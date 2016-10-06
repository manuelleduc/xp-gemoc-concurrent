/**
 */
package gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gx10.IntVar#getIntVarExpr <em>Int Var Expr</em>}</li>
 *   <li>{@link gx10.IntVar#getIntVarName <em>Int Var Name</em>}</li>
 * </ul>
 *
 * @see gx10.Gx10Package#getIntVar()
 * @model
 * @generated
 */
public interface IntVar extends Statement {
	/**
	 * Returns the value of the '<em><b>Int Var Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Var Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Var Expr</em>' containment reference.
	 * @see #setIntVarExpr(IntExpression)
	 * @see gx10.Gx10Package#getIntVar_IntVarExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntExpression getIntVarExpr();

	/**
	 * Sets the value of the '{@link gx10.IntVar#getIntVarExpr <em>Int Var Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Var Expr</em>' containment reference.
	 * @see #getIntVarExpr()
	 * @generated
	 */
	void setIntVarExpr(IntExpression value);

	/**
	 * Returns the value of the '<em><b>Int Var Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Var Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Var Name</em>' containment reference.
	 * @see #setIntVarName(Referentiable)
	 * @see gx10.Gx10Package#getIntVar_IntVarName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Referentiable getIntVarName();

	/**
	 * Sets the value of the '{@link gx10.IntVar#getIntVarName <em>Int Var Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Var Name</em>' containment reference.
	 * @see #getIntVarName()
	 * @generated
	 */
	void setIntVarName(Referentiable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void evaluate();

} // IntVar
