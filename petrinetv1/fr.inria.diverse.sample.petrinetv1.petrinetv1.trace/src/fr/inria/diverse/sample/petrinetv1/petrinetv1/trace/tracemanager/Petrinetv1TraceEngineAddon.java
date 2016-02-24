package fr.inria.diverse.sample.petrinetv1.petrinetv1.trace.tracemanager;

import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

import org.eclipse.emf.ecore.resource.Resource;

public class Petrinetv1TraceEngineAddon extends AbstractTraceAddon {

	@Override
	public fr.inria.diverse.trace.gemoc.api.IGemocTraceManager constructTraceManager(Resource exeModel,
			Resource traceResource) {
		return new Petrinetv1TraceManager(exeModel, traceResource);
	}

	private Petrinetv1TraceStepFactory factory = null;

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new Petrinetv1TraceStepFactory();
		return factory;
	}

}