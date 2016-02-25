/**
 */
package petrinetv3Trace.Steps;

import org.eclipse.emf.common.util.EList;

import petrinetv3.Net;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinetv3 Net Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinetv3Trace.Steps.Petrinetv3_Net_Run#getSubSteps <em>Sub Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinetv3Trace.Steps.StepsPackage#getPetrinetv3_Net_Run()
 * @model
 * @generated
 */
public interface Petrinetv3_Net_Run extends BigStep {
	/**
	 * Returns the value of the '<em><b>Sub Steps</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv3Trace.Steps.Petrinetv3_Net_Run_AbstractSubStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Steps</em>' containment reference list.
	 * @see petrinetv3Trace.Steps.StepsPackage#getPetrinetv3_Net_Run_SubSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Petrinetv3_Net_Run_AbstractSubStep> getSubSteps();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (Net) this.getMse().getCaller();\n'"
	 * @generated
	 */
	Net getCaller();

} // Petrinetv3_Net_Run
