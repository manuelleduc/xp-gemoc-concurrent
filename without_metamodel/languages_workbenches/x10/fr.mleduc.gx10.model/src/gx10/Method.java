/**
 */
package gx10;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gx10.Method#getInProgram <em>In Program</em>}</li>
 *   <li>{@link gx10.Method#getMethodBlock <em>Method Block</em>}</li>
 *   <li>{@link gx10.Method#getName <em>Name</em>}</li>
 *   <li>{@link gx10.Method#getCalledBy <em>Called By</em>}</li>
 * </ul>
 * </p>
 *
 * @see gx10.Gx10Package#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>In Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gx10.Program#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Program</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Program</em>' container reference.
	 * @see #setInProgram(Program)
	 * @see gx10.Gx10Package#getMethod_InProgram()
	 * @see gx10.Program#getMethods
	 * @model opposite="methods" required="true" transient="false"
	 * @generated
	 */
	Program getInProgram();

	/**
	 * Sets the value of the '{@link gx10.Method#getInProgram <em>In Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Program</em>' container reference.
	 * @see #getInProgram()
	 * @generated
	 */
	void setInProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Method Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Block</em>' containment reference.
	 * @see #setMethodBlock(Block)
	 * @see gx10.Gx10Package#getMethod_MethodBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getMethodBlock();

	/**
	 * Sets the value of the '{@link gx10.Method#getMethodBlock <em>Method Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Block</em>' containment reference.
	 * @see #getMethodBlock()
	 * @generated
	 */
	void setMethodBlock(Block value);

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
	 * @see gx10.Gx10Package#getMethod_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gx10.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Called By</b></em>' reference list.
	 * The list contents are of type {@link gx10.MethodCall}.
	 * It is bidirectional and its opposite is '{@link gx10.MethodCall#getMethodToCall <em>Method To Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called By</em>' reference list.
	 * @see gx10.Gx10Package#getMethod_CalledBy()
	 * @see gx10.MethodCall#getMethodToCall
	 * @model opposite="methodToCall"
	 * @generated
	 */
	EList<MethodCall> getCalledBy();

} // Method
