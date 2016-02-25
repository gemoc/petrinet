package fr.inria.diverse.sample.petrinetv3.trace.tracemanager;

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

public class Petrinetv3TraceManager implements fr.inria.diverse.trace.gemoc.api.IGemocTraceManager {

	private petrinetv3Trace.Trace traceRoot;
	private Resource executedModel;

	private Map<EObject, EObject> exeToTraced;

	private petrinetv3Trace.States.State lastState;
	private List<IValueTrace> traces;

	private Resource traceResource;
	private Deque<petrinetv3Trace.Steps.Step> context = new LinkedList<petrinetv3Trace.Steps.Step>();
	private static final List<String> bigSteps = Arrays.asList("Petrinetv3_Net_Run");

	public Petrinetv3TraceManager(Resource exeModel, Resource traceResource) {
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

		petrinetv3Trace.States.State newState = petrinetv3Trace.States.StatesFactory.eINSTANCE.createState();
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
				 * Storing the state of a petrinetv3.Transition object
				 */
				if (o instanceof petrinetv3.Transition) {

					petrinetv3.Transition o_cast = (petrinetv3.Transition) o;

					storeAsTracedObject(o_cast);

					petrinetv3Trace.States.petrinetv3.TracedTransition tracedObject = (petrinetv3Trace.States.petrinetv3.TracedTransition) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<petrinetv3Trace.States.Transition_clock_Value> localTrace1 = tracedObject.getClockSequence();
					petrinetv3Trace.States.Transition_clock_Value previousValue1 = null;
					if (!localTrace1.isEmpty())
						previousValue1 = localTrace1.get(localTrace1.size() - 1);

					int content1 = o_cast.getClock();

					boolean noChange1 = previousValue1 != null && previousValue1.getClock() == content1;

					if (noChange1) {
						newState.getTransition_clock_Values().add(previousValue1);

					} // Else we create one
					else {
						changed = true;
						petrinetv3Trace.States.Transition_clock_Value newValue = petrinetv3Trace.States.StatesFactory.eINSTANCE
								.createTransition_clock_Value();

						newValue.setClock(content1);

						tracedObject.getClockSequence().add(newValue);
						newState.getTransition_clock_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a petrinetv3.Place object
				 */
				if (o instanceof petrinetv3.Place) {

					petrinetv3.Place o_cast = (petrinetv3.Place) o;

					storeAsTracedObject(o_cast);

					petrinetv3Trace.States.petrinetv3.TracedPlace tracedObject = (petrinetv3Trace.States.petrinetv3.TracedPlace) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<petrinetv3Trace.States.Place_tokens_Value> localTrace2 = tracedObject.getTokensSequence();
					petrinetv3Trace.States.Place_tokens_Value previousValue2 = null;
					if (!localTrace2.isEmpty())
						previousValue2 = localTrace2.get(localTrace2.size() - 1);

					for (petrinetv3.Token aValue : o_cast.getTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange2 = true;
					if (previousValue2 != null) {

						if (previousValue2.getTokens().size() == o_cast.getTokens().size()) {

							java.util.Iterator<petrinetv3.Token> it = o_cast.getTokens().iterator();
							for (petrinetv3Trace.States.petrinetv3.TracedToken aPreviousValue : previousValue2
									.getTokens()) {
								petrinetv3.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange2 = false;
									break;
								}
							}

						} else {
							noChange2 = false;
						}
					} else {
						noChange2 = false;
					}

					if (noChange2) {
						newState.getPlace_tokens_Values().add(previousValue2);

					} // Else we create one
					else {
						changed = true;
						petrinetv3Trace.States.Place_tokens_Value newValue = petrinetv3Trace.States.StatesFactory.eINSTANCE
								.createPlace_tokens_Value();

						newValue.getTokens()
								.addAll((Collection<? extends petrinetv3Trace.States.petrinetv3.TracedToken>) getExeToTraced(o_cast
										.getTokens()));

						tracedObject.getTokensSequence().add(newValue);
						newState.getPlace_tokens_Values().add(newValue);
					}

				}
			}

		boolean createNewState = lastState == null || (!onlyIfChange || changed);
		if (createNewState) {

			final petrinetv3Trace.Steps.Step currentStep = context.peekFirst();
			if (currentStep != null && currentStep instanceof petrinetv3Trace.Steps.BigStep) {
				final petrinetv3Trace.States.State startingState = lastState;
				final petrinetv3Trace.States.State endingState = newState;
				addImplicitStep(currentStep, startingState, endingState);
			}

			lastState = newState;
			traceRoot.getStatesTrace().add(lastState);
		}

		// Undoing the new state created for nothing
		else {

			newState.getStartedSteps().clear();
			newState.getEndedSteps().clear();

			newState.getTransition_clock_Values().clear();
			newState.getPlace_tokens_Values().clear();
		}

		return createNewState;

	}

	@Override
	public void addStep(String stepRule, Map<String, Object> params) {
		addStep(stepRule, params, this.getTraceSize() - 1);
	}

	private void addStep(String stepRule, Map<String, Object> params, int stateIndex) {

		petrinetv3Trace.Steps.Step toPush = null;

		if (stateIndex >= 0) {

			petrinetv3Trace.States.State state = this.traceRoot.getStatesTrace().get(stateIndex);

			if (stepRule.equalsIgnoreCase("petrinetv3.Net.initialize")) {
				// First we create the step
				petrinetv3Trace.Steps.Petrinetv3_Net_Initialize petrinetv3_Net_InitializeInstance = petrinetv3Trace.Steps.StepsFactory.eINSTANCE
						.createPetrinetv3_Net_Initialize();
				petrinetv3_Net_InitializeInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", petrinetv3_Net_InitializeInstance);
				} else {
					traceRoot.getRootSteps().add(petrinetv3_Net_InitializeInstance);
				}
				toPush = petrinetv3_Net_InitializeInstance;

				// Then we add it to its trace
				this.traceRoot.getPetrinetv3_Net_Initialize_Sequence().add(petrinetv3_Net_InitializeInstance);
			} else

			if (stepRule.equalsIgnoreCase("petrinetv3.Net.run")) {
				// First we create the step
				petrinetv3Trace.Steps.Petrinetv3_Net_Run petrinetv3_Net_RunInstance = petrinetv3Trace.Steps.StepsFactory.eINSTANCE
						.createPetrinetv3_Net_Run();
				petrinetv3_Net_RunInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", petrinetv3_Net_RunInstance);
				} else {
					traceRoot.getRootSteps().add(petrinetv3_Net_RunInstance);
				}
				toPush = petrinetv3_Net_RunInstance;

				// Then we add it to its trace
				this.traceRoot.getPetrinetv3_Net_Run_Sequence().add(petrinetv3_Net_RunInstance);
			} else

			if (stepRule.equalsIgnoreCase("petrinetv3.Net.tickEnabledTransitions")) {
				// First we create the step
				petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions petrinetv3_Net_TickEnabledTransitionsInstance = petrinetv3Trace.Steps.StepsFactory.eINSTANCE
						.createPetrinetv3_Net_TickEnabledTransitions();
				petrinetv3_Net_TickEnabledTransitionsInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", petrinetv3_Net_TickEnabledTransitionsInstance);
				} else {
					traceRoot.getRootSteps().add(petrinetv3_Net_TickEnabledTransitionsInstance);
				}
				toPush = petrinetv3_Net_TickEnabledTransitionsInstance;

				// Then we add it to its trace
				this.traceRoot.getPetrinetv3_Net_TickEnabledTransitions_Sequence().add(
						petrinetv3_Net_TickEnabledTransitionsInstance);
			} else

