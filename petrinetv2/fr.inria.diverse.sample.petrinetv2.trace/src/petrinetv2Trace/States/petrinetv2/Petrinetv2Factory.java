/**
 */
package petrinetv2Trace.States.petrinetv2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see petrinetv2Trace.States.petrinetv2.Petrinetv2Package
 * @generated
 */
public interface Petrinetv2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Petrinetv2Factory eINSTANCE = petrinetv2Trace.States.petrinetv2.impl.Petrinetv2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Place</em>'.
	 * @generated
	 */
	TracedPlace createTracedPlace();

	/**
	 * Returns a new object of class '<em>Traced Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Token</em>'.
	 * @generated
	 */
	TracedToken createTracedToken();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Petrinetv2Package getPetrinetv2Package();

} //Petrinetv2Factory
