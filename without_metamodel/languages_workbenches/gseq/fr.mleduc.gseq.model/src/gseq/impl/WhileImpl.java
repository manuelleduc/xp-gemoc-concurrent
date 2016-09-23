/**
 */
package gseq.impl;

import gseq.BooleanExpression;
import gseq.GseqPackage;
import gseq.IntegerExpression;
import gseq.While;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gseq.impl.WhileImpl#getWhileCondition <em>While Condition</em>}</li>
 *   <li>{@link gseq.impl.WhileImpl#getWhileExpression <em>While Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhileImpl extends OperationImpl implements While {
	/**
	 * The cached value of the '{@link #getWhileCondition() <em>While Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhileCondition()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression whileCondition;

	/**
	 * The cached value of the '{@link #getWhileExpression() <em>While Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhileExpression()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression whileExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GseqPackage.Literals.WHILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getWhileCondition() {
		if (whileCondition != null && whileCondition.eIsProxy()) {
			InternalEObject oldWhileCondition = (InternalEObject)whileCondition;
			whileCondition = (BooleanExpression)eResolveProxy(oldWhileCondition);
			if (whileCondition != oldWhileCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.WHILE__WHILE_CONDITION, oldWhileCondition, whileCondition));
			}
		}
		return whileCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression basicGetWhileCondition() {
		return whileCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhileCondition(BooleanExpression newWhileCondition) {
		BooleanExpression oldWhileCondition = whileCondition;
		whileCondition = newWhileCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.WHILE__WHILE_CONDITION, oldWhileCondition, whileCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getWhileExpression() {
		if (whileExpression != null && whileExpression.eIsProxy()) {
			InternalEObject oldWhileExpression = (InternalEObject)whileExpression;
			whileExpression = (IntegerExpression)eResolveProxy(oldWhileExpression);
			if (whileExpression != oldWhileExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.WHILE__WHILE_EXPRESSION, oldWhileExpression, whileExpression));
			}
		}
		return whileExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression basicGetWhileExpression() {
		return whileExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhileExpression(IntegerExpression newWhileExpression) {
		IntegerExpression oldWhileExpression = whileExpression;
		whileExpression = newWhileExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.WHILE__WHILE_EXPRESSION, oldWhileExpression, whileExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GseqPackage.WHILE__WHILE_CONDITION:
				if (resolve) return getWhileCondition();
				return basicGetWhileCondition();
			case GseqPackage.WHILE__WHILE_EXPRESSION:
				if (resolve) return getWhileExpression();
				return basicGetWhileExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GseqPackage.WHILE__WHILE_CONDITION:
				setWhileCondition((BooleanExpression)newValue);
				return;
			case GseqPackage.WHILE__WHILE_EXPRESSION:
				setWhileExpression((IntegerExpression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GseqPackage.WHILE__WHILE_CONDITION:
				setWhileCondition((BooleanExpression)null);
				return;
			case GseqPackage.WHILE__WHILE_EXPRESSION:
				setWhileExpression((IntegerExpression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GseqPackage.WHILE__WHILE_CONDITION:
				return whileCondition != null;
			case GseqPackage.WHILE__WHILE_EXPRESSION:
				return whileExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //WhileImpl
