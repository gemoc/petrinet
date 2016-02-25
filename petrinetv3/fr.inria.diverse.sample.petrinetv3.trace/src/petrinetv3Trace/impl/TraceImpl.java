/**
 */
package petrinetv3Trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinetv3Trace.Petrinetv3TracePackage;

import petrinetv3Trace.States.State;

import petrinetv3Trace.States.petrinetv3.TracedPlace;
import petrinetv3Trace.States.petrinetv3.TracedToken;
import petrinetv3Trace.States.petrinetv3.TracedTransition;

import petrinetv3Trace.Steps.Petrinetv3_Net_Initialize;
import petrinetv3Trace.Steps.Petrinetv3_Net_Run;
import petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions;
import petrinetv3Trace.Steps.Petrinetv3_Transition_Fire;
import petrinetv3Trace.Steps.Step;

import petrinetv3Trace.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link petrinetv3Trace.impl.TraceImpl#getPetrinetv3_Net_Initialize_Sequence <em>Petrinetv3 Net Initialize Sequence</em>}</li>
 *   <li>{@link petrinetv3Trace.impl.TraceImpl#getPetrinetv3_Net_Run_Sequence <em>Petrinetv3 Net Run Sequence</em>}</li>
 *   <li>{@link petrinetv3Trace.impl.TraceImpl#getPetrinetv3_Net_TickEnabledTransitions_Sequence <em>Petrinetv3 Net Tick Enabled Transitions Sequence</em>}</li>
 *   <li>{@link petrinetv3Trace.impl.TraceImpl#getPetrinetv3_Transition_Fire_Sequence <em>Petrinetv3 Transition Fire Sequence</em>}</li>
 *   <li>{@link petrinetv3Trace.impl.TraceImpl#getPetrinetv3_tracedPlaces <em>Petrinetv3 traced Places</em>}</li>
 *   <li>{@link petrinetv3Trace.impl.TraceImpl#getPetrinetv3_tracedTokens <em>Petrinetv3 traced Tokens</em>}</li>
 *   <li>{@link petrinetv3Trace.impl.TraceImpl#getPetrinetv3_tracedTransitions <em>Petrinetv3 traced Transitions</em>}</li>
 *   <li>{@link petrinetv3Trace.impl.TraceImpl#getRootSteps <em>Root Steps</em>}</li>
 *   <li>{@link petrinetv3Trace.impl.TraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The cached value of the '{@link #getPetrinetv3_Net_Initialize_Sequence() <em>Petrinetv3 Net Initialize Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv3_Net_Initialize_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Petrinetv3_Net_Initialize> petrinetv3_Net_Initialize_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinetv3_Net_Run_Sequence() <em>Petrinetv3 Net Run Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv3_Net_Run_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Petrinetv3_Net_Run> petrinetv3_Net_Run_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinetv3_Net_TickEnabledTransitions_Sequence() <em>Petrinetv3 Net Tick Enabled Transitions Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv3_Net_TickEnabledTransitions_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Petrinetv3_Net_TickEnabledTransitions> petrinetv3_Net_TickEnabledTransitions_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinetv3_Transition_Fire_Sequence() <em>Petrinetv3 Transition Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv3_Transition_Fire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Petrinetv3_Transition_Fire> petrinetv3_Transition_Fire_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinetv3_tracedPlaces() <em>Petrinetv3 traced Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv3_tracedPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPlace> petrinetv3_tracedPlaces;

	/**
	 * The cached value of the '{@link #getPetrinetv3_tracedTokens() <em>Petrinetv3 traced Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv3_tracedTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedToken> petrinetv3_tracedTokens;

	/**
	 * The cached value of the '{@link #getPetrinetv3_tracedTransitions() <em>Petrinetv3 traced Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv3_tracedTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedTransition> petrinetv3_tracedTransitions;

	/**
	 * The cached value of the '{@link #getRootSteps() <em>Root Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> rootSteps;

	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Petrinetv3TracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Petrinetv3_Net_Initialize> getPetrinetv3_Net_Initialize_Sequence() {
		if (petrinetv3_Net_Initialize_Sequence == null) {
			petrinetv3_Net_Initialize_Sequence = new EObjectResolvingEList<Petrinetv3_Net_Initialize>(Petrinetv3_Net_Initialize.class, this, Petrinetv3TracePackage.TRACE__PETRINETV3_NET_INITIALIZE_SEQUENCE);
		}
		return petrinetv3_Net_Initialize_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Petrinetv3_Net_Run> getPetrinetv3_Net_Run_Sequence() {
		if (petrinetv3_Net_Run_Sequence == null) {
			petrinetv3_Net_Run_Sequence = new EObjectResolvingEList<Petrinetv3_Net_Run>(Petrinetv3_Net_Run.class, this, Petrinetv3TracePackage.TRACE__PETRINETV3_NET_RUN_SEQUENCE);
		}
		return petrinetv3_Net_Run_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Petrinetv3_Net_TickEnabledTransitions> getPetrinetv3_Net_TickEnabledTransitions_Sequence() {
		if (petrinetv3_Net_TickEnabledTransitions_Sequence == null) {
			petrinetv3_Net_TickEnabledTransitions_Sequence = new EObjectResolvingEList<Petrinetv3_Net_TickEnabledTransitions>(Petrinetv3_Net_TickEnabledTransitions.class, this, Petrinetv3TracePackage.TRACE__PETRINETV3_NET_TICK_ENABLED_TRANSITIONS_SEQUENCE);
		}
		return petrinetv3_Net_TickEnabledTransitions_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Petrinetv3_Transition_Fire> getPetrinetv3_Transition_Fire_Sequence() {
		if (petrinetv3_Transition_Fire_Sequence == null) {
			petrinetv3_Transition_Fire_Sequence = new EObjectResolvingEList<Petrinetv3_Transition_Fire>(Petrinetv3_Transition_Fire.class, this, Petrinetv3TracePackage.TRACE__PETRINETV3_TRANSITION_FIRE_SEQUENCE);
		}
		return petrinetv3_Transition_Fire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPlace> getPetrinetv3_tracedPlaces() {
		if (petrinetv3_tracedPlaces == null) {
			petrinetv3_tracedPlaces = new EObjectContainmentEList<TracedPlace>(TracedPlace.class, this, Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_PLACES);
		}
		return petrinetv3_tracedPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedToken> getPetrinetv3_tracedTokens() {
		if (petrinetv3_tracedTokens == null) {
			petrinetv3_tracedTokens = new EObjectContainmentEList<TracedToken>(TracedToken.class, this, Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_TOKENS);
		}
		return petrinetv3_tracedTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedTransition> getPetrinetv3_tracedTransitions() {
		if (petrinetv3_tracedTransitions == null) {
			petrinetv3_tracedTransitions = new EObjectContainmentEList<TracedTransition>(TracedTransition.class, this, Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_TRANSITIONS);
		}
		return petrinetv3_tracedTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getRootSteps() {
		if (rootSteps == null) {
			rootSteps = new EObjectContainmentEList<Step>(Step.class, this, Petrinetv3TracePackage.TRACE__ROOT_STEPS);
		}
		return rootSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, Petrinetv3TracePackage.TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_PLACES:
				return ((InternalEList<?>)getPetrinetv3_tracedPlaces()).basicRemove(otherEnd, msgs);
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_TOKENS:
				return ((InternalEList<?>)getPetrinetv3_tracedTokens()).basicRemove(otherEnd, msgs);
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_TRANSITIONS:
				return ((InternalEList<?>)getPetrinetv3_tracedTransitions()).basicRemove(otherEnd, msgs);
			case Petrinetv3TracePackage.TRACE__ROOT_STEPS:
				return ((InternalEList<?>)getRootSteps()).basicRemove(otherEnd, msgs);
			case Petrinetv3TracePackage.TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Petrinetv3TracePackage.TRACE__PETRINETV3_NET_INITIALIZE_SEQUENCE:
				return getPetrinetv3_Net_Initialize_Sequence();
			case Petrinetv3TracePackage.TRACE__PETRINETV3_NET_RUN_SEQUENCE:
				return getPetrinetv3_Net_Run_Sequence();
			case Petrinetv3TracePackage.TRACE__PETRINETV3_NET_TICK_ENABLED_TRANSITIONS_SEQUENCE:
				return getPetrinetv3_Net_TickEnabledTransitions_Sequence();
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRANSITION_FIRE_SEQUENCE:
				return getPetrinetv3_Transition_Fire_Sequence();
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_PLACES:
				return getPetrinetv3_tracedPlaces();
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_TOKENS:
				return getPetrinetv3_tracedTokens();
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_TRANSITIONS:
				return getPetrinetv3_tracedTransitions();
			case Petrinetv3TracePackage.TRACE__ROOT_STEPS:
				return getRootSteps();
			case Petrinetv3TracePackage.TRACE__STATES_TRACE:
				return getStatesTrace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Petrinetv3TracePackage.TRACE__PETRINETV3_NET_INITIALIZE_SEQUENCE:
				getPetrinetv3_Net_Initialize_Sequence().clear();
				getPetrinetv3_Net_Initialize_Sequence().addAll((Collection<? extends Petrinetv3_Net_Initialize>)newValue);
				return;
			case Petrinetv3TracePackage.TRACE__PETRINETV3_NET_RUN_SEQUENCE:
				getPetrinetv3_Net_Run_Sequence().clear();
				getPetrinetv3_Net_Run_Sequence().addAll((Collection<? extends Petrinetv3_Net_Run>)newValue);
				return;
			case Petrinetv3TracePackage.TRACE__PETRINETV3_NET_TICK_ENABLED_TRANSITIONS_SEQUENCE:
				getPetrinetv3_Net_TickEnabledTransitions_Sequence().clear();
				getPetrinetv3_Net_TickEnabledTransitions_Sequence().addAll((Collection<? extends Petrinetv3_Net_TickEnabledTransitions>)newValue);
				return;
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRANSITION_FIRE_SEQUENCE:
				getPetrinetv3_Transition_Fire_Sequence().clear();
				getPetrinetv3_Transition_Fire_Sequence().addAll((Collection<? extends Petrinetv3_Transition_Fire>)newValue);
				return;
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_PLACES:
				getPetrinetv3_tracedPlaces().clear();
				getPetrinetv3_tracedPlaces().addAll((Collection<? extends TracedPlace>)newValue);
				return;
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_TOKENS:
				getPetrinetv3_tracedTokens().clear();
				getPetrinetv3_tracedTokens().addAll((Collection<? extends TracedToken>)newValue);
				return;
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_TRANSITIONS:
				getPetrinetv3_tracedTransitions().clear();
				getPetrinetv3_tracedTransitions().addAll((Collection<? extends TracedTransition>)newValue);
				return;
			case Petrinetv3TracePackage.TRACE__ROOT_STEPS:
				getRootSteps().clear();
				getRootSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case Petrinetv3TracePackage.TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Petrinetv3TracePackage.TRACE__PETRINETV3_NET_INITIALIZE_SEQUENCE:
				getPetrinetv3_Net_Initialize_Sequence().clear();
				return;
			case Petrinetv3TracePackage.TRACE__PETRINETV3_NET_RUN_SEQUENCE:
				getPetrinetv3_Net_Run_Sequence().clear();
				return;
			case Petrinetv3TracePackage.TRACE__PETRINETV3_NET_TICK_ENABLED_TRANSITIONS_SEQUENCE:
				getPetrinetv3_Net_TickEnabledTransitions_Sequence().clear();
				return;
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRANSITION_FIRE_SEQUENCE:
				getPetrinetv3_Transition_Fire_Sequence().clear();
				return;
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_PLACES:
				getPetrinetv3_tracedPlaces().clear();
				return;
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_TOKENS:
				getPetrinetv3_tracedTokens().clear();
				return;
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_TRANSITIONS:
				getPetrinetv3_tracedTransitions().clear();
				return;
			case Petrinetv3TracePackage.TRACE__ROOT_STEPS:
				getRootSteps().clear();
				return;
			case Petrinetv3TracePackage.TRACE__STATES_TRACE:
				getStatesTrace().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Petrinetv3TracePackage.TRACE__PETRINETV3_NET_INITIALIZE_SEQUENCE:
				return petrinetv3_Net_Initialize_Sequence != null && !petrinetv3_Net_Initialize_Sequence.isEmpty();
			case Petrinetv3TracePackage.TRACE__PETRINETV3_NET_RUN_SEQUENCE:
				return petrinetv3_Net_Run_Sequence != null && !petrinetv3_Net_Run_Sequence.isEmpty();
			case Petrinetv3TracePackage.TRACE__PETRINETV3_NET_TICK_ENABLED_TRANSITIONS_SEQUENCE:
				return petrinetv3_Net_TickEnabledTransitions_Sequence != null && !petrinetv3_Net_TickEnabledTransitions_Sequence.isEmpty();
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRANSITION_FIRE_SEQUENCE:
				return petrinetv3_Transition_Fire_Sequence != null && !petrinetv3_Transition_Fire_Sequence.isEmpty();
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_PLACES:
				return petrinetv3_tracedPlaces != null && !petrinetv3_tracedPlaces.isEmpty();
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_TOKENS:
				return petrinetv3_tracedTokens != null && !petrinetv3_tracedTokens.isEmpty();
			case Petrinetv3TracePackage.TRACE__PETRINETV3_TRACED_TRANSITIONS:
				return petrinetv3_tracedTransitions != null && !petrinetv3_tracedTransitions.isEmpty();
			case Petrinetv3TracePackage.TRACE__ROOT_STEPS:
				return rootSteps != null && !rootSteps.isEmpty();
			case Petrinetv3TracePackage.TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
