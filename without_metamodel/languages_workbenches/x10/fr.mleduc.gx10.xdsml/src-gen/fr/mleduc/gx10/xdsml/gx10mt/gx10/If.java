/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.If#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.If#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getIf()
 * @model
 * @generated
 */
public interface If extends ControlStructure {
	/**
	 * Returns the value of the '<em><b>Then Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Block</em>' containment reference.
	 * @see #setThenBlock(Block)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getIf_ThenBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getThenBlock();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.If#getThenBlock <em>Then Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Block</em>' containment reference.
	 * @see #getThenBlock()
	 * @generated
	 */
	void setThenBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Block</em>' containment reference.
	 * @see #setElseBlock(Block)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getIf_ElseBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getElseBlock();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.If#getElseBlock <em>Else Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Block</em>' containment reference.
	 * @see #getElseBlock()
	 * @generated
	 */
	void setElseBlock(Block value);

} // If
