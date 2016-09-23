/**
 */
package gseq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gseq.Not#getNotExpression <em>Not Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see gseq.GseqPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Not Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Expression</em>' reference.
	 * @see #setNotExpression(BooleanExpression)
	 * @see gseq.GseqPackage#getNot_NotExpression()
	 * @model required="true"
	 * @generated
	 */
	BooleanExpression getNotExpression();

	/**
	 * Sets the value of the '{@link gseq.Not#getNotExpression <em>Not Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Expression</em>' reference.
	 * @see #getNotExpression()
	 * @generated
	 */
	void setNotExpression(BooleanExpression value);

} // Not
