/**
 */
package petrinetv2Trace.Steps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinetv2Trace.Steps.*;

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
			case StepsPackage.PETRINETV2_NET_INITIALIZE: return createPetrinetv2_Net_Initialize();
			case StepsPackage.PETRINETV2_NET_RUN: return createPetrinetv2_Net_Run();
			case StepsPackage.PETRINETV2_NET_RUN_IMPLICIT_STEP: return createPetrinetv2_Net_Run_ImplicitStep();
			case StepsPackage.PETRINETV2_TRANSITION_FIRE: return createPetrinetv2_Transition_Fire();
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
	public Petrinetv2_Net_Initialize createPetrinetv2_Net_Initialize() {
		Petrinetv2_Net_InitializeImpl petrinetv2_Net_Initialize = new Petrinetv2_Net_InitializeImpl();
		return petrinetv2_Net_Initialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv2_Net_Run createPetrinetv2_Net_Run() {
		Petrinetv2_Net_RunImpl petrinetv2_Net_Run = new Petrinetv2_Net_RunImpl();
		return petrinetv2_Net_Run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv2_Net_Run_ImplicitStep createPetrinetv2_Net_Run_ImplicitStep() {
		Petrinetv2_Net_Run_ImplicitStepImpl petrinetv2_Net_Run_ImplicitStep = new Petrinetv2_Net_Run_ImplicitStepImpl();
		return petrinetv2_Net_Run_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv2_Transition_Fire createPetrinetv2_Transition_Fire() {
		Petrinetv2_Transition_FireImpl petrinetv2_Transition_Fire = new Petrinetv2_Transition_FireImpl();
		return petrinetv2_Transition_Fire;
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
