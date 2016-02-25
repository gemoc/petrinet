/**
 */
package petrinetv2Trace.Steps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import petrinetv2.PetrinetV2Package;

import petrinetv2Trace.Petrinetv2TracePackage;

import petrinetv2Trace.States.StatesPackage;

import petrinetv2Trace.States.impl.StatesPackageImpl;

import petrinetv2Trace.States.petrinetv2.Petrinetv2Package;

import petrinetv2Trace.States.petrinetv2.impl.Petrinetv2PackageImpl;

import petrinetv2Trace.Steps.BigStep;
import petrinetv2Trace.Steps.Petrinetv2_Net_Initialize;
import petrinetv2Trace.Steps.Petrinetv2_Net_Run;
import petrinetv2Trace.Steps.Petrinetv2_Net_Run_AbstractSubStep;
import petrinetv2Trace.Steps.Petrinetv2_Net_Run_ImplicitStep;
import petrinetv2Trace.Steps.Petrinetv2_Transition_Fire;
import petrinetv2Trace.Steps.RootImplicitStep;
import petrinetv2Trace.Steps.SmallStep;
import petrinetv2Trace.Steps.Step;
import petrinetv2Trace.Steps.StepsFactory;
import petrinetv2Trace.Steps.StepsPackage;

import petrinetv2Trace.impl.Petrinetv2TracePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetv2_Net_InitializeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetv2_Net_RunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetv2_Net_Run_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetv2_Net_Run_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetv2_Transition_FireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see petrinetv2Trace.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited) return (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MsePackage.eINSTANCE.eClass();
		PetrinetV2Package.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Petrinetv2TracePackageImpl thePetrinetv2TracePackage = (Petrinetv2TracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Petrinetv2TracePackage.eNS_URI) instanceof Petrinetv2TracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Petrinetv2TracePackage.eNS_URI) : Petrinetv2TracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		Petrinetv2PackageImpl thePetrinetv2Package = (Petrinetv2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Petrinetv2Package.eNS_URI) instanceof Petrinetv2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Petrinetv2Package.eNS_URI) : Petrinetv2Package.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		thePetrinetv2TracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		thePetrinetv2Package.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		thePetrinetv2TracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		thePetrinetv2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigStep() {
		return bigStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetv2_Net_Initialize() {
		return petrinetv2_Net_InitializeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPetrinetv2_Net_Initialize__GetCaller() {
		return petrinetv2_Net_InitializeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetv2_Net_Run() {
		return petrinetv2_Net_RunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetrinetv2_Net_Run_SubSteps() {
		return (EReference)petrinetv2_Net_RunEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPetrinetv2_Net_Run__GetCaller() {
		return petrinetv2_Net_RunEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetv2_Net_Run_AbstractSubStep() {
		return petrinetv2_Net_Run_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetv2_Net_Run_ImplicitStep() {
		return petrinetv2_Net_Run_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetv2_Transition_Fire() {
		return petrinetv2_Transition_FireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPetrinetv2_Transition_Fire__GetCaller() {
		return petrinetv2_Transition_FireEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootImplicitStep() {
		return rootImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmallStep() {
		return smallStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_EndingState() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_StartingState() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactory getStepsFactory() {
		return (StepsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bigStepEClass = createEClass(BIG_STEP);

		petrinetv2_Net_InitializeEClass = createEClass(PETRINETV2_NET_INITIALIZE);
		createEOperation(petrinetv2_Net_InitializeEClass, PETRINETV2_NET_INITIALIZE___GET_CALLER);

		petrinetv2_Net_RunEClass = createEClass(PETRINETV2_NET_RUN);
		createEReference(petrinetv2_Net_RunEClass, PETRINETV2_NET_RUN__SUB_STEPS);
		createEOperation(petrinetv2_Net_RunEClass, PETRINETV2_NET_RUN___GET_CALLER);

		petrinetv2_Net_Run_AbstractSubStepEClass = createEClass(PETRINETV2_NET_RUN_ABSTRACT_SUB_STEP);

		petrinetv2_Net_Run_ImplicitStepEClass = createEClass(PETRINETV2_NET_RUN_IMPLICIT_STEP);

		petrinetv2_Transition_FireEClass = createEClass(PETRINETV2_TRANSITION_FIRE);
		createEOperation(petrinetv2_Transition_FireEClass, PETRINETV2_TRANSITION_FIRE___GET_CALLER);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		smallStepEClass = createEClass(SMALL_STEP);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__ENDING_STATE);
		createEReference(stepEClass, STEP__STARTING_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PetrinetV2Package thePetrinetV2Package = (PetrinetV2Package)EPackage.Registry.INSTANCE.getEPackage(PetrinetV2Package.eNS_URI);
		MsePackage theMsePackage = (MsePackage)EPackage.Registry.INSTANCE.getEPackage(MsePackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bigStepEClass.getESuperTypes().add(this.getStep());
		petrinetv2_Net_InitializeEClass.getESuperTypes().add(this.getPetrinetv2_Net_Run_AbstractSubStep());
		petrinetv2_Net_InitializeEClass.getESuperTypes().add(this.getSmallStep());
		petrinetv2_Net_RunEClass.getESuperTypes().add(this.getBigStep());
		petrinetv2_Net_Run_ImplicitStepEClass.getESuperTypes().add(this.getPetrinetv2_Net_Run_AbstractSubStep());
		petrinetv2_Net_Run_ImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		petrinetv2_Transition_FireEClass.getESuperTypes().add(this.getPetrinetv2_Net_Run_AbstractSubStep());
		petrinetv2_Transition_FireEClass.getESuperTypes().add(this.getSmallStep());
		rootImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		smallStepEClass.getESuperTypes().add(this.getStep());
		stepEClass.getESuperTypes().add(theMsePackage.getMSEOccurrence());

		// Initialize classes, features, and operations; add parameters
		initEClass(bigStepEClass, BigStep.class, "BigStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinetv2_Net_InitializeEClass, Petrinetv2_Net_Initialize.class, "Petrinetv2_Net_Initialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPetrinetv2_Net_Initialize__GetCaller(), thePetrinetV2Package.getNet(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(petrinetv2_Net_RunEClass, Petrinetv2_Net_Run.class, "Petrinetv2_Net_Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPetrinetv2_Net_Run_SubSteps(), this.getPetrinetv2_Net_Run_AbstractSubStep(), null, "subSteps", null, 0, -1, Petrinetv2_Net_Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPetrinetv2_Net_Run__GetCaller(), thePetrinetV2Package.getNet(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(petrinetv2_Net_Run_AbstractSubStepEClass, Petrinetv2_Net_Run_AbstractSubStep.class, "Petrinetv2_Net_Run_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinetv2_Net_Run_ImplicitStepEClass, Petrinetv2_Net_Run_ImplicitStep.class, "Petrinetv2_Net_Run_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinetv2_Transition_FireEClass, Petrinetv2_Transition_Fire.class, "Petrinetv2_Transition_Fire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPetrinetv2_Transition_Fire__GetCaller(), thePetrinetV2Package.getTransition(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smallStepEClass, SmallStep.class, "SmallStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl
