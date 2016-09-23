/**
 */
package fr.mleduc.gseq.xdsml.gseqmt.gseq;

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
 *   <li>{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getOperations <em>Operations</em>}</li>
 *   <li>{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getName <em>Name</em>}</li>
 *   <li>{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getInProgram <em>In Program</em>}</li>
 *   <li>{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getCalledBy <em>Called By</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Operation}.
	 * It is bidirectional and its opposite is '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Operation#getExecutedBy <em>Executed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getMethod_Operations()
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Operation#getExecutedBy
	 * @model opposite="executedBy" containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

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
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Program#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Program</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Program</em>' container reference.
	 * @see #setInProgram(Program)
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getMethod_InProgram()
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Program#getMethods
	 * @model opposite="methods" required="true" transient="false"
	 * @generated
	 */
	Program getInProgram();

	/**
	 * Sets the value of the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getInProgram <em>In Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Program</em>' container reference.
	 * @see #getInProgram()
	 * @generated
	 */
	void setInProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Called By</b></em>' reference list.
	 * The list contents are of type {@link fr.mleduc.gseq.xdsml.gseqmt.gseq.MethodCall}.
	 * It is bidirectional and its opposite is '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.MethodCall#getMethodToCall <em>Method To Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called By</em>' reference list.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getMethod_CalledBy()
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.MethodCall#getMethodToCall
	 * @model opposite="methodToCall"
	 * @generated
	 */
	EList<MethodCall> getCalledBy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void call();

} // Method
