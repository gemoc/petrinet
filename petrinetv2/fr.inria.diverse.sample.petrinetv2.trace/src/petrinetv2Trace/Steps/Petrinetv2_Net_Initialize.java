/**
 */
package petrinetv2Trace.Steps;

import petrinetv2.Net;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinetv2 Net Initialize</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see petrinetv2Trace.Steps.StepsPackage#getPetrinetv2_Net_Initialize()
 * @model
 * @generated
 */
public interface Petrinetv2_Net_Initialize extends Petrinetv2_Net_Run_AbstractSubStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (Net) this.getMse().getCaller();\n'"
	 * @generated
	 */
	Net getCaller();

} // Petrinetv2_Net_Initialize
