/**
 */
package fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place#getInitialTokens <em>Initial Tokens</em>}</li>
 *   <li>{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Petrinetv1Package#getPlace()
 * @model
 * @generated
 */
public interface Place extends EObject {
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
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Petrinetv1Package#getPlace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Initial Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Tokens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Tokens</em>' attribute.
	 * @see #setInitialTokens(int)
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Petrinetv1Package#getPlace_InitialTokens()
	 * @model
	 * @generated
	 */
	int getInitialTokens();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place#getInitialTokens <em>Initial Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Tokens</em>' attribute.
	 * @see #getInitialTokens()
	 * @generated
	 */
	void setInitialTokens(int value);

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' attribute.
	 * @see #setTokens(int)
	 * @see fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Petrinetv1Package#getPlace_Tokens()
	 * @model
	 * @generated
	 */
	int getTokens();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Place#getTokens <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' attribute.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(int value);

} // Place
