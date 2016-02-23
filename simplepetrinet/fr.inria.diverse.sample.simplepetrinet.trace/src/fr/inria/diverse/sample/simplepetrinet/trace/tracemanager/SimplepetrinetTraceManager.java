package fr.inria.diverse.sample.simplepetrinet.trace.tracemanager;

import fr.inria.diverse.trace.api.IValueTrace;
import fr.inria.diverse.trace.api.impl.GenericValueTrace;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.TreeIterator;

public class SimplepetrinetTraceManager implements fr.inria.diverse.trace.gemoc.api.IGemocTraceManager {

	private simplepetrinetTrace.Trace traceRoot;
	private Resource executedModel;

	private Map<EObject, EObject> exeToTraced;

	private simplepetrinetTrace.States.State lastState;
	private List<IValueTrace> traces;

	private Resource traceResource;
	private Deque<simplepetrinetTrace.Steps.Step> context = new LinkedList<simplepetrinetTrace.Steps.Step>();
	private static final List<String> bigSteps = Arrays.asList();

	public SimplepetrinetTraceManager(Resource exeModel, Resource traceResource) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.traces = new ArrayList<IValueTrace>();
	}

	@Override
	public boolean addStateIfChanged() {
		return addState(true);
	}

	@Override
	public void addState() {
		addState(false);
	}

	@SuppressWarnings("unchecked")
	private boolean addState(boolean onlyIfChange) {

		simplepetrinetTrace.States.State newState = simplepetrinetTrace.States.StatesFactory.eINSTANCE.createState();
		boolean changed = false;

		// We look at each object instance of a class with mutable properties 
		// Each of these objects should eventually become a traced object

		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		for (Resource r : allResources)
			for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
				EObject o = i.next();

				/**
				 * Storing the state of a simplepetrinet.Place object
				 */
				if (o instanceof simplepetrinet.Place) {

					simplepetrinet.Place o_cast = (simplepetrinet.Place) o;

					storeAsTracedObject(o_cast);

					simplepetrinetTrace.States.simplepetrinet.TracedPlace tracedObject = (simplepetrinetTrace.States.simplepetrinet.TracedPlace) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<simplepetrinetTrace.States.Place_tokens_Value> localTrace1 = tracedObject.getTokensSequence();
					simplepetrinetTrace.States.Place_tokens_Value previousValue1 = null;
					if (!localTrace1.isEmpty())
						previousValue1 = localTrace1.get(localTrace1.size() - 1);

					int content1 = o_cast.getTokens();

					boolean noChange1 = previousValue1 != null && previousValue1.getTokens() == content1;

					if (noChange1) {
						newState.getPlace_tokens_Values().add(previousValue1);

					} // Else we create one
					else {
						changed = true;
						simplepetrinetTrace.States.Place_tokens_Value newValue = simplepetrinetTrace.States.StatesFactory.eINSTANCE
								.createPlace_tokens_Value();

						newValue.setTokens(content1);

						tracedObject.getTokensSequence().add(newValue);
						newState.getPlace_tokens_Values().add(newValue);
					}

				}
			}

		boolean createNewState = lastState == null || (!onlyIfChange || changed);
		if (createNewState) {

			final simplepetrinetTrace.Steps.Step currentStep = context.peekFirst();
			if (currentStep != null && currentStep instanceof simplepetrinetTrace.Steps.BigStep) {
				final simplepetrinetTrace.States.State startingState = lastState;
				final simplepetrinetTrace.States.State endingState = newState;
				addImplicitStep(currentStep, startingState, endingState);
			}

			lastState = newState;
			traceRoot.getStatesTrace().add(lastState);
		}

		// Undoing the new state created for nothing
		else {

			newState.getStartedSteps().clear();
			newState.getEndedSteps().clear();

			newState.getPlace_tokens_Values().clear();
		}

		return createNewState;

	}

	@Override
	public void addStep(String stepRule, Map<String, Object> params) {
		addStep(stepRule, params, this.getTraceSize() - 1);
	}

	private void addStep(String stepRule, Map<String, Object> params, int stateIndex) {

		simplepetrinetTrace.Steps.Step toPush = null;

		if (stateIndex >= 0) {

			simplepetrinetTrace.States.State state = this.traceRoot.getStatesTrace().get(stateIndex);

			if (stepRule.equalsIgnoreCase("simplepetrinet.Net.initialize")) {
				// First we create the step
				simplepetrinetTrace.Steps.Simplepetrinet_Net_Initialize simplepetrinet_Net_InitializeInstance = simplepetrinetTrace.Steps.StepsFactory.eINSTANCE
						.createSimplepetrinet_Net_Initialize();
				simplepetrinet_Net_InitializeInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", simplepetrinet_Net_InitializeInstance);
				} else {
					traceRoot.getRootSteps().add(simplepetrinet_Net_InitializeInstance);
				}
				toPush = simplepetrinet_Net_InitializeInstance;

				// Then we add it to its trace
				this.traceRoot.getSimplepetrinet_Net_Initialize_Sequence().add(simplepetrinet_Net_InitializeInstance);
			} else

			if (stepRule.equalsIgnoreCase("simplepetrinet.Transition.fire")) {
				// First we create the step
				simplepetrinetTrace.Steps.Simplepetrinet_Transition_Fire simplepetrinet_Transition_FireInstance = simplepetrinetTrace.Steps.StepsFactory.eINSTANCE
						.createSimplepetrinet_Transition_Fire();
				simplepetrinet_Transition_FireInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", simplepetrinet_Transition_FireInstance);
				} else {
					traceRoot.getRootSteps().add(simplepetrinet_Transition_FireInstance);
				}
				toPush = simplepetrinet_Transition_FireInstance;

				// Then we add it to its trace
				this.traceRoot.getSimplepetrinet_Transition_Fire_Sequence().add(simplepetrinet_Transition_FireInstance);
			}

		}

		context.push(toPush);

	}

	private void addImplicitStep(simplepetrinetTrace.Steps.Step currentStep,
			simplepetrinetTrace.States.State startingState, simplepetrinetTrace.States.State endingState) {
		simplepetrinetTrace.Steps.Step implicitStep = null;
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			emfAdd(currentStep, "subSteps", implicitStep);
		}
	}

	@Override
	public boolean addStep(org.gemoc.executionframework.engine.mse.MSEOccurrence mseOccurrence) {

		simplepetrinetTrace.Steps.Step step = null;

		if (mseOccurrence != null && mseOccurrence instanceof simplepetrinetTrace.Steps.Step) {

			step = (simplepetrinetTrace.Steps.Step) mseOccurrence;

			// Creating generic (or almost generic) links
			simplepetrinetTrace.States.State state = this.traceRoot.getStatesTrace().get(this.getTraceSize() - 1);
			step.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				emfAdd(context.getFirst(), "subSteps", step);
			} else {
				traceRoot.getRootSteps().add(step);
			}

			// Adding step in its dedicated sequence/dimension
			if (step instanceof simplepetrinetTrace.Steps.Simplepetrinet_Net_Initialize) {
				simplepetrinetTrace.Steps.Simplepetrinet_Net_Initialize simplepetrinet_Net_InitializeInstance = (simplepetrinetTrace.Steps.Simplepetrinet_Net_Initialize) step;
				this.traceRoot.getSimplepetrinet_Net_Initialize_Sequence().add(simplepetrinet_Net_InitializeInstance);
			} else if (step instanceof simplepetrinetTrace.Steps.Simplepetrinet_Transition_Fire) {
				simplepetrinetTrace.Steps.Simplepetrinet_Transition_Fire simplepetrinet_Transition_FireInstance = (simplepetrinetTrace.Steps.Simplepetrinet_Transition_Fire) step;
				this.traceRoot.getSimplepetrinet_Transition_Fire_Sequence().add(simplepetrinet_Transition_FireInstance);
			}
		}
		context.push(step);

		return (step != null);
	}

	@Override
	public void endStep(String stepRule, Object returnValue) {
		simplepetrinetTrace.Steps.Step popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void goTo(EObject state) {

		if (state instanceof simplepetrinetTrace.States.State) {
			simplepetrinetTrace.States.State stateToGo = (simplepetrinetTrace.States.State) state;

			for (simplepetrinetTrace.States.Place_tokens_Value value : stateToGo.getPlace_tokens_Values()) {

				if (value.getParent() instanceof simplepetrinetTrace.States.simplepetrinet.TracedPlace) {
					simplepetrinetTrace.States.simplepetrinet.TracedPlace parent_cast = (simplepetrinetTrace.States.simplepetrinet.TracedPlace) value
							.getParent();
					int toset = value.getTokens();
					int current = ((simplepetrinet.Place) parent_cast.getOriginalObject()).getTokens();
					if (current != toset)
						((simplepetrinet.Place) parent_cast.getOriginalObject()).setTokens(toset);

				}

			}

		} else {
			goToValue(state);
		}
	}

	@Override
	public void goTo(int stepNumber) {
		simplepetrinetTrace.States.State stateToGo = traceRoot.getStatesTrace().get(stepNumber);
		goTo(stateToGo);
	}

	private void goToValue(EObject value) {
		Object states = emfGet(value, "states");
		if (states != null) {
			if (states instanceof List<?>) {
				// We get the first state in which this value existed
				Object state = ((List<?>) states).get(0);
				if (state instanceof simplepetrinetTrace.States.State) {
					goTo((simplepetrinetTrace.States.State) state);
				}
			}
		}
	}

	@Override
	public void initTrace() {
		// Create root
		this.traceRoot = simplepetrinetTrace.SimplepetrinetTraceFactory.eINSTANCE.createTrace();

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		// Initializing the map exeobject -> tracedobject
		this.exeToTraced = new HashMap<EObject, EObject>();
	}

	@Override
	public void save() {
		//try {
		//	traceResource.save(null);
		//} catch (IOException e) {
		//	e.printStackTrace();
		//}
	}

	@Override
	public String getDescriptionOfExecutionState(int index) {
		StringBuilder result = new StringBuilder();
		simplepetrinetTrace.States.State gs = traceRoot.getStatesTrace().get(index);

		if (!gs.getPlace_tokens_Values().isEmpty())
			result.append("\nTokens values:");
		for (simplepetrinetTrace.States.Place_tokens_Value currentState : gs.getPlace_tokens_Values()) {
			result.append("\n\t" + currentState.getTokens());
		}

		if (!gs.getStartedSteps().isEmpty()) {
			result.append("\n\nStarting steps: ");
			for (simplepetrinetTrace.Steps.Step m : gs.getStartedSteps()) {
				result.append("\n\t" + m.eClass().getName());
				if (m.getEndingState() != null) {
					result.append(" (ends at state " + traceRoot.getStatesTrace().indexOf(m.getEndingState()) + ")");
				}
			}
		}

		result.deleteCharAt(0);
		return result.toString();
	}

	@Override
	public String getDescriptionOfValue(EObject eObject) {
		if (eObject instanceof simplepetrinetTrace.States.Place_tokens_Value) {
			return "simplepetrinetTrace.States.Place_tokens_Value: "
					+ ((simplepetrinetTrace.States.Place_tokens_Value) eObject).getTokens();
		} else
			return "ERROR";
	}

	private void storeAsTracedObject(simplepetrinet.Place o) {

		// First we find the traced object, and we create it if required
		simplepetrinetTrace.States.simplepetrinet.TracedPlace tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = simplepetrinetTrace.States.simplepetrinet.SimplepetrinetFactory.eINSTANCE
					.createTracedPlace();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getSimplepetrinet_tracedPlaces().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getTokensSequence(), this));
		}
	}

	private void storeAsTracedObject(EObject o) {
		if (o instanceof simplepetrinet.Place) {
			storeAsTracedObject((simplepetrinet.Place) o);
		}
	}

	private Collection<? extends EObject> getExeToTraced(Collection<? extends EObject> exeObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject exeObject : exeObjects) {
			storeAsTracedObject(exeObject);
			result.add(exeToTraced.get(exeObject));
		}
		return result;
	}

	private Collection<? extends EObject> getTracedToExe(Collection<? extends EObject> tracedObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject tracedObject : tracedObjects) {
			result.add(getTracedToExe(tracedObject));
		}
		return result;
	}

	private EObject getTracedToExe(EObject tracedObject) {
		for (EObject key : exeToTraced.keySet()) {
			if (exeToTraced.get(key) == tracedObject)
				return key;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private static void emfAdd(EObject o, String property, Object value) {
		for (EReference r : o.eClass().getEAllReferences()) {
			if (r.getName().equalsIgnoreCase(property)) {
				Object coll = o.eGet(r);
				if (coll instanceof Collection) {
					((Collection<Object>) coll).add(value);
					return;
				}
			}
		}
	}

	private static Object emfGet(EObject o, String property) {
		for (EReference r : o.eClass().getEAllReferences()) {
			if (r.getName().equalsIgnoreCase(property)) {
				return o.eGet(r);
			}
		}
		return null;
	}

	@Override
	public EObject getExecutionState(int index) {
		return traceRoot.getStatesTrace().get(index);
	}

	@Override
	public int getTraceSize() {
		return traceRoot.getStatesTrace().size();
	}

	@Override
	public int getNumberOfValueTraces() {
		return traces.size();
	}

	@Override
	public Set<EObject> getAllCurrentValues(int stateIndex) {
		simplepetrinetTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);
		// We find all current values
		Set<EObject> currentValues = new HashSet<EObject>();
		if (currentState != null) {
			currentValues.addAll(currentState.getPlace_tokens_Values());
		}
		return currentValues;
	}

	public List<IValueTrace> getAllValueTraces() {
		return traces;
	}

	@Override
	public int getStateOrValueIndex(EObject stateOrValue) {
		int idx = traceRoot.getStatesTrace().indexOf(stateOrValue);
		if (idx == -1) {
			final Object states = emfGet(stateOrValue, "states");
			if (states != null) {
				if (states instanceof List<?>) {
					// We get the first state in which this value existed
					Object valueState = ((List<?>) states).get(0);
					if (valueState instanceof simplepetrinetTrace.States.State) {
						idx = traceRoot.getStatesTrace().indexOf(valueState);
					}
				}
			}
		}
		return idx;
	}

	@Override
	public String currentBigStep() {
		if (!context.isEmpty() && context.getFirst() != null)
			return context.getFirst().eClass().getName();
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<fr.inria.diverse.trace.api.IStep> getStackForwardAfterState(int stateIndex) {
		List<fr.inria.diverse.trace.api.IStep> result = new ArrayList<fr.inria.diverse.trace.api.IStep>();
		simplepetrinetTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);

		// We start at the top of the forward stack, and we go downward
		simplepetrinetTrace.Steps.Step itStep = currentState.getStartedSteps().get(0);
		while (itStep != null) {
			simplepetrinetTrace.Steps.Step itStep_prev = itStep;
			if (itStep instanceof simplepetrinetTrace.Steps.Step) {
				result.add(createGenericStep((simplepetrinetTrace.Steps.Step) itStep));
				List<simplepetrinetTrace.Steps.Step> subSteps = (List<simplepetrinetTrace.Steps.Step>) emfGet(itStep,
						"subSteps");
				if (subSteps != null) {
					itStep = subSteps.get(0);
				}
			}

			// If we didn't find anything new, we stop
			if (itStep == itStep_prev)
				itStep = null;
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<fr.inria.diverse.trace.api.IStep> getStackBackward(int stateIndex) {
		List<fr.inria.diverse.trace.api.IStep> result = new ArrayList<fr.inria.diverse.trace.api.IStep>();
		simplepetrinetTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);

		// We start at the top of the backward stack, and we go downward
		simplepetrinetTrace.Steps.Step itStep = currentState.getEndedSteps().get(0);
		while (itStep != null) {
			simplepetrinetTrace.Steps.Step itStep_prev = itStep;
			if (itStep instanceof simplepetrinetTrace.Steps.Step) {
				result.add(createGenericStep((simplepetrinetTrace.Steps.Step) itStep));
				List<simplepetrinetTrace.Steps.Step> subSteps = (List<simplepetrinetTrace.Steps.Step>) emfGet(itStep,
						"subSteps");
				if (subSteps != null) {
					itStep = subSteps.get(subSteps.size() - 1);
				}
			}

			// If we didn't find anything new, we stop
			if (itStep == itStep_prev)
				itStep = null;
		}
		return result;
	}

	@Override
	public List<fr.inria.diverse.trace.api.IStep> getStackForwardBeforeState(int stateIndex) {
		LinkedList<fr.inria.diverse.trace.api.IStep> result = new LinkedList<fr.inria.diverse.trace.api.IStep>();
		simplepetrinetTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);
		List<simplepetrinetTrace.Steps.Step> endedSteps = currentState.getEndedSteps();

		if (!endedSteps.isEmpty()) {
			final simplepetrinetTrace.Steps.Step endedStep = endedSteps.get(0);
			if (endedStep.getStartingState() != currentState) {
				result.addFirst(createGenericStep(endedStep));
			}
			EObject itStep = endedStep.eContainer();
			while (itStep != null) {
				if (itStep instanceof simplepetrinetTrace.Steps.Step) {
					simplepetrinetTrace.Steps.Step step = (simplepetrinetTrace.Steps.Step) itStep;
					if (step.getStartingState() != currentState) {
						result.addFirst(createGenericStep(step));
					}
					itStep = itStep.eContainer();
				} else {
					itStep = null;
				}
			}
		}
		return result;
	}

	@Override
	public List<fr.inria.diverse.trace.api.IStep.StepEvent> getEventsForState(int stateIndex) {
		final Map<simplepetrinetTrace.Steps.Step, fr.inria.diverse.trace.api.IStep> step2IStep = new HashMap<>();
	
		final simplepetrinetTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);
	
		final List<fr.inria.diverse.trace.api.IStep> endedSteps = currentState.getEndedSteps().stream().map(s -> {
			return step2IStep.computeIfAbsent(s, k -> createGenericStep(k));
		}).collect(Collectors.toList());
	
		final List<fr.inria.diverse.trace.api.IStep> startedSteps = currentState.getStartedSteps().stream().map(s -> {
			return step2IStep.computeIfAbsent(s, k -> createGenericStep(k));
		}).collect(Collectors.toList());
	
		final List<fr.inria.diverse.trace.api.IStep.StepEvent> events = new ArrayList<>();
		final LinkedList<fr.inria.diverse.trace.api.IStep> virtualStack = new LinkedList<>();
	
		final Iterator<fr.inria.diverse.trace.api.IStep> itEnding = endedSteps.iterator();
		final Iterator<fr.inria.diverse.trace.api.IStep> itStarting = startedSteps.iterator();
	
		while (itEnding.hasNext()) {
			// As long as we have ending steps
			final fr.inria.diverse.trace.api.IStep endedIStep = itEnding.next();
			if (endedIStep.getStartingIndex() != stateIndex) {
				events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(endedIStep, false));
			} else {
				if (virtualStack.peek() == endedIStep) {
					// A start event on this step has already been treated,
					// we thus can treat this end event.
					events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(endedIStep, false));
					virtualStack.pop();
				} else {
					while (virtualStack.peek() != endedIStep && itStarting.hasNext()) {
						// Pushing steps that start onto the stack until we pushed the one
						// we are trying to pop or we run out of steps.
						final fr.inria.diverse.trace.api.IStep startedIStep = itStarting.next();
						virtualStack.push(startedIStep);
						events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(startedIStep, true));
					}
					if (virtualStack.peek() == endedIStep) {
						// We try again.
						events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(endedIStep, false));
						virtualStack.pop();
					} else {
						// If it failed again, throw an exception. Not supposed to happen.
						throw new IllegalStateException();
					}
				}
			}
		}
		
		while (itStarting.hasNext()) {
			final fr.inria.diverse.trace.api.IStep startedIStep = itStarting.next();
			events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(startedIStep, true));
		}
	
		return events;
	}

	private fr.inria.diverse.trace.api.IStep generateStep(simplepetrinetTrace.Steps.Step step) {
		fr.inria.diverse.trace.api.IStep result = null;

		fr.inria.diverse.trace.api.IStep parentStep = null;
		if (step.eContainer() instanceof simplepetrinetTrace.Steps.Step) {
			parentStep = createGenericStep((simplepetrinetTrace.Steps.Step) step.eContainer());
		}

		if (step instanceof simplepetrinetTrace.Steps.Simplepetrinet_Net_Initialize) {
			simplepetrinetTrace.Steps.Simplepetrinet_Net_Initialize step_cast = (simplepetrinetTrace.Steps.Simplepetrinet_Net_Initialize) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("simplepetrinet.Net", "initialize", startIndex,
					endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof simplepetrinetTrace.Steps.Simplepetrinet_Transition_Fire) {
			simplepetrinetTrace.Steps.Simplepetrinet_Transition_Fire step_cast = (simplepetrinetTrace.Steps.Simplepetrinet_Transition_Fire) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("simplepetrinet.Transition", "fire", startIndex,
					endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		}

		return result;
	}

	private fr.inria.diverse.trace.api.IStep createGenericStep(simplepetrinetTrace.Steps.Step step) {
		return new fr.inria.diverse.trace.api.impl.LazyGenericStep(() -> {
			return generateStep(step);
		});
		
	}
}
