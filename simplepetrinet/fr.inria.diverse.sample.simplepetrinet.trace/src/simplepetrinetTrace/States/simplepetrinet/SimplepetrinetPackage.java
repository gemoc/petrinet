/**
 */
package simplepetrinetTrace.States.simplepetrinet;

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
 * @see simplepetrinetTrace.States.simplepetrinet.SimplepetrinetFactory
 * @model kind="package"
 * @generated
 */
public interface SimplepetrinetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplepetrinet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "simplepetrinetTrace_simplepetrinet";

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
	SimplepetrinetPackage eINSTANCE = simplepetrinetTrace.States.simplepetrinet.impl.SimplepetrinetPackageImpl.init();

	/**
	 * The meta object id for the '{@link simplepetrinetTrace.States.simplepetrinet.impl.TracedPlaceImpl <em>Traced Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplepetrinetTrace.States.simplepetrinet.impl.TracedPlaceImpl
	 * @see simplepetrinetTrace.States.simplepetrinet.impl.SimplepetrinetPackageImpl#getTracedPlace()
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
	 * Returns the meta object for class '{@link simplepetrinetTrace.States.simplepetrinet.TracedPlace <em>Traced Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Place</em>'.
	 * @see simplepetrinetTrace.States.simplepetrinet.TracedPlace
	 * @generated
	 */
	EClass getTracedPlace();

	/**
	 * Returns the meta object for the reference '{@link simplepetrinetTrace.States.simplepetrinet.TracedPlace#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see simplepetrinetTrace.States.simplepetrinet.TracedPlace#getOriginalObject()
	 * @see #getTracedPlace()
	 * @generated
	 */
	EReference getTracedPlace_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link simplepetrinetTrace.States.simplepetrinet.TracedPlace#getTokensSequence <em>Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens Sequence</em>'.
	 * @see simplepetrinetTrace.States.simplepetrinet.TracedPlace#getTokensSequence()
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
	SimplepetrinetFactory getSimplepetrinetFactory();

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
		 * The meta object literal for the '{@link simplepetrinetTrace.States.simplepetrinet.impl.TracedPlaceImpl <em>Traced Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplepetrinetTrace.States.simplepetrinet.impl.TracedPlaceImpl
		 * @see simplepetrinetTrace.States.simplepetrinet.impl.SimplepetrinetPackageImpl#getTracedPlace()
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

} //SimplepetrinetPackage
