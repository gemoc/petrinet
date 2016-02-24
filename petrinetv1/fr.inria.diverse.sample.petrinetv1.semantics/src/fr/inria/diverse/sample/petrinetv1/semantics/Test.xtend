package fr.inria.diverse.sample.petrinetv1.semantics

import static extension fr.inria.diverse.sample.petrinetv1.semantics.NetAspect.*
import petrinetv1.Net
import petrinetv1.PetrinetV1Factory

class Test {


	static def Net createSampleNet() {
		val factory = PetrinetV1Factory.eINSTANCE

		val p1 = factory.createPlace => [
			name = "p1"
			initialTokens = 1
		]

		val p2 = factory.createPlace => [
			name = "p2"
			initialTokens = 1
		]

		val p3 = factory.createPlace => [
			name = "p3"
			initialTokens = 0
		]

		val p4 = factory.createPlace => [
			name = "p4"
			initialTokens = 0
		]

		val t1 = factory.createTransition => [
			name = "t1"
			input.add(p1)
			output.add(p3)
		]

		val t2 = factory.createTransition => [
			name = "t2"
			input.addAll(p3, p2)
			output.add(p4)
		]

		val net = factory.createNet => [
			places.addAll(p1, p2, p3, p4)
			transitions.addAll(t1, t2)
		]

		return net
	}
	
	def static void main(String[] args) {
		val Net net = createSampleNet
		net.run
	}

}
 