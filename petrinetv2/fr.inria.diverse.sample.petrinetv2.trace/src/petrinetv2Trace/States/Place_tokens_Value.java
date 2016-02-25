/**
 */
package petrinetv2Trace.States;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import petrinetv2Trace.States.petrinetv2.TracedPlace;
import petrinetv2Trace.States.petrinetv2.TracedToken;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place tokens Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinetv2Trace.States.Place_tokens_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link petrinetv2Trace.States.Place_tokens_Value#getStates <em>States</em>}</li>
 *   <li>{@link petrinetv2Trace.States.Place_tokens_Value#getTokens <em>Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinetv2Trace.States.StatesPackage#getPlace_tokens_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Place_tokens_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinetv2Trace.States.petrinetv2.TracedPlace#getTokensSequence <em>Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedPlace)
	 * @see petrinetv2Trace.States.StatesPackage#getPlace_tokens_Value_Parent()
	 * @see petrinetv2Trace.States.petrinetv2.TracedPlace#getTokensSequence
	 * @model opposite="tokensSequence" required="true" transient="false"
	 * @generated
	 */
	TracedPlace getParent();

	/**
	 * Sets the value of the '{@link petrinetv2Trace.States.Place_tokens_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedPlace value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link petrinetv2Trace.States.State}.
	 * It is bidirectional and its opposite is '{@link petrinetv2Trace.States.State#getPlace_tokens_Values <em>Place tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see petrinetv2Trace.States.StatesPackage#getPlace_tokens_Value_States()
	 * @see petrinetv2Trace.States.State#getPlace_tokens_Values
	 * @model opposite="place_tokens_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' reference list.
	 * The list contents are of type {@link petrinetv2Trace.States.petrinetv2.TracedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' reference list.
	 * @see petrinetv2Trace.States.StatesPackage#getPlace_tokens_Value_Tokens()
	 * @model
	 * @generated
	 */
	EList<TracedToken> getTokens();

} // Place_tokens_Value
