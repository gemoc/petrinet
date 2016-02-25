/**
 */
package petrinetv1Trace;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see petrinetv1Trace.Petrinetv1TraceFactory
 * @model kind="package"
 * @generated
 */
public interface Petrinetv1TracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinetv1Trace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "petrinetv1Trace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinetv1Trace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Petrinetv1TracePackage eINSTANCE = petrinetv1Trace.impl.Petrinetv1TracePackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetv1Trace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv1Trace.impl.TraceImpl
	 * @see petrinetv1Trace.impl.Petrinetv1TracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Petrinetv1 Net Initialize Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PETRINETV1_NET_INITIALIZE_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Petrinetv1 Net Run Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PETRINETV1_NET_RUN_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Petrinetv1 Transition Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PETRINETV1_TRANSITION_FIRE_SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Petrinetv1 traced Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PETRINETV1_TRACED_PLACES = 3;

	/**
	 * The feature id for the '<em><b>Root Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ROOT_STEPS = 4;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STATES_TRACE = 5;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link petrinetv1Trace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see petrinetv1Trace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv1Trace.Trace#getPetrinetv1_Net_Initialize_Sequence <em>Petrinetv1 Net Initialize Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Petrinetv1 Net Initialize Sequence</em>'.
	 * @see petrinetv1Trace.Trace#getPetrinetv1_Net_Initialize_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Petrinetv1_Net_Initialize_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv1Trace.Trace#getPetrinetv1_Net_Run_Sequence <em>Petrinetv1 Net Run Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Petrinetv1 Net Run Sequence</em>'.
	 * @see petrinetv1Trace.Trace#getPetrinetv1_Net_Run_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Petrinetv1_Net_Run_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv1Trace.Trace#getPetrinetv1_Transition_Fire_Sequence <em>Petrinetv1 Transition Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Petrinetv1 Transition Fire Sequence</em>'.
	 * @see petrinetv1Trace.Trace#getPetrinetv1_Transition_Fire_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Petrinetv1_Transition_Fire_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetv1Trace.Trace#getPetrinetv1_tracedPlaces <em>Petrinetv1 traced Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Petrinetv1 traced Places</em>'.
	 * @see petrinetv1Trace.Trace#getPetrinetv1_tracedPlaces()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Petrinetv1_tracedPlaces();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetv1Trace.Trace#getRootSteps <em>Root Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Steps</em>'.
	 * @see petrinetv1Trace.Trace#getRootSteps()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_RootSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetv1Trace.Trace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see petrinetv1Trace.Trace#getStatesTrace()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_StatesTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Petrinetv1TraceFactory getPetrinetv1TraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link petrinetv1Trace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv1Trace.impl.TraceImpl
		 * @see petrinetv1Trace.impl.Petrinetv1TracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Petrinetv1 Net Initialize Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__PETRINETV1_NET_INITIALIZE_SEQUENCE = eINSTANCE.getTrace_Petrinetv1_Net_Initialize_Sequence();

		/**
		 * The meta object literal for the '<em><b>Petrinetv1 Net Run Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__PETRINETV1_NET_RUN_SEQUENCE = eINSTANCE.getTrace_Petrinetv1_Net_Run_Sequence();

		/**
		 * The meta object literal for the '<em><b>Petrinetv1 Transition Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__PETRINETV1_TRANSITION_FIRE_SEQUENCE = eINSTANCE.getTrace_Petrinetv1_Transition_Fire_Sequence();

		/**
		 * The meta object literal for the '<em><b>Petrinetv1 traced Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__PETRINETV1_TRACED_PLACES = eINSTANCE.getTrace_Petrinetv1_tracedPlaces();

		/**
		 * The meta object literal for the '<em><b>Root Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ROOT_STEPS = eINSTANCE.getTrace_RootSteps();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STATES_TRACE = eINSTANCE.getTrace_StatesTrace();

	}

} //Petrinetv1TracePackage
