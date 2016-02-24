/**
 */
package petrinetv1Trace.States.petrinetv1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinetv1Trace.States.petrinetv1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Petrinetv1FactoryImpl extends EFactoryImpl implements Petrinetv1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Petrinetv1Factory init() {
		try {
			Petrinetv1Factory thePetrinetv1Factory = (Petrinetv1Factory)EPackage.Registry.INSTANCE.getEFactory(Petrinetv1Package.eNS_URI);
			if (thePetrinetv1Factory != null) {
				return thePetrinetv1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Petrinetv1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv1FactoryImpl() {
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
			case Petrinetv1Package.TRACED_PLACE: return createTracedPlace();
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
	public Petrinetv1Package getPetrinetv1Package() {
		return (Petrinetv1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Petrinetv1Package getPackage() {
		return Petrinetv1Package.eINSTANCE;
	}

} //Petrinetv1FactoryImpl
