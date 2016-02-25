/**
 */
package petrinetv2Trace.Steps.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.executionframework.engine.mse.MSEOccurrence;

import petrinetv2Trace.Steps.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see petrinetv2Trace.Steps.StepsPackage
 * @generated
 */
public class StepsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsSwitch() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StepsPackage.BIG_STEP: {
				BigStep bigStep = (BigStep)theEObject;
				T result = caseBigStep(bigStep);
				if (result == null) result = caseStep(bigStep);
				if (result == null) result = caseMSEOccurrence(bigStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINETV2_NET_INITIALIZE: {
				Petrinetv2_Net_Initialize petrinetv2_Net_Initialize = (Petrinetv2_Net_Initialize)theEObject;
				T result = casePetrinetv2_Net_Initialize(petrinetv2_Net_Initialize);
				if (result == null) result = casePetrinetv2_Net_Run_AbstractSubStep(petrinetv2_Net_Initialize);
				if (result == null) result = caseSmallStep(petrinetv2_Net_Initialize);
				if (result == null) result = caseStep(petrinetv2_Net_Initialize);
				if (result == null) result = caseMSEOccurrence(petrinetv2_Net_Initialize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINETV2_NET_RUN: {
				Petrinetv2_Net_Run petrinetv2_Net_Run = (Petrinetv2_Net_Run)theEObject;
				T result = casePetrinetv2_Net_Run(petrinetv2_Net_Run);
				if (result == null) result = caseBigStep(petrinetv2_Net_Run);
				if (result == null) result = caseStep(petrinetv2_Net_Run);
				if (result == null) result = caseMSEOccurrence(petrinetv2_Net_Run);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINETV2_NET_RUN_ABSTRACT_SUB_STEP: {
				Petrinetv2_Net_Run_AbstractSubStep petrinetv2_Net_Run_AbstractSubStep = (Petrinetv2_Net_Run_AbstractSubStep)theEObject;
				T result = casePetrinetv2_Net_Run_AbstractSubStep(petrinetv2_Net_Run_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINETV2_NET_RUN_IMPLICIT_STEP: {
				Petrinetv2_Net_Run_ImplicitStep petrinetv2_Net_Run_ImplicitStep = (Petrinetv2_Net_Run_ImplicitStep)theEObject;
				T result = casePetrinetv2_Net_Run_ImplicitStep(petrinetv2_Net_Run_ImplicitStep);
				if (result == null) result = casePetrinetv2_Net_Run_AbstractSubStep(petrinetv2_Net_Run_ImplicitStep);
				if (result == null) result = caseSmallStep(petrinetv2_Net_Run_ImplicitStep);
				if (result == null) result = caseStep(petrinetv2_Net_Run_ImplicitStep);
				if (result == null) result = caseMSEOccurrence(petrinetv2_Net_Run_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINETV2_TRANSITION_FIRE: {
				Petrinetv2_Transition_Fire petrinetv2_Transition_Fire = (Petrinetv2_Transition_Fire)theEObject;
				T result = casePetrinetv2_Transition_Fire(petrinetv2_Transition_Fire);
				if (result == null) result = casePetrinetv2_Net_Run_AbstractSubStep(petrinetv2_Transition_Fire);
				if (result == null) result = caseSmallStep(petrinetv2_Transition_Fire);
				if (result == null) result = caseStep(petrinetv2_Transition_Fire);
				if (result == null) result = caseMSEOccurrence(petrinetv2_Transition_Fire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ROOT_IMPLICIT_STEP: {
				RootImplicitStep rootImplicitStep = (RootImplicitStep)theEObject;
				T result = caseRootImplicitStep(rootImplicitStep);
				if (result == null) result = caseSmallStep(rootImplicitStep);
				if (result == null) result = caseStep(rootImplicitStep);
				if (result == null) result = caseMSEOccurrence(rootImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.SMALL_STEP: {
				SmallStep smallStep = (SmallStep)theEObject;
				T result = caseSmallStep(smallStep);
				if (result == null) result = caseStep(smallStep);
				if (result == null) result = caseMSEOccurrence(smallStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseMSEOccurrence(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigStep(BigStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinetv2 Net Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinetv2 Net Initialize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinetv2_Net_Initialize(Petrinetv2_Net_Initialize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinetv2 Net Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinetv2 Net Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinetv2_Net_Run(Petrinetv2_Net_Run object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinetv2 Net Run Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinetv2 Net Run Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinetv2_Net_Run_AbstractSubStep(Petrinetv2_Net_Run_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinetv2 Net Run Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinetv2 Net Run Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinetv2_Net_Run_ImplicitStep(Petrinetv2_Net_Run_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinetv2 Transition Fire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinetv2 Transition Fire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinetv2_Transition_Fire(Petrinetv2_Transition_Fire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootImplicitStep(RootImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallStep(SmallStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSE Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSE Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSEOccurrence(MSEOccurrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StepsSwitch
