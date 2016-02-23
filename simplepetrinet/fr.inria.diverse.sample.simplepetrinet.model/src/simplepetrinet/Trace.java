/**
 */
package simplepetrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simplepetrinet.Trace#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see simplepetrinet.SimplepetrinetPackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link simplepetrinet.Net}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see simplepetrinet.SimplepetrinetPackage#getTrace_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<Net> getStates();

} // Trace
