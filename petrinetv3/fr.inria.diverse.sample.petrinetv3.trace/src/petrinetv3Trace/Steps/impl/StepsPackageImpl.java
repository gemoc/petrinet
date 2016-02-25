/**
 */
package petrinetv3Trace.Steps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import petrinetv3.PetrinetV3Package;

import petrinetv3Trace.Petrinetv3TracePackage;

import petrinetv3Trace.States.StatesPackage;

import petrinetv3Trace.States.impl.StatesPackageImpl;

import petrinetv3Trace.States.petrinetv3.Petrinetv3Package;

import petrinetv3Trace.States.petrinetv3.impl.Petrinetv3PackageImpl;

import petrinetv3Trace.Steps.BigStep;
import petrinetv3Trace.Steps.Petrinetv3_Net_Initialize;
import petrinetv3Trace.Steps.Petrinetv3_Net_Run;
import petrinetv3Trace.Steps.Petrinetv3_Net_Run_AbstractSubStep;
import petrinetv3Trace.Steps.Petrinetv3_Net_Run_ImplicitStep;
import petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions;
import petrinetv3Trace.Steps.Petrinetv3_Transition_Fire;
import petrinetv3Trace.Steps.RootImplicitStep;
import petrinetv3Trace.Steps.SmallStep;
import petrinetv3Trace.Steps.Step;
import petrinetv3Trace.Steps.StepsFactory;
import petrinetv3Trace.Steps.StepsPackage;

