/**
 */
package gseq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gseq.And#getLeftAnd <em>Left And</em>}</li>
 *   <li>{@link gseq.And#getRightAnd <em>Right And</em>}</li>
 * </ul>
 * </p>
 *
 * @see gseq.GseqPackage#getAnd()
 * @model
 * @generated
 */
public interface And extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Left And</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left And</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left And</em>' reference.
	 * @see #setLeftAnd(BooleanExpression)
	 * @see gseq.GseqPackage#getAnd_LeftAnd()
	 * @model required="true"
	 * @generated
	 */
	BooleanExpression getLeftAnd();

	/**
	 * Sets the value of the '{@link gseq.And#getLeftAnd <em>Left And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left And</em>' reference.
	 * @see #getLeftAnd()
	 * @generated
	 */
	void setLeftAnd(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Right And</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right And</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right And</em>' reference.
	 * @see #setRightAnd(BooleanExpression)
	 * @see gseq.GseqPackage#getAnd_RightAnd()
	 * @model required="true"
	 * @generated
	 */
	BooleanExpression getRightAnd();

	/**
	 * Sets the value of the '{@link gseq.And#getRightAnd <em>Right And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right And</em>' reference.
	 * @see #getRightAnd()
	 * @generated
	 */
	void setRightAnd(BooleanExpression value);

} // And
