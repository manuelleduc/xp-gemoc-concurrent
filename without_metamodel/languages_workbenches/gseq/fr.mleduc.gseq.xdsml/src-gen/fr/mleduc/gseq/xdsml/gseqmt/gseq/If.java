/**
 */
package fr.mleduc.gseq.xdsml.gseqmt.gseq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.If#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.If#getThenBranch <em>Then Branch</em>}</li>
 *   <li>{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.If#getElseBranch <em>Else Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Operation {
	/**
	 * Returns the value of the '<em><b>If Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Condition</em>' reference.
	 * @see #setIfCondition(BooleanExpression)
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getIf_IfCondition()
	 * @model required="true"
	 * @generated
	 */
	BooleanExpression getIfCondition();

	/**
	 * Sets the value of the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.If#getIfCondition <em>If Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Condition</em>' reference.
	 * @see #getIfCondition()
	 * @generated
	 */
	void setIfCondition(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Then Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Branch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Branch</em>' reference.
	 * @see #setThenBranch(Operation)
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getIf_ThenBranch()
	 * @model required="true"
	 * @generated
	 */
	Operation getThenBranch();

	/**
	 * Sets the value of the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.If#getThenBranch <em>Then Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Branch</em>' reference.
	 * @see #getThenBranch()
	 * @generated
	 */
	void setThenBranch(Operation value);

	/**
	 * Returns the value of the '<em><b>Else Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Branch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Branch</em>' reference.
	 * @see #setElseBranch(Operation)
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getIf_ElseBranch()
	 * @model
	 * @generated
	 */
	Operation getElseBranch();

	/**
	 * Sets the value of the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.If#getElseBranch <em>Else Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Branch</em>' reference.
	 * @see #getElseBranch()
	 * @generated
	 */
	void setElseBranch(Operation value);

} // If
