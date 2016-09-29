/**
 */
package fr.mleduc.gx10.xdsml.gx10mt.gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Print#getToPrint <em>To Print</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getPrint()
 * @model
 * @generated
 */
public interface Print extends Statement {
	/**
	 * Returns the value of the '<em><b>To Print</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Print</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Print</em>' containment reference.
	 * @see #setToPrint(Expression)
	 * @see fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package#getPrint_ToPrint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getToPrint();

	/**
	 * Sets the value of the '{@link fr.mleduc.gx10.xdsml.gx10mt.gx10.Print#getToPrint <em>To Print</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Print</em>' containment reference.
	 * @see #getToPrint()
	 * @generated
	 */
	void setToPrint(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void print();

} // Print
