/**
 */
package gx10;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gx10.MethodCall#getMethodToCall <em>Method To Call</em>}</li>
 *   <li>{@link gx10.MethodCall#getMethodCallParameters <em>Method Call Parameters</em>}</li>
 * </ul>
 *
 * @see gx10.Gx10Package#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Method To Call</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gx10.Method#getCalledBy <em>Called By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method To Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method To Call</em>' reference.
	 * @see #setMethodToCall(Method)
	 * @see gx10.Gx10Package#getMethodCall_MethodToCall()
	 * @see gx10.Method#getCalledBy
	 * @model opposite="calledBy" required="true"
	 * @generated
	 */
	Method getMethodToCall();

	/**
	 * Sets the value of the '{@link gx10.MethodCall#getMethodToCall <em>Method To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method To Call</em>' reference.
	 * @see #getMethodToCall()
	 * @generated
	 */
	void setMethodToCall(Method value);

	/**
	 * Returns the value of the '<em><b>Method Call Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link gx10.MethodCallParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Call Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Call Parameters</em>' containment reference list.
	 * @see gx10.Gx10Package#getMethodCall_MethodCallParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodCallParameter> getMethodCallParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void call();

} // MethodCall
