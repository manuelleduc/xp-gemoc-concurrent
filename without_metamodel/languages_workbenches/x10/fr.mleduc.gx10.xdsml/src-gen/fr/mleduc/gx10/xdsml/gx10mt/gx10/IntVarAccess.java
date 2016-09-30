/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Var Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.IntVarAccess#getIntVarRef <em>Int Var Ref</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getIntVarAccess()
 * @model
 * @generated
 */
public interface IntVarAccess extends IntExpression {
	/**
	 * Returns the value of the '<em><b>Int Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Var Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Var Ref</em>' reference.
	 * @see #setIntVarRef(IntVar)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getIntVarAccess_IntVarRef()
	 * @model required="true"
	 * @generated
	 */
	IntVar getIntVarRef();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.IntVarAccess#getIntVarRef <em>Int Var Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Var Ref</em>' reference.
	 * @see #getIntVarRef()
	 * @generated
	 */
	void setIntVarRef(IntVar value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getCurrentValue();

} // IntVarAccess
