/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.While#getWhileBlock <em>While Block</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getWhile()
 * @model
 * @generated
 */
public interface While extends ControlStructure {
	/**
	 * Returns the value of the '<em><b>While Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Block</em>' containment reference.
	 * @see #setWhileBlock(Block)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getWhile_WhileBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getWhileBlock();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.While#getWhileBlock <em>While Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Block</em>' containment reference.
	 * @see #getWhileBlock()
	 * @generated
	 */
	void setWhileBlock(Block value);

} // While
