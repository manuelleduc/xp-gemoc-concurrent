/**
 */
package gx10.impl;

import gx10.Gx10Package;
import gx10.IntBinaryOperation;
import gx10.IntExpression;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gx10.impl.IntBinaryOperationImpl#getLeftBinaryExpression <em>Left Binary Expression</em>}</li>
 *   <li>{@link gx10.impl.IntBinaryOperationImpl#getRightBinaryExpression <em>Right Binary Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IntBinaryOperationImpl extends IntExpressionImpl implements IntBinaryOperation {
	/**
	 * The cached value of the '{@link #getLeftBinaryExpression() <em>Left Binary Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftBinaryExpression()
	 * @generated
	 * @ordered
	 */
	protected IntExpression leftBinaryExpression;

	/**
	 * The cached value of the '{@link #getRightBinaryExpression() <em>Right Binary Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightBinaryExpression()
	 * @generated
	 * @ordered
	 */
	protected IntExpression rightBinaryExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntBinaryOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.INT_BINARY_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntExpression getLeftBinaryExpression() {
		return leftBinaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftBinaryExpression(IntExpression newLeftBinaryExpression, NotificationChain msgs) {
		IntExpression oldLeftBinaryExpression = leftBinaryExpression;
		leftBinaryExpression = newLeftBinaryExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION, oldLeftBinaryExpression, newLeftBinaryExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftBinaryExpression(IntExpression newLeftBinaryExpression) {
		if (newLeftBinaryExpression != leftBinaryExpression) {
			NotificationChain msgs = null;
			if (leftBinaryExpression != null)
				msgs = ((InternalEObject)leftBinaryExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION, null, msgs);
			if (newLeftBinaryExpression != null)
				msgs = ((InternalEObject)newLeftBinaryExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION, null, msgs);
			msgs = basicSetLeftBinaryExpression(newLeftBinaryExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION, newLeftBinaryExpression, newLeftBinaryExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntExpression getRightBinaryExpression() {
		return rightBinaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightBinaryExpression(IntExpression newRightBinaryExpression, NotificationChain msgs) {
		IntExpression oldRightBinaryExpression = rightBinaryExpression;
		rightBinaryExpression = newRightBinaryExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION, oldRightBinaryExpression, newRightBinaryExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightBinaryExpression(IntExpression newRightBinaryExpression) {
		if (newRightBinaryExpression != rightBinaryExpression) {
			NotificationChain msgs = null;
			if (rightBinaryExpression != null)
				msgs = ((InternalEObject)rightBinaryExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION, null, msgs);
			if (newRightBinaryExpression != null)
				msgs = ((InternalEObject)newRightBinaryExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION, null, msgs);
			msgs = basicSetRightBinaryExpression(newRightBinaryExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION, newRightBinaryExpression, newRightBinaryExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void evaluate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gx10Package.INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION:
				return basicSetLeftBinaryExpression(null, msgs);
			case Gx10Package.INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION:
				return basicSetRightBinaryExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gx10Package.INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION:
				return getLeftBinaryExpression();
			case Gx10Package.INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION:
				return getRightBinaryExpression();
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
			case Gx10Package.INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION:
				setLeftBinaryExpression((IntExpression)newValue);
				return;
			case Gx10Package.INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION:
				setRightBinaryExpression((IntExpression)newValue);
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
			case Gx10Package.INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION:
				setLeftBinaryExpression((IntExpression)null);
				return;
			case Gx10Package.INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION:
				setRightBinaryExpression((IntExpression)null);
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
			case Gx10Package.INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION:
				return leftBinaryExpression != null;
			case Gx10Package.INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION:
				return rightBinaryExpression != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Gx10Package.INT_BINARY_OPERATION___EVALUATE:
				evaluate();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //IntBinaryOperationImpl
