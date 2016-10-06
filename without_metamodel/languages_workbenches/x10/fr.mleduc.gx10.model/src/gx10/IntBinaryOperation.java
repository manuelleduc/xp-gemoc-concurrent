/**
 */
package gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gx10.IntBinaryOperation#getLeftBinaryExpression <em>Left Binary Expression</em>}</li>
 *   <li>{@link gx10.IntBinaryOperation#getRightBinaryExpression <em>Right Binary Expression</em>}</li>
 * </ul>
 *
 * @see gx10.Gx10Package#getIntBinaryOperation()
 * @model abstract="true"
 * @generated
 */
public interface IntBinaryOperation extends IntExpression {
	/**
	 * Returns the value of the '<em><b>Left Binary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Binary Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Binary Expression</em>' containment reference.
	 * @see #setLeftBinaryExpression(IntExpression)
	 * @see gx10.Gx10Package#getIntBinaryOperation_LeftBinaryExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntExpression getLeftBinaryExpression();

	/**
	 * Sets the value of the '{@link gx10.IntBinaryOperation#getLeftBinaryExpression <em>Left Binary Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Binary Expression</em>' containment reference.
	 * @see #getLeftBinaryExpression()
	 * @generated
	 */
	void setLeftBinaryExpression(IntExpression value);

	/**
	 * Returns the value of the '<em><b>Right Binary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Binary Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Binary Expression</em>' containment reference.
	 * @see #setRightBinaryExpression(IntExpression)
	 * @see gx10.Gx10Package#getIntBinaryOperation_RightBinaryExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntExpression getRightBinaryExpression();

	/**
	 * Sets the value of the '{@link gx10.IntBinaryOperation#getRightBinaryExpression <em>Right Binary Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Binary Expression</em>' containment reference.
	 * @see #getRightBinaryExpression()
	 * @generated
	 */
	void setRightBinaryExpression(IntExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void evaluate();

} // IntBinaryOperation
