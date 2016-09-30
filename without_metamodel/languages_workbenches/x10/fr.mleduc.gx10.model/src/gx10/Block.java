/**
 */
package gx10;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gx10.Block#getBlockStatements <em>Block Statements</em>}</li>
 * </ul>
 *
 * @see gx10.Gx10Package#getBlock()
 * @model
 * @generated
 */
public interface Block extends Statement {
	/**
	 * Returns the value of the '<em><b>Block Statements</b></em>' containment reference list.
	 * The list contents are of type {@link gx10.Statement}.
	 * It is bidirectional and its opposite is '{@link gx10.Statement#getInBlock <em>In Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Statements</em>' containment reference list.
	 * @see gx10.Gx10Package#getBlock_BlockStatements()
	 * @see gx10.Statement#getInBlock
	 * @model opposite="inBlock" containment="true"
	 * @generated
	 */
	EList<Statement> getBlockStatements();

} // Block
