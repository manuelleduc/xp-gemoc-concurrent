/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolVar#getName <em>Name</em>}</li>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolVar#getBoolVarExpr <em>Bool Var Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getBoolVar()
 * @model
 * @generated
 */
public interface BoolVar extends BoolExpression {
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
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getBoolVar_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolVar#getName <em>Name</em>}' attribute.
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
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getBoolVar_BoolVarExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolExpression getBoolVarExpr();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolVar#getBoolVarExpr <em>Bool Var Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Var Expr</em>' containment reference.
	 * @see #getBoolVarExpr()
	 * @generated
	 */
	void setBoolVarExpr(BoolExpression value);

} // BoolVar
