/**
 */
package gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finish</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gx10.Finish#getFinishStatement <em>Finish Statement</em>}</li>
 * </ul>
 *
 * @see gx10.Gx10Package#getFinish()
 * @model
 * @generated
 */
public interface Finish extends Statement {
	/**
	 * Returns the value of the '<em><b>Finish Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Statement</em>' containment reference.
	 * @see #setFinishStatement(Statement)
	 * @see gx10.Gx10Package#getFinish_FinishStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getFinishStatement();

	/**
	 * Sets the value of the '{@link gx10.Finish#getFinishStatement <em>Finish Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish Statement</em>' containment reference.
	 * @see #getFinishStatement()
	 * @generated
	 */
	void setFinishStatement(Statement value);

} // Finish
