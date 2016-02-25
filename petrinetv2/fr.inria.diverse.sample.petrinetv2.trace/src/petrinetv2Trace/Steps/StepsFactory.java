/**
 */
package petrinetv2Trace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see petrinetv2Trace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = petrinetv2Trace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Petrinetv2 Net Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinetv2 Net Initialize</em>'.
	 * @generated
	 */
	Petrinetv2_Net_Initialize createPetrinetv2_Net_Initialize();

	/**
	 * Returns a new object of class '<em>Petrinetv2 Net Run</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinetv2 Net Run</em>'.
	 * @generated
	 */
	Petrinetv2_Net_Run createPetrinetv2_Net_Run();

	/**
	 * Returns a new object of class '<em>Petrinetv2 Net Run Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinetv2 Net Run Implicit Step</em>'.
	 * @generated
	 */
	Petrinetv2_Net_Run_ImplicitStep createPetrinetv2_Net_Run_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Petrinetv2 Transition Fire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinetv2 Transition Fire</em>'.
	 * @generated
	 */
	Petrinetv2_Transition_Fire createPetrinetv2_Transition_Fire();

	/**
	 * Returns a new object of class '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Implicit Step</em>'.
	 * @generated
	 */
	RootImplicitStep createRootImplicitStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
