DSL fr.inria.diverse.sample.petrinetv1.xdsml.XPetrinetv1 {
	abstract-syntax {
		ecore = "platform:/resource/fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1/model/XPetrinetv1.ecore"
	}
	semantic {
		k3 = "fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspect",
		"fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.TransitionAspect",
		"fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.PlaceAspect"
	}
}
