/**
 */
package simplepetrinetTrace.States.simplepetrinet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import simplepetrinetTrace.SimplepetrinetTracePackage;

import simplepetrinetTrace.States.StatesPackage;

import simplepetrinetTrace.States.impl.StatesPackageImpl;

import simplepetrinetTrace.States.simplepetrinet.SimplepetrinetFactory;
import simplepetrinetTrace.States.simplepetrinet.SimplepetrinetPackage;
import simplepetrinetTrace.States.simplepetrinet.TracedPlace;

import simplepetrinetTrace.Steps.StepsPackage;

import simplepetrinetTrace.Steps.impl.StepsPackageImpl;

import simplepetrinetTrace.impl.SimplepetrinetTracePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplepetrinetPackageImpl extends EPackageImpl implements SimplepetrinetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPlaceEClass = null;

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
	 * @see simplepetrinetTrace.States.simplepetrinet.SimplepetrinetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimplepetrinetPackageImpl() {
		super(eNS_URI, SimplepetrinetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimplepetrinetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimplepetrinetPackage init() {
		if (isInited) return (SimplepetrinetPackage)EPackage.Registry.INSTANCE.getEPackage(SimplepetrinetPackage.eNS_URI);

		// Obtain or create and register package
		SimplepetrinetPackageImpl theSimplepetrinetPackage = (SimplepetrinetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimplepetrinetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimplepetrinetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MsePackage.eINSTANCE.eClass();
		simplepetrinet.SimplepetrinetPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SimplepetrinetTracePackageImpl theSimplepetrinetTracePackage = (SimplepetrinetTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SimplepetrinetTracePackage.eNS_URI) instanceof SimplepetrinetTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SimplepetrinetTracePackage.eNS_URI) : SimplepetrinetTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		theSimplepetrinetPackage.createPackageContents();
		theSimplepetrinetTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		theSimplepetrinetPackage.initializePackageContents();
		theSimplepetrinetTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimplepetrinetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimplepetrinetPackage.eNS_URI, theSimplepetrinetPackage);
		return theSimplepetrinetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPlace() {
		return tracedPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPlace_OriginalObject() {
		return (EReference)tracedPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPlace_TokensSequence() {
		return (EReference)tracedPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplepetrinetFactory getSimplepetrinetFactory() {
		return (SimplepetrinetFactory)getEFactoryInstance();
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
		tracedPlaceEClass = createEClass(TRACED_PLACE);
		createEReference(tracedPlaceEClass, TRACED_PLACE__ORIGINAL_OBJECT);
		createEReference(tracedPlaceEClass, TRACED_PLACE__TOKENS_SEQUENCE);
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
		simplepetrinet.SimplepetrinetPackage theSimplepetrinetPackage_1 = (simplepetrinet.SimplepetrinetPackage)EPackage.Registry.INSTANCE.getEPackage(simplepetrinet.SimplepetrinetPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedPlaceEClass, TracedPlace.class, "TracedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedPlace_OriginalObject(), theSimplepetrinetPackage_1.getPlace(), null, "originalObject", null, 0, 1, TracedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedPlace_TokensSequence(), theStatesPackage.getPlace_tokens_Value(), theStatesPackage.getPlace_tokens_Value_Parent(), "tokensSequence", null, 0, -1, TracedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SimplepetrinetPackageImpl
