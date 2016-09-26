/**
 */
package gseq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gseq.Print#getToPrint <em>To Print</em>}</li>
 * </ul>
 * </p>
 *
 * @see gseq.GseqPackage#getPrint()
 * @model
 * @generated
 */
public interface Print extends Operation {
	/**
	 * Returns the value of the '<em><b>To Print</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Print</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Print</em>' containment reference.
	 * @see #setToPrint(Operation)
	 * @see gseq.GseqPackage#getPrint_ToPrint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getToPrint();

	/**
	 * Sets the value of the '{@link gseq.Print#getToPrint <em>To Print</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Print</em>' containment reference.
	 * @see #getToPrint()
	 * @generated
	 */
	void setToPrint(Operation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void print();

} // Print
