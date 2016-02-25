/**
 */
package petrinetv1Trace.States.petrinetv1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see petrinetv1Trace.States.petrinetv1.Petrinetv1Package
 * @generated
 */
public interface Petrinetv1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Petrinetv1Factory eINSTANCE = petrinetv1Trace.States.petrinetv1.impl.Petrinetv1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Place</em>'.
	 * @generated
	 */
	TracedPlace createTracedPlace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Petrinetv1Package getPetrinetv1Package();

} //Petrinetv1Factory
