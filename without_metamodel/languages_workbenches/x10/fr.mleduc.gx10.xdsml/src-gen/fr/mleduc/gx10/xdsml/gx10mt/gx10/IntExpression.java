/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression#getInMethodCallParameter <em>In Method Call Parameter</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getIntExpression()
 * @model abstract="true"
 * @generated
 */
public interface IntExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>In Method Call Parameter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCallParameter#getMethodCallParameterExpr <em>Method Call Parameter Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Method Call Parameter</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Method Call Parameter</em>' container reference.
	 * @see #setInMethodCallParameter(MethodCallParameter)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getIntExpression_InMethodCallParameter()
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCallParameter#getMethodCallParameterExpr
	 * @model opposite="methodCallParameterExpr" transient="false"
	 * @generated
	 */
	MethodCallParameter getInMethodCallParameter();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression#getInMethodCallParameter <em>In Method Call Parameter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Method Call Parameter</em>' container reference.
	 * @see #getInMethodCallParameter()
	 * @generated
	 */
	void setInMethodCallParameter(MethodCallParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getCurrentValue();

} // IntExpression
