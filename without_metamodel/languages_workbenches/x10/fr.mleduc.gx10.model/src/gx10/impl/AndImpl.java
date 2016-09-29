/**
 */
package gx10.impl;

import gx10.And;
import gx10.BoolExpression;
import gx10.Gx10Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gx10.impl.AndImpl#getLeftAndExpression <em>Left And Expression</em>}</li>
 *   <li>{@link gx10.impl.AndImpl#getRightAndExpression <em>Right And Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndImpl extends BoolExpressionImpl implements And {
	/**
	 * The cached value of the '{@link #getLeftAndExpression() <em>Left And Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftAndExpression()
	 * @generated
	 * @ordered
	 */
	protected BoolExpression leftAndExpression;

	/**
	 * The cached value of the '{@link #getRightAndExpression() <em>Right And Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightAndExpression()
	 * @generated
	 * @ordered
	 */
	protected BoolExpression rightAndExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.AND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolExpression getLeftAndExpression() {
		return leftAndExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftAndExpression(BoolExpression newLeftAndExpression, NotificationChain msgs) {
		BoolExpression oldLeftAndExpression = leftAndExpression;
		leftAndExpression = newLeftAndExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.AND__LEFT_AND_EXPRESSION, oldLeftAndExpression, newLeftAndExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftAndExpression(BoolExpression newLeftAndExpression) {
		if (newLeftAndExpression != leftAndExpression) {
			NotificationChain msgs = null;
			if (leftAndExpression != null)
				msgs = ((InternalEObject)leftAndExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.AND__LEFT_AND_EXPRESSION, null, msgs);
			if (newLeftAndExpression != null)
				msgs = ((InternalEObject)newLeftAndExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.AND__LEFT_AND_EXPRESSION, null, msgs);
			msgs = basicSetLeftAndExpression(newLeftAndExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.AND__LEFT_AND_EXPRESSION, newLeftAndExpression, newLeftAndExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolExpression getRightAndExpression() {
		return rightAndExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightAndExpression(BoolExpression newRightAndExpression, NotificationChain msgs) {
		BoolExpression oldRightAndExpression = rightAndExpression;
		rightAndExpression = newRightAndExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.AND__RIGHT_AND_EXPRESSION, oldRightAndExpression, newRightAndExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightAndExpression(BoolExpression newRightAndExpression) {
		if (newRightAndExpression != rightAndExpression) {
			NotificationChain msgs = null;
			if (rightAndExpression != null)
				msgs = ((InternalEObject)rightAndExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.AND__RIGHT_AND_EXPRESSION, null, msgs);
			if (newRightAndExpression != null)
				msgs = ((InternalEObject)newRightAndExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.AND__RIGHT_AND_EXPRESSION, null, msgs);
			msgs = basicSetRightAndExpression(newRightAndExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.AND__RIGHT_AND_EXPRESSION, newRightAndExpression, newRightAndExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gx10Package.AND__LEFT_AND_EXPRESSION:
				return basicSetLeftAndExpression(null, msgs);
			case Gx10Package.AND__RIGHT_AND_EXPRESSION:
				return basicSetRightAndExpression(null, msgs);
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
			case Gx10Package.AND__LEFT_AND_EXPRESSION:
				return getLeftAndExpression();
			case Gx10Package.AND__RIGHT_AND_EXPRESSION:
				return getRightAndExpression();
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
			case Gx10Package.AND__LEFT_AND_EXPRESSION:
				setLeftAndExpression((BoolExpression)newValue);
				return;
			case Gx10Package.AND__RIGHT_AND_EXPRESSION:
				setRightAndExpression((BoolExpression)newValue);
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
			case Gx10Package.AND__LEFT_AND_EXPRESSION:
				setLeftAndExpression((BoolExpression)null);
				return;
			case Gx10Package.AND__RIGHT_AND_EXPRESSION:
				setRightAndExpression((BoolExpression)null);
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
			case Gx10Package.AND__LEFT_AND_EXPRESSION:
				return leftAndExpression != null;
			case Gx10Package.AND__RIGHT_AND_EXPRESSION:
				return rightAndExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //AndImpl
