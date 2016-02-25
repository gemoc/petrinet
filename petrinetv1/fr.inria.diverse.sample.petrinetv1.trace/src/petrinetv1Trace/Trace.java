/**
 */
package petrinetv1Trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import petrinetv1Trace.States.State;

import petrinetv1Trace.States.petrinetv1.TracedPlace;

import petrinetv1Trace.Steps.Petrinetv1_Net_Initialize;
import petrinetv1Trace.Steps.Petrinetv1_Net_Run;
import petrinetv1Trace.Steps.Petrinetv1_Transition_Fire;
import petrinetv1Trace.Steps.Step;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinetv1Trace.Trace#getPetrinetv1_Net_Initialize_Sequence <em>Petrinetv1 Net Initialize Sequence</em>}</li>
 *   <li>{@link petrinetv1Trace.Trace#getPetrinetv1_Net_Run_Sequence <em>Petrinetv1 Net Run Sequence</em>}</li>
 *   <li>{@link petrinetv1Trace.Trace#getPetrinetv1_Transition_Fire_Sequence <em>Petrinetv1 Transition Fire Sequence</em>}</li>
 *   <li>{@link petrinetv1Trace.Trace#getPetrinetv1_tracedPlaces <em>Petrinetv1 traced Places</em>}</li>
 *   <li>{@link petrinetv1Trace.Trace#getRootSteps <em>Root Steps</em>}</li>
 *   <li>{@link petrinetv1Trace.Trace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinetv1Trace.Petrinetv1TracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Petrinetv1 Net Initialize Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetv1Trace.Steps.Petrinetv1_Net_Initialize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv1 Net Initialize Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv1 Net Initialize Sequence</em>' reference list.
	 * @see petrinetv1Trace.Petrinetv1TracePackage#getTrace_Petrinetv1_Net_Initialize_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinetv1_Net_Initialize> getPetrinetv1_Net_Initialize_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinetv1 Net Run Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetv1Trace.Steps.Petrinetv1_Net_Run}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv1 Net Run Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv1 Net Run Sequence</em>' reference list.
	 * @see petrinetv1Trace.Petrinetv1TracePackage#getTrace_Petrinetv1_Net_Run_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinetv1_Net_Run> getPetrinetv1_Net_Run_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinetv1 Transition Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetv1Trace.Steps.Petrinetv1_Transition_Fire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv1 Transition Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv1 Transition Fire Sequence</em>' reference list.
	 * @see petrinetv1Trace.Petrinetv1TracePackage#getTrace_Petrinetv1_Transition_Fire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinetv1_Transition_Fire> getPetrinetv1_Transition_Fire_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinetv1 traced Places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv1Trace.States.petrinetv1.TracedPlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv1 traced Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv1 traced Places</em>' containment reference list.
	 * @see petrinetv1Trace.Petrinetv1TracePackage#getTrace_Petrinetv1_tracedPlaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedPlace> getPetrinetv1_tracedPlaces();

	/**
	 * Returns the value of the '<em><b>Root Steps</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv1Trace.Steps.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Steps</em>' containment reference list.
	 * @see petrinetv1Trace.Petrinetv1TracePackage#getTrace_RootSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getRootSteps();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv1Trace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see petrinetv1Trace.Petrinetv1TracePackage#getTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // Trace
