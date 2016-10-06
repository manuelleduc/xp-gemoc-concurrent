/**
 */
package gx10;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gx10.MethodCallParameter#getName <em>Name</em>}</li>
 *   <li>{@link gx10.MethodCallParameter#getMethodCallParameterExpr <em>Method Call Parameter Expr</em>}</li>
 *   <li>{@link gx10.MethodCallParameter#getInMethodCall <em>In Method Call</em>}</li>
 * </ul>
 *
 * @see gx10.Gx10Package#getMethodCallParameter()
 * @model
 * @generated
 */
public interface MethodCallParameter extends EObject {
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
	 * @see gx10.Gx10Package#getMethodCallParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gx10.MethodCallParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Method Call Parameter Expr</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link gx10.IntExpression#getInMethodCallParameter <em>In Method Call Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Call Parameter Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Call Parameter Expr</em>' containment reference.
	 * @see #setMethodCallParameterExpr(IntExpression)
	 * @see gx10.Gx10Package#getMethodCallParameter_MethodCallParameterExpr()
	 * @see gx10.IntExpression#getInMethodCallParameter
	 * @model opposite="inMethodCallParameter" containment="true" required="true"
	 * @generated
	 */
	IntExpression getMethodCallParameterExpr();

	/**
	 * Sets the value of the '{@link gx10.MethodCallParameter#getMethodCallParameterExpr <em>Method Call Parameter Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Call Parameter Expr</em>' containment reference.
	 * @see #getMethodCallParameterExpr()
	 * @generated
	 */
	void setMethodCallParameterExpr(IntExpression value);

	/**
	 * Returns the value of the '<em><b>In Method Call</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gx10.MethodCall#getMethodCallParameters <em>Method Call Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Method Call</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Method Call</em>' container reference.
	 * @see #setInMethodCall(MethodCall)
	 * @see gx10.Gx10Package#getMethodCallParameter_InMethodCall()
	 * @see gx10.MethodCall#getMethodCallParameters
	 * @model opposite="methodCallParameters" required="true" transient="false"
	 * @generated
	 */
	MethodCall getInMethodCall();

	/**
	 * Sets the value of the '{@link gx10.MethodCallParameter#getInMethodCall <em>In Method Call</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Method Call</em>' container reference.
	 * @see #getInMethodCall()
	 * @generated
	 */
	void setInMethodCall(MethodCall value);

} // MethodCallParameter
