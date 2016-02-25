/**
 */
package petrinetv1Trace.States.petrinetv1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import petrinetv1.PetrinetV1Package;

import petrinetv1Trace.Petrinetv1TracePackage;

import petrinetv1Trace.States.StatesPackage;

import petrinetv1Trace.States.impl.StatesPackageImpl;

import petrinetv1Trace.States.petrinetv1.Petrinetv1Factory;
import petrinetv1Trace.States.petrinetv1.Petrinetv1Package;
import petrinetv1Trace.States.petrinetv1.TracedPlace;

import petrinetv1Trace.Steps.StepsPackage;

import petrinetv1Trace.Steps.impl.StepsPackageImpl;

import petrinetv1Trace.impl.Petrinetv1TracePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Petrinetv1PackageImpl extends EPackageImpl implements Petrinetv1Package {
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
	 * @see petrinetv1Trace.States.petrinetv1.Petrinetv1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Petrinetv1PackageImpl() {
		super(eNS_URI, Petrinetv1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Petrinetv1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Petrinetv1Package init() {
		if (isInited) return (Petrinetv1Package)EPackage.Registry.INSTANCE.getEPackage(Petrinetv1Package.eNS_URI);

		// Obtain or create and register package
		Petrinetv1PackageImpl thePetrinetv1Package = (Petrinetv1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Petrinetv1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Petrinetv1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MsePackage.eINSTANCE.eClass();
		PetrinetV1Package.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Petrinetv1TracePackageImpl thePetrinetv1TracePackage = (Petrinetv1TracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Petrinetv1TracePackage.eNS_URI) instanceof Petrinetv1TracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Petrinetv1TracePackage.eNS_URI) : Petrinetv1TracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		thePetrinetv1Package.createPackageContents();
		thePetrinetv1TracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		thePetrinetv1Package.initializePackageContents();
		thePetrinetv1TracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinetv1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Petrinetv1Package.eNS_URI, thePetrinetv1Package);
		return thePetrinetv1Package;
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
	public Petrinetv1Factory getPetrinetv1Factory() {
		return (Petrinetv1Factory)getEFactoryInstance();
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
		PetrinetV1Package thePetrinetV1Package = (PetrinetV1Package)EPackage.Registry.INSTANCE.getEPackage(PetrinetV1Package.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedPlaceEClass, TracedPlace.class, "TracedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedPlace_OriginalObject(), thePetrinetV1Package.getPlace(), null, "originalObject", null, 0, 1, TracedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedPlace_TokensSequence(), theStatesPackage.getPlace_tokens_Value(), theStatesPackage.getPlace_tokens_Value_Parent(), "tokensSequence", null, 0, -1, TracedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //Petrinetv1PackageImpl
