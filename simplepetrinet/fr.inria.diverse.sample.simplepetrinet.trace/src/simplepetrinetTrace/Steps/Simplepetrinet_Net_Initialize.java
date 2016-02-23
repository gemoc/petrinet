/**
 */
package simplepetrinetTrace.Steps;

import simplepetrinet.Net;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simplepetrinet Net Initialize</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see simplepetrinetTrace.Steps.StepsPackage#getSimplepetrinet_Net_Initialize()
 * @model
 * @generated
 */
public interface Simplepetrinet_Net_Initialize extends SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (Net) this.getMse().getCaller();\n'"
	 * @generated
	 */
	Net getCaller();

} // Simplepetrinet_Net_Initialize
