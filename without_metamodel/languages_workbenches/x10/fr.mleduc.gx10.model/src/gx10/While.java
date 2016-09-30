/**
 */
package gx10;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gx10.While#getWhileBlock <em>While Block</em>}</li>
 * </ul>
 *
 * @see gx10.Gx10Package#getWhile()
 * @model
 * @generated
 */
public interface While extends ControlStructure {
	/**
	 * Returns the value of the '<em><b>While Block</b></em>' containment reference list.
	 * The list contents are of type {@link gx10.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Block</em>' containment reference list.
	 * @see gx10.Gx10Package#getWhile_WhileBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getWhileBlock();

} // While
