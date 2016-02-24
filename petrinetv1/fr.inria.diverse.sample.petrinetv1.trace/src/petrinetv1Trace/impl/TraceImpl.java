/**
 */
package petrinetv1Trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinetv1Trace.Petrinetv1TracePackage;

import petrinetv1Trace.States.State;

import petrinetv1Trace.States.petrinetv1.TracedPlace;

import petrinetv1Trace.Steps.Petrinetv1_Net_Initialize;
import petrinetv1Trace.Steps.Petrinetv1_Transition_Fire;
import petrinetv1Trace.Steps.Step;

import petrinetv1Trace.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link petrinetv1Trace.impl.TraceImpl#getPetrinetv1_Net_Initialize_Sequence <em>Petrinetv1 Net Initialize Sequence</em>}</li>
 *   <li>{@link petrinetv1Trace.impl.TraceImpl#getPetrinetv1_Transition_Fire_Sequence <em>Petrinetv1 Transition Fire Sequence</em>}</li>
 *   <li>{@link petrinetv1Trace.impl.TraceImpl#getPetrinetv1_tracedPlaces <em>Petrinetv1 traced Places</em>}</li>
 *   <li>{@link petrinetv1Trace.impl.TraceImpl#getRootSteps <em>Root Steps</em>}</li>
 *   <li>{@link petrinetv1Trace.impl.TraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The cached value of the '{@link #getPetrinetv1_Net_Initialize_Sequence() <em>Petrinetv1 Net Initialize Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv1_Net_Initialize_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Petrinetv1_Net_Initialize> petrinetv1_Net_Initialize_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinetv1_Transition_Fire_Sequence() <em>Petrinetv1 Transition Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv1_Transition_Fire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Petrinetv1_Transition_Fire> petrinetv1_Transition_Fire_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinetv1_tracedPlaces() <em>Petrinetv1 traced Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetv1_tracedPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPlace> petrinetv1_tracedPlaces;

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
		return Petrinetv1TracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Petrinetv1_Net_Initialize> getPetrinetv1_Net_Initialize_Sequence() {
		if (petrinetv1_Net_Initialize_Sequence == null) {
			petrinetv1_Net_Initialize_Sequence = new EObjectResolvingEList<Petrinetv1_Net_Initialize>(Petrinetv1_Net_Initialize.class, this, Petrinetv1TracePackage.TRACE__PETRINETV1_NET_INITIALIZE_SEQUENCE);
		}
		return petrinetv1_Net_Initialize_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Petrinetv1_Transition_Fire> getPetrinetv1_Transition_Fire_Sequence() {
		if (petrinetv1_Transition_Fire_Sequence == null) {
			petrinetv1_Transition_Fire_Sequence = new EObjectResolvingEList<Petrinetv1_Transition_Fire>(Petrinetv1_Transition_Fire.class, this, Petrinetv1TracePackage.TRACE__PETRINETV1_TRANSITION_FIRE_SEQUENCE);
		}
		return petrinetv1_Transition_Fire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPlace> getPetrinetv1_tracedPlaces() {
		if (petrinetv1_tracedPlaces == null) {
			petrinetv1_tracedPlaces = new EObjectContainmentEList<TracedPlace>(TracedPlace.class, this, Petrinetv1TracePackage.TRACE__PETRINETV1_TRACED_PLACES);
		}
		return petrinetv1_tracedPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getRootSteps() {
		if (rootSteps == null) {
			rootSteps = new EObjectContainmentEList<Step>(Step.class, this, Petrinetv1TracePackage.TRACE__ROOT_STEPS);
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
			statesTrace = new EObjectContainmentEList<State>(State.class, this, Petrinetv1TracePackage.TRACE__STATES_TRACE);
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
			case Petrinetv1TracePackage.TRACE__PETRINETV1_TRACED_PLACES:
				return ((InternalEList<?>)getPetrinetv1_tracedPlaces()).basicRemove(otherEnd, msgs);
			case Petrinetv1TracePackage.TRACE__ROOT_STEPS:
				return ((InternalEList<?>)getRootSteps()).basicRemove(otherEnd, msgs);
			case Petrinetv1TracePackage.TRACE__STATES_TRACE:
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
			case Petrinetv1TracePackage.TRACE__PETRINETV1_NET_INITIALIZE_SEQUENCE:
				return getPetrinetv1_Net_Initialize_Sequence();
			case Petrinetv1TracePackage.TRACE__PETRINETV1_TRANSITION_FIRE_SEQUENCE:
				return getPetrinetv1_Transition_Fire_Sequence();
			case Petrinetv1TracePackage.TRACE__PETRINETV1_TRACED_PLACES:
				return getPetrinetv1_tracedPlaces();
			case Petrinetv1TracePackage.TRACE__ROOT_STEPS:
				return getRootSteps();
			case Petrinetv1TracePackage.TRACE__STATES_TRACE:
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
			case Petrinetv1TracePackage.TRACE__PETRINETV1_NET_INITIALIZE_SEQUENCE:
				getPetrinetv1_Net_Initialize_Sequence().clear();
				getPetrinetv1_Net_Initialize_Sequence().addAll((Collection<? extends Petrinetv1_Net_Initialize>)newValue);
				return;
			case Petrinetv1TracePackage.TRACE__PETRINETV1_TRANSITION_FIRE_SEQUENCE:
				getPetrinetv1_Transition_Fire_Sequence().clear();
				getPetrinetv1_Transition_Fire_Sequence().addAll((Collection<? extends Petrinetv1_Transition_Fire>)newValue);
				return;
			case Petrinetv1TracePackage.TRACE__PETRINETV1_TRACED_PLACES:
				getPetrinetv1_tracedPlaces().clear();
				getPetrinetv1_tracedPlaces().addAll((Collection<? extends TracedPlace>)newValue);
				return;
			case Petrinetv1TracePackage.TRACE__ROOT_STEPS:
				getRootSteps().clear();
				getRootSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case Petrinetv1TracePackage.TRACE__STATES_TRACE:
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
			case Petrinetv1TracePackage.TRACE__PETRINETV1_NET_INITIALIZE_SEQUENCE:
				getPetrinetv1_Net_Initialize_Sequence().clear();
				return;
			case Petrinetv1TracePackage.TRACE__PETRINETV1_TRANSITION_FIRE_SEQUENCE:
				getPetrinetv1_Transition_Fire_Sequence().clear();
				return;
			case Petrinetv1TracePackage.TRACE__PETRINETV1_TRACED_PLACES:
				getPetrinetv1_tracedPlaces().clear();
				return;
			case Petrinetv1TracePackage.TRACE__ROOT_STEPS:
				getRootSteps().clear();
				return;
			case Petrinetv1TracePackage.TRACE__STATES_TRACE:
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
			case Petrinetv1TracePackage.TRACE__PETRINETV1_NET_INITIALIZE_SEQUENCE:
				return petrinetv1_Net_Initialize_Sequence != null && !petrinetv1_Net_Initialize_Sequence.isEmpty();
			case Petrinetv1TracePackage.TRACE__PETRINETV1_TRANSITION_FIRE_SEQUENCE:
				return petrinetv1_Transition_Fire_Sequence != null && !petrinetv1_Transition_Fire_Sequence.isEmpty();
			case Petrinetv1TracePackage.TRACE__PETRINETV1_TRACED_PLACES:
				return petrinetv1_tracedPlaces != null && !petrinetv1_tracedPlaces.isEmpty();
			case Petrinetv1TracePackage.TRACE__ROOT_STEPS:
				return rootSteps != null && !rootSteps.isEmpty();
			case Petrinetv1TracePackage.TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
