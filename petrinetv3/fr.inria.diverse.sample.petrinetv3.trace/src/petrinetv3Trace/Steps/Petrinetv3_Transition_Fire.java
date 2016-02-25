/**
 */
package petrinetv3Trace.Steps;

import petrinetv3.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinetv3 Transition Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see petrinetv3Trace.Steps.StepsPackage#getPetrinetv3_Transition_Fire()
 * @model
 * @generated
 */
public interface Petrinetv3_Transition_Fire extends Petrinetv3_Net_Run_AbstractSubStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (Transition) this.getMse().getCaller();\n'"
	 * @generated
	 */
	Transition getCaller();

} // Petrinetv3_Transition_Fire
