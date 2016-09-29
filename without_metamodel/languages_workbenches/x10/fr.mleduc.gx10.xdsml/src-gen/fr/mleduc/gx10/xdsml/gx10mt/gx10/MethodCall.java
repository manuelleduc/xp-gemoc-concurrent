/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCall#getMethodToCall <em>Method To Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Method To Call</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Method#getCalledBy <em>Called By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method To Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method To Call</em>' reference.
	 * @see #setMethodToCall(Method)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getMethodCall_MethodToCall()
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Method#getCalledBy
	 * @model opposite="calledBy" required="true"
	 * @generated
	 */
	Method getMethodToCall();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCall#getMethodToCall <em>Method To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method To Call</em>' reference.
	 * @see #getMethodToCall()
	 * @generated
	 */
	void setMethodToCall(Method value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void call();

} // MethodCall
