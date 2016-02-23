/**
 */
package simplepetrinetTrace.States.simplepetrinet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simplepetrinetTrace.States.simplepetrinet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplepetrinetFactoryImpl extends EFactoryImpl implements SimplepetrinetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplepetrinetFactory init() {
		try {
			SimplepetrinetFactory theSimplepetrinetFactory = (SimplepetrinetFactory)EPackage.Registry.INSTANCE.getEFactory(SimplepetrinetPackage.eNS_URI);
			if (theSimplepetrinetFactory != null) {
				return theSimplepetrinetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplepetrinetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplepetrinetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimplepetrinetPackage.TRACED_PLACE: return createTracedPlace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPlace createTracedPlace() {
		TracedPlaceImpl tracedPlace = new TracedPlaceImpl();
		return tracedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplepetrinetPackage getSimplepetrinetPackage() {
		return (SimplepetrinetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplepetrinetPackage getPackage() {
		return SimplepetrinetPackage.eINSTANCE;
	}

} //SimplepetrinetFactoryImpl
