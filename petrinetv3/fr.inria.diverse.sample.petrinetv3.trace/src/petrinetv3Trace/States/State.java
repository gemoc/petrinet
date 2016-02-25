/**
 */
package petrinetv3Trace.States;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import petrinetv3Trace.Steps.Step;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinetv3Trace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link petrinetv3Trace.States.State#getPlace_tokens_Values <em>Place tokens Values</em>}</li>
 *   <li>{@link petrinetv3Trace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link petrinetv3Trace.States.State#getTransition_clock_Values <em>Transition clock Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinetv3Trace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link petrinetv3Trace.Steps.Step}.
	 * It is bidirectional and its opposite is '{@link petrinetv3Trace.Steps.Step#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see petrinetv3Trace.States.StatesPackage#getState_EndedSteps()
	 * @see petrinetv3Trace.Steps.Step#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<Step> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Place tokens Values</b></em>' reference list.
	 * The list contents are of type {@link petrinetv3Trace.States.Place_tokens_Value}.
	 * It is bidirectional and its opposite is '{@link petrinetv3Trace.States.Place_tokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place tokens Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place tokens Values</em>' reference list.
	 * @see petrinetv3Trace.States.StatesPackage#getState_Place_tokens_Values()
	 * @see petrinetv3Trace.States.Place_tokens_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Place_tokens_Value> getPlace_tokens_Values();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link petrinetv3Trace.Steps.Step}.
	 * It is bidirectional and its opposite is '{@link petrinetv3Trace.Steps.Step#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see petrinetv3Trace.States.StatesPackage#getState_StartedSteps()
	 * @see petrinetv3Trace.Steps.Step#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<Step> getStartedSteps();

	/**
	 * Returns the value of the '<em><b>Transition clock Values</b></em>' reference list.
	 * The list contents are of type {@link petrinetv3Trace.States.Transition_clock_Value}.
	 * It is bidirectional and its opposite is '{@link petrinetv3Trace.States.Transition_clock_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition clock Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition clock Values</em>' reference list.
	 * @see petrinetv3Trace.States.StatesPackage#getState_Transition_clock_Values()
	 * @see petrinetv3Trace.States.Transition_clock_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Transition_clock_Value> getTransition_clock_Values();

} // State
