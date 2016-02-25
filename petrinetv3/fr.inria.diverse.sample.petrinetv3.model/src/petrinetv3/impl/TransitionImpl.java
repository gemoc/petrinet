/**
 */
package petrinetv3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import petrinetv3.Net;
import petrinetv3.PetrinetV3Package;
import petrinetv3.Place;
import petrinetv3.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link petrinetv3.impl.TransitionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link petrinetv3.impl.TransitionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link petrinetv3.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinetv3.impl.TransitionImpl#getTmin <em>Tmin</em>}</li>
 *   <li>{@link petrinetv3.impl.TransitionImpl#getTmax <em>Tmax</em>}</li>
 *   <li>{@link petrinetv3.impl.TransitionImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link petrinetv3.impl.TransitionImpl#getParentNet <em>Parent Net</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> output;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTmin() <em>Tmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmin()
	 * @generated
	 * @ordered
	 */
	protected static final int TMIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTmin() <em>Tmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmin()
	 * @generated
	 * @ordered
	 */
	protected int tmin = TMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTmax() <em>Tmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmax()
	 * @generated
	 * @ordered
	 */
	protected static final int TMAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTmax() <em>Tmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmax()
	 * @generated
	 * @ordered
	 */
	protected int tmax = TMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected static final int CLOCK_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected int clock = CLOCK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetV3Package.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<Place>(Place.class, this, PetrinetV3Package.TRANSITION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getOutput() {
		if (output == null) {
			output = new EObjectResolvingEList<Place>(Place.class, this, PetrinetV3Package.TRANSITION__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetV3Package.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTmin() {
		return tmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmin(int newTmin) {
		int oldTmin = tmin;
		tmin = newTmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetV3Package.TRANSITION__TMIN, oldTmin, tmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTmax() {
		return tmax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmax(int newTmax) {
		int oldTmax = tmax;
		tmax = newTmax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetV3Package.TRANSITION__TMAX, oldTmax, tmax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(int newClock) {
		int oldClock = clock;
		clock = newClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetV3Package.TRANSITION__CLOCK, oldClock, clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net getParentNet() {
		if (eContainerFeatureID() != PetrinetV3Package.TRANSITION__PARENT_NET) return null;
		return (Net)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentNet(Net newParentNet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentNet, PetrinetV3Package.TRANSITION__PARENT_NET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNet(Net newParentNet) {
		if (newParentNet != eInternalContainer() || (eContainerFeatureID() != PetrinetV3Package.TRANSITION__PARENT_NET && newParentNet != null)) {
			if (EcoreUtil.isAncestor(this, newParentNet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentNet != null)
				msgs = ((InternalEObject)newParentNet).eInverseAdd(this, PetrinetV3Package.NET__TRANSITIONS, Net.class, msgs);
			msgs = basicSetParentNet(newParentNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetV3Package.TRANSITION__PARENT_NET, newParentNet, newParentNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetV3Package.TRANSITION__PARENT_NET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentNet((Net)otherEnd, msgs);
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
			case PetrinetV3Package.TRANSITION__PARENT_NET:
				return basicSetParentNet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PetrinetV3Package.TRANSITION__PARENT_NET:
				return eInternalContainer().eInverseRemove(this, PetrinetV3Package.NET__TRANSITIONS, Net.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetV3Package.TRANSITION__INPUT:
				return getInput();
			case PetrinetV3Package.TRANSITION__OUTPUT:
				return getOutput();
			case PetrinetV3Package.TRANSITION__NAME:
				return getName();
			case PetrinetV3Package.TRANSITION__TMIN:
				return getTmin();
			case PetrinetV3Package.TRANSITION__TMAX:
				return getTmax();
			case PetrinetV3Package.TRANSITION__CLOCK:
				return getClock();
			case PetrinetV3Package.TRANSITION__PARENT_NET:
				return getParentNet();
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
			case PetrinetV3Package.TRANSITION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Place>)newValue);
				return;
			case PetrinetV3Package.TRANSITION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Place>)newValue);
				return;
			case PetrinetV3Package.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case PetrinetV3Package.TRANSITION__TMIN:
				setTmin((Integer)newValue);
				return;
			case PetrinetV3Package.TRANSITION__TMAX:
				setTmax((Integer)newValue);
				return;
			case PetrinetV3Package.TRANSITION__CLOCK:
				setClock((Integer)newValue);
				return;
			case PetrinetV3Package.TRANSITION__PARENT_NET:
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
			case PetrinetV3Package.TRANSITION__INPUT:
				getInput().clear();
				return;
			case PetrinetV3Package.TRANSITION__OUTPUT:
				getOutput().clear();
				return;
			case PetrinetV3Package.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetrinetV3Package.TRANSITION__TMIN:
				setTmin(TMIN_EDEFAULT);
				return;
			case PetrinetV3Package.TRANSITION__TMAX:
				setTmax(TMAX_EDEFAULT);
				return;
			case PetrinetV3Package.TRANSITION__CLOCK:
				setClock(CLOCK_EDEFAULT);
				return;
			case PetrinetV3Package.TRANSITION__PARENT_NET:
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
			case PetrinetV3Package.TRANSITION__INPUT:
				return input != null && !input.isEmpty();
			case PetrinetV3Package.TRANSITION__OUTPUT:
				return output != null && !output.isEmpty();
			case PetrinetV3Package.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetrinetV3Package.TRANSITION__TMIN:
				return tmin != TMIN_EDEFAULT;
			case PetrinetV3Package.TRANSITION__TMAX:
				return tmax != TMAX_EDEFAULT;
			case PetrinetV3Package.TRANSITION__CLOCK:
				return clock != CLOCK_EDEFAULT;
			case PetrinetV3Package.TRANSITION__PARENT_NET:
				return getParentNet() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", tmin: ");
		result.append(tmin);
		result.append(", tmax: ");
		result.append(tmax);
		result.append(", clock: ");
		result.append(clock);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
