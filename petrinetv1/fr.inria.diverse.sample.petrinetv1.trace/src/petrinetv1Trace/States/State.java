/**
 */
package petrinetv1Trace.States;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import petrinetv1Trace.Steps.Step;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinetv1Trace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link petrinetv1Trace.States.State#getPlace_tokens_Values <em>Place tokens Values</em>}</li>
 *   <li>{@link petrinetv1Trace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinetv1Trace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link petrinetv1Trace.Steps.Step}.
	 * It is bidirectional and its opposite is '{@link petrinetv1Trace.Steps.Step#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see petrinetv1Trace.States.StatesPackage#getState_EndedSteps()
	 * @see petrinetv1Trace.Steps.Step#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<Step> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Place tokens Values</b></em>' reference list.
	 * The list contents are of type {@link petrinetv1Trace.States.Place_tokens_Value}.
	 * It is bidirectional and its opposite is '{@link petrinetv1Trace.States.Place_tokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place tokens Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place tokens Values</em>' reference list.
	 * @see petrinetv1Trace.States.StatesPackage#getState_Place_tokens_Values()
	 * @see petrinetv1Trace.States.Place_tokens_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Place_tokens_Value> getPlace_tokens_Values();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link petrinetv1Trace.Steps.Step}.
	 * It is bidirectional and its opposite is '{@link petrinetv1Trace.Steps.Step#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see petrinetv1Trace.States.StatesPackage#getState_StartedSteps()
	 * @see petrinetv1Trace.Steps.Step#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<Step> getStartedSteps();

} // State
