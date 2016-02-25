/**
 */
package petrinetv2Trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import petrinetv2Trace.States.State;

import petrinetv2Trace.States.petrinetv2.TracedPlace;
import petrinetv2Trace.States.petrinetv2.TracedToken;

import petrinetv2Trace.Steps.Petrinetv2_Net_Initialize;
import petrinetv2Trace.Steps.Petrinetv2_Net_Run;
import petrinetv2Trace.Steps.Petrinetv2_Transition_Fire;
import petrinetv2Trace.Steps.Step;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinetv2Trace.Trace#getPetrinetv2_Net_Initialize_Sequence <em>Petrinetv2 Net Initialize Sequence</em>}</li>
 *   <li>{@link petrinetv2Trace.Trace#getPetrinetv2_Net_Run_Sequence <em>Petrinetv2 Net Run Sequence</em>}</li>
 *   <li>{@link petrinetv2Trace.Trace#getPetrinetv2_Transition_Fire_Sequence <em>Petrinetv2 Transition Fire Sequence</em>}</li>
 *   <li>{@link petrinetv2Trace.Trace#getPetrinetv2_tracedPlaces <em>Petrinetv2 traced Places</em>}</li>
 *   <li>{@link petrinetv2Trace.Trace#getPetrinetv2_tracedTokens <em>Petrinetv2 traced Tokens</em>}</li>
 *   <li>{@link petrinetv2Trace.Trace#getRootSteps <em>Root Steps</em>}</li>
 *   <li>{@link petrinetv2Trace.Trace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinetv2Trace.Petrinetv2TracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Petrinetv2 Net Initialize Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetv2Trace.Steps.Petrinetv2_Net_Initialize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv2 Net Initialize Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv2 Net Initialize Sequence</em>' reference list.
	 * @see petrinetv2Trace.Petrinetv2TracePackage#getTrace_Petrinetv2_Net_Initialize_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinetv2_Net_Initialize> getPetrinetv2_Net_Initialize_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinetv2 Net Run Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetv2Trace.Steps.Petrinetv2_Net_Run}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv2 Net Run Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv2 Net Run Sequence</em>' reference list.
	 * @see petrinetv2Trace.Petrinetv2TracePackage#getTrace_Petrinetv2_Net_Run_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinetv2_Net_Run> getPetrinetv2_Net_Run_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinetv2 Transition Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetv2Trace.Steps.Petrinetv2_Transition_Fire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv2 Transition Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv2 Transition Fire Sequence</em>' reference list.
	 * @see petrinetv2Trace.Petrinetv2TracePackage#getTrace_Petrinetv2_Transition_Fire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinetv2_Transition_Fire> getPetrinetv2_Transition_Fire_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinetv2 traced Places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv2Trace.States.petrinetv2.TracedPlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv2 traced Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv2 traced Places</em>' containment reference list.
	 * @see petrinetv2Trace.Petrinetv2TracePackage#getTrace_Petrinetv2_tracedPlaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedPlace> getPetrinetv2_tracedPlaces();

	/**
	 * Returns the value of the '<em><b>Petrinetv2 traced Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv2Trace.States.petrinetv2.TracedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetv2 traced Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetv2 traced Tokens</em>' containment reference list.
	 * @see petrinetv2Trace.Petrinetv2TracePackage#getTrace_Petrinetv2_tracedTokens()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedToken> getPetrinetv2_tracedTokens();

	/**
	 * Returns the value of the '<em><b>Root Steps</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv2Trace.Steps.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Steps</em>' containment reference list.
	 * @see petrinetv2Trace.Petrinetv2TracePackage#getTrace_RootSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getRootSteps();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv2Trace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see petrinetv2Trace.Petrinetv2TracePackage#getTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // Trace
