/**
 */
package simplepetrinetTrace.Steps;

import simplepetrinet.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simplepetrinet Transition Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see simplepetrinetTrace.Steps.StepsPackage#getSimplepetrinet_Transition_Fire()
 * @model
 * @generated
 */
public interface Simplepetrinet_Transition_Fire extends SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (Transition) this.getMse().getCaller();\n'"
	 * @generated
	 */
	Transition getCaller();

} // Simplepetrinet_Transition_Fire
