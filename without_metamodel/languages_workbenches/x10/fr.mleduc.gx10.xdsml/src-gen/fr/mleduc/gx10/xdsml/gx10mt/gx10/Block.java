/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;

import gx10.aspects.Context;

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
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Block#getBlockStatements <em>Block Statements</em>}</li>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Block#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getBlock()
 * @model
 * @generated
 */
public interface Block extends Statement {
	/**
	 * Returns the value of the '<em><b>Block Statements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Statement}.
	 * It is bidirectional and its opposite is '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Statement#getInBlock <em>In Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Statements</em>' containment reference list.
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getBlock_BlockStatements()
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Statement#getInBlock
	 * @model opposite="inBlock" containment="true"
	 * @generated
	 */
	EList<Statement> getBlockStatements();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(Context)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getBlock_Context()
	 * @model dataType="fr.mleduc.gx10.xdsml.gx10mt.gx10.Context"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Block#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initBlock();

} // Block
