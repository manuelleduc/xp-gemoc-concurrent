/**
 */
package gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gx10.BoolVar#getName <em>Name</em>}</li>
 *   <li>{@link gx10.BoolVar#getBoolVarExpr <em>Bool Var Expr</em>}</li>
 * </ul>
 *
 * @see gx10.Gx10Package#getBoolVar()
 * @model
 * @generated
 */
public interface BoolVar extends Expression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gx10.Gx10Package#getBoolVar_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gx10.BoolVar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bool Var Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var Expr</em>' containment reference.
	 * @see #setBoolVarExpr(BoolExpression)
	 * @see gx10.Gx10Package#getBoolVar_BoolVarExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolExpression getBoolVarExpr();

	/**
	 * Sets the value of the '{@link gx10.BoolVar#getBoolVarExpr <em>Bool Var Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Var Expr</em>' containment reference.
	 * @see #getBoolVarExpr()
	 * @generated
	 */
	void setBoolVarExpr(BoolExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void evaluate();

} // BoolVar
