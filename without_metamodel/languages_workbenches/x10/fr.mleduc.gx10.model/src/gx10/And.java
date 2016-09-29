/**
 */
package gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gx10.And#getLeftAndExpression <em>Left And Expression</em>}</li>
 *   <li>{@link gx10.And#getRightAndExpression <em>Right And Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see gx10.Gx10Package#getAnd()
 * @model
 * @generated
 */
public interface And extends BoolExpression {
	/**
	 * Returns the value of the '<em><b>Left And Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left And Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left And Expression</em>' containment reference.
	 * @see #setLeftAndExpression(BoolExpression)
	 * @see gx10.Gx10Package#getAnd_LeftAndExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolExpression getLeftAndExpression();

	/**
	 * Sets the value of the '{@link gx10.And#getLeftAndExpression <em>Left And Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left And Expression</em>' containment reference.
	 * @see #getLeftAndExpression()
	 * @generated
	 */
	void setLeftAndExpression(BoolExpression value);

	/**
	 * Returns the value of the '<em><b>Right And Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right And Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right And Expression</em>' containment reference.
	 * @see #setRightAndExpression(BoolExpression)
	 * @see gx10.Gx10Package#getAnd_RightAndExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolExpression getRightAndExpression();

	/**
	 * Sets the value of the '{@link gx10.And#getRightAndExpression <em>Right And Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right And Expression</em>' containment reference.
	 * @see #getRightAndExpression()
	 * @generated
	 */
	void setRightAndExpression(BoolExpression value);

} // And
