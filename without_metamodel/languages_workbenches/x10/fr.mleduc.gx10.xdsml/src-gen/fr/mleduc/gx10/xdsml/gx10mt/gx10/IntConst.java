/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Const</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.IntConst#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getIntConst()
 * @model
 * @generated
 */
public interface IntConst extends IntExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getIntConst_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.IntConst#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getCurrentValue();

} // IntConst
