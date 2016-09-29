/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.ControlStructure#getControlStructureCondition <em>Control Structure Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getControlStructure()
 * @model abstract="true"
 * @generated
 */
public interface ControlStructure extends Statement {
	/**
	 * Returns the value of the '<em><b>Control Structure Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Structure Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Structure Condition</em>' containment reference.
	 * @see #setControlStructureCondition(BoolExpression)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getControlStructure_ControlStructureCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolExpression getControlStructureCondition();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.ControlStructure#getControlStructureCondition <em>Control Structure Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Structure Condition</em>' containment reference.
	 * @see #getControlStructureCondition()
	 * @generated
	 */
	void setControlStructureCondition(BoolExpression value);

} // ControlStructure