			if (stepRule.equalsIgnoreCase("petrinetv3.Transition.fire")) {
				// First we create the step
				petrinetv3Trace.Steps.Petrinetv3_Transition_Fire petrinetv3_Transition_FireInstance = petrinetv3Trace.Steps.StepsFactory.eINSTANCE
						.createPetrinetv3_Transition_Fire();
				petrinetv3_Transition_FireInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", petrinetv3_Transition_FireInstance);
				} else {
					traceRoot.getRootSteps().add(petrinetv3_Transition_FireInstance);
				}
				toPush = petrinetv3_Transition_FireInstance;

				// Then we add it to its trace
				this.traceRoot.getPetrinetv3_Transition_Fire_Sequence().add(petrinetv3_Transition_FireInstance);
			}

		}

		context.push(toPush);

	}

	private void addImplicitStep(petrinetv3Trace.Steps.Step currentStep, petrinetv3Trace.States.State startingState,
			petrinetv3Trace.States.State endingState) {
		petrinetv3Trace.Steps.Step implicitStep = null;
		if (currentStep instanceof petrinetv3Trace.Steps.Petrinetv3_Net_Run) {
			implicitStep = petrinetv3Trace.Steps.StepsFactory.eINSTANCE.createPetrinetv3_Net_Run_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			emfAdd(currentStep, "subSteps", implicitStep);
		}
	}

	@Override
	public boolean addStep(org.gemoc.executionframework.engine.mse.MSEOccurrence mseOccurrence) {

		petrinetv3Trace.Steps.Step step = null;

		if (mseOccurrence != null && mseOccurrence instanceof petrinetv3Trace.Steps.Step) {

			step = (petrinetv3Trace.Steps.Step) mseOccurrence;

			// Creating generic (or almost generic) links
			petrinetv3Trace.States.State state = this.traceRoot.getStatesTrace().get(this.getTraceSize() - 1);
			step.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				emfAdd(context.getFirst(), "subSteps", step);
			} else {
				traceRoot.getRootSteps().add(step);
			}

			// Adding step in its dedicated sequence/dimension
			if (step instanceof petrinetv3Trace.Steps.Petrinetv3_Net_Initialize) {
				petrinetv3Trace.Steps.Petrinetv3_Net_Initialize petrinetv3_Net_InitializeInstance = (petrinetv3Trace.Steps.Petrinetv3_Net_Initialize) step;
				this.traceRoot.getPetrinetv3_Net_Initialize_Sequence().add(petrinetv3_Net_InitializeInstance);
			} else if (step instanceof petrinetv3Trace.Steps.Petrinetv3_Net_Run) {
				petrinetv3Trace.Steps.Petrinetv3_Net_Run petrinetv3_Net_RunInstance = (petrinetv3Trace.Steps.Petrinetv3_Net_Run) step;
				this.traceRoot.getPetrinetv3_Net_Run_Sequence().add(petrinetv3_Net_RunInstance);
			} else if (step instanceof petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions) {
				petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions petrinetv3_Net_TickEnabledTransitionsInstance = (petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions) step;
				this.traceRoot.getPetrinetv3_Net_TickEnabledTransitions_Sequence().add(
						petrinetv3_Net_TickEnabledTransitionsInstance);
			} else if (step instanceof petrinetv3Trace.Steps.Petrinetv3_Transition_Fire) {
				petrinetv3Trace.Steps.Petrinetv3_Transition_Fire petrinetv3_Transition_FireInstance = (petrinetv3Trace.Steps.Petrinetv3_Transition_Fire) step;
				this.traceRoot.getPetrinetv3_Transition_Fire_Sequence().add(petrinetv3_Transition_FireInstance);
			}
		}
		context.push(step);

		return (step != null);
	}

	@Override
	public void endStep(String stepRule, Object returnValue) {
		petrinetv3Trace.Steps.Step popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void goTo(EObject state) {

		if (state instanceof petrinetv3Trace.States.State) {
			petrinetv3Trace.States.State stateToGo = (petrinetv3Trace.States.State) state;

			for (petrinetv3Trace.States.Transition_clock_Value value : stateToGo.getTransition_clock_Values()) {

				if (value.getParent() instanceof petrinetv3Trace.States.petrinetv3.TracedTransition) {
					petrinetv3Trace.States.petrinetv3.TracedTransition parent_cast = (petrinetv3Trace.States.petrinetv3.TracedTransition) value
							.getParent();
					int toset = value.getClock();
					int current = ((petrinetv3.Transition) parent_cast.getOriginalObject()).getClock();
					if (current != toset)
						((petrinetv3.Transition) parent_cast.getOriginalObject()).setClock(toset);

				}

			}

			for (petrinetv3Trace.States.Place_tokens_Value value : stateToGo.getPlace_tokens_Values()) {

				if (value.getParent() instanceof petrinetv3Trace.States.petrinetv3.TracedPlace) {
					petrinetv3Trace.States.petrinetv3.TracedPlace parent_cast = (petrinetv3Trace.States.petrinetv3.TracedPlace) value
							.getParent();
					parent_cast.getOriginalObject().getTokens().clear();
					parent_cast.getOriginalObject().getTokens()
							.addAll((Collection<? extends petrinetv3.Token>) getTracedToExe(value.getTokens()));

				}

			}

		} else {
			goToValue(state);
		}
	}

	@Override
	public void goTo(int stepNumber) {
		petrinetv3Trace.States.State stateToGo = traceRoot.getStatesTrace().get(stepNumber);
		goTo(stateToGo);
	}

	private void goToValue(EObject value) {
		Object states = emfGet(value, "states");
		if (states != null) {
			if (states instanceof List<?>) {
				// We get the first state in which this value existed
				Object state = ((List<?>) states).get(0);
				if (state instanceof petrinetv3Trace.States.State) {
					goTo((petrinetv3Trace.States.State) state);
				}
			}
		}
	}

	@Override
	public void initTrace() {
		// Create root
		this.traceRoot = petrinetv3Trace.Petrinetv3TraceFactory.eINSTANCE.createTrace();

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
		petrinetv3Trace.States.State gs = traceRoot.getStatesTrace().get(index);

		if (!gs.getTransition_clock_Values().isEmpty())
			result.append("\nClock values:");
		for (petrinetv3Trace.States.Transition_clock_Value currentState : gs.getTransition_clock_Values()) {
			result.append("\n\t" + currentState.getClock());
		}

		if (!gs.getPlace_tokens_Values().isEmpty())
			result.append("\nTokens values:");
		for (petrinetv3Trace.States.Place_tokens_Value currentState : gs.getPlace_tokens_Values()) {
			String d = "";
			List l = currentState.getTokens();
			int s = l.size();
			for (int i = 0; i < s - 1; i++) {
				d += l.get(i).toString() + ",\n\t\t";
			}
			if (s > 0) {
				d += l.get(s - 1).toString();
			}
			result.append("\n\t" + "[" + d + "]");
		}

		if (!gs.getStartedSteps().isEmpty()) {
			result.append("\n\nStarting steps: ");
			for (petrinetv3Trace.Steps.Step m : gs.getStartedSteps()) {
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
		if (eObject instanceof petrinetv3Trace.States.Transition_clock_Value) {
			return "petrinetv3Trace.States.Transition_clock_Value: "
					+ ((petrinetv3Trace.States.Transition_clock_Value) eObject).getClock();
		} else if (eObject instanceof petrinetv3Trace.States.Place_tokens_Value) {
			return "petrinetv3Trace.States.Place_tokens_Value: "
					+ ((petrinetv3Trace.States.Place_tokens_Value) eObject).getTokens();
		} else
			return "ERROR";
	}

	private void storeAsTracedObject(petrinetv3.Place o) {

		// First we find the traced object, and we create it if required
		petrinetv3Trace.States.petrinetv3.TracedPlace tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = petrinetv3Trace.States.petrinetv3.Petrinetv3Factory.eINSTANCE.createTracedPlace();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getPetrinetv3_tracedPlaces().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getTokensSequence(), this));
		}
	}

	private void storeAsTracedObject(petrinetv3.Token o) {

		// First we find the traced object, and we create it if required
		petrinetv3Trace.States.petrinetv3.TracedToken tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = petrinetv3Trace.States.petrinetv3.Petrinetv3Factory.eINSTANCE.createTracedToken();
			exeToTraced.put(o, tracedObject);
			traceRoot.getPetrinetv3_tracedTokens().add(tracedObject);

		}
	}

	private void storeAsTracedObject(petrinetv3.Transition o) {

		// First we find the traced object, and we create it if required
		petrinetv3Trace.States.petrinetv3.TracedTransition tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = petrinetv3Trace.States.petrinetv3.Petrinetv3Factory.eINSTANCE.createTracedTransition();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getPetrinetv3_tracedTransitions().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getClockSequence(), this));
		}
	}

	private void storeAsTracedObject(EObject o) {
		if (o instanceof petrinetv3.Transition) {
			storeAsTracedObject((petrinetv3.Transition) o);
		} else if (o instanceof petrinetv3.Token) {
			storeAsTracedObject((petrinetv3.Token) o);
		} else if (o instanceof petrinetv3.Place) {
			storeAsTracedObject((petrinetv3.Place) o);
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
		petrinetv3Trace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);
		// We find all current values
		Set<EObject> currentValues = new HashSet<EObject>();
		if (currentState != null) {
			currentValues.addAll(currentState.getTransition_clock_Values());
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
					if (valueState instanceof petrinetv3Trace.States.State) {
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
		petrinetv3Trace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);

		// We start at the top of the forward stack, and we go downward
		petrinetv3Trace.Steps.Step itStep = currentState.getStartedSteps().get(0);
		while (itStep != null) {
			petrinetv3Trace.Steps.Step itStep_prev = itStep;
			if (itStep instanceof petrinetv3Trace.Steps.Step) {
				result.add(createGenericStep((petrinetv3Trace.Steps.Step) itStep));
				List<petrinetv3Trace.Steps.Step> subSteps = (List<petrinetv3Trace.Steps.Step>) emfGet(itStep,
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
		petrinetv3Trace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);

		// We start at the top of the backward stack, and we go downward
		petrinetv3Trace.Steps.Step itStep = currentState.getEndedSteps().get(0);
		while (itStep != null) {
			petrinetv3Trace.Steps.Step itStep_prev = itStep;
			if (itStep instanceof petrinetv3Trace.Steps.Step) {
				result.add(createGenericStep((petrinetv3Trace.Steps.Step) itStep));
				List<petrinetv3Trace.Steps.Step> subSteps = (List<petrinetv3Trace.Steps.Step>) emfGet(itStep,
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
		petrinetv3Trace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);
		List<petrinetv3Trace.Steps.Step> endedSteps = currentState.getEndedSteps();

		if (!endedSteps.isEmpty()) {
			final petrinetv3Trace.Steps.Step endedStep = endedSteps.get(0);
			if (endedStep.getStartingState() != currentState) {
				result.addFirst(createGenericStep(endedStep));
			}
			EObject itStep = endedStep.eContainer();
			while (itStep != null) {
				if (itStep instanceof petrinetv3Trace.Steps.Step) {
					petrinetv3Trace.Steps.Step step = (petrinetv3Trace.Steps.Step) itStep;
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
		final Map<petrinetv3Trace.Steps.Step, fr.inria.diverse.trace.api.IStep> step2IStep = new HashMap<>();
	
		final petrinetv3Trace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);
	
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

	private fr.inria.diverse.trace.api.IStep generateStep(petrinetv3Trace.Steps.Step step) {
		fr.inria.diverse.trace.api.IStep result = null;

		fr.inria.diverse.trace.api.IStep parentStep = null;
		if (step.eContainer() instanceof petrinetv3Trace.Steps.Step) {
			parentStep = createGenericStep((petrinetv3Trace.Steps.Step) step.eContainer());
		}

		if (step instanceof petrinetv3Trace.Steps.Petrinetv3_Net_Initialize) {
			petrinetv3Trace.Steps.Petrinetv3_Net_Initialize step_cast = (petrinetv3Trace.Steps.Petrinetv3_Net_Initialize) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("petrinetv3.Net", "initialize", startIndex,
					endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof petrinetv3Trace.Steps.Petrinetv3_Net_Run) {
			petrinetv3Trace.Steps.Petrinetv3_Net_Run step_cast = (petrinetv3Trace.Steps.Petrinetv3_Net_Run) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("petrinetv3.Net", "run", startIndex, endIndex,
					parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions) {
			petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions step_cast = (petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("petrinetv3.Net", "tickEnabledTransitions",
					startIndex, endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof petrinetv3Trace.Steps.Petrinetv3_Transition_Fire) {
			petrinetv3Trace.Steps.Petrinetv3_Transition_Fire step_cast = (petrinetv3Trace.Steps.Petrinetv3_Transition_Fire) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("petrinetv3.Transition", "fire", startIndex,
					endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof petrinetv3Trace.Steps.Petrinetv3_Net_Run_ImplicitStep) {
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("petrinetv3.Net", "implicitStep", startIndex,
					endIndex, parentStep);
			result.addParameter("this", step);
		}

		return result;
	}

	private fr.inria.diverse.trace.api.IStep createGenericStep(petrinetv3Trace.Steps.Step step) {
		return new fr.inria.diverse.trace.api.impl.LazyGenericStep(() -> {
			return generateStep(step);
		});
		
	}
}
