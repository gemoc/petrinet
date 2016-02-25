/**
 */
package petrinetv2Trace.States.petrinetv2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import petrinetv2.PetrinetV2Package;

import petrinetv2Trace.Petrinetv2TracePackage;

import petrinetv2Trace.States.StatesPackage;

import petrinetv2Trace.States.impl.StatesPackageImpl;

import petrinetv2Trace.States.petrinetv2.Petrinetv2Factory;
import petrinetv2Trace.States.petrinetv2.Petrinetv2Package;
import petrinetv2Trace.States.petrinetv2.TracedPlace;
import petrinetv2Trace.States.petrinetv2.TracedToken;

import petrinetv2Trace.Steps.StepsPackage;

import petrinetv2Trace.Steps.impl.StepsPackageImpl;

import petrinetv2Trace.impl.Petrinetv2TracePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Petrinetv2PackageImpl extends EPackageImpl implements Petrinetv2Package {
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
	 * @see petrinetv2Trace.States.petrinetv2.Petrinetv2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Petrinetv2PackageImpl() {
		super(eNS_URI, Petrinetv2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Petrinetv2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Petrinetv2Package init() {
		if (isInited) return (Petrinetv2Package)EPackage.Registry.INSTANCE.getEPackage(Petrinetv2Package.eNS_URI);

		// Obtain or create and register package
		Petrinetv2PackageImpl thePetrinetv2Package = (Petrinetv2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Petrinetv2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Petrinetv2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MsePackage.eINSTANCE.eClass();
		PetrinetV2Package.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Petrinetv2TracePackageImpl thePetrinetv2TracePackage = (Petrinetv2TracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Petrinetv2TracePackage.eNS_URI) instanceof Petrinetv2TracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Petrinetv2TracePackage.eNS_URI) : Petrinetv2TracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		thePetrinetv2Package.createPackageContents();
		thePetrinetv2TracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		thePetrinetv2Package.initializePackageContents();
		thePetrinetv2TracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinetv2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Petrinetv2Package.eNS_URI, thePetrinetv2Package);
		return thePetrinetv2Package;
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
	public Petrinetv2Factory getPetrinetv2Factory() {
		return (Petrinetv2Factory)getEFactoryInstance();
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
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedPlaceEClass, TracedPlace.class, "TracedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedPlace_OriginalObject(), thePetrinetV2Package.getPlace(), null, "originalObject", null, 0, 1, TracedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedPlace_Tokens(), thePetrinetV2Package.getToken(), null, "tokens", null, 0, -1, TracedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedPlace_TokensSequence(), theStatesPackage.getPlace_tokens_Value(), theStatesPackage.getPlace_tokens_Value_Parent(), "tokensSequence", null, 0, -1, TracedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedTokenEClass, TracedToken.class, "TracedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

} //Petrinetv2PackageImpl
