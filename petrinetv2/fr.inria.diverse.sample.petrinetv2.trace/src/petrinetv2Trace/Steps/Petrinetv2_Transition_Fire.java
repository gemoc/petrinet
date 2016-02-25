/**
 */
package petrinetv2Trace.Steps;

import petrinetv2.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinetv2 Transition Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see petrinetv2Trace.Steps.StepsPackage#getPetrinetv2_Transition_Fire()
 * @model
 * @generated
 */
public interface Petrinetv2_Transition_Fire extends Petrinetv2_Net_Run_AbstractSubStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (Transition) this.getMse().getCaller();\n'"
	 * @generated
	 */
	Transition getCaller();

} // Petrinetv2_Transition_Fire
