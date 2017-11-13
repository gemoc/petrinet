/**
 */
package fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Net#getPlaces <em>Places</em>}</li>
 *   <li>{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Net#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Petrinetv1Package#getNet()
 * @model
 * @generated
 */
public interface Net extends EObject {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Petrinetv1Package#getNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Petrinetv1Package#getNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated
	 */
	void initialize(EList<String> args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String markingToString();

} // Net
