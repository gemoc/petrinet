/**
 */
package simplepetrinetTrace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplepetrinetTrace.SimplepetrinetTracePackage;

import simplepetrinetTrace.States.State;

import simplepetrinetTrace.States.simplepetrinet.TracedPlace;

import simplepetrinetTrace.Steps.Simplepetrinet_Net_Initialize;
import simplepetrinetTrace.Steps.Simplepetrinet_Transition_Fire;
import simplepetrinetTrace.Steps.Step;

import simplepetrinetTrace.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simplepetrinetTrace.impl.TraceImpl#getSimplepetrinet_Net_Initialize_Sequence <em>Simplepetrinet Net Initialize Sequence</em>}</li>
 *   <li>{@link simplepetrinetTrace.impl.TraceImpl#getSimplepetrinet_Transition_Fire_Sequence <em>Simplepetrinet Transition Fire Sequence</em>}</li>
 *   <li>{@link simplepetrinetTrace.impl.TraceImpl#getRootSteps <em>Root Steps</em>}</li>
 *   <li>{@link simplepetrinetTrace.impl.TraceImpl#getSimplepetrinet_tracedPlaces <em>Simplepetrinet traced Places</em>}</li>
 *   <li>{@link simplepetrinetTrace.impl.TraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The cached value of the '{@link #getSimplepetrinet_Net_Initialize_Sequence() <em>Simplepetrinet Net Initialize Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplepetrinet_Net_Initialize_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Simplepetrinet_Net_Initialize> simplepetrinet_Net_Initialize_Sequence;

	/**
	 * The cached value of the '{@link #getSimplepetrinet_Transition_Fire_Sequence() <em>Simplepetrinet Transition Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplepetrinet_Transition_Fire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Simplepetrinet_Transition_Fire> simplepetrinet_Transition_Fire_Sequence;

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
	 * The cached value of the '{@link #getSimplepetrinet_tracedPlaces() <em>Simplepetrinet traced Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplepetrinet_tracedPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPlace> simplepetrinet_tracedPlaces;

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
		return SimplepetrinetTracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Simplepetrinet_Net_Initialize> getSimplepetrinet_Net_Initialize_Sequence() {
		if (simplepetrinet_Net_Initialize_Sequence == null) {
			simplepetrinet_Net_Initialize_Sequence = new EObjectResolvingEList<Simplepetrinet_Net_Initialize>(Simplepetrinet_Net_Initialize.class, this, SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_NET_INITIALIZE_SEQUENCE);
		}
		return simplepetrinet_Net_Initialize_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Simplepetrinet_Transition_Fire> getSimplepetrinet_Transition_Fire_Sequence() {
		if (simplepetrinet_Transition_Fire_Sequence == null) {
			simplepetrinet_Transition_Fire_Sequence = new EObjectResolvingEList<Simplepetrinet_Transition_Fire>(Simplepetrinet_Transition_Fire.class, this, SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_TRANSITION_FIRE_SEQUENCE);
		}
		return simplepetrinet_Transition_Fire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getRootSteps() {
		if (rootSteps == null) {
			rootSteps = new EObjectContainmentEList<Step>(Step.class, this, SimplepetrinetTracePackage.TRACE__ROOT_STEPS);
		}
		return rootSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPlace> getSimplepetrinet_tracedPlaces() {
		if (simplepetrinet_tracedPlaces == null) {
			simplepetrinet_tracedPlaces = new EObjectContainmentEList<TracedPlace>(TracedPlace.class, this, SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_TRACED_PLACES);
		}
		return simplepetrinet_tracedPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, SimplepetrinetTracePackage.TRACE__STATES_TRACE);
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
			case SimplepetrinetTracePackage.TRACE__ROOT_STEPS:
				return ((InternalEList<?>)getRootSteps()).basicRemove(otherEnd, msgs);
			case SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_TRACED_PLACES:
				return ((InternalEList<?>)getSimplepetrinet_tracedPlaces()).basicRemove(otherEnd, msgs);
			case SimplepetrinetTracePackage.TRACE__STATES_TRACE:
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
			case SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_NET_INITIALIZE_SEQUENCE:
				return getSimplepetrinet_Net_Initialize_Sequence();
			case SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_TRANSITION_FIRE_SEQUENCE:
				return getSimplepetrinet_Transition_Fire_Sequence();
			case SimplepetrinetTracePackage.TRACE__ROOT_STEPS:
				return getRootSteps();
			case SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_TRACED_PLACES:
				return getSimplepetrinet_tracedPlaces();
			case SimplepetrinetTracePackage.TRACE__STATES_TRACE:
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
			case SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_NET_INITIALIZE_SEQUENCE:
				getSimplepetrinet_Net_Initialize_Sequence().clear();
				getSimplepetrinet_Net_Initialize_Sequence().addAll((Collection<? extends Simplepetrinet_Net_Initialize>)newValue);
				return;
			case SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_TRANSITION_FIRE_SEQUENCE:
				getSimplepetrinet_Transition_Fire_Sequence().clear();
				getSimplepetrinet_Transition_Fire_Sequence().addAll((Collection<? extends Simplepetrinet_Transition_Fire>)newValue);
				return;
			case SimplepetrinetTracePackage.TRACE__ROOT_STEPS:
				getRootSteps().clear();
				getRootSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_TRACED_PLACES:
				getSimplepetrinet_tracedPlaces().clear();
				getSimplepetrinet_tracedPlaces().addAll((Collection<? extends TracedPlace>)newValue);
				return;
			case SimplepetrinetTracePackage.TRACE__STATES_TRACE:
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
			case SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_NET_INITIALIZE_SEQUENCE:
				getSimplepetrinet_Net_Initialize_Sequence().clear();
				return;
			case SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_TRANSITION_FIRE_SEQUENCE:
				getSimplepetrinet_Transition_Fire_Sequence().clear();
				return;
			case SimplepetrinetTracePackage.TRACE__ROOT_STEPS:
				getRootSteps().clear();
				return;
			case SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_TRACED_PLACES:
				getSimplepetrinet_tracedPlaces().clear();
				return;
			case SimplepetrinetTracePackage.TRACE__STATES_TRACE:
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
			case SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_NET_INITIALIZE_SEQUENCE:
				return simplepetrinet_Net_Initialize_Sequence != null && !simplepetrinet_Net_Initialize_Sequence.isEmpty();
			case SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_TRANSITION_FIRE_SEQUENCE:
				return simplepetrinet_Transition_Fire_Sequence != null && !simplepetrinet_Transition_Fire_Sequence.isEmpty();
			case SimplepetrinetTracePackage.TRACE__ROOT_STEPS:
				return rootSteps != null && !rootSteps.isEmpty();
			case SimplepetrinetTracePackage.TRACE__SIMPLEPETRINET_TRACED_PLACES:
				return simplepetrinet_tracedPlaces != null && !simplepetrinet_tracedPlaces.isEmpty();
			case SimplepetrinetTracePackage.TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
