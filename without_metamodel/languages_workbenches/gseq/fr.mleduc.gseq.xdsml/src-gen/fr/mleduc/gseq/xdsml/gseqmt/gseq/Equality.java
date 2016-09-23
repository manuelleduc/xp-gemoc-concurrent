/**
 */
package fr.mleduc.gseq.xdsml.gseqmt.gseq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Equality#getLeftEquality <em>Left Equality</em>}</li>
 *   <li>{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Equality#getRightEquality <em>Right Equality</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getEquality()
 * @model
 * @generated
 */
public interface Equality extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Left Equality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Equality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Equality</em>' reference.
	 * @see #setLeftEquality(IntegerExpression)
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getEquality_LeftEquality()
	 * @model required="true"
	 * @generated
	 */
	IntegerExpression getLeftEquality();

	/**
	 * Sets the value of the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Equality#getLeftEquality <em>Left Equality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Equality</em>' reference.
	 * @see #getLeftEquality()
	 * @generated
	 */
	void setLeftEquality(IntegerExpression value);

	/**
	 * Returns the value of the '<em><b>Right Equality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Equality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Equality</em>' reference.
	 * @see #setRightEquality(IntegerExpression)
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getEquality_RightEquality()
	 * @model required="true"
	 * @generated
	 */
	IntegerExpression getRightEquality();

	/**
	 * Sets the value of the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Equality#getRightEquality <em>Right Equality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Equality</em>' reference.
	 * @see #getRightEquality()
	 * @generated
	 */
	void setRightEquality(IntegerExpression value);

} // Equality
