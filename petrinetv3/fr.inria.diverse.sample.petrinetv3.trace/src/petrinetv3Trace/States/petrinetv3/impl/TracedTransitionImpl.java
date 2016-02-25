/**
 */
package petrinetv3Trace.States.petrinetv3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinetv3.Net;
import petrinetv3.Transition;

import petrinetv3Trace.States.StatesPackage;
import petrinetv3Trace.States.Transition_clock_Value;

import petrinetv3Trace.States.petrinetv3.Petrinetv3Package;
import petrinetv3Trace.States.petrinetv3.TracedPlace;
import petrinetv3Trace.States.petrinetv3.TracedTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link petrinetv3Trace.States.petrinetv3.impl.TracedTransitionImpl#getClockSequence <em>Clock Sequence</em>}</li>
 *   <li>{@link petrinetv3Trace.States.petrinetv3.impl.TracedTransitionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link petrinetv3Trace.States.petrinetv3.impl.TracedTransitionImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link petrinetv3Trace.States.petrinetv3.impl.TracedTransitionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link petrinetv3Trace.States.petrinetv3.impl.TracedTransitionImpl#getParentNet <em>Parent Net</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedTransitionImpl extends MinimalEObjectImpl.Container implements TracedTransition {
	/**
	 * The cached value of the '{@link #getClockSequence() <em>Clock Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition_clock_Value> clockSequence;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPlace> input;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Transition originalObject;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPlace> output;

	/**
	 * The cached value of the '{@link #getParentNet() <em>Parent Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNet()
	 * @generated
	 * @ordered
	 */
	protected Net parentNet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Petrinetv3Package.Literals.TRACED_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition_clock_Value> getClockSequence() {
		if (clockSequence == null) {
			clockSequence = new EObjectContainmentWithInverseEList<Transition_clock_Value>(Transition_clock_Value.class, this, Petrinetv3Package.TRACED_TRANSITION__CLOCK_SEQUENCE, StatesPackage.TRANSITION_CLOCK_VALUE__PARENT);
		}
		return clockSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPlace> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<TracedPlace>(TracedPlace.class, this, Petrinetv3Package.TRACED_TRANSITION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Transition)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Petrinetv3Package.TRACED_TRANSITION__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Transition newOriginalObject) {
		Transition oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Petrinetv3Package.TRACED_TRANSITION__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPlace> getOutput() {
		if (output == null) {
			output = new EObjectResolvingEList<TracedPlace>(TracedPlace.class, this, Petrinetv3Package.TRACED_TRANSITION__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net getParentNet() {
		if (parentNet != null && parentNet.eIsProxy()) {
			InternalEObject oldParentNet = (InternalEObject)parentNet;
			parentNet = (Net)eResolveProxy(oldParentNet);
			if (parentNet != oldParentNet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Petrinetv3Package.TRACED_TRANSITION__PARENT_NET, oldParentNet, parentNet));
			}
		}
		return parentNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net basicGetParentNet() {
		return parentNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNet(Net newParentNet) {
		Net oldParentNet = parentNet;
		parentNet = newParentNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Petrinetv3Package.TRACED_TRANSITION__PARENT_NET, oldParentNet, parentNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Petrinetv3Package.TRACED_TRANSITION__CLOCK_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClockSequence()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Petrinetv3Package.TRACED_TRANSITION__CLOCK_SEQUENCE:
				return ((InternalEList<?>)getClockSequence()).basicRemove(otherEnd, msgs);
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
			case Petrinetv3Package.TRACED_TRANSITION__CLOCK_SEQUENCE:
				return getClockSequence();
			case Petrinetv3Package.TRACED_TRANSITION__INPUT:
				return getInput();
			case Petrinetv3Package.TRACED_TRANSITION__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case Petrinetv3Package.TRACED_TRANSITION__OUTPUT:
				return getOutput();
			case Petrinetv3Package.TRACED_TRANSITION__PARENT_NET:
				if (resolve) return getParentNet();
				return basicGetParentNet();
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
			case Petrinetv3Package.TRACED_TRANSITION__CLOCK_SEQUENCE:
				getClockSequence().clear();
				getClockSequence().addAll((Collection<? extends Transition_clock_Value>)newValue);
				return;
			case Petrinetv3Package.TRACED_TRANSITION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends TracedPlace>)newValue);
				return;
			case Petrinetv3Package.TRACED_TRANSITION__ORIGINAL_OBJECT:
				setOriginalObject((Transition)newValue);
				return;
			case Petrinetv3Package.TRACED_TRANSITION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends TracedPlace>)newValue);
				return;
			case Petrinetv3Package.TRACED_TRANSITION__PARENT_NET:
				setParentNet((Net)newValue);
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
			case Petrinetv3Package.TRACED_TRANSITION__CLOCK_SEQUENCE:
				getClockSequence().clear();
				return;
			case Petrinetv3Package.TRACED_TRANSITION__INPUT:
				getInput().clear();
				return;
			case Petrinetv3Package.TRACED_TRANSITION__ORIGINAL_OBJECT:
				setOriginalObject((Transition)null);
				return;
			case Petrinetv3Package.TRACED_TRANSITION__OUTPUT:
				getOutput().clear();
				return;
			case Petrinetv3Package.TRACED_TRANSITION__PARENT_NET:
				setParentNet((Net)null);
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
			case Petrinetv3Package.TRACED_TRANSITION__CLOCK_SEQUENCE:
				return clockSequence != null && !clockSequence.isEmpty();
			case Petrinetv3Package.TRACED_TRANSITION__INPUT:
				return input != null && !input.isEmpty();
			case Petrinetv3Package.TRACED_TRANSITION__ORIGINAL_OBJECT:
				return originalObject != null;
			case Petrinetv3Package.TRACED_TRANSITION__OUTPUT:
				return output != null && !output.isEmpty();
			case Petrinetv3Package.TRACED_TRANSITION__PARENT_NET:
				return parentNet != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedTransitionImpl
