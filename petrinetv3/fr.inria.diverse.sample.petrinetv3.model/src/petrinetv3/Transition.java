/**
 */
package petrinetv3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinetv3.Transition#getInput <em>Input</em>}</li>
 *   <li>{@link petrinetv3.Transition#getOutput <em>Output</em>}</li>
 *   <li>{@link petrinetv3.Transition#getName <em>Name</em>}</li>
 *   <li>{@link petrinetv3.Transition#getTmin <em>Tmin</em>}</li>
 *   <li>{@link petrinetv3.Transition#getTmax <em>Tmax</em>}</li>
 *   <li>{@link petrinetv3.Transition#getClock <em>Clock</em>}</li>
 *   <li>{@link petrinetv3.Transition#getParentNet <em>Parent Net</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinetv3.PetrinetV3Package#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link petrinetv3.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see petrinetv3.PetrinetV3Package#getTransition_Input()
	 * @model required="true"
	 * @generated
	 */
	EList<Place> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link petrinetv3.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see petrinetv3.PetrinetV3Package#getTransition_Output()
	 * @model required="true"
	 * @generated
	 */
	EList<Place> getOutput();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinetv3.PetrinetV3Package#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinetv3.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmin</em>' attribute.
	 * @see #setTmin(int)
	 * @see petrinetv3.PetrinetV3Package#getTransition_Tmin()
	 * @model
	 * @generated
	 */
	int getTmin();

	/**
	 * Sets the value of the '{@link petrinetv3.Transition#getTmin <em>Tmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmin</em>' attribute.
	 * @see #getTmin()
	 * @generated
	 */
	void setTmin(int value);

	/**
	 * Returns the value of the '<em><b>Tmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmax</em>' attribute.
	 * @see #setTmax(int)
	 * @see petrinetv3.PetrinetV3Package#getTransition_Tmax()
	 * @model
	 * @generated
	 */
	int getTmax();

	/**
	 * Sets the value of the '{@link petrinetv3.Transition#getTmax <em>Tmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax</em>' attribute.
	 * @see #getTmax()
	 * @generated
	 */
	void setTmax(int value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' attribute.
	 * @see #setClock(int)
	 * @see petrinetv3.PetrinetV3Package#getTransition_Clock()
	 * @model default="-1"
	 * @generated
	 */
	int getClock();

	/**
	 * Sets the value of the '{@link petrinetv3.Transition#getClock <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' attribute.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(int value);

	/**
	 * Returns the value of the '<em><b>Parent Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinetv3.Net#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Net</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Net</em>' container reference.
	 * @see #setParentNet(Net)
	 * @see petrinetv3.PetrinetV3Package#getTransition_ParentNet()
	 * @see petrinetv3.Net#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	Net getParentNet();

	/**
	 * Sets the value of the '{@link petrinetv3.Transition#getParentNet <em>Parent Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Net</em>' container reference.
	 * @see #getParentNet()
	 * @generated
	 */
	void setParentNet(Net value);

} // Transition
