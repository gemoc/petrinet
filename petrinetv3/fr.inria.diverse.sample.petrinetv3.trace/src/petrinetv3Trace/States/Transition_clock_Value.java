/**
 */
package petrinetv3Trace.States;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import petrinetv3Trace.States.petrinetv3.TracedTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition clock Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinetv3Trace.States.Transition_clock_Value#getClock <em>Clock</em>}</li>
 *   <li>{@link petrinetv3Trace.States.Transition_clock_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link petrinetv3Trace.States.Transition_clock_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinetv3Trace.States.StatesPackage#getTransition_clock_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Transition_clock_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' attribute.
	 * @see #setClock(int)
	 * @see petrinetv3Trace.States.StatesPackage#getTransition_clock_Value_Clock()
	 * @model default="-1"
	 * @generated
	 */
	int getClock();

	/**
	 * Sets the value of the '{@link petrinetv3Trace.States.Transition_clock_Value#getClock <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' attribute.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(int value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinetv3Trace.States.petrinetv3.TracedTransition#getClockSequence <em>Clock Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedTransition)
	 * @see petrinetv3Trace.States.StatesPackage#getTransition_clock_Value_Parent()
	 * @see petrinetv3Trace.States.petrinetv3.TracedTransition#getClockSequence
	 * @model opposite="clockSequence" required="true" transient="false"
	 * @generated
	 */
	TracedTransition getParent();

	/**
	 * Sets the value of the '{@link petrinetv3Trace.States.Transition_clock_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedTransition value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link petrinetv3Trace.States.State}.
	 * It is bidirectional and its opposite is '{@link petrinetv3Trace.States.State#getTransition_clock_Values <em>Transition clock Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see petrinetv3Trace.States.StatesPackage#getTransition_clock_Value_States()
	 * @see petrinetv3Trace.States.State#getTransition_clock_Values
	 * @model opposite="transition_clock_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // Transition_clock_Value
