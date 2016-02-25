/**
 */
package petrinetv1Trace.States.petrinetv1;

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
 * @see petrinetv1Trace.States.petrinetv1.Petrinetv1Factory
 * @model kind="package"
 * @generated
 */
public interface Petrinetv1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinetv1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "petrinetv1Trace_petrinetv1";

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
	Petrinetv1Package eINSTANCE = petrinetv1Trace.States.petrinetv1.impl.Petrinetv1PackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetv1Trace.States.petrinetv1.impl.TracedPlaceImpl <em>Traced Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv1Trace.States.petrinetv1.impl.TracedPlaceImpl
	 * @see petrinetv1Trace.States.petrinetv1.impl.Petrinetv1PackageImpl#getTracedPlace()
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
	 * The feature id for the '<em><b>Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PLACE__TOKENS_SEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>Traced Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PLACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Traced Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PLACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link petrinetv1Trace.States.petrinetv1.TracedPlace <em>Traced Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Place</em>'.
	 * @see petrinetv1Trace.States.petrinetv1.TracedPlace
	 * @generated
	 */
	EClass getTracedPlace();

	/**
	 * Returns the meta object for the reference '{@link petrinetv1Trace.States.petrinetv1.TracedPlace#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see petrinetv1Trace.States.petrinetv1.TracedPlace#getOriginalObject()
	 * @see #getTracedPlace()
	 * @generated
	 */
	EReference getTracedPlace_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetv1Trace.States.petrinetv1.TracedPlace#getTokensSequence <em>Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens Sequence</em>'.
	 * @see petrinetv1Trace.States.petrinetv1.TracedPlace#getTokensSequence()
	 * @see #getTracedPlace()
	 * @generated
	 */
	EReference getTracedPlace_TokensSequence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Petrinetv1Factory getPetrinetv1Factory();

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
		 * The meta object literal for the '{@link petrinetv1Trace.States.petrinetv1.impl.TracedPlaceImpl <em>Traced Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv1Trace.States.petrinetv1.impl.TracedPlaceImpl
		 * @see petrinetv1Trace.States.petrinetv1.impl.Petrinetv1PackageImpl#getTracedPlace()
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
		 * The meta object literal for the '<em><b>Tokens Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PLACE__TOKENS_SEQUENCE = eINSTANCE.getTracedPlace_TokensSequence();

	}

} //Petrinetv1Package
