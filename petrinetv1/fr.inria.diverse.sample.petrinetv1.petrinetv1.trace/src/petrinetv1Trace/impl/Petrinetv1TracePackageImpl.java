/**
 */
package petrinetv1Trace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import petrinetv1.PetrinetV1Package;

import petrinetv1Trace.Petrinetv1TraceFactory;
import petrinetv1Trace.Petrinetv1TracePackage;

import petrinetv1Trace.States.StatesPackage;

import petrinetv1Trace.States.impl.StatesPackageImpl;

import petrinetv1Trace.States.petrinetv1.Petrinetv1Package;

import petrinetv1Trace.States.petrinetv1.impl.Petrinetv1PackageImpl;

import petrinetv1Trace.Steps.StepsPackage;

import petrinetv1Trace.Steps.impl.StepsPackageImpl;

import petrinetv1Trace.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Petrinetv1TracePackageImpl extends EPackageImpl implements Petrinetv1TracePackage {
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
	 * @see petrinetv1Trace.Petrinetv1TracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Petrinetv1TracePackageImpl() {
		super(eNS_URI, Petrinetv1TraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Petrinetv1TracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Petrinetv1TracePackage init() {
		if (isInited) return (Petrinetv1TracePackage)EPackage.Registry.INSTANCE.getEPackage(Petrinetv1TracePackage.eNS_URI);

		// Obtain or create and register package
		Petrinetv1TracePackageImpl thePetrinetv1TracePackage = (Petrinetv1TracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Petrinetv1TracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Petrinetv1TracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MsePackage.eINSTANCE.eClass();
		PetrinetV1Package.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		Petrinetv1PackageImpl thePetrinetv1Package = (Petrinetv1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Petrinetv1Package.eNS_URI) instanceof Petrinetv1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Petrinetv1Package.eNS_URI) : Petrinetv1Package.eINSTANCE);

		// Create package meta-data objects
		thePetrinetv1TracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		thePetrinetv1Package.createPackageContents();

		// Initialize created meta-data
		thePetrinetv1TracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		thePetrinetv1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinetv1TracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Petrinetv1TracePackage.eNS_URI, thePetrinetv1TracePackage);
		return thePetrinetv1TracePackage;
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
	public EReference getTrace_Petrinetv1_Net_Initialize_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Petrinetv1_Transition_Fire_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Petrinetv1_tracedPlaces() {
		return (EReference)traceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_RootSteps() {
		return (EReference)traceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_StatesTrace() {
		return (EReference)traceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv1TraceFactory getPetrinetv1TraceFactory() {
		return (Petrinetv1TraceFactory)getEFactoryInstance();
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
		createEReference(traceEClass, TRACE__PETRINETV1_NET_INITIALIZE_SEQUENCE);
		createEReference(traceEClass, TRACE__PETRINETV1_TRANSITION_FIRE_SEQUENCE);
		createEReference(traceEClass, TRACE__PETRINETV1_TRACED_PLACES);
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
		Petrinetv1Package thePetrinetv1Package = (Petrinetv1Package)EPackage.Registry.INSTANCE.getEPackage(Petrinetv1Package.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStepsPackage);
		getESubpackages().add(theStatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_Petrinetv1_Net_Initialize_Sequence(), theStepsPackage.getPetrinetv1_Net_Initialize(), null, "Petrinetv1_Net_Initialize_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Petrinetv1_Transition_Fire_Sequence(), theStepsPackage.getPetrinetv1_Transition_Fire(), null, "Petrinetv1_Transition_Fire_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Petrinetv1_tracedPlaces(), thePetrinetv1Package.getTracedPlace(), null, "petrinetv1_tracedPlaces", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_RootSteps(), theStepsPackage.getStep(), null, "rootSteps", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_StatesTrace(), theStatesPackage.getState(), null, "statesTrace", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Petrinetv1TracePackageImpl
