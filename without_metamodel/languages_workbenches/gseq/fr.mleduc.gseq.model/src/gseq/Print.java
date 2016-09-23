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
	 * Returns the value of the '<em><b>To Print</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Print</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Print</em>' reference.
	 * @see #setToPrint(Printable)
	 * @see gseq.GseqPackage#getPrint_ToPrint()
	 * @model required="true"
	 * @generated
	 */
	Printable getToPrint();

	/**
	 * Sets the value of the '{@link gseq.Print#getToPrint <em>To Print</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Print</em>' reference.
	 * @see #getToPrint()
	 * @generated
	 */
	void setToPrint(Printable value);

} // Print
