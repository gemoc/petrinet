/**
 */
package petrinetv3Trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import petrinetv3Trace.States.State;

import petrinetv3Trace.States.petrinetv3.TracedPlace;
import petrinetv3Trace.States.petrinetv3.TracedToken;
import petrinetv3Trace.States.petrinetv3.TracedTransition;

import petrinetv3Trace.Steps.Petrinetv3_Net_Initialize;
import petrinetv3Trace.Steps.Petrinetv3_Net_Run;
import petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions;
import petrinetv3Trace.Steps.Petrinetv3_Transition_Fire;
import petrinetv3Trace.Steps.Step;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinetv3Trace.Trace#getPetrinetv3_Net_Initialize_Sequence <em>Petrinetv3 Net Initialize Sequence</em>}</li>
 *   <li>{@link petrinetv3Trace.Trace#getPetrinetv3_Net_Run_Sequence <em>Petrinetv3 Net Run Sequence</em>}</li>
 *   <li>{@link petrinetv3Trace.Trace#getPetrinetv3_Net_TickEnabledTransitions_Sequence <em>Petrinetv3 Net Tick Enabled Transitions Sequence</em>}</li>
 *   <li>{@link petrinetv3Trace.Trace#getPetrinetv3_Transition_Fire_Sequence <em>Petrinetv3 Transition Fire Sequence</em>}</li>
 *   <li>{@link petrinetv3Trace.Trace#getPetrinetv3_tracedPlaces <em>Petrinetv3 traced Places</em>}</li>
 *   <li>{@link petrinetv3Trace.Trace#getPetrinetv3_tracedTokens <em>Petrinetv3 traced Tokens</em>}</li>
 *   <li>{@link petrinetv3Trace.Trace#getPetrinetv3_tracedTransitions <em>Petrinetv3 traced Transitions</em>}</li>
 *   <li>{@link petrinetv3Trace.Trace#getRootSteps <em>Root Steps</em>}</li>
 *   <li>{@link petrinetv3Trace.Trace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinetv3Trace.Petrinetv3TracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Petrinetv3 Net Initialize Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetv3Trace.Steps.Petrinetv3_Net_Initialize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv3 Net Initialize Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv3 Net Initialize Sequence</em>' reference list.
	 * @see petrinetv3Trace.Petrinetv3TracePackage#getTrace_Petrinetv3_Net_Initialize_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinetv3_Net_Initialize> getPetrinetv3_Net_Initialize_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinetv3 Net Run Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetv3Trace.Steps.Petrinetv3_Net_Run}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv3 Net Run Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv3 Net Run Sequence</em>' reference list.
	 * @see petrinetv3Trace.Petrinetv3TracePackage#getTrace_Petrinetv3_Net_Run_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinetv3_Net_Run> getPetrinetv3_Net_Run_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinetv3 Net Tick Enabled Transitions Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv3 Net Tick Enabled Transitions Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv3 Net Tick Enabled Transitions Sequence</em>' reference list.
	 * @see petrinetv3Trace.Petrinetv3TracePackage#getTrace_Petrinetv3_Net_TickEnabledTransitions_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinetv3_Net_TickEnabledTransitions> getPetrinetv3_Net_TickEnabledTransitions_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinetv3 Transition Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetv3Trace.Steps.Petrinetv3_Transition_Fire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv3 Transition Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv3 Transition Fire Sequence</em>' reference list.
	 * @see petrinetv3Trace.Petrinetv3TracePackage#getTrace_Petrinetv3_Transition_Fire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinetv3_Transition_Fire> getPetrinetv3_Transition_Fire_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinetv3 traced Places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv3Trace.States.petrinetv3.TracedPlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv3 traced Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv3 traced Places</em>' containment reference list.
	 * @see petrinetv3Trace.Petrinetv3TracePackage#getTrace_Petrinetv3_tracedPlaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedPlace> getPetrinetv3_tracedPlaces();

	/**
	 * Returns the value of the '<em><b>Petrinetv3 traced Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv3Trace.States.petrinetv3.TracedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv3 traced Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv3 traced Tokens</em>' containment reference list.
	 * @see petrinetv3Trace.Petrinetv3TracePackage#getTrace_Petrinetv3_tracedTokens()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedToken> getPetrinetv3_tracedTokens();

	/**
	 * Returns the value of the '<em><b>Petrinetv3 traced Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv3Trace.States.petrinetv3.TracedTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv3 traced Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv3 traced Transitions</em>' containment reference list.
	 * @see petrinetv3Trace.Petrinetv3TracePackage#getTrace_Petrinetv3_tracedTransitions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedTransition> getPetrinetv3_tracedTransitions();

	/**
	 * Returns the value of the '<em><b>Root Steps</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv3Trace.Steps.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Steps</em>' containment reference list.
	 * @see petrinetv3Trace.Petrinetv3TracePackage#getTrace_RootSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getRootSteps();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv3Trace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see petrinetv3Trace.Petrinetv3TracePackage#getTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // Trace