import petrinetv3Trace.impl.Petrinetv3TracePackageImpl;

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
	private EClass petrinetv3_Net_InitializeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetv3_Net_RunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetv3_Net_Run_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetv3_Net_Run_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetv3_Net_TickEnabledTransitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetv3_Transition_FireEClass = null;

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
	 * @see petrinetv3Trace.Steps.StepsPackage#eNS_URI
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
		PetrinetV3Package.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Petrinetv3TracePackageImpl thePetrinetv3TracePackage = (Petrinetv3TracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Petrinetv3TracePackage.eNS_URI) instanceof Petrinetv3TracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Petrinetv3TracePackage.eNS_URI) : Petrinetv3TracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		Petrinetv3PackageImpl thePetrinetv3Package = (Petrinetv3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Petrinetv3Package.eNS_URI) instanceof Petrinetv3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Petrinetv3Package.eNS_URI) : Petrinetv3Package.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		thePetrinetv3TracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		thePetrinetv3Package.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		thePetrinetv3TracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		thePetrinetv3Package.initializePackageContents();

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
	public EClass getPetrinetv3_Net_Initialize() {
		return petrinetv3_Net_InitializeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPetrinetv3_Net_Initialize__GetCaller() {
		return petrinetv3_Net_InitializeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetv3_Net_Run() {
		return petrinetv3_Net_RunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetrinetv3_Net_Run_SubSteps() {
		return (EReference)petrinetv3_Net_RunEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPetrinetv3_Net_Run__GetCaller() {
		return petrinetv3_Net_RunEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetv3_Net_Run_AbstractSubStep() {
		return petrinetv3_Net_Run_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetv3_Net_Run_ImplicitStep() {
		return petrinetv3_Net_Run_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetv3_Net_TickEnabledTransitions() {
		return petrinetv3_Net_TickEnabledTransitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPetrinetv3_Net_TickEnabledTransitions__GetCaller() {
		return petrinetv3_Net_TickEnabledTransitionsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetv3_Transition_Fire() {
		return petrinetv3_Transition_FireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPetrinetv3_Transition_Fire__GetCaller() {
		return petrinetv3_Transition_FireEClass.getEOperations().get(0);
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

		petrinetv3_Net_InitializeEClass = createEClass(PETRINETV3_NET_INITIALIZE);
		createEOperation(petrinetv3_Net_InitializeEClass, PETRINETV3_NET_INITIALIZE___GET_CALLER);

		petrinetv3_Net_RunEClass = createEClass(PETRINETV3_NET_RUN);
		createEReference(petrinetv3_Net_RunEClass, PETRINETV3_NET_RUN__SUB_STEPS);
		createEOperation(petrinetv3_Net_RunEClass, PETRINETV3_NET_RUN___GET_CALLER);

		petrinetv3_Net_Run_AbstractSubStepEClass = createEClass(PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP);

		petrinetv3_Net_Run_ImplicitStepEClass = createEClass(PETRINETV3_NET_RUN_IMPLICIT_STEP);

		petrinetv3_Net_TickEnabledTransitionsEClass = createEClass(PETRINETV3_NET_TICK_ENABLED_TRANSITIONS);
		createEOperation(petrinetv3_Net_TickEnabledTransitionsEClass, PETRINETV3_NET_TICK_ENABLED_TRANSITIONS___GET_CALLER);

		petrinetv3_Transition_FireEClass = createEClass(PETRINETV3_TRANSITION_FIRE);
		createEOperation(petrinetv3_Transition_FireEClass, PETRINETV3_TRANSITION_FIRE___GET_CALLER);

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
		PetrinetV3Package thePetrinetV3Package = (PetrinetV3Package)EPackage.Registry.INSTANCE.getEPackage(PetrinetV3Package.eNS_URI);
		MsePackage theMsePackage = (MsePackage)EPackage.Registry.INSTANCE.getEPackage(MsePackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bigStepEClass.getESuperTypes().add(this.getStep());
		petrinetv3_Net_InitializeEClass.getESuperTypes().add(this.getPetrinetv3_Net_Run_AbstractSubStep());
		petrinetv3_Net_InitializeEClass.getESuperTypes().add(this.getSmallStep());
		petrinetv3_Net_RunEClass.getESuperTypes().add(this.getBigStep());
		petrinetv3_Net_Run_ImplicitStepEClass.getESuperTypes().add(this.getPetrinetv3_Net_Run_AbstractSubStep());
		petrinetv3_Net_Run_ImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		petrinetv3_Net_TickEnabledTransitionsEClass.getESuperTypes().add(this.getPetrinetv3_Net_Run_AbstractSubStep());
		petrinetv3_Net_TickEnabledTransitionsEClass.getESuperTypes().add(this.getSmallStep());
		petrinetv3_Transition_FireEClass.getESuperTypes().add(this.getPetrinetv3_Net_Run_AbstractSubStep());
		petrinetv3_Transition_FireEClass.getESuperTypes().add(this.getSmallStep());
		rootImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		smallStepEClass.getESuperTypes().add(this.getStep());
		stepEClass.getESuperTypes().add(theMsePackage.getMSEOccurrence());

		// Initialize classes, features, and operations; add parameters
		initEClass(bigStepEClass, BigStep.class, "BigStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinetv3_Net_InitializeEClass, Petrinetv3_Net_Initialize.class, "Petrinetv3_Net_Initialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPetrinetv3_Net_Initialize__GetCaller(), thePetrinetV3Package.getNet(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(petrinetv3_Net_RunEClass, Petrinetv3_Net_Run.class, "Petrinetv3_Net_Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPetrinetv3_Net_Run_SubSteps(), this.getPetrinetv3_Net_Run_AbstractSubStep(), null, "subSteps", null, 0, -1, Petrinetv3_Net_Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPetrinetv3_Net_Run__GetCaller(), thePetrinetV3Package.getNet(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(petrinetv3_Net_Run_AbstractSubStepEClass, Petrinetv3_Net_Run_AbstractSubStep.class, "Petrinetv3_Net_Run_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinetv3_Net_Run_ImplicitStepEClass, Petrinetv3_Net_Run_ImplicitStep.class, "Petrinetv3_Net_Run_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinetv3_Net_TickEnabledTransitionsEClass, Petrinetv3_Net_TickEnabledTransitions.class, "Petrinetv3_Net_TickEnabledTransitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPetrinetv3_Net_TickEnabledTransitions__GetCaller(), thePetrinetV3Package.getNet(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(petrinetv3_Transition_FireEClass, Petrinetv3_Transition_Fire.class, "Petrinetv3_Transition_Fire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPetrinetv3_Transition_Fire__GetCaller(), thePetrinetV3Package.getTransition(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smallStepEClass, SmallStep.class, "SmallStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl
