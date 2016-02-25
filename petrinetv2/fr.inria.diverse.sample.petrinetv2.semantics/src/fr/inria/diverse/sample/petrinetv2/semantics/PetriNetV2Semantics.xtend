package fr.inria.diverse.sample.petrinetv2.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension fr.inria.diverse.sample.petrinetv2.semantics.TransitionAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import petrinetv2.Net
import petrinetv2.Transition
import petrinetv2.Place
import petrinetv2.PetrinetV2Factory

@Aspect(className=Net)
class NetAspect {

	/**
	 * Initialization function to be called after creating 
	 * the objects of the executable model.
	 * Each place is given as many tokens as specified in initialTokens.
	 */
	@Step
	def void initialize() {
		for (place : _self.places)
			for (x : 1 .. place.initialTokens)
				place.tokens.add(PetrinetV2Factory.eINSTANCE.createToken)
	}

	/**
	 * Transformation rule that runs the Petri net to completion.
	 */
	@Main
	@Step
	def void run() {
		_self.initialize
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
	 * Current tokens in a Place object.
	 */
	//public List<Token> tokens;

}

@Aspect(className=Transition)
class TransitionAspect {

	/**
	 * Query to know if the Transition is enabled.
	 * @return true if all input places have at least one token, false otherwise.
	 */
	public def boolean isEnabled() {
		return _self.input.forall[place|place.tokens.size > 0]
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
				input.tokens.remove(input.tokens.get(0))

			// Adding a token to each output place
			for (Place output : _self.output)
				output.tokens.add(PetrinetV2Factory.eINSTANCE.createToken)
		}
	}

}
