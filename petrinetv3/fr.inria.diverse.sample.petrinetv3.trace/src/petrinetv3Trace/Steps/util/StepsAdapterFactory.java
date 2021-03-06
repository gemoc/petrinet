/**
 */
package petrinetv3Trace.Steps.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.executionframework.engine.mse.MSEOccurrence;

import petrinetv3Trace.Steps.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see petrinetv3Trace.Steps.StepsPackage
 * @generated
 */
public class StepsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepsSwitch<Adapter> modelSwitch =
		new StepsSwitch<Adapter>() {
			@Override
			public Adapter caseBigStep(BigStep object) {
				return createBigStepAdapter();
			}
			@Override
			public Adapter casePetrinetv3_Net_Initialize(Petrinetv3_Net_Initialize object) {
				return createPetrinetv3_Net_InitializeAdapter();
			}
			@Override
			public Adapter casePetrinetv3_Net_Run(Petrinetv3_Net_Run object) {
				return createPetrinetv3_Net_RunAdapter();
			}
			@Override
			public Adapter casePetrinetv3_Net_Run_AbstractSubStep(Petrinetv3_Net_Run_AbstractSubStep object) {
				return createPetrinetv3_Net_Run_AbstractSubStepAdapter();
			}
			@Override
			public Adapter casePetrinetv3_Net_Run_ImplicitStep(Petrinetv3_Net_Run_ImplicitStep object) {
				return createPetrinetv3_Net_Run_ImplicitStepAdapter();
			}
			@Override
			public Adapter casePetrinetv3_Net_TickEnabledTransitions(Petrinetv3_Net_TickEnabledTransitions object) {
				return createPetrinetv3_Net_TickEnabledTransitionsAdapter();
			}
			@Override
			public Adapter casePetrinetv3_Transition_Fire(Petrinetv3_Transition_Fire object) {
				return createPetrinetv3_Transition_FireAdapter();
			}
			@Override
			public Adapter caseRootImplicitStep(RootImplicitStep object) {
				return createRootImplicitStepAdapter();
			}
			@Override
			public Adapter caseSmallStep(SmallStep object) {
				return createSmallStepAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseMSEOccurrence(MSEOccurrence object) {
				return createMSEOccurrenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link petrinetv3Trace.Steps.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetv3Trace.Steps.BigStep
	 * @generated
	 */
	public Adapter createBigStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetv3Trace.Steps.Petrinetv3_Net_Initialize <em>Petrinetv3 Net Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Net_Initialize
	 * @generated
	 */
	public Adapter createPetrinetv3_Net_InitializeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetv3Trace.Steps.Petrinetv3_Net_Run <em>Petrinetv3 Net Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Net_Run
	 * @generated
	 */
	public Adapter createPetrinetv3_Net_RunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetv3Trace.Steps.Petrinetv3_Net_Run_AbstractSubStep <em>Petrinetv3 Net Run Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Net_Run_AbstractSubStep
	 * @generated
	 */
	public Adapter createPetrinetv3_Net_Run_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetv3Trace.Steps.Petrinetv3_Net_Run_ImplicitStep <em>Petrinetv3 Net Run Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Net_Run_ImplicitStep
	 * @generated
	 */
	public Adapter createPetrinetv3_Net_Run_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions <em>Petrinetv3 Net Tick Enabled Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Net_TickEnabledTransitions
	 * @generated
	 */
	public Adapter createPetrinetv3_Net_TickEnabledTransitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetv3Trace.Steps.Petrinetv3_Transition_Fire <em>Petrinetv3 Transition Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetv3Trace.Steps.Petrinetv3_Transition_Fire
	 * @generated
	 */
	public Adapter createPetrinetv3_Transition_FireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetv3Trace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetv3Trace.Steps.RootImplicitStep
	 * @generated
	 */
	public Adapter createRootImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetv3Trace.Steps.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetv3Trace.Steps.SmallStep
	 * @generated
	 */
	public Adapter createSmallStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetv3Trace.Steps.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetv3Trace.Steps.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.executionframework.engine.mse.MSEOccurrence <em>MSE Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.executionframework.engine.mse.MSEOccurrence
	 * @generated
	 */
	public Adapter createMSEOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StepsAdapterFactory
