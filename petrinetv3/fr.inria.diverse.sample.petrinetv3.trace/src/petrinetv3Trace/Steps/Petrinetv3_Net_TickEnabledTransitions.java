/**
 */
package petrinetv3Trace.Steps;

import petrinetv3.Net;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinetv3 Net Tick Enabled Transitions</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see petrinetv3Trace.Steps.StepsPackage#getPetrinetv3_Net_TickEnabledTransitions()
 * @model
 * @generated
 */
public interface Petrinetv3_Net_TickEnabledTransitions extends Petrinetv3_Net_Run_AbstractSubStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (Net) this.getMse().getCaller();\n'"
	 * @generated
	 */
	Net getCaller();

} // Petrinetv3_Net_TickEnabledTransitions
