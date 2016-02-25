/**
 */
package petrinetv1Trace.Steps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinetv1Trace.Steps.*;

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
			case StepsPackage.PETRINETV1_NET_INITIALIZE: return createPetrinetv1_Net_Initialize();
			case StepsPackage.PETRINETV1_NET_RUN: return createPetrinetv1_Net_Run();
			case StepsPackage.PETRINETV1_NET_RUN_IMPLICIT_STEP: return createPetrinetv1_Net_Run_ImplicitStep();
			case StepsPackage.PETRINETV1_TRANSITION_FIRE: return createPetrinetv1_Transition_Fire();
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
	public Petrinetv1_Net_Initialize createPetrinetv1_Net_Initialize() {
		Petrinetv1_Net_InitializeImpl petrinetv1_Net_Initialize = new Petrinetv1_Net_InitializeImpl();
		return petrinetv1_Net_Initialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv1_Net_Run createPetrinetv1_Net_Run() {
		Petrinetv1_Net_RunImpl petrinetv1_Net_Run = new Petrinetv1_Net_RunImpl();
		return petrinetv1_Net_Run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv1_Net_Run_ImplicitStep createPetrinetv1_Net_Run_ImplicitStep() {
		Petrinetv1_Net_Run_ImplicitStepImpl petrinetv1_Net_Run_ImplicitStep = new Petrinetv1_Net_Run_ImplicitStepImpl();
		return petrinetv1_Net_Run_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv1_Transition_Fire createPetrinetv1_Transition_Fire() {
		Petrinetv1_Transition_FireImpl petrinetv1_Transition_Fire = new Petrinetv1_Transition_FireImpl();
		return petrinetv1_Transition_Fire;
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
