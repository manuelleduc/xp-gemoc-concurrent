/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.IntVar#getName <em>Name</em>}</li>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.IntVar#getIntVarExpr <em>Int Var Expr</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getIntVar()
 * @model
 * @generated
 */
public interface IntVar extends Statement {
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
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getIntVar_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.IntVar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getIntVar_IntVarExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntExpression getIntVarExpr();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.IntVar#getIntVarExpr <em>Int Var Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Var Expr</em>' containment reference.
	 * @see #getIntVarExpr()
	 * @generated
	 */
	void setIntVarExpr(IntExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void evaluate();

} // IntVar
