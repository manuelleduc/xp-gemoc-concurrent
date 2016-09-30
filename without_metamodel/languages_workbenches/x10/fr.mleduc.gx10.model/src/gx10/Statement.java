/**
 */
package gx10;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gx10.Statement#getInBlock <em>In Block</em>}</li>
 * </ul>
 *
 * @see gx10.Gx10Package#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>In Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gx10.Block#getBlockStatements <em>Block Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Block</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Block</em>' container reference.
	 * @see #setInBlock(Block)
	 * @see gx10.Gx10Package#getStatement_InBlock()
	 * @see gx10.Block#getBlockStatements
	 * @model opposite="blockStatements" transient="false"
	 * @generated
	 */
	Block getInBlock();

	/**
	 * Sets the value of the '{@link gx10.Statement#getInBlock <em>In Block</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Block</em>' container reference.
	 * @see #getInBlock()
	 * @generated
	 */
	void setInBlock(Block value);

} // Statement
