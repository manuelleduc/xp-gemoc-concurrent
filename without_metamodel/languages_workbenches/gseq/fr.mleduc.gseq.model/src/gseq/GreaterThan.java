/**
 */
package gseq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greater Than</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gseq.GreaterThan#getLeftGreaterThan <em>Left Greater Than</em>}</li>
 *   <li>{@link gseq.GreaterThan#getRightGreaterThan <em>Right Greater Than</em>}</li>
 * </ul>
 * </p>
 *
 * @see gseq.GseqPackage#getGreaterThan()
 * @model
 * @generated
 */
public interface GreaterThan extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Left Greater Than</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Greater Than</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Greater Than</em>' reference.
	 * @see #setLeftGreaterThan(IntegerExpression)
	 * @see gseq.GseqPackage#getGreaterThan_LeftGreaterThan()
	 * @model required="true"
	 * @generated
	 */
	IntegerExpression getLeftGreaterThan();

	/**
	 * Sets the value of the '{@link gseq.GreaterThan#getLeftGreaterThan <em>Left Greater Than</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Greater Than</em>' reference.
	 * @see #getLeftGreaterThan()
	 * @generated
	 */
	void setLeftGreaterThan(IntegerExpression value);

	/**
	 * Returns the value of the '<em><b>Right Greater Than</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Greater Than</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Greater Than</em>' reference.
	 * @see #setRightGreaterThan(IntegerExpression)
	 * @see gseq.GseqPackage#getGreaterThan_RightGreaterThan()
	 * @model
	 * @generated
	 */
	IntegerExpression getRightGreaterThan();

	/**
	 * Sets the value of the '{@link gseq.GreaterThan#getRightGreaterThan <em>Right Greater Than</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Greater Than</em>' reference.
	 * @see #getRightGreaterThan()
	 * @generated
	 */
	void setRightGreaterThan(IntegerExpression value);

} // GreaterThan
