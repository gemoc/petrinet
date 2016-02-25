/**
 */
package petrinetv2Trace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import petrinetv2.PetrinetV2Package;

import petrinetv2Trace.Petrinetv2TraceFactory;
import petrinetv2Trace.Petrinetv2TracePackage;

import petrinetv2Trace.States.StatesPackage;

import petrinetv2Trace.States.impl.StatesPackageImpl;

import petrinetv2Trace.States.petrinetv2.Petrinetv2Package;

import petrinetv2Trace.States.petrinetv2.impl.Petrinetv2PackageImpl;

import petrinetv2Trace.Steps.StepsPackage;

import petrinetv2Trace.Steps.impl.StepsPackageImpl;

import petrinetv2Trace.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Petrinetv2TracePackageImpl extends EPackageImpl implements Petrinetv2TracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

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
	 * @see petrinetv2Trace.Petrinetv2TracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Petrinetv2TracePackageImpl() {
		super(eNS_URI, Petrinetv2TraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Petrinetv2TracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Petrinetv2TracePackage init() {
		if (isInited) return (Petrinetv2TracePackage)EPackage.Registry.INSTANCE.getEPackage(Petrinetv2TracePackage.eNS_URI);

		// Obtain or create and register package
		Petrinetv2TracePackageImpl thePetrinetv2TracePackage = (Petrinetv2TracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Petrinetv2TracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Petrinetv2TracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MsePackage.eINSTANCE.eClass();
		PetrinetV2Package.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		Petrinetv2PackageImpl thePetrinetv2Package = (Petrinetv2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Petrinetv2Package.eNS_URI) instanceof Petrinetv2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Petrinetv2Package.eNS_URI) : Petrinetv2Package.eINSTANCE);

		// Create package meta-data objects
		thePetrinetv2TracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		thePetrinetv2Package.createPackageContents();

		// Initialize created meta-data
		thePetrinetv2TracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		thePetrinetv2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinetv2TracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Petrinetv2TracePackage.eNS_URI, thePetrinetv2TracePackage);
		return thePetrinetv2TracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Petrinetv2_Net_Initialize_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Petrinetv2_Net_Run_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Petrinetv2_Transition_Fire_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Petrinetv2_tracedPlaces() {
		return (EReference)traceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Petrinetv2_tracedTokens() {
		return (EReference)traceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_RootSteps() {
		return (EReference)traceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_StatesTrace() {
		return (EReference)traceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv2TraceFactory getPetrinetv2TraceFactory() {
		return (Petrinetv2TraceFactory)getEFactoryInstance();
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
		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__PETRINETV2_NET_INITIALIZE_SEQUENCE);
		createEReference(traceEClass, TRACE__PETRINETV2_NET_RUN_SEQUENCE);
		createEReference(traceEClass, TRACE__PETRINETV2_TRANSITION_FIRE_SEQUENCE);
		createEReference(traceEClass, TRACE__PETRINETV2_TRACED_PLACES);
		createEReference(traceEClass, TRACE__PETRINETV2_TRACED_TOKENS);
		createEReference(traceEClass, TRACE__ROOT_STEPS);
		createEReference(traceEClass, TRACE__STATES_TRACE);
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
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		Petrinetv2Package thePetrinetv2Package = (Petrinetv2Package)EPackage.Registry.INSTANCE.getEPackage(Petrinetv2Package.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStepsPackage);
		getESubpackages().add(theStatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_Petrinetv2_Net_Initialize_Sequence(), theStepsPackage.getPetrinetv2_Net_Initialize(), null, "Petrinetv2_Net_Initialize_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Petrinetv2_Net_Run_Sequence(), theStepsPackage.getPetrinetv2_Net_Run(), null, "Petrinetv2_Net_Run_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Petrinetv2_Transition_Fire_Sequence(), theStepsPackage.getPetrinetv2_Transition_Fire(), null, "Petrinetv2_Transition_Fire_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Petrinetv2_tracedPlaces(), thePetrinetv2Package.getTracedPlace(), null, "petrinetv2_tracedPlaces", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Petrinetv2_tracedTokens(), thePetrinetv2Package.getTracedToken(), null, "petrinetv2_tracedTokens", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_RootSteps(), theStepsPackage.getStep(), null, "rootSteps", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_StatesTrace(), theStatesPackage.getState(), null, "statesTrace", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Petrinetv2TracePackageImpl
