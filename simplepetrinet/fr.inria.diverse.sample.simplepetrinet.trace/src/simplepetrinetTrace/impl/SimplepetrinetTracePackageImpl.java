/**
 */
package simplepetrinetTrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import simplepetrinet.SimplepetrinetPackage;

import simplepetrinetTrace.SimplepetrinetTraceFactory;
import simplepetrinetTrace.SimplepetrinetTracePackage;

import simplepetrinetTrace.States.StatesPackage;

import simplepetrinetTrace.States.impl.StatesPackageImpl;

import simplepetrinetTrace.States.simplepetrinet.impl.SimplepetrinetPackageImpl;

import simplepetrinetTrace.Steps.StepsPackage;

import simplepetrinetTrace.Steps.impl.StepsPackageImpl;

import simplepetrinetTrace.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplepetrinetTracePackageImpl extends EPackageImpl implements SimplepetrinetTracePackage {
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
	 * @see simplepetrinetTrace.SimplepetrinetTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimplepetrinetTracePackageImpl() {
		super(eNS_URI, SimplepetrinetTraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimplepetrinetTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimplepetrinetTracePackage init() {
		if (isInited) return (SimplepetrinetTracePackage)EPackage.Registry.INSTANCE.getEPackage(SimplepetrinetTracePackage.eNS_URI);

		// Obtain or create and register package
		SimplepetrinetTracePackageImpl theSimplepetrinetTracePackage = (SimplepetrinetTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimplepetrinetTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimplepetrinetTracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MsePackage.eINSTANCE.eClass();
		SimplepetrinetPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		SimplepetrinetPackageImpl theSimplepetrinetPackage_1 = (SimplepetrinetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(simplepetrinetTrace.States.simplepetrinet.SimplepetrinetPackage.eNS_URI) instanceof SimplepetrinetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(simplepetrinetTrace.States.simplepetrinet.SimplepetrinetPackage.eNS_URI) : simplepetrinetTrace.States.simplepetrinet.SimplepetrinetPackage.eINSTANCE);

		// Create package meta-data objects
		theSimplepetrinetTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theSimplepetrinetPackage_1.createPackageContents();

		// Initialize created meta-data
		theSimplepetrinetTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theSimplepetrinetPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimplepetrinetTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimplepetrinetTracePackage.eNS_URI, theSimplepetrinetTracePackage);
		return theSimplepetrinetTracePackage;
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
	public EReference getTrace_Simplepetrinet_Net_Initialize_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Simplepetrinet_Transition_Fire_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_RootSteps() {
		return (EReference)traceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Simplepetrinet_tracedPlaces() {
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
	public SimplepetrinetTraceFactory getSimplepetrinetTraceFactory() {
		return (SimplepetrinetTraceFactory)getEFactoryInstance();
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
		createEReference(traceEClass, TRACE__SIMPLEPETRINET_NET_INITIALIZE_SEQUENCE);
		createEReference(traceEClass, TRACE__SIMPLEPETRINET_TRANSITION_FIRE_SEQUENCE);
		createEReference(traceEClass, TRACE__ROOT_STEPS);
		createEReference(traceEClass, TRACE__SIMPLEPETRINET_TRACED_PLACES);
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
		simplepetrinetTrace.States.simplepetrinet.SimplepetrinetPackage theSimplepetrinetPackage_1 = (simplepetrinetTrace.States.simplepetrinet.SimplepetrinetPackage)EPackage.Registry.INSTANCE.getEPackage(simplepetrinetTrace.States.simplepetrinet.SimplepetrinetPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStepsPackage);
		getESubpackages().add(theStatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_Simplepetrinet_Net_Initialize_Sequence(), theStepsPackage.getSimplepetrinet_Net_Initialize(), null, "Simplepetrinet_Net_Initialize_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Simplepetrinet_Transition_Fire_Sequence(), theStepsPackage.getSimplepetrinet_Transition_Fire(), null, "Simplepetrinet_Transition_Fire_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_RootSteps(), theStepsPackage.getStep(), null, "rootSteps", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Simplepetrinet_tracedPlaces(), theSimplepetrinetPackage_1.getTracedPlace(), null, "simplepetrinet_tracedPlaces", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_StatesTrace(), theStatesPackage.getState(), null, "statesTrace", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SimplepetrinetTracePackageImpl
