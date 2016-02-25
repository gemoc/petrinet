/**
 */
package petrinetv2Trace.States.petrinetv2.impl;

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

import petrinetv2.Place;
import petrinetv2.Token;

import petrinetv2Trace.States.Place_tokens_Value;
import petrinetv2Trace.States.StatesPackage;

import petrinetv2Trace.States.petrinetv2.Petrinetv2Package;
import petrinetv2Trace.States.petrinetv2.TracedPlace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link petrinetv2Trace.States.petrinetv2.impl.TracedPlaceImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link petrinetv2Trace.States.petrinetv2.impl.TracedPlaceImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link petrinetv2Trace.States.petrinetv2.impl.TracedPlaceImpl#getTokensSequence <em>Tokens Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedPlaceImpl extends MinimalEObjectImpl.Container implements TracedPlace {
	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Place originalObject;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> tokens;

	/**
	 * The cached value of the '{@link #getTokensSequence() <em>Tokens Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokensSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Place_tokens_Value> tokensSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Petrinetv2Package.Literals.TRACED_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Place)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Petrinetv2Package.TRACED_PLACE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Place newOriginalObject) {
		Place oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Petrinetv2Package.TRACED_PLACE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getTokens() {
		if (tokens == null) {
			tokens = new EObjectResolvingEList<Token>(Token.class, this, Petrinetv2Package.TRACED_PLACE__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place_tokens_Value> getTokensSequence() {
		if (tokensSequence == null) {
			tokensSequence = new EObjectContainmentWithInverseEList<Place_tokens_Value>(Place_tokens_Value.class, this, Petrinetv2Package.TRACED_PLACE__TOKENS_SEQUENCE, StatesPackage.PLACE_TOKENS_VALUE__PARENT);
		}
		return tokensSequence;
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
			case Petrinetv2Package.TRACED_PLACE__TOKENS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTokensSequence()).basicAdd(otherEnd, msgs);
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
			case Petrinetv2Package.TRACED_PLACE__TOKENS_SEQUENCE:
				return ((InternalEList<?>)getTokensSequence()).basicRemove(otherEnd, msgs);
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
			case Petrinetv2Package.TRACED_PLACE__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case Petrinetv2Package.TRACED_PLACE__TOKENS:
				return getTokens();
			case Petrinetv2Package.TRACED_PLACE__TOKENS_SEQUENCE:
				return getTokensSequence();
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
			case Petrinetv2Package.TRACED_PLACE__ORIGINAL_OBJECT:
				setOriginalObject((Place)newValue);
				return;
			case Petrinetv2Package.TRACED_PLACE__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case Petrinetv2Package.TRACED_PLACE__TOKENS_SEQUENCE:
				getTokensSequence().clear();
				getTokensSequence().addAll((Collection<? extends Place_tokens_Value>)newValue);
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
			case Petrinetv2Package.TRACED_PLACE__ORIGINAL_OBJECT:
				setOriginalObject((Place)null);
				return;
			case Petrinetv2Package.TRACED_PLACE__TOKENS:
				getTokens().clear();
				return;
			case Petrinetv2Package.TRACED_PLACE__TOKENS_SEQUENCE:
				getTokensSequence().clear();
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
			case Petrinetv2Package.TRACED_PLACE__ORIGINAL_OBJECT:
				return originalObject != null;
			case Petrinetv2Package.TRACED_PLACE__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case Petrinetv2Package.TRACED_PLACE__TOKENS_SEQUENCE:
				return tokensSequence != null && !tokensSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedPlaceImpl
