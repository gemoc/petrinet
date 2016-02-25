package fr.inria.diverse.sample.petrinetv3.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension fr.inria.diverse.sample.petrinetv3.semantics.TransitionAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import petrinetv3.Net
import petrinetv3.Transition
import petrinetv3.Place
import petrinetv3.PetrinetV3Factory

@Aspect(className=Net)
class NetAspect {

	/**
	 * Initialization function to be called after creating 
	 * the objects of the executable model.
	 * Each place is given as many tokens as specified in initialTokens.
	 */
	@Step
	def void initialize() {
		// Creating initial tokens
		for (place : _self.places)
			for (x : 1 .. place.initialTokens)
				place.tokens.add(PetrinetV3Factory.eINSTANCE.createToken)
				
		// Activating clocks of enabled transitions
		for (t : _self.transitions.filter[t|t.enabled])
			t.clock = 0
	}

	/**
	 * Transformation rule that runs the Petri net to completion.
	 */
	@Main
	@Step
	def void run() {
		_self.initialize
		var int i = 0;
		println(_self.netToString)
		while (i < 100 && _self.transitions.exists[t|t.isEnabled]) {
			i++
			println("("+i+")")
			val fireableTransition = _self.transitions.findFirst[t|t.isFireable]
			// Either we can fire a transition
			if (fireableTransition != null) {
				fireableTransition.fire
				println(_self.netToString)
			} // Or we tick the clocks of enabled transitions 
			else {
				_self.tickEnabledTransitions()
				println(_self.clocksToString)
			}
		}
	}

	def String netToString() {
		'''Net marking:
	«FOR p : _self.places»
	«p.name»: «p.tokens»
	«ENDFOR»
«_self.clocksToString»'''
	}
	
		def String clocksToString() {
'''Clocks:
	«FOR t : _self.transitions»
	«t.name»: «t.clock»
«ENDFOR»'''
	}

	@Step
	def void tickEnabledTransitions() {
		for (t : _self.transitions.filter[t|t.isEnabled]) {
			t.clock = t.clock + 1
		}
	}

}

@Aspect(className=Place)
class PlaceAspect {
	/**
	 * Current tokens in a Place object.
	 */
	// public List<Token> tokens;
}

@Aspect(className=Transition)
class TransitionAspect {

	/**
	 * Current value of the clock of the Transition.
	 */
	// public int clock;
	/**
	 * Query to know if the Transition is enabled.
	 * @return true if all input places have at least one token, false otherwise.
	 */
	public def boolean isEnabled() {
		return _self.input.forall[place|place.tokens.size > 0]
	}

	/**
	 * Query to know if the Transition is fireable.
	 * @return true if the transition is enabled and if the clock satifies the time constraints
	 */
	public def boolean isFireable() {
		return _self.isEnabled && (_self.tmin <= _self.clock ) && ( _self.clock <= _self.tmax )
	}

	/**
	 * Transformation rule that fires the Transition.
	 */
	@Step
	public def void fire() {

		// Checking if input places are enabled
		if (_self.isFireable) {

			// Removing a token from each input place
			for (Place input : _self.input)
				input.tokens.remove(input.tokens.get(0))

			// We find which transitions were disabled by the removals
			val disabledDuringTransition = _self.parentNet.transitions.filter[t|!t.isEnabled].toSet

			// Adding a token to each output place
			for (Place output : _self.output)
				output.tokens.add(PetrinetV3Factory.eINSTANCE.createToken)

			// Next we reset the newly enabled transitions
			for (t : _self.parentNet.transitions.filter[t|t.isEnabled].filter [ t |
				t == _self || disabledDuringTransition.contains(t)
			]) {
				t.clock = 0
			}
			
			// And we disable clocks of disabled transitions
			for (t : _self.parentNet.transitions.filter[t|!t.enabled])
				t.clock = -1
			}
	}

}
