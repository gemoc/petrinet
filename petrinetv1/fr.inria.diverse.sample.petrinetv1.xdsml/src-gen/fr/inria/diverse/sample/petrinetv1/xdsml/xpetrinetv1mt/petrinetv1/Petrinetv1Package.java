/**
 */
package fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1;

import org.eclipse.emf.ecore.EAttribute;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Petrinetv1Factory
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
	String eNS_URI = "http://fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt/petrinetv1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinetv1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Petrinetv1Package eINSTANCE = fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.Petrinetv1PackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.NetImpl <em>Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.NetImpl
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.Petrinetv1PackageImpl#getNet()
	 * @generated
	 */
	int NET = 0;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__TRANSITIONS = 1;

	/**
	 * The number of structural features of the '<em>Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.TransitionImpl
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.Petrinetv1PackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.PlaceImpl
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.Petrinetv1PackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Initial Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INITIAL_TOKENS = 1;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOKENS = 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Net <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net</em>'.
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Net
	 * @generated
	 */
	EClass getNet();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Net#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Net#getPlaces()
	 * @see #getNet()
	 * @generated
	 */
	EReference getNet_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Net#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Net#getTransitions()
	 * @see #getNet()
	 * @generated
	 */
	EReference getNet_Transitions();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Transition#getInput()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Input();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Output();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place#getName()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place#getInitialTokens <em>Initial Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Tokens</em>'.
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place#getInitialTokens()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_InitialTokens();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokens</em>'.
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place#getTokens()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Tokens();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.NetImpl <em>Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.NetImpl
		 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.Petrinetv1PackageImpl#getNet()
		 * @generated
		 */
		EClass NET = eINSTANCE.getNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NET__PLACES = eINSTANCE.getNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NET__TRANSITIONS = eINSTANCE.getNet_Transitions();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.TransitionImpl
		 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.Petrinetv1PackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INPUT = eINSTANCE.getTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.PlaceImpl
		 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.impl.Petrinetv1PackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NAME = eINSTANCE.getPlace_Name();

		/**
		 * The meta object literal for the '<em><b>Initial Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__INITIAL_TOKENS = eINSTANCE.getPlace_InitialTokens();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__TOKENS = eINSTANCE.getPlace_Tokens();

	}

} //Petrinetv1Package
