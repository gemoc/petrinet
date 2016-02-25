/**
 */
package petrinetv3Trace.Steps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinetv3Trace.Steps.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsFactoryImpl extends EFactoryImpl implements StepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepsFactory init() {
		try {
			StepsFactory theStepsFactory = (StepsFactory)EPackage.Registry.INSTANCE.getEFactory(StepsPackage.eNS_URI);
			if (theStepsFactory != null) {
				return theStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StepsPackage.PETRINETV3_NET_INITIALIZE: return createPetrinetv3_Net_Initialize();
			case StepsPackage.PETRINETV3_NET_RUN: return createPetrinetv3_Net_Run();
			case StepsPackage.PETRINETV3_NET_RUN_IMPLICIT_STEP: return createPetrinetv3_Net_Run_ImplicitStep();
			case StepsPackage.PETRINETV3_NET_TICK_ENABLED_TRANSITIONS: return createPetrinetv3_Net_TickEnabledTransitions();
			case StepsPackage.PETRINETV3_TRANSITION_FIRE: return createPetrinetv3_Transition_Fire();
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv3_Net_Initialize createPetrinetv3_Net_Initialize() {
		Petrinetv3_Net_InitializeImpl petrinetv3_Net_Initialize = new Petrinetv3_Net_InitializeImpl();
		return petrinetv3_Net_Initialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv3_Net_Run createPetrinetv3_Net_Run() {
		Petrinetv3_Net_RunImpl petrinetv3_Net_Run = new Petrinetv3_Net_RunImpl();
		return petrinetv3_Net_Run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv3_Net_Run_ImplicitStep createPetrinetv3_Net_Run_ImplicitStep() {
		Petrinetv3_Net_Run_ImplicitStepImpl petrinetv3_Net_Run_ImplicitStep = new Petrinetv3_Net_Run_ImplicitStepImpl();
		return petrinetv3_Net_Run_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv3_Net_TickEnabledTransitions createPetrinetv3_Net_TickEnabledTransitions() {
		Petrinetv3_Net_TickEnabledTransitionsImpl petrinetv3_Net_TickEnabledTransitions = new Petrinetv3_Net_TickEnabledTransitionsImpl();
		return petrinetv3_Net_TickEnabledTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv3_Transition_Fire createPetrinetv3_Transition_Fire() {
		Petrinetv3_Transition_FireImpl petrinetv3_Transition_Fire = new Petrinetv3_Transition_FireImpl();
		return petrinetv3_Transition_Fire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootImplicitStep createRootImplicitStep() {
		RootImplicitStepImpl rootImplicitStep = new RootImplicitStepImpl();
		return rootImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsPackage getStepsPackage() {
		return (StepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepsPackage getPackage() {
		return StepsPackage.eINSTANCE;
	}

} //StepsFactoryImpl
