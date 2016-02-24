/**
 */
package petrinetv1Trace.Steps.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import petrinetv1.Transition;

import petrinetv1Trace.Steps.Petrinetv1_Transition_Fire;
import petrinetv1Trace.Steps.StepsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petrinetv1 Transition Fire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Petrinetv1_Transition_FireImpl extends SmallStepImpl implements Petrinetv1_Transition_Fire {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Petrinetv1_Transition_FireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.PETRINETV1_TRANSITION_FIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getCaller() {
		return (Transition) this.getMse().getCaller();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StepsPackage.PETRINETV1_TRANSITION_FIRE___GET_CALLER:
				return getCaller();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Petrinetv1_Transition_FireImpl