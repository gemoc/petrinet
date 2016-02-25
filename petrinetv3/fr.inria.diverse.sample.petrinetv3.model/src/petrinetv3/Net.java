/**
 */
package petrinetv3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinetv3.Net#getPlaces <em>Places</em>}</li>
 *   <li>{@link petrinetv3.Net#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinetv3.PetrinetV3Package#getNet()
 * @model
 * @generated
 */
public interface Net extends EObject {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv3.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see petrinetv3.PetrinetV3Package#getNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetv3.Transition}.
	 * It is bidirectional and its opposite is '{@link petrinetv3.Transition#getParentNet <em>Parent Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see petrinetv3.PetrinetV3Package#getNet_Transitions()
	 * @see petrinetv3.Transition#getParentNet
	 * @model opposite="parentNet" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // Net
