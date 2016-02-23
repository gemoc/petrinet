/**
 */
package simplepetrinetTrace;

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
 * @see simplepetrinetTrace.SimplepetrinetTraceFactory
 * @model kind="package"
 * @generated
 */
public interface SimplepetrinetTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplepetrinetTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "simplepetrinetTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplepetrinetTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplepetrinetTracePackage eINSTANCE = simplepetrinetTrace.impl.SimplepetrinetTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link simplepetrinetTrace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplepetrinetTrace.impl.TraceImpl
	 * @see simplepetrinetTrace.impl.SimplepetrinetTracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Simplepetrinet Net Initialize Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SIMPLEPETRINET_NET_INITIALIZE_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Simplepetrinet Transition Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SIMPLEPETRINET_TRANSITION_FIRE_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Root Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ROOT_STEPS = 2;

	/**
	 * The feature id for the '<em><b>Simplepetrinet traced Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SIMPLEPETRINET_TRACED_PLACES = 3;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STATES_TRACE = 4;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link simplepetrinetTrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see simplepetrinetTrace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link simplepetrinetTrace.Trace#getSimplepetrinet_Net_Initialize_Sequence <em>Simplepetrinet Net Initialize Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simplepetrinet Net Initialize Sequence</em>'.
	 * @see simplepetrinetTrace.Trace#getSimplepetrinet_Net_Initialize_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Simplepetrinet_Net_Initialize_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link simplepetrinetTrace.Trace#getSimplepetrinet_Transition_Fire_Sequence <em>Simplepetrinet Transition Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simplepetrinet Transition Fire Sequence</em>'.
	 * @see simplepetrinetTrace.Trace#getSimplepetrinet_Transition_Fire_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Simplepetrinet_Transition_Fire_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link simplepetrinetTrace.Trace#getRootSteps <em>Root Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Steps</em>'.
	 * @see simplepetrinetTrace.Trace#getRootSteps()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_RootSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link simplepetrinetTrace.Trace#getSimplepetrinet_tracedPlaces <em>Simplepetrinet traced Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simplepetrinet traced Places</em>'.
	 * @see simplepetrinetTrace.Trace#getSimplepetrinet_tracedPlaces()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Simplepetrinet_tracedPlaces();

	/**
	 * Returns the meta object for the containment reference list '{@link simplepetrinetTrace.Trace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see simplepetrinetTrace.Trace#getStatesTrace()
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
	SimplepetrinetTraceFactory getSimplepetrinetTraceFactory();

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
		 * The meta object literal for the '{@link simplepetrinetTrace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplepetrinetTrace.impl.TraceImpl
		 * @see simplepetrinetTrace.impl.SimplepetrinetTracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Simplepetrinet Net Initialize Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__SIMPLEPETRINET_NET_INITIALIZE_SEQUENCE = eINSTANCE.getTrace_Simplepetrinet_Net_Initialize_Sequence();

		/**
		 * The meta object literal for the '<em><b>Simplepetrinet Transition Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__SIMPLEPETRINET_TRANSITION_FIRE_SEQUENCE = eINSTANCE.getTrace_Simplepetrinet_Transition_Fire_Sequence();

		/**
		 * The meta object literal for the '<em><b>Root Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ROOT_STEPS = eINSTANCE.getTrace_RootSteps();

		/**
		 * The meta object literal for the '<em><b>Simplepetrinet traced Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__SIMPLEPETRINET_TRACED_PLACES = eINSTANCE.getTrace_Simplepetrinet_tracedPlaces();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STATES_TRACE = eINSTANCE.getTrace_StatesTrace();

	}

} //SimplepetrinetTracePackage
