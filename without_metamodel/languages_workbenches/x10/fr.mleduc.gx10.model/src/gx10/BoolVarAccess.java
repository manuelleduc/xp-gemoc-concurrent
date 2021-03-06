/**
 */
package gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Var Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gx10.BoolVarAccess#getBoolVarRef <em>Bool Var Ref</em>}</li>
 * </ul>
 *
 * @see gx10.Gx10Package#getBoolVarAccess()
 * @model
 * @generated
 */
public interface BoolVarAccess extends BoolExpression {
	/**
	 * Returns the value of the '<em><b>Bool Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var Ref</em>' reference.
	 * @see #setBoolVarRef(Referentiable)
	 * @see gx10.Gx10Package#getBoolVarAccess_BoolVarRef()
	 * @model required="true"
	 * @generated
	 */
	Referentiable getBoolVarRef();

	/**
	 * Sets the value of the '{@link gx10.BoolVarAccess#getBoolVarRef <em>Bool Var Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Var Ref</em>' reference.
	 * @see #getBoolVarRef()
	 * @generated
	 */
	void setBoolVarRef(Referentiable value);

} // BoolVarAccess
