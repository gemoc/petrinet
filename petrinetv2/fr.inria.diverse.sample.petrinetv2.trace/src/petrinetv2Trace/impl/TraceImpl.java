/**
 */
package petrinetv2Trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinetv2Trace.Petrinetv2TracePackage;

import petrinetv2Trace.States.State;

import petrinetv2Trace.States.petrinetv2.TracedPlace;
import petrinetv2Trace.States.petrinetv2.TracedToken;

import petrinetv2Trace.Steps.Petrinetv2_Net_Initialize;
import petrinetv2Trace.Steps.Petrinetv2_Net_Run;
import petrinetv2Trace.Steps.Petrinetv2_Transition_Fire;
import petrinetv2Trace.Steps.Step;

import petrinetv2Trace.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link petrinetv2Trace.impl.TraceImpl#getPetrinetv2_Net_Initialize_Sequence <em>Petrinetv2 Net Initialize Sequence</em>}</li>
 *   <li>{@link petrinetv2Trace.impl.TraceImpl#getPetrinetv2_Net_Run_Sequence <em>Petrinetv2 Net Run Sequence</em>}</li>
 *   <li>{@link petrinetv2Trace.impl.TraceImpl#getPetrinetv2_Transition_Fire_Sequence <em>Petrinetv2 Transition Fire Sequence</em>}</li>
 *   <li>{@link petrinetv2Trace.impl.TraceImpl#getPetrinetv2_tracedPlaces <em>Petrinetv2 traced Places</em>}</li>
 *   <li>{@link petrinetv2Trace.impl.TraceImpl#getPetrinetv2_tracedTokens <em>Petrinetv2 traced Tokens</em>}</li>
 *   <li>{@link petrinetv2Trace.impl.TraceImpl#getRootSteps <em>Root Steps</em>}</li>
 *   <li>{@link petrinetv2Trace.impl.TraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The cached value of the '{@link #getPetrinetv2_Net_Initialize_Sequence() <em>Petrinetv2 Net Initialize Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv2_Net_Initialize_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Petrinetv2_Net_Initialize> petrinetv2_Net_Initialize_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinetv2_Net_Run_Sequence() <em>Petrinetv2 Net Run Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv2_Net_Run_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Petrinetv2_Net_Run> petrinetv2_Net_Run_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinetv2_Transition_Fire_Sequence() <em>Petrinetv2 Transition Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv2_Transition_Fire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Petrinetv2_Transition_Fire> petrinetv2_Transition_Fire_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinetv2_tracedPlaces() <em>Petrinetv2 traced Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv2_tracedPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPlace> petrinetv2_tracedPlaces;

	/**
	 * The cached value of the '{@link #getPetrinetv2_tracedTokens() <em>Petrinetv2 traced Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv2_tracedTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedToken> petrinetv2_tracedTokens;

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
		return Petrinetv2TracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Petrinetv2_Net_Initialize> getPetrinetv2_Net_Initialize_Sequence() {
		if (petrinetv2_Net_Initialize_Sequence == null) {
			petrinetv2_Net_Initialize_Sequence = new EObjectResolvingEList<Petrinetv2_Net_Initialize>(Petrinetv2_Net_Initialize.class, this, Petrinetv2TracePackage.TRACE__PETRINETV2_NET_INITIALIZE_SEQUENCE);
		}
		return petrinetv2_Net_Initialize_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Petrinetv2_Net_Run> getPetrinetv2_Net_Run_Sequence() {
		if (petrinetv2_Net_Run_Sequence == null) {
			petrinetv2_Net_Run_Sequence = new EObjectResolvingEList<Petrinetv2_Net_Run>(Petrinetv2_Net_Run.class, this, Petrinetv2TracePackage.TRACE__PETRINETV2_NET_RUN_SEQUENCE);
		}
		return petrinetv2_Net_Run_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Petrinetv2_Transition_Fire> getPetrinetv2_Transition_Fire_Sequence() {
		if (petrinetv2_Transition_Fire_Sequence == null) {
			petrinetv2_Transition_Fire_Sequence = new EObjectResolvingEList<Petrinetv2_Transition_Fire>(Petrinetv2_Transition_Fire.class, this, Petrinetv2TracePackage.TRACE__PETRINETV2_TRANSITION_FIRE_SEQUENCE);
		}
		return petrinetv2_Transition_Fire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPlace> getPetrinetv2_tracedPlaces() {
		if (petrinetv2_tracedPlaces == null) {
			petrinetv2_tracedPlaces = new EObjectContainmentEList<TracedPlace>(TracedPlace.class, this, Petrinetv2TracePackage.TRACE__PETRINETV2_TRACED_PLACES);
		}
		return petrinetv2_tracedPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedToken> getPetrinetv2_tracedTokens() {
		if (petrinetv2_tracedTokens == null) {
			petrinetv2_tracedTokens = new EObjectContainmentEList<TracedToken>(TracedToken.class, this, Petrinetv2TracePackage.TRACE__PETRINETV2_TRACED_TOKENS);
		}
		return petrinetv2_tracedTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getRootSteps() {
		if (rootSteps == null) {
			rootSteps = new EObjectContainmentEList<Step>(Step.class, this, Petrinetv2TracePackage.TRACE__ROOT_STEPS);
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
			statesTrace = new EObjectContainmentEList<State>(State.class, this, Petrinetv2TracePackage.TRACE__STATES_TRACE);
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
			case Petrinetv2TracePackage.TRACE__PETRINETV2_TRACED_PLACES:
				return ((InternalEList<?>)getPetrinetv2_tracedPlaces()).basicRemove(otherEnd, msgs);
			case Petrinetv2TracePackage.TRACE__PETRINETV2_TRACED_TOKENS:
				return ((InternalEList<?>)getPetrinetv2_tracedTokens()).basicRemove(otherEnd, msgs);
			case Petrinetv2TracePackage.TRACE__ROOT_STEPS:
				return ((InternalEList<?>)getRootSteps()).basicRemove(otherEnd, msgs);
			case Petrinetv2TracePackage.TRACE__STATES_TRACE:
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
			case Petrinetv2TracePackage.TRACE__PETRINETV2_NET_INITIALIZE_SEQUENCE:
				return getPetrinetv2_Net_Initialize_Sequence();
			case Petrinetv2TracePackage.TRACE__PETRINETV2_NET_RUN_SEQUENCE:
				return getPetrinetv2_Net_Run_Sequence();
			case Petrinetv2TracePackage.TRACE__PETRINETV2_TRANSITION_FIRE_SEQUENCE:
				return getPetrinetv2_Transition_Fire_Sequence();
			case Petrinetv2TracePackage.TRACE__PETRINETV2_TRACED_PLACES:
				return getPetrinetv2_tracedPlaces();
			case Petrinetv2TracePackage.TRACE__PETRINETV2_TRACED_TOKENS:
				return getPetrinetv2_tracedTokens();
			case Petrinetv2TracePackage.TRACE__ROOT_STEPS:
				return getRootSteps();
			case Petrinetv2TracePackage.TRACE__STATES_TRACE:
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
			case Petrinetv2TracePackage.TRACE__PETRINETV2_NET_INITIALIZE_SEQUENCE:
				getPetrinetv2_Net_Initialize_Sequence().clear();
				getPetrinetv2_Net_Initialize_Sequence().addAll((Collection<? extends Petrinetv2_Net_Initialize>)newValue);
				return;
			case Petrinetv2TracePackage.TRACE__PETRINETV2_NET_RUN_SEQUENCE:
				getPetrinetv2_Net_Run_Sequence().clear();
				getPetrinetv2_Net_Run_Sequence().addAll((Collection<? extends Petrinetv2_Net_Run>)newValue);
				return;
			case Petrinetv2TracePackage.TRACE__PETRINETV2_TRANSITION_FIRE_SEQUENCE:
				getPetrinetv2_Transition_Fire_Sequence().clear();
				getPetrinetv2_Transition_Fire_Sequence().addAll((Collection<? extends Petrinetv2_Transition_Fire>)newValue);
				return;
			case Petrinetv2TracePackage.TRACE__PETRINETV2_TRACED_PLACES:
				getPetrinetv2_tracedPlaces().clear();
				getPetrinetv2_tracedPlaces().addAll((Collection<? extends TracedPlace>)newValue);
				return;
			case Petrinetv2TracePackage.TRACE__PETRINETV2_TRACED_TOKENS:
				getPetrinetv2_tracedTokens().clear();
				getPetrinetv2_tracedTokens().addAll((Collection<? extends TracedToken>)newValue);
				return;
			case Petrinetv2TracePackage.TRACE__ROOT_STEPS:
				getRootSteps().clear();
				getRootSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case Petrinetv2TracePackage.TRACE__STATES_TRACE:
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
			case Petrinetv2TracePackage.TRACE__PETRINETV2_NET_INITIALIZE_SEQUENCE:
				getPetrinetv2_Net_Initialize_Sequence().clear();
				return;
			case Petrinetv2TracePackage.TRACE__PETRINETV2_NET_RUN_SEQUENCE:
				getPetrinetv2_Net_Run_Sequence().clear();
				return;
			case Petrinetv2TracePackage.TRACE__PETRINETV2_TRANSITION_FIRE_SEQUENCE:
				getPetrinetv2_Transition_Fire_Sequence().clear();
				return;
			case Petrinetv2TracePackage.TRACE__PETRINETV2_TRACED_PLACES:
				getPetrinetv2_tracedPlaces().clear();
				return;
			case Petrinetv2TracePackage.TRACE__PETRINETV2_TRACED_TOKENS:
				getPetrinetv2_tracedTokens().clear();
				return;
			case Petrinetv2TracePackage.TRACE__ROOT_STEPS:
				getRootSteps().clear();
				return;
			case Petrinetv2TracePackage.TRACE__STATES_TRACE:
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
			case Petrinetv2TracePackage.TRACE__PETRINETV2_NET_INITIALIZE_SEQUENCE:
				return petrinetv2_Net_Initialize_Sequence != null && !petrinetv2_Net_Initialize_Sequence.isEmpty();
			case Petrinetv2TracePackage.TRACE__PETRINETV2_NET_RUN_SEQUENCE:
				return petrinetv2_Net_Run_Sequence != null && !petrinetv2_Net_Run_Sequence.isEmpty();
			case Petrinetv2TracePackage.TRACE__PETRINETV2_TRANSITION_FIRE_SEQUENCE:
				return petrinetv2_Transition_Fire_Sequence != null && !petrinetv2_Transition_Fire_Sequence.isEmpty();
			case Petrinetv2TracePackage.TRACE__PETRINETV2_TRACED_PLACES:
				return petrinetv2_tracedPlaces != null && !petrinetv2_tracedPlaces.isEmpty();
			case Petrinetv2TracePackage.TRACE__PETRINETV2_TRACED_TOKENS:
				return petrinetv2_tracedTokens != null && !petrinetv2_tracedTokens.isEmpty();
			case Petrinetv2TracePackage.TRACE__ROOT_STEPS:
				return rootSteps != null && !rootSteps.isEmpty();
			case Petrinetv2TracePackage.TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
