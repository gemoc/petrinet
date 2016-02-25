/**
 */
package petrinetv3Trace.Steps;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gemoc.executionframework.engine.mse.MsePackage;

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
 * @see petrinetv3Trace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "petrinetv3Trace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = petrinetv3Trace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetv3Trace.Steps.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.Steps.impl.StepImpl
	 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 9;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MSE = MsePackage.MSE_OCCURRENCE__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARAMETERS = MsePackage.MSE_OCCURRENCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RESULT = MsePackage.MSE_OCCURRENCE__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LOGICAL_STEP = MsePackage.MSE_OCCURRENCE__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ENDING_STATE = MsePackage.MSE_OCCURRENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STARTING_STATE = MsePackage.MSE_OCCURRENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = MsePackage.MSE_OCCURRENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = MsePackage.MSE_OCCURRENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetv3Trace.Steps.impl.BigStepImpl <em>Big Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.Steps.impl.BigStepImpl
	 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getBigStep()
	 * @generated
	 */
	int BIG_STEP = 0;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__MSE = STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__RESULT = STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__LOGICAL_STEP = STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__ENDING_STATE = STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__STARTING_STATE = STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Big Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Big Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetv3Trace.Steps.impl.Petrinetv3_Net_Run_AbstractSubStepImpl <em>Petrinetv3 Net Run Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.Steps.impl.Petrinetv3_Net_Run_AbstractSubStepImpl
	 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getPetrinetv3_Net_Run_AbstractSubStep()
	 * @generated
	 */
	int PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP = 3;

	/**
	 * The number of structural features of the '<em>Petrinetv3 Net Run Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Petrinetv3 Net Run Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetv3Trace.Steps.impl.Petrinetv3_Net_InitializeImpl <em>Petrinetv3 Net Initialize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.Steps.impl.Petrinetv3_Net_InitializeImpl
	 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getPetrinetv3_Net_Initialize()
	 * @generated
	 */
	int PETRINETV3_NET_INITIALIZE = 1;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_INITIALIZE__MSE = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_INITIALIZE__PARAMETERS = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_INITIALIZE__RESULT = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_INITIALIZE__LOGICAL_STEP = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_INITIALIZE__ENDING_STATE = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_INITIALIZE__STARTING_STATE = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Petrinetv3 Net Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_INITIALIZE_FEATURE_COUNT = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_INITIALIZE___GET_CALLER = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Petrinetv3 Net Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_INITIALIZE_OPERATION_COUNT = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetv3Trace.Steps.impl.Petrinetv3_Net_RunImpl <em>Petrinetv3 Net Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.Steps.impl.Petrinetv3_Net_RunImpl
	 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getPetrinetv3_Net_Run()
	 * @generated
	 */
	int PETRINETV3_NET_RUN = 2;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN__MSE = BIG_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN__PARAMETERS = BIG_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN__RESULT = BIG_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN__LOGICAL_STEP = BIG_STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN__ENDING_STATE = BIG_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN__STARTING_STATE = BIG_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN__SUB_STEPS = BIG_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Petrinetv3 Net Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN_FEATURE_COUNT = BIG_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN___GET_CALLER = BIG_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Petrinetv3 Net Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN_OPERATION_COUNT = BIG_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetv3Trace.Steps.impl.Petrinetv3_Net_Run_ImplicitStepImpl <em>Petrinetv3 Net Run Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.Steps.impl.Petrinetv3_Net_Run_ImplicitStepImpl
	 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getPetrinetv3_Net_Run_ImplicitStep()
	 * @generated
	 */
	int PETRINETV3_NET_RUN_IMPLICIT_STEP = 4;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN_IMPLICIT_STEP__MSE = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN_IMPLICIT_STEP__PARAMETERS = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN_IMPLICIT_STEP__RESULT = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN_IMPLICIT_STEP__LOGICAL_STEP = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN_IMPLICIT_STEP__ENDING_STATE = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN_IMPLICIT_STEP__STARTING_STATE = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Petrinetv3 Net Run Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN_IMPLICIT_STEP_FEATURE_COUNT = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Petrinetv3 Net Run Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_RUN_IMPLICIT_STEP_OPERATION_COUNT = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetv3Trace.Steps.impl.Petrinetv3_Net_TickEnabledTransitionsImpl <em>Petrinetv3 Net Tick Enabled Transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.Steps.impl.Petrinetv3_Net_TickEnabledTransitionsImpl
	 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getPetrinetv3_Net_TickEnabledTransitions()
	 * @generated
	 */
	int PETRINETV3_NET_TICK_ENABLED_TRANSITIONS = 5;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_TICK_ENABLED_TRANSITIONS__MSE = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_TICK_ENABLED_TRANSITIONS__PARAMETERS = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_TICK_ENABLED_TRANSITIONS__RESULT = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_TICK_ENABLED_TRANSITIONS__LOGICAL_STEP = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_TICK_ENABLED_TRANSITIONS__ENDING_STATE = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_TICK_ENABLED_TRANSITIONS__STARTING_STATE = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Petrinetv3 Net Tick Enabled Transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_TICK_ENABLED_TRANSITIONS_FEATURE_COUNT = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_TICK_ENABLED_TRANSITIONS___GET_CALLER = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Petrinetv3 Net Tick Enabled Transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_NET_TICK_ENABLED_TRANSITIONS_OPERATION_COUNT = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetv3Trace.Steps.impl.Petrinetv3_Transition_FireImpl <em>Petrinetv3 Transition Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.Steps.impl.Petrinetv3_Transition_FireImpl
	 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getPetrinetv3_Transition_Fire()
	 * @generated
	 */
	int PETRINETV3_TRANSITION_FIRE = 6;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_TRANSITION_FIRE__MSE = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_TRANSITION_FIRE__PARAMETERS = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_TRANSITION_FIRE__RESULT = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_TRANSITION_FIRE__LOGICAL_STEP = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_TRANSITION_FIRE__ENDING_STATE = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_TRANSITION_FIRE__STARTING_STATE = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Petrinetv3 Transition Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_TRANSITION_FIRE_FEATURE_COUNT = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_TRANSITION_FIRE___GET_CALLER = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Petrinetv3 Transition Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETV3_TRANSITION_FIRE_OPERATION_COUNT = PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetv3Trace.Steps.impl.SmallStepImpl <em>Small Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.Steps.impl.SmallStepImpl
	 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getSmallStep()
	 * @generated
	 */
	int SMALL_STEP = 8;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__MSE = STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__RESULT = STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__LOGICAL_STEP = STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__ENDING_STATE = STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__STARTING_STATE = STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Small Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Small Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetv3Trace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetv3Trace.Steps.impl.RootImplicitStepImpl
	 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 7;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__LOGICAL_STEP = SMALL_STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.Steps.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Step</em>'.
	 * @see petrinetv3Trace.Steps.BigStep
	 * @generated
	 */
	EClass getBigStep();

	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.Steps.Petrinetv3_Net_Initialize <em>Petrinetv3 Net Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinetv3 Net Initialize</em>'.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Net_Initialize
	 * @generated
	 */
	EClass getPetrinetv3_Net_Initialize();

	/**
	 * Returns the meta object for the '{@link petrinetv3Trace.Steps.Petrinetv3_Net_Initialize#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Net_Initialize#getCaller()
	 * @generated
	 */
	EOperation getPetrinetv3_Net_Initialize__GetCaller();

	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.Steps.Petrinetv3_Net_Run <em>Petrinetv3 Net Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinetv3 Net Run</em>'.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Net_Run
	 * @generated
	 */
	EClass getPetrinetv3_Net_Run();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetv3Trace.Steps.Petrinetv3_Net_Run#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Net_Run#getSubSteps()
	 * @see #getPetrinetv3_Net_Run()
	 * @generated
	 */
	EReference getPetrinetv3_Net_Run_SubSteps();

	/**
	 * Returns the meta object for the '{@link petrinetv3Trace.Steps.Petrinetv3_Net_Run#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Net_Run#getCaller()
	 * @generated
	 */
	EOperation getPetrinetv3_Net_Run__GetCaller();

	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.Steps.Petrinetv3_Net_Run_AbstractSubStep <em>Petrinetv3 Net Run Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinetv3 Net Run Abstract Sub Step</em>'.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Net_Run_AbstractSubStep
	 * @generated
	 */
	EClass getPetrinetv3_Net_Run_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.Steps.Petrinetv3_Net_Run_ImplicitStep <em>Petrinetv3 Net Run Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinetv3 Net Run Implicit Step</em>'.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Net_Run_ImplicitStep
	 * @generated
	 */
	EClass getPetrinetv3_Net_Run_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions <em>Petrinetv3 Net Tick Enabled Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinetv3 Net Tick Enabled Transitions</em>'.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions
	 * @generated
	 */
	EClass getPetrinetv3_Net_TickEnabledTransitions();

	/**
	 * Returns the meta object for the '{@link petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions#getCaller()
	 * @generated
	 */
	EOperation getPetrinetv3_Net_TickEnabledTransitions__GetCaller();

	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.Steps.Petrinetv3_Transition_Fire <em>Petrinetv3 Transition Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinetv3 Transition Fire</em>'.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Transition_Fire
	 * @generated
	 */
	EClass getPetrinetv3_Transition_Fire();

	/**
	 * Returns the meta object for the '{@link petrinetv3Trace.Steps.Petrinetv3_Transition_Fire#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Transition_Fire#getCaller()
	 * @generated
	 */
	EOperation getPetrinetv3_Transition_Fire__GetCaller();

	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see petrinetv3Trace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.Steps.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Step</em>'.
	 * @see petrinetv3Trace.Steps.SmallStep
	 * @generated
	 */
	EClass getSmallStep();

	/**
	 * Returns the meta object for class '{@link petrinetv3Trace.Steps.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see petrinetv3Trace.Steps.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference '{@link petrinetv3Trace.Steps.Step#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see petrinetv3Trace.Steps.Step#getEndingState()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link petrinetv3Trace.Steps.Step#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see petrinetv3Trace.Steps.Step#getStartingState()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_StartingState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

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
		 * The meta object literal for the '{@link petrinetv3Trace.Steps.impl.BigStepImpl <em>Big Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.Steps.impl.BigStepImpl
		 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getBigStep()
		 * @generated
		 */
		EClass BIG_STEP = eINSTANCE.getBigStep();

		/**
		 * The meta object literal for the '{@link petrinetv3Trace.Steps.impl.Petrinetv3_Net_InitializeImpl <em>Petrinetv3 Net Initialize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.Steps.impl.Petrinetv3_Net_InitializeImpl
		 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getPetrinetv3_Net_Initialize()
		 * @generated
		 */
		EClass PETRINETV3_NET_INITIALIZE = eINSTANCE.getPetrinetv3_Net_Initialize();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PETRINETV3_NET_INITIALIZE___GET_CALLER = eINSTANCE.getPetrinetv3_Net_Initialize__GetCaller();

		/**
		 * The meta object literal for the '{@link petrinetv3Trace.Steps.impl.Petrinetv3_Net_RunImpl <em>Petrinetv3 Net Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.Steps.impl.Petrinetv3_Net_RunImpl
		 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getPetrinetv3_Net_Run()
		 * @generated
		 */
		EClass PETRINETV3_NET_RUN = eINSTANCE.getPetrinetv3_Net_Run();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRINETV3_NET_RUN__SUB_STEPS = eINSTANCE.getPetrinetv3_Net_Run_SubSteps();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PETRINETV3_NET_RUN___GET_CALLER = eINSTANCE.getPetrinetv3_Net_Run__GetCaller();

		/**
		 * The meta object literal for the '{@link petrinetv3Trace.Steps.impl.Petrinetv3_Net_Run_AbstractSubStepImpl <em>Petrinetv3 Net Run Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.Steps.impl.Petrinetv3_Net_Run_AbstractSubStepImpl
		 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getPetrinetv3_Net_Run_AbstractSubStep()
		 * @generated
		 */
		EClass PETRINETV3_NET_RUN_ABSTRACT_SUB_STEP = eINSTANCE.getPetrinetv3_Net_Run_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link petrinetv3Trace.Steps.impl.Petrinetv3_Net_Run_ImplicitStepImpl <em>Petrinetv3 Net Run Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.Steps.impl.Petrinetv3_Net_Run_ImplicitStepImpl
		 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getPetrinetv3_Net_Run_ImplicitStep()
		 * @generated
		 */
		EClass PETRINETV3_NET_RUN_IMPLICIT_STEP = eINSTANCE.getPetrinetv3_Net_Run_ImplicitStep();

		/**
		 * The meta object literal for the '{@link petrinetv3Trace.Steps.impl.Petrinetv3_Net_TickEnabledTransitionsImpl <em>Petrinetv3 Net Tick Enabled Transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.Steps.impl.Petrinetv3_Net_TickEnabledTransitionsImpl
		 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getPetrinetv3_Net_TickEnabledTransitions()
		 * @generated
		 */
		EClass PETRINETV3_NET_TICK_ENABLED_TRANSITIONS = eINSTANCE.getPetrinetv3_Net_TickEnabledTransitions();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PETRINETV3_NET_TICK_ENABLED_TRANSITIONS___GET_CALLER = eINSTANCE.getPetrinetv3_Net_TickEnabledTransitions__GetCaller();

		/**
		 * The meta object literal for the '{@link petrinetv3Trace.Steps.impl.Petrinetv3_Transition_FireImpl <em>Petrinetv3 Transition Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.Steps.impl.Petrinetv3_Transition_FireImpl
		 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getPetrinetv3_Transition_Fire()
		 * @generated
		 */
		EClass PETRINETV3_TRANSITION_FIRE = eINSTANCE.getPetrinetv3_Transition_Fire();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PETRINETV3_TRANSITION_FIRE___GET_CALLER = eINSTANCE.getPetrinetv3_Transition_Fire__GetCaller();

		/**
		 * The meta object literal for the '{@link petrinetv3Trace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.Steps.impl.RootImplicitStepImpl
		 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link petrinetv3Trace.Steps.impl.SmallStepImpl <em>Small Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.Steps.impl.SmallStepImpl
		 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getSmallStep()
		 * @generated
		 */
		EClass SMALL_STEP = eINSTANCE.getSmallStep();

		/**
		 * The meta object literal for the '{@link petrinetv3Trace.Steps.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetv3Trace.Steps.impl.StepImpl
		 * @see petrinetv3Trace.Steps.impl.StepsPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ENDING_STATE = eINSTANCE.getStep_EndingState();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__STARTING_STATE = eINSTANCE.getStep_StartingState();

	}

} //StepsPackage
