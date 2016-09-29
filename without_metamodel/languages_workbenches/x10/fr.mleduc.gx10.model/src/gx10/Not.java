/**
 */
package gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gx10.Not#getNotExpression <em>Not Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see gx10.Gx10Package#getNot()
 * @model
 * @generated
 */
public interface Not extends BoolExpression {
	/**
	 * Returns the value of the '<em><b>Not Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Expression</em>' containment reference.
	 * @see #setNotExpression(BoolExpression)
	 * @see gx10.Gx10Package#getNot_NotExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolExpression getNotExpression();

	/**
	 * Sets the value of the '{@link gx10.Not#getNotExpression <em>Not Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Expression</em>' containment reference.
	 * @see #getNotExpression()
	 * @generated
	 */
	void setNotExpression(BoolExpression value);

} // Not
