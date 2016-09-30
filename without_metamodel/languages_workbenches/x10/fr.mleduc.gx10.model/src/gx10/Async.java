/**
 */
package gx10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Async</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gx10.Async#getAsyncBlock <em>Async Block</em>}</li>
 * </ul>
 *
 * @see gx10.Gx10Package#getAsync()
 * @model
 * @generated
 */
public interface Async extends Statement {
	/**
	 * Returns the value of the '<em><b>Async Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Async Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Async Block</em>' containment reference.
	 * @see #setAsyncBlock(Statement)
	 * @see gx10.Gx10Package#getAsync_AsyncBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getAsyncBlock();

	/**
	 * Sets the value of the '{@link gx10.Async#getAsyncBlock <em>Async Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Async Block</em>' containment reference.
	 * @see #getAsyncBlock()
	 * @generated
	 */
	void setAsyncBlock(Statement value);

} // Async
