package fr.inria.diverse.sample.petrinetv3.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class Petrinetv3TraceStepFactory implements IStepFactory {

	@Override
	public org.gemoc.executionframework.engine.mse.MSEOccurrence createMSEOccurrence(
			org.gemoc.executionframework.engine.mse.MSE mse, List<Object> parameters, List<Object> result) {

		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(mse.getCaller().eClass(), ".") + "."
				+ mse.getAction().getName();
		org.gemoc.executionframework.engine.mse.MSEOccurrence mseocc = null;

		if (stepRule.equalsIgnoreCase("petrinetv3.Net.initialize")) {
			mseocc = petrinetv3Trace.Steps.StepsFactory.eINSTANCE.createPetrinetv3_Net_Initialize();
		} else

		if (stepRule.equalsIgnoreCase("petrinetv3.Net.run")) {
			mseocc = petrinetv3Trace.Steps.StepsFactory.eINSTANCE.createPetrinetv3_Net_Run();
		} else

		if (stepRule.equalsIgnoreCase("petrinetv3.Net.tickEnabledTransitions")) {
			mseocc = petrinetv3Trace.Steps.StepsFactory.eINSTANCE.createPetrinetv3_Net_TickEnabledTransitions();
		} else

		if (stepRule.equalsIgnoreCase("petrinetv3.Transition.fire")) {
			mseocc = petrinetv3Trace.Steps.StepsFactory.eINSTANCE.createPetrinetv3_Transition_Fire();
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
