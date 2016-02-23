/**
 */
package simplepetrinetTrace.States.simplepetrinet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simplepetrinetTrace.States.simplepetrinet.SimplepetrinetPackage
 * @generated
 */
public interface SimplepetrinetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplepetrinetFactory eINSTANCE = simplepetrinetTrace.States.simplepetrinet.impl.SimplepetrinetFactoryImpl.init();

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
	SimplepetrinetPackage getSimplepetrinetPackage();

} //SimplepetrinetFactory
