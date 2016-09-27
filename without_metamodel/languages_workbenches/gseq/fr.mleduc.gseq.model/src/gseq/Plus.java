/**
 */
package gseq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gseq.Plus#getLeftPlus <em>Left Plus</em>}</li>
 *   <li>{@link gseq.Plus#getRightPlus <em>Right Plus</em>}</li>
 * </ul>
 * </p>
 *
 * @see gseq.GseqPackage#getPlus()
 * @model
 * @generated
 */
public interface Plus extends IntegerExpression {
	/**
	 * Returns the value of the '<em><b>Left Plus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Plus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Plus</em>' containment reference.
	 * @see #setLeftPlus(IntegerExpression)
	 * @see gseq.GseqPackage#getPlus_LeftPlus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerExpression getLeftPlus();

	/**
	 * Sets the value of the '{@link gseq.Plus#getLeftPlus <em>Left Plus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Plus</em>' containment reference.
	 * @see #getLeftPlus()
	 * @generated
	 */
	void setLeftPlus(IntegerExpression value);

	/**
	 * Returns the value of the '<em><b>Right Plus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Plus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Plus</em>' containment reference.
	 * @see #setRightPlus(IntegerExpression)
	 * @see gseq.GseqPackage#getPlus_RightPlus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerExpression getRightPlus();

	/**
	 * Sets the value of the '{@link gseq.Plus#getRightPlus <em>Right Plus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Plus</em>' containment reference.
	 * @see #getRightPlus()
	 * @generated
	 */
	void setRightPlus(IntegerExpression value);

} // Plus
