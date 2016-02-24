/**
 */
package petrinetv1Trace.States.petrinetv1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import petrinetv1.Place;

import petrinetv1Trace.States.Place_tokens_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinetv1Trace.States.petrinetv1.TracedPlace#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link petrinetv1Trace.States.petrinetv1.TracedPlace#getTokensSequence <em>Tokens Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinetv1Trace.States.petrinetv1.Petrinetv1Package#getTracedPlace()
 * @model
 * @generated
 */
public interface TracedPlace extends EObject {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Place)
	 * @see petrinetv1Trace.States.petrinetv1.Petrinetv1Package#getTracedPlace_OriginalObject()
	 * @model
	 * @generated
	 */
	Place getOriginalObject();

	/**
	 * Sets the value of the '{@link petrinetv1Trace.States.petrinetv1.TracedPlace#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Place value);

	/**
	 * Returns the value of the '<em><b>Tokens Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv1Trace.States.Place_tokens_Value}.
	 * It is bidirectional and its opposite is '{@link petrinetv1Trace.States.Place_tokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens Sequence</em>' containment reference list.
	 * @see petrinetv1Trace.States.petrinetv1.Petrinetv1Package#getTracedPlace_TokensSequence()
	 * @see petrinetv1Trace.States.Place_tokens_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Place_tokens_Value> getTokensSequence();

} // TracedPlace
