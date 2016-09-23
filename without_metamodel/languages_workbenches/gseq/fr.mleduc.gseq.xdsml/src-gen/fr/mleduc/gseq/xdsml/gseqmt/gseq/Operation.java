/**
 */
package fr.mleduc.gseq.xdsml.gseqmt.gseq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Operation#getExecutedBy <em>Executed By</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Executed By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed By</em>' container reference.
	 * @see #setExecutedBy(Method)
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getOperation_ExecutedBy()
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getOperations
	 * @model opposite="operations" required="true" transient="false"
	 * @generated
	 */
	Method getExecutedBy();

	/**
	 * Sets the value of the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Operation#getExecutedBy <em>Executed By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed By</em>' container reference.
	 * @see #getExecutedBy()
	 * @generated
	 */
	void setExecutedBy(Method value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // Operation
