/**
 */
package petrinetv1Trace.Steps;

import petrinetv1.Net;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinetv1 Net Initialize</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see petrinetv1Trace.Steps.StepsPackage#getPetrinetv1_Net_Initialize()
 * @model
 * @generated
 */
public interface Petrinetv1_Net_Initialize extends Petrinetv1_Net_Run_AbstractSubStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (Net) this.getMse().getCaller();\n'"
	 * @generated
	 */
	Net getCaller();

} // Petrinetv1_Net_Initialize
