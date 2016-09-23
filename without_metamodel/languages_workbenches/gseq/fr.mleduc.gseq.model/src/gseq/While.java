/**
 */
package gseq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gseq.While#getWhileCondition <em>While Condition</em>}</li>
 *   <li>{@link gseq.While#getWhileExpression <em>While Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see gseq.GseqPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends Operation {
	/**
	 * Returns the value of the '<em><b>While Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Condition</em>' reference.
	 * @see #setWhileCondition(BooleanExpression)
	 * @see gseq.GseqPackage#getWhile_WhileCondition()
	 * @model
	 * @generated
	 */
	BooleanExpression getWhileCondition();

	/**
	 * Sets the value of the '{@link gseq.While#getWhileCondition <em>While Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Condition</em>' reference.
	 * @see #getWhileCondition()
	 * @generated
	 */
	void setWhileCondition(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>While Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Expression</em>' reference.
	 * @see #setWhileExpression(IntegerExpression)
	 * @see gseq.GseqPackage#getWhile_WhileExpression()
	 * @model required="true"
	 * @generated
	 */
	IntegerExpression getWhileExpression();

	/**
	 * Sets the value of the '{@link gseq.While#getWhileExpression <em>While Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Expression</em>' reference.
	 * @see #getWhileExpression()
	 * @generated
	 */
	void setWhileExpression(IntegerExpression value);

} // While
