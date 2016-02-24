/**
 */
package petrinetv1Trace.Steps;

import petrinetv1.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinetv1 Transition Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see petrinetv1Trace.Steps.StepsPackage#getPetrinetv1_Transition_Fire()
 * @model
 * @generated
 */
public interface Petrinetv1_Transition_Fire extends SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (Transition) this.getMse().getCaller();\n'"
	 * @generated
	 */
	Transition getCaller();

} // Petrinetv1_Transition_Fire
