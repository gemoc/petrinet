package fr.inria.diverse.sample.petrinetv1.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.List
import petrinetv1.Net
import petrinetv1.Place
import petrinetv1.Transition

import static extension fr.inria.diverse.sample.petrinetv1.semantics.TransitionAspect.*

@Aspect(className=Net)
class NetAspect {

	/**
	 * Each place is given as many tokens as specified in initialTokens.
	 */
	@InitializeModel
	def void initialize(List<String> args) {
		for (place : _self.places)
			place.tokens = place.initialTokens
	}

	/**
	 * Transformation rule that runs the Petri net to completion.
	 */
	@Main
	@Step
	def void run() {
		var int i = 0;
		while (true) {
			val enabledTransition = _self.transitions.findFirst[t|t.isEnabled]
			if (enabledTransition != null) {
				enabledTransition.fire
				println(i++)
				println(_self.markingToString)
			} else
				return
		}
	}

	def String markingToString() {
		'''Net marking:
			«FOR p : _self.places»
				«p.name»: «p.tokens»
			«ENDFOR»
			'''
	}

}

@Aspect(className=Place)
class PlaceAspect {

	/**
	 * Current amount of tokens in a Place object.
	 */
	public int tokens;

}

@Aspect(className=Transition)
class TransitionAspect {

	/**
	 * Query to know if the Transition is enabled.
	 * @return true if all input places have at least one token, false otherwise.
	 */
	public def boolean isEnabled() {
		return _self.input.forall[place|place.tokens > 0]
	}

	/**
	 * Transformation rule that fires the Transition.
	 */
	@Step
	public def void fire() {

		// Checking if input places are enabled
		if (_self.isEnabled) {

			// Removing a token from each input place
			for (Place input : _self.input)
				input.tokens = input.tokens - 1

			// Adding a token to each output place
			for (Place output : _self.output)
				output.tokens = output.tokens + 1
		}
	}

}
