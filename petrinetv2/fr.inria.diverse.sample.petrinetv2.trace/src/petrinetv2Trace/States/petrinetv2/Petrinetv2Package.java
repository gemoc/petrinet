/**
 */
package petrinetv2Trace.States.petrinetv2;

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
 * @see petrinetv2Trace.States.petrinetv2.Petrinetv2Factory
 * @model kind="package"
 * @generated
 */
public interface Petrinetv2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinetv2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "petrinetv2Trace_petrinetv2";

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
	Petrinetv2Package eINSTANCE = petrinetv2Trace.States.petrinetv2.impl.Petrinetv2PackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetv2Trace.States.petrinetv2.impl.TracedPlaceImpl <em>Traced Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv2Trace.States.petrinetv2.impl.TracedPlaceImpl
	 * @see petrinetv2Trace.States.petrinetv2.impl.Petrinetv2PackageImpl#getTracedPlace()
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
	 * The meta object id for the '{@link petrinetv2Trace.States.petrinetv2.impl.TracedTokenImpl <em>Traced Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv2Trace.States.petrinetv2.impl.TracedTokenImpl
	 * @see petrinetv2Trace.States.petrinetv2.impl.Petrinetv2PackageImpl#getTracedToken()
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
	 * Returns the meta object for class '{@link petrinetv2Trace.States.petrinetv2.TracedPlace <em>Traced Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Place</em>'.
	 * @see petrinetv2Trace.States.petrinetv2.TracedPlace
	 * @generated
	 */
	EClass getTracedPlace();

	/**
	 * Returns the meta object for the reference '{@link petrinetv2Trace.States.petrinetv2.TracedPlace#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see petrinetv2Trace.States.petrinetv2.TracedPlace#getOriginalObject()
	 * @see #getTracedPlace()
	 * @generated
	 */
	EReference getTracedPlace_OriginalObject();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv2Trace.States.petrinetv2.TracedPlace#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tokens</em>'.
	 * @see petrinetv2Trace.States.petrinetv2.TracedPlace#getTokens()
	 * @see #getTracedPlace()
	 * @generated
	 */
	EReference getTracedPlace_Tokens();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetv2Trace.States.petrinetv2.TracedPlace#getTokensSequence <em>Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens Sequence</em>'.
	 * @see petrinetv2Trace.States.petrinetv2.TracedPlace#getTokensSequence()
	 * @see #getTracedPlace()
	 * @generated
	 */
	EReference getTracedPlace_TokensSequence();

	/**
	 * Returns the meta object for class '{@link petrinetv2Trace.States.petrinetv2.TracedToken <em>Traced Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Token</em>'.
	 * @see petrinetv2Trace.States.petrinetv2.TracedToken
	 * @generated
	 */
	EClass getTracedToken();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Petrinetv2Factory getPetrinetv2Factory();

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
		 * The meta object literal for the '{@link petrinetv2Trace.States.petrinetv2.impl.TracedPlaceImpl <em>Traced Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv2Trace.States.petrinetv2.impl.TracedPlaceImpl
		 * @see petrinetv2Trace.States.petrinetv2.impl.Petrinetv2PackageImpl#getTracedPlace()
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
		 * The meta object literal for the '{@link petrinetv2Trace.States.petrinetv2.impl.TracedTokenImpl <em>Traced Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv2Trace.States.petrinetv2.impl.TracedTokenImpl
		 * @see petrinetv2Trace.States.petrinetv2.impl.Petrinetv2PackageImpl#getTracedToken()
		 * @generated
		 */
		EClass TRACED_TOKEN = eINSTANCE.getTracedToken();

	}

} //Petrinetv2Package
