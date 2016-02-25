/**
 */
package petrinetv3Trace.States.petrinetv3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import petrinetv3.Net;
import petrinetv3.Transition;

import petrinetv3Trace.States.Transition_clock_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinetv3Trace.States.petrinetv3.TracedTransition#getClockSequence <em>Clock Sequence</em>}</li>
 *   <li>{@link petrinetv3Trace.States.petrinetv3.TracedTransition#getInput <em>Input</em>}</li>
 *   <li>{@link petrinetv3Trace.States.petrinetv3.TracedTransition#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link petrinetv3Trace.States.petrinetv3.TracedTransition#getOutput <em>Output</em>}</li>
 *   <li>{@link petrinetv3Trace.States.petrinetv3.TracedTransition#getParentNet <em>Parent Net</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinetv3Trace.States.petrinetv3.Petrinetv3Package#getTracedTransition()
 * @model
 * @generated
 */
public interface TracedTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv3Trace.States.Transition_clock_Value}.
	 * It is bidirectional and its opposite is '{@link petrinetv3Trace.States.Transition_clock_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Sequence</em>' containment reference list.
	 * @see petrinetv3Trace.States.petrinetv3.Petrinetv3Package#getTracedTransition_ClockSequence()
	 * @see petrinetv3Trace.States.Transition_clock_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Transition_clock_Value> getClockSequence();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link petrinetv3Trace.States.petrinetv3.TracedPlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see petrinetv3Trace.States.petrinetv3.Petrinetv3Package#getTracedTransition_Input()
	 * @model required="true"
	 * @generated
	 */
	EList<TracedPlace> getInput();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Transition)
	 * @see petrinetv3Trace.States.petrinetv3.Petrinetv3Package#getTracedTransition_OriginalObject()
	 * @model
	 * @generated
	 */
	Transition getOriginalObject();

	/**
	 * Sets the value of the '{@link petrinetv3Trace.States.petrinetv3.TracedTransition#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Transition value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link petrinetv3Trace.States.petrinetv3.TracedPlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see petrinetv3Trace.States.petrinetv3.Petrinetv3Package#getTracedTransition_Output()
	 * @model required="true"
	 * @generated
	 */
	EList<TracedPlace> getOutput();

	/**
	 * Returns the value of the '<em><b>Parent Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Net</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Net</em>' reference.
	 * @see #setParentNet(Net)
	 * @see petrinetv3Trace.States.petrinetv3.Petrinetv3Package#getTracedTransition_ParentNet()
	 * @model required="true"
	 * @generated
	 */
	Net getParentNet();

	/**
	 * Sets the value of the '{@link petrinetv3Trace.States.petrinetv3.TracedTransition#getParentNet <em>Parent Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Net</em>' reference.
	 * @see #getParentNet()
	 * @generated
	 */
	void setParentNet(Net value);

} // TracedTransition
