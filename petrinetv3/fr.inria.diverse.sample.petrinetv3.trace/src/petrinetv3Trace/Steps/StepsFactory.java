/**
 */
package petrinetv3Trace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see petrinetv3Trace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = petrinetv3Trace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Petrinetv3 Net Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinetv3 Net Initialize</em>'.
	 * @generated
	 */
	Petrinetv3_Net_Initialize createPetrinetv3_Net_Initialize();

	/**
	 * Returns a new object of class '<em>Petrinetv3 Net Run</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinetv3 Net Run</em>'.
	 * @generated
	 */
	Petrinetv3_Net_Run createPetrinetv3_Net_Run();

	/**
	 * Returns a new object of class '<em>Petrinetv3 Net Run Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinetv3 Net Run Implicit Step</em>'.
	 * @generated
	 */
	Petrinetv3_Net_Run_ImplicitStep createPetrinetv3_Net_Run_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Petrinetv3 Net Tick Enabled Transitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinetv3 Net Tick Enabled Transitions</em>'.
	 * @generated
	 */
	Petrinetv3_Net_TickEnabledTransitions createPetrinetv3_Net_TickEnabledTransitions();

	/**
	 * Returns a new object of class '<em>Petrinetv3 Transition Fire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinetv3 Transition Fire</em>'.
	 * @generated
	 */
	Petrinetv3_Transition_Fire createPetrinetv3_Transition_Fire();

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
