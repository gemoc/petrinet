package fr.inria.diverse.sample.petrinetv3.trace.tracemanager;

import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

import org.eclipse.emf.ecore.resource.Resource;

public class Petrinetv3TraceEngineAddon extends AbstractTraceAddon {

	@Override
	public fr.inria.diverse.trace.gemoc.api.IGemocTraceManager constructTraceManager(Resource exeModel,
			Resource traceResource) {
		return new Petrinetv3TraceManager(exeModel, traceResource);
	}

	private Petrinetv3TraceStepFactory factory = null;

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new Petrinetv3TraceStepFactory();
		return factory;
	}

}