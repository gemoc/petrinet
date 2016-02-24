/**
 */
package petrinetv1Trace.Steps.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import petrinetv1.Net;

import petrinetv1Trace.Steps.Petrinetv1_Net_Initialize;
import petrinetv1Trace.Steps.StepsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petrinetv1 Net Initialize</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Petrinetv1_Net_InitializeImpl extends SmallStepImpl implements Petrinetv1_Net_Initialize {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Petrinetv1_Net_InitializeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.PETRINETV1_NET_INITIALIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net getCaller() {
		return (Net) this.getMse().getCaller();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StepsPackage.PETRINETV1_NET_INITIALIZE___GET_CALLER:
				return getCaller();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Petrinetv1_Net_InitializeImpl
