/**
 */
package petrinetv3Trace.States.petrinetv3.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import petrinetv3.PetrinetV3Package;

import petrinetv3Trace.Petrinetv3TracePackage;

import petrinetv3Trace.States.StatesPackage;

import petrinetv3Trace.States.impl.StatesPackageImpl;

import petrinetv3Trace.States.petrinetv3.Petrinetv3Factory;
import petrinetv3Trace.States.petrinetv3.Petrinetv3Package;
import petrinetv3Trace.States.petrinetv3.TracedPlace;
import petrinetv3Trace.States.petrinetv3.TracedToken;
import petrinetv3Trace.States.petrinetv3.TracedTransition;

import petrinetv3Trace.Steps.StepsPackage;

import petrinetv3Trace.Steps.impl.StepsPackageImpl;

import petrinetv3Trace.impl.Petrinetv3TracePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Petrinetv3PackageImpl extends EPackageImpl implements Petrinetv3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTransitionEClass = null;

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
	 * @see petrinetv3Trace.States.petrinetv3.Petrinetv3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Petrinetv3PackageImpl() {
		super(eNS_URI, Petrinetv3Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Petrinetv3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Petrinetv3Package init() {
		if (isInited) return (Petrinetv3Package)EPackage.Registry.INSTANCE.getEPackage(Petrinetv3Package.eNS_URI);

		// Obtain or create and register package
		Petrinetv3PackageImpl thePetrinetv3Package = (Petrinetv3PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Petrinetv3PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Petrinetv3PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MsePackage.eINSTANCE.eClass();
		PetrinetV3Package.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Petrinetv3TracePackageImpl thePetrinetv3TracePackage = (Petrinetv3TracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Petrinetv3TracePackage.eNS_URI) instanceof Petrinetv3TracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Petrinetv3TracePackage.eNS_URI) : Petrinetv3TracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		thePetrinetv3Package.createPackageContents();
		thePetrinetv3TracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		thePetrinetv3Package.initializePackageContents();
		thePetrinetv3TracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinetv3Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Petrinetv3Package.eNS_URI, thePetrinetv3Package);
		return thePetrinetv3Package;
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
	public EReference getTracedPlace_Tokens() {
		return (EReference)tracedPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPlace_TokensSequence() {
		return (EReference)tracedPlaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedToken() {
		return tracedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTransition() {
		return tracedTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransition_ClockSequence() {
		return (EReference)tracedTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransition_Input() {
		return (EReference)tracedTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransition_OriginalObject() {
		return (EReference)tracedTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransition_Output() {
		return (EReference)tracedTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransition_ParentNet() {
		return (EReference)tracedTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv3Factory getPetrinetv3Factory() {
		return (Petrinetv3Factory)getEFactoryInstance();
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
		createEReference(tracedPlaceEClass, TRACED_PLACE__TOKENS);
		createEReference(tracedPlaceEClass, TRACED_PLACE__TOKENS_SEQUENCE);

		tracedTokenEClass = createEClass(TRACED_TOKEN);

		tracedTransitionEClass = createEClass(TRACED_TRANSITION);
		createEReference(tracedTransitionEClass, TRACED_TRANSITION__CLOCK_SEQUENCE);
		createEReference(tracedTransitionEClass, TRACED_TRANSITION__INPUT);
		createEReference(tracedTransitionEClass, TRACED_TRANSITION__ORIGINAL_OBJECT);
		createEReference(tracedTransitionEClass, TRACED_TRANSITION__OUTPUT);
		createEReference(tracedTransitionEClass, TRACED_TRANSITION__PARENT_NET);
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
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedPlaceEClass, TracedPlace.class, "TracedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedPlace_OriginalObject(), thePetrinetV3Package.getPlace(), null, "originalObject", null, 0, 1, TracedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedPlace_Tokens(), thePetrinetV3Package.getToken(), null, "tokens", null, 0, -1, TracedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedPlace_TokensSequence(), theStatesPackage.getPlace_tokens_Value(), theStatesPackage.getPlace_tokens_Value_Parent(), "tokensSequence", null, 0, -1, TracedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedTokenEClass, TracedToken.class, "TracedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedTransitionEClass, TracedTransition.class, "TracedTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedTransition_ClockSequence(), theStatesPackage.getTransition_clock_Value(), theStatesPackage.getTransition_clock_Value_Parent(), "clockSequence", null, 0, -1, TracedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedTransition_Input(), this.getTracedPlace(), null, "input", null, 1, -1, TracedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedTransition_OriginalObject(), thePetrinetV3Package.getTransition(), null, "originalObject", null, 0, 1, TracedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedTransition_Output(), this.getTracedPlace(), null, "output", null, 1, -1, TracedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedTransition_ParentNet(), thePetrinetV3Package.getNet(), null, "parentNet", null, 1, 1, TracedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (getTracedPlace_Tokens(), 
		   source, 
		   new String[] {
		   });
	}

} //Petrinetv3PackageImpl
