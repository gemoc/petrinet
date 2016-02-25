/**
 */
package petrinetv3Trace.States.petrinetv3;

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
 * @see petrinetv3Trace.States.petrinetv3.Petrinetv3Factory
 * @model kind="package"
 * @generated
 */
public interface Petrinetv3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinetv3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "petrinetv3Trace_petrinetv3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Petrinetv3Package eINSTANCE = petrinetv3Trace.States.petrinetv3.impl.Petrinetv3PackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetv3Trace.States.petrinetv3.impl.TracedPlaceImpl <em>Traced Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.States.petrinetv3.impl.TracedPlaceImpl
	 * @see petrinetv3Trace.States.petrinetv3.impl.Petrinetv3PackageImpl#getTracedPlace()
	 * @generated
	 */
	int TRACED_PLACE = 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PLACE__ORIGINAL_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PLACE__TOKENS = 1;

	/**
	 * The feature id for the '<em><b>Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PLACE__TOKENS_SEQUENCE = 2;

	/**
	 * The number of structural features of the '<em>Traced Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PLACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Traced Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetv3Trace.States.petrinetv3.impl.TracedTokenImpl <em>Traced Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.States.petrinetv3.impl.TracedTokenImpl
	 * @see petrinetv3Trace.States.petrinetv3.impl.Petrinetv3PackageImpl#getTracedToken()
	 * @generated
	 */
	int TRACED_TOKEN = 1;

	/**
	 * The number of structural features of the '<em>Traced Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetv3Trace.States.petrinetv3.impl.TracedTransitionImpl <em>Traced Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.States.petrinetv3.impl.TracedTransitionImpl
	 * @see petrinetv3Trace.States.petrinetv3.impl.Petrinetv3PackageImpl#getTracedTransition()
	 * @generated
	 */
	int TRACED_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Clock Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION__CLOCK_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION__INPUT = 1;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION__ORIGINAL_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION__OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Parent Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION__PARENT_NET = 4;

	/**
	 * The number of structural features of the '<em>Traced Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Traced Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.States.petrinetv3.TracedPlace <em>Traced Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Place</em>'.
	 * @see petrinetv3Trace.States.petrinetv3.TracedPlace
	 * @generated
	 */
	EClass getTracedPlace();

	/**
	 * Returns the meta object for the reference '{@link petrinetv3Trace.States.petrinetv3.TracedPlace#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see petrinetv3Trace.States.petrinetv3.TracedPlace#getOriginalObject()
	 * @see #getTracedPlace()
	 * @generated
	 */
	EReference getTracedPlace_OriginalObject();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv3Trace.States.petrinetv3.TracedPlace#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tokens</em>'.
	 * @see petrinetv3Trace.States.petrinetv3.TracedPlace#getTokens()
	 * @see #getTracedPlace()
	 * @generated
	 */
	EReference getTracedPlace_Tokens();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetv3Trace.States.petrinetv3.TracedPlace#getTokensSequence <em>Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens Sequence</em>'.
	 * @see petrinetv3Trace.States.petrinetv3.TracedPlace#getTokensSequence()
	 * @see #getTracedPlace()
	 * @generated
	 */
	EReference getTracedPlace_TokensSequence();

	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.States.petrinetv3.TracedToken <em>Traced Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Token</em>'.
	 * @see petrinetv3Trace.States.petrinetv3.TracedToken
	 * @generated
	 */
	EClass getTracedToken();

	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.States.petrinetv3.TracedTransition <em>Traced Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Transition</em>'.
	 * @see petrinetv3Trace.States.petrinetv3.TracedTransition
	 * @generated
	 */
	EClass getTracedTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetv3Trace.States.petrinetv3.TracedTransition#getClockSequence <em>Clock Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clock Sequence</em>'.
	 * @see petrinetv3Trace.States.petrinetv3.TracedTransition#getClockSequence()
	 * @see #getTracedTransition()
	 * @generated
	 */
	EReference getTracedTransition_ClockSequence();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv3Trace.States.petrinetv3.TracedTransition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see petrinetv3Trace.States.petrinetv3.TracedTransition#getInput()
	 * @see #getTracedTransition()
	 * @generated
	 */
	EReference getTracedTransition_Input();

	/**
	 * Returns the meta object for the reference '{@link petrinetv3Trace.States.petrinetv3.TracedTransition#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see petrinetv3Trace.States.petrinetv3.TracedTransition#getOriginalObject()
	 * @see #getTracedTransition()
	 * @generated
	 */
	EReference getTracedTransition_OriginalObject();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv3Trace.States.petrinetv3.TracedTransition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see petrinetv3Trace.States.petrinetv3.TracedTransition#getOutput()
	 * @see #getTracedTransition()
	 * @generated
	 */
	EReference getTracedTransition_Output();

	/**
	 * Returns the meta object for the reference '{@link petrinetv3Trace.States.petrinetv3.TracedTransition#getParentNet <em>Parent Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Net</em>'.
	 * @see petrinetv3Trace.States.petrinetv3.TracedTransition#getParentNet()
	 * @see #getTracedTransition()
	 * @generated
	 */
	EReference getTracedTransition_ParentNet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Petrinetv3Factory getPetrinetv3Factory();

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
		 * The meta object literal for the '{@link petrinetv3Trace.States.petrinetv3.impl.TracedPlaceImpl <em>Traced Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.States.petrinetv3.impl.TracedPlaceImpl
		 * @see petrinetv3Trace.States.petrinetv3.impl.Petrinetv3PackageImpl#getTracedPlace()
		 * @generated
		 */
		EClass TRACED_PLACE = eINSTANCE.getTracedPlace();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PLACE__ORIGINAL_OBJECT = eINSTANCE.getTracedPlace_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PLACE__TOKENS = eINSTANCE.getTracedPlace_Tokens();

		/**
		 * The meta object literal for the '<em><b>Tokens Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PLACE__TOKENS_SEQUENCE = eINSTANCE.getTracedPlace_TokensSequence();

		/**
		 * The meta object literal for the '{@link petrinetv3Trace.States.petrinetv3.impl.TracedTokenImpl <em>Traced Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.States.petrinetv3.impl.TracedTokenImpl
		 * @see petrinetv3Trace.States.petrinetv3.impl.Petrinetv3PackageImpl#getTracedToken()
		 * @generated
		 */
		EClass TRACED_TOKEN = eINSTANCE.getTracedToken();

		/**
		 * The meta object literal for the '{@link petrinetv3Trace.States.petrinetv3.impl.TracedTransitionImpl <em>Traced Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.States.petrinetv3.impl.TracedTransitionImpl
		 * @see petrinetv3Trace.States.petrinetv3.impl.Petrinetv3PackageImpl#getTracedTransition()
		 * @generated
		 */
		EClass TRACED_TRANSITION = eINSTANCE.getTracedTransition();

		/**
		 * The meta object literal for the '<em><b>Clock Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSITION__CLOCK_SEQUENCE = eINSTANCE.getTracedTransition_ClockSequence();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSITION__INPUT = eINSTANCE.getTracedTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSITION__ORIGINAL_OBJECT = eINSTANCE.getTracedTransition_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSITION__OUTPUT = eINSTANCE.getTracedTransition_Output();

		/**
		 * The meta object literal for the '<em><b>Parent Net</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSITION__PARENT_NET = eINSTANCE.getTracedTransition_ParentNet();

	}

} //Petrinetv3Package
