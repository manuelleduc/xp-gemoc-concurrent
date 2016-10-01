/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Equal#getLeftEqual <em>Left Equal</em>}</li>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Equal#getRightEqual <em>Right Equal</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getEqual()
 * @model
 * @generated
 */
public interface Equal extends BoolExpression {
	/**
	 * Returns the value of the '<em><b>Left Equal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Equal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Equal</em>' containment reference.
	 * @see #setLeftEqual(IntExpression)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getEqual_LeftEqual()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntExpression getLeftEqual();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Equal#getLeftEqual <em>Left Equal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Equal</em>' containment reference.
	 * @see #getLeftEqual()
	 * @generated
	 */
	void setLeftEqual(IntExpression value);

	/**
	 * Returns the value of the '<em><b>Right Equal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Equal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Equal</em>' containment reference.
	 * @see #setRightEqual(IntExpression)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getEqual_RightEqual()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntExpression getRightEqual();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Equal#getRightEqual <em>Right Equal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Equal</em>' containment reference.
	 * @see #getRightEqual()
	 * @generated
	 */
	void setRightEqual(IntExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void evaluate();

} // Equal
