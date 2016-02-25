/**
 */
package petrinetv2Trace.States.petrinetv2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinetv2Trace.States.petrinetv2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Petrinetv2FactoryImpl extends EFactoryImpl implements Petrinetv2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Petrinetv2Factory init() {
		try {
			Petrinetv2Factory thePetrinetv2Factory = (Petrinetv2Factory)EPackage.Registry.INSTANCE.getEFactory(Petrinetv2Package.eNS_URI);
			if (thePetrinetv2Factory != null) {
				return thePetrinetv2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Petrinetv2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetv2FactoryImpl() {
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
			case Petrinetv2Package.TRACED_PLACE: return createTracedPlace();
			case Petrinetv2Package.TRACED_TOKEN: return createTracedToken();
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
	public Petrinetv2Package getPetrinetv2Package() {
		return (Petrinetv2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Petrinetv2Package getPackage() {
		return Petrinetv2Package.eINSTANCE;
	}

} //Petrinetv2FactoryImpl
