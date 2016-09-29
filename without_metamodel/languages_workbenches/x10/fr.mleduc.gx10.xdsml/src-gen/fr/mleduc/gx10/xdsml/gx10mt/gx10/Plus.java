/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Plus#getLeftPlus <em>Left Plus</em>}</li>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Plus#getRightPlus <em>Right Plus</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getPlus()
 * @model
 * @generated
 */
public interface Plus extends IntExpression {
	/**
	 * Returns the value of the '<em><b>Left Plus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Plus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Plus</em>' containment reference.
	 * @see #setLeftPlus(IntExpression)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getPlus_LeftPlus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntExpression getLeftPlus();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Plus#getLeftPlus <em>Left Plus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Plus</em>' containment reference.
	 * @see #getLeftPlus()
	 * @generated
	 */
	void setLeftPlus(IntExpression value);

	/**
	 * Returns the value of the '<em><b>Right Plus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Plus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Plus</em>' containment reference.
	 * @see #setRightPlus(IntExpression)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getPlus_RightPlus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntExpression getRightPlus();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Plus#getRightPlus <em>Right Plus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Plus</em>' containment reference.
	 * @see #getRightPlus()
	 * @generated
	 */
	void setRightPlus(IntExpression value);

} // Plus
