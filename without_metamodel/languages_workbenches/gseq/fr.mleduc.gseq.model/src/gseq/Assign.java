/**
 */
package gseq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gseq.Assign#getVarName <em>Var Name</em>}</li>
 *   <li>{@link gseq.Assign#getAssignedExpression <em>Assigned Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see gseq.GseqPackage#getAssign()
 * @model
 * @generated
 */
public interface Assign extends Operation {
	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see gseq.GseqPackage#getAssign_VarName()
	 * @model required="true"
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link gseq.Assign#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Assigned Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Expression</em>' reference.
	 * @see #setAssignedExpression(IntegerExpression)
	 * @see gseq.GseqPackage#getAssign_AssignedExpression()
	 * @model required="true"
	 * @generated
	 */
	IntegerExpression getAssignedExpression();

	/**
	 * Sets the value of the '{@link gseq.Assign#getAssignedExpression <em>Assigned Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Expression</em>' reference.
	 * @see #getAssignedExpression()
	 * @generated
	 */
	void setAssignedExpression(IntegerExpression value);

} // Assign
