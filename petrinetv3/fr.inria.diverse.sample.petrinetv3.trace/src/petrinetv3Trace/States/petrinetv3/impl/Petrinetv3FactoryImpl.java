/**
 */
package petrinetv3Trace.States.petrinetv3.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinetv3Trace.States.petrinetv3.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Petrinetv3FactoryImpl extends EFactoryImpl implements Petrinetv3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Petrinetv3Factory init() {
		try {
			Petrinetv3Factory thePetrinetv3Factory = (Petrinetv3Factory)EPackage.Registry.INSTANCE.getEFactory(Petrinetv3Package.eNS_URI);
			if (thePetrinetv3Factory != null) {
				return thePetrinetv3Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Petrinetv3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv3FactoryImpl() {
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
			case Petrinetv3Package.TRACED_PLACE: return createTracedPlace();
			case Petrinetv3Package.TRACED_TOKEN: return createTracedToken();
			case Petrinetv3Package.TRACED_TRANSITION: return createTracedTransition();
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
	public TracedToken createTracedToken() {
		TracedTokenImpl tracedToken = new TracedTokenImpl();
		return tracedToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTransition createTracedTransition() {
		TracedTransitionImpl tracedTransition = new TracedTransitionImpl();
		return tracedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv3Package getPetrinetv3Package() {
		return (Petrinetv3Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Petrinetv3Package getPackage() {
		return Petrinetv3Package.eINSTANCE;
	}

} //Petrinetv3FactoryImpl
