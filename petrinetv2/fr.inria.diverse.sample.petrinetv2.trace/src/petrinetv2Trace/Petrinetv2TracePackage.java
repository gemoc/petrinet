/**
 */
package petrinetv2Trace;

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
 * @see petrinetv2Trace.Petrinetv2TraceFactory
 * @model kind="package"
 * @generated
 */
public interface Petrinetv2TracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinetv2Trace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "petrinetv2Trace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinetv2Trace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Petrinetv2TracePackage eINSTANCE = petrinetv2Trace.impl.Petrinetv2TracePackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetv2Trace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv2Trace.impl.TraceImpl
	 * @see petrinetv2Trace.impl.Petrinetv2TracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Petrinetv2 Net Initialize Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PETRINETV2_NET_INITIALIZE_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Petrinetv2 Net Run Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PETRINETV2_NET_RUN_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Petrinetv2 Transition Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PETRINETV2_TRANSITION_FIRE_SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Petrinetv2 traced Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PETRINETV2_TRACED_PLACES = 3;

	/**
	 * The feature id for the '<em><b>Petrinetv2 traced Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PETRINETV2_TRACED_TOKENS = 4;

	/**
	 * The feature id for the '<em><b>Root Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ROOT_STEPS = 5;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STATES_TRACE = 6;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link petrinetv2Trace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see petrinetv2Trace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv2Trace.Trace#getPetrinetv2_Net_Initialize_Sequence <em>Petrinetv2 Net Initialize Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Petrinetv2 Net Initialize Sequence</em>'.
	 * @see petrinetv2Trace.Trace#getPetrinetv2_Net_Initialize_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Petrinetv2_Net_Initialize_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv2Trace.Trace#getPetrinetv2_Net_Run_Sequence <em>Petrinetv2 Net Run Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Petrinetv2 Net Run Sequence</em>'.
	 * @see petrinetv2Trace.Trace#getPetrinetv2_Net_Run_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Petrinetv2_Net_Run_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv2Trace.Trace#getPetrinetv2_Transition_Fire_Sequence <em>Petrinetv2 Transition Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Petrinetv2 Transition Fire Sequence</em>'.
	 * @see petrinetv2Trace.Trace#getPetrinetv2_Transition_Fire_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Petrinetv2_Transition_Fire_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetv2Trace.Trace#getPetrinetv2_tracedPlaces <em>Petrinetv2 traced Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Petrinetv2 traced Places</em>'.
	 * @see petrinetv2Trace.Trace#getPetrinetv2_tracedPlaces()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Petrinetv2_tracedPlaces();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetv2Trace.Trace#getPetrinetv2_tracedTokens <em>Petrinetv2 traced Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Petrinetv2 traced Tokens</em>'.
	 * @see petrinetv2Trace.Trace#getPetrinetv2_tracedTokens()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Petrinetv2_tracedTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetv2Trace.Trace#getRootSteps <em>Root Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Steps</em>'.
	 * @see petrinetv2Trace.Trace#getRootSteps()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_RootSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetv2Trace.Trace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see petrinetv2Trace.Trace#getStatesTrace()
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
	Petrinetv2TraceFactory getPetrinetv2TraceFactory();

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
		 * The meta object literal for the '{@link petrinetv2Trace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv2Trace.impl.TraceImpl
		 * @see petrinetv2Trace.impl.Petrinetv2TracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Petrinetv2 Net Initialize Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__PETRINETV2_NET_INITIALIZE_SEQUENCE = eINSTANCE.getTrace_Petrinetv2_Net_Initialize_Sequence();

		/**
		 * The meta object literal for the '<em><b>Petrinetv2 Net Run Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__PETRINETV2_NET_RUN_SEQUENCE = eINSTANCE.getTrace_Petrinetv2_Net_Run_Sequence();

		/**
		 * The meta object literal for the '<em><b>Petrinetv2 Transition Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__PETRINETV2_TRANSITION_FIRE_SEQUENCE = eINSTANCE.getTrace_Petrinetv2_Transition_Fire_Sequence();

		/**
		 * The meta object literal for the '<em><b>Petrinetv2 traced Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__PETRINETV2_TRACED_PLACES = eINSTANCE.getTrace_Petrinetv2_tracedPlaces();

		/**
		 * The meta object literal for the '<em><b>Petrinetv2 traced Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__PETRINETV2_TRACED_TOKENS = eINSTANCE.getTrace_Petrinetv2_tracedTokens();

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

} //Petrinetv2TracePackage
