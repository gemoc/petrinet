/**
 */
package petrinetv3Trace.States;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see petrinetv3Trace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "petrinetv3Trace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = petrinetv3Trace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetv3Trace.States.impl.Place_tokens_ValueImpl <em>Place tokens Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.States.impl.Place_tokens_ValueImpl
	 * @see petrinetv3Trace.States.impl.StatesPackageImpl#getPlace_tokens_Value()
	 * @generated
	 */
	int PLACE_TOKENS_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TOKENS_VALUE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TOKENS_VALUE__STATES = 1;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TOKENS_VALUE__TOKENS = 2;

	/**
	 * The number of structural features of the '<em>Place tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TOKENS_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Place tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TOKENS_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetv3Trace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.States.impl.StateImpl
	 * @see petrinetv3Trace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Place tokens Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PLACE_TOKENS_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 2;

	/**
	 * The feature id for the '<em><b>Transition clock Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITION_CLOCK_VALUES = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetv3Trace.States.impl.Transition_clock_ValueImpl <em>Transition clock Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.States.impl.Transition_clock_ValueImpl
	 * @see petrinetv3Trace.States.impl.StatesPackageImpl#getTransition_clock_Value()
	 * @generated
	 */
	int TRANSITION_CLOCK_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CLOCK_VALUE__CLOCK = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CLOCK_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CLOCK_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Transition clock Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CLOCK_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition clock Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CLOCK_VALUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.States.Place_tokens_Value <em>Place tokens Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place tokens Value</em>'.
	 * @see petrinetv3Trace.States.Place_tokens_Value
	 * @generated
	 */
	EClass getPlace_tokens_Value();

	/**
	 * Returns the meta object for the container reference '{@link petrinetv3Trace.States.Place_tokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see petrinetv3Trace.States.Place_tokens_Value#getParent()
	 * @see #getPlace_tokens_Value()
	 * @generated
	 */
	EReference getPlace_tokens_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv3Trace.States.Place_tokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see petrinetv3Trace.States.Place_tokens_Value#getStates()
	 * @see #getPlace_tokens_Value()
	 * @generated
	 */
	EReference getPlace_tokens_Value_States();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv3Trace.States.Place_tokens_Value#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tokens</em>'.
	 * @see petrinetv3Trace.States.Place_tokens_Value#getTokens()
	 * @see #getPlace_tokens_Value()
	 * @generated
	 */
	EReference getPlace_tokens_Value_Tokens();

	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see petrinetv3Trace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv3Trace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see petrinetv3Trace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv3Trace.States.State#getPlace_tokens_Values <em>Place tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Place tokens Values</em>'.
	 * @see petrinetv3Trace.States.State#getPlace_tokens_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Place_tokens_Values();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv3Trace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see petrinetv3Trace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv3Trace.States.State#getTransition_clock_Values <em>Transition clock Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition clock Values</em>'.
	 * @see petrinetv3Trace.States.State#getTransition_clock_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transition_clock_Values();

	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.States.Transition_clock_Value <em>Transition clock Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition clock Value</em>'.
	 * @see petrinetv3Trace.States.Transition_clock_Value
	 * @generated
	 */
	EClass getTransition_clock_Value();

	/**
	 * Returns the meta object for the attribute '{@link petrinetv3Trace.States.Transition_clock_Value#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock</em>'.
	 * @see petrinetv3Trace.States.Transition_clock_Value#getClock()
	 * @see #getTransition_clock_Value()
	 * @generated
	 */
	EAttribute getTransition_clock_Value_Clock();

	/**
	 * Returns the meta object for the container reference '{@link petrinetv3Trace.States.Transition_clock_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see petrinetv3Trace.States.Transition_clock_Value#getParent()
	 * @see #getTransition_clock_Value()
	 * @generated
	 */
	EReference getTransition_clock_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link petrinetv3Trace.States.Transition_clock_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see petrinetv3Trace.States.Transition_clock_Value#getStates()
	 * @see #getTransition_clock_Value()
	 * @generated
	 */
	EReference getTransition_clock_Value_States();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

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
		 * The meta object literal for the '{@link petrinetv3Trace.States.impl.Place_tokens_ValueImpl <em>Place tokens Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.States.impl.Place_tokens_ValueImpl
		 * @see petrinetv3Trace.States.impl.StatesPackageImpl#getPlace_tokens_Value()
		 * @generated
		 */
		EClass PLACE_TOKENS_VALUE = eINSTANCE.getPlace_tokens_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_TOKENS_VALUE__PARENT = eINSTANCE.getPlace_tokens_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_TOKENS_VALUE__STATES = eINSTANCE.getPlace_tokens_Value_States();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_TOKENS_VALUE__TOKENS = eINSTANCE.getPlace_tokens_Value_Tokens();

		/**
		 * The meta object literal for the '{@link petrinetv3Trace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.States.impl.StateImpl
		 * @see petrinetv3Trace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Place tokens Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PLACE_TOKENS_VALUES = eINSTANCE.getState_Place_tokens_Values();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '<em><b>Transition clock Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITION_CLOCK_VALUES = eINSTANCE.getState_Transition_clock_Values();

		/**
		 * The meta object literal for the '{@link petrinetv3Trace.States.impl.Transition_clock_ValueImpl <em>Transition clock Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.States.impl.Transition_clock_ValueImpl
		 * @see petrinetv3Trace.States.impl.StatesPackageImpl#getTransition_clock_Value()
		 * @generated
		 */
		EClass TRANSITION_CLOCK_VALUE = eINSTANCE.getTransition_clock_Value();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_CLOCK_VALUE__CLOCK = eINSTANCE.getTransition_clock_Value_Clock();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_CLOCK_VALUE__PARENT = eINSTANCE.getTransition_clock_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_CLOCK_VALUE__STATES = eINSTANCE.getTransition_clock_Value_States();

	}

} //StatesPackage
