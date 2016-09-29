/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Statement#getInBlock <em>In Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends EObject {

	/**
	 * Returns the value of the '<em><b>In Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Block#getBlockStatements <em>Block Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Block</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Block</em>' container reference.
	 * @see #setInBlock(Block)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getStatement_InBlock()
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Block#getBlockStatements
	 * @model opposite="blockStatements" transient="false"
	 * @generated
	 */
	Block getInBlock();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Statement#getInBlock <em>In Block</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Block</em>' container reference.
	 * @see #getInBlock()
	 * @generated
	 */
	void setInBlock(Block value);
} // Statement
