package fr.inria.diverse.sample.petrinetv2.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class Petrinetv2TraceStepFactory implements IStepFactory {

	@Override
	public org.gemoc.executionframework.engine.mse.MSEOccurrence createMSEOccurrence(
			org.gemoc.executionframework.engine.mse.MSE mse, List<Object> parameters, List<Object> result) {

		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(mse.getCaller().eClass(), ".") + "."
				+ mse.getAction().getName();
		org.gemoc.executionframework.engine.mse.MSEOccurrence mseocc = null;

		if (stepRule.equalsIgnoreCase("petrinetv2.Net.initialize")) {
			mseocc = petrinetv2Trace.Steps.StepsFactory.eINSTANCE.createPetrinetv2_Net_Initialize();
		} else

		if (stepRule.equalsIgnoreCase("petrinetv2.Net.run")) {
			mseocc = petrinetv2Trace.Steps.StepsFactory.eINSTANCE.createPetrinetv2_Net_Run();
		} else

		if (stepRule.equalsIgnoreCase("petrinetv2.Transition.fire")) {
			mseocc = petrinetv2Trace.Steps.StepsFactory.eINSTANCE.createPetrinetv2_Transition_Fire();
		}

		else {
			mseocc = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE.createMSEOccurrence();
		}

		if (mseocc != null) {
			mseocc.setMse(mse);
			mseocc.getParameters().addAll(parameters);
			mseocc.getResult().addAll(result);
		}
		return mseocc;
	}
}
