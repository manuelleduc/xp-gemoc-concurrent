/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.While#getWhileBlock <em>While Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getWhile()
 * @model
 * @generated
 */
public interface While extends ControlStructure {
	/**
	 * Returns the value of the '<em><b>While Block</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Block</em>' containment reference list.
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getWhile_WhileBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getWhileBlock();

} // While
