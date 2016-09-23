/**
 */
package fr.mleduc.gseq.xdsml.gseqmt.gseq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Print#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getPrint()
 * @model
 * @generated
 */
public interface Print extends Operation {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage#getPrint_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Print#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // Print
