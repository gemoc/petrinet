package fr.inria.diverse.sample.petrinetv2.trace.tracemanager;

import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

import org.eclipse.emf.ecore.resource.Resource;

public class Petrinetv2TraceEngineAddon extends AbstractTraceAddon {

	@Override
	public fr.inria.diverse.trace.gemoc.api.IGemocTraceManager constructTraceManager(Resource exeModel,
			Resource traceResource) {
		return new Petrinetv2TraceManager(exeModel, traceResource);
	}

	private Petrinetv2TraceStepFactory factory = null;

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new Petrinetv2TraceStepFactory();
		return factory;
	}

}