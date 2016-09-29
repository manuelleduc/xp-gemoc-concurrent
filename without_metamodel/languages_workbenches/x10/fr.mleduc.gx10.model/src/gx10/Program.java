/**
 */
package gx10;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gx10.Program#getMethods <em>Methods</em>}</li>
 *   <li>{@link gx10.Program#getStartMethod <em>Start Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see gx10.Gx10Package#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link gx10.Method}.
	 * It is bidirectional and its opposite is '{@link gx10.Method#getInProgram <em>In Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see gx10.Gx10Package#getProgram_Methods()
	 * @see gx10.Method#getInProgram
	 * @model opposite="inProgram" containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Start Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Method</em>' reference.
	 * @see #setStartMethod(Method)
	 * @see gx10.Gx10Package#getProgram_StartMethod()
	 * @model required="true"
	 * @generated
	 */
	Method getStartMethod();

	/**
	 * Sets the value of the '{@link gx10.Program#getStartMethod <em>Start Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Method</em>' reference.
	 * @see #getStartMethod()
	 * @generated
	 */
	void setStartMethod(Method value);

} // Program
