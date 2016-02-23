/**
 */
package simplepetrinetTrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import simplepetrinetTrace.States.State;

import simplepetrinetTrace.States.simplepetrinet.TracedPlace;

import simplepetrinetTrace.Steps.Simplepetrinet_Net_Initialize;
import simplepetrinetTrace.Steps.Simplepetrinet_Transition_Fire;
import simplepetrinetTrace.Steps.Step;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simplepetrinetTrace.Trace#getSimplepetrinet_Net_Initialize_Sequence <em>Simplepetrinet Net Initialize Sequence</em>}</li>
 *   <li>{@link simplepetrinetTrace.Trace#getSimplepetrinet_Transition_Fire_Sequence <em>Simplepetrinet Transition Fire Sequence</em>}</li>
 *   <li>{@link simplepetrinetTrace.Trace#getRootSteps <em>Root Steps</em>}</li>
 *   <li>{@link simplepetrinetTrace.Trace#getSimplepetrinet_tracedPlaces <em>Simplepetrinet traced Places</em>}</li>
 *   <li>{@link simplepetrinetTrace.Trace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see simplepetrinetTrace.SimplepetrinetTracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Simplepetrinet Net Initialize Sequence</b></em>' reference list.
	 * The list contents are of type {@link simplepetrinetTrace.Steps.Simplepetrinet_Net_Initialize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simplepetrinet Net Initialize Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplepetrinet Net Initialize Sequence</em>' reference list.
	 * @see simplepetrinetTrace.SimplepetrinetTracePackage#getTrace_Simplepetrinet_Net_Initialize_Sequence()
	 * @model
	 * @generated
	 */
	EList<Simplepetrinet_Net_Initialize> getSimplepetrinet_Net_Initialize_Sequence();

	/**
	 * Returns the value of the '<em><b>Simplepetrinet Transition Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link simplepetrinetTrace.Steps.Simplepetrinet_Transition_Fire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simplepetrinet Transition Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplepetrinet Transition Fire Sequence</em>' reference list.
	 * @see simplepetrinetTrace.SimplepetrinetTracePackage#getTrace_Simplepetrinet_Transition_Fire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Simplepetrinet_Transition_Fire> getSimplepetrinet_Transition_Fire_Sequence();

	/**
	 * Returns the value of the '<em><b>Root Steps</b></em>' containment reference list.
	 * The list contents are of type {@link simplepetrinetTrace.Steps.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Steps</em>' containment reference list.
	 * @see simplepetrinetTrace.SimplepetrinetTracePackage#getTrace_RootSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getRootSteps();

	/**
	 * Returns the value of the '<em><b>Simplepetrinet traced Places</b></em>' containment reference list.
	 * The list contents are of type {@link simplepetrinetTrace.States.simplepetrinet.TracedPlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simplepetrinet traced Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplepetrinet traced Places</em>' containment reference list.
	 * @see simplepetrinetTrace.SimplepetrinetTracePackage#getTrace_Simplepetrinet_tracedPlaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedPlace> getSimplepetrinet_tracedPlaces();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link simplepetrinetTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see simplepetrinetTrace.SimplepetrinetTracePackage#getTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // Trace
