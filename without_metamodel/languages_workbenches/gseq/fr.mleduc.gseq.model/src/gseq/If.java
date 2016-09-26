/**
 */
package gseq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gseq.If#getElseBranch <em>Else Branch</em>}</li>
 *   <li>{@link gseq.If#getThenBranch <em>Then Branch</em>}</li>
 *   <li>{@link gseq.If#getConditionIf <em>Condition If</em>}</li>
 * </ul>
 * </p>
 *
 * @see gseq.GseqPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Operation {
	/**
	 * Returns the value of the '<em><b>Else Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Branch</em>' containment reference.
	 * @see #setElseBranch(Operation)
	 * @see gseq.GseqPackage#getIf_ElseBranch()
	 * @model containment="true"
	 * @generated
	 */
	Operation getElseBranch();

	/**
	 * Sets the value of the '{@link gseq.If#getElseBranch <em>Else Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Branch</em>' containment reference.
	 * @see #getElseBranch()
	 * @generated
	 */
	void setElseBranch(Operation value);

	/**
	 * Returns the value of the '<em><b>Then Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Branch</em>' containment reference.
	 * @see #setThenBranch(Operation)
	 * @see gseq.GseqPackage#getIf_ThenBranch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getThenBranch();

	/**
	 * Sets the value of the '{@link gseq.If#getThenBranch <em>Then Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Branch</em>' containment reference.
	 * @see #getThenBranch()
	 * @generated
	 */
	void setThenBranch(Operation value);

	/**
	 * Returns the value of the '<em><b>Condition If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition If</em>' containment reference.
	 * @see #setConditionIf(BooleanExpression)
	 * @see gseq.GseqPackage#getIf_ConditionIf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getConditionIf();

	/**
	 * Sets the value of the '{@link gseq.If#getConditionIf <em>Condition If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition If</em>' containment reference.
	 * @see #getConditionIf()
	 * @generated
	 */
	void setConditionIf(BooleanExpression value);

} // If
