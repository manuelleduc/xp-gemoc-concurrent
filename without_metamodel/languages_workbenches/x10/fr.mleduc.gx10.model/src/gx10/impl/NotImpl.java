/**
 */
package gx10.impl;

import gx10.BoolExpression;
import gx10.Gx10Package;
import gx10.Not;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gx10.impl.NotImpl#getNotExpression <em>Not Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotImpl extends BoolExpressionImpl implements Not {
	/**
	 * The cached value of the '{@link #getNotExpression() <em>Not Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotExpression()
	 * @generated
	 * @ordered
	 */
	protected BoolExpression notExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.NOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolExpression getNotExpression() {
		return notExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotExpression(BoolExpression newNotExpression, NotificationChain msgs) {
		BoolExpression oldNotExpression = notExpression;
		notExpression = newNotExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.NOT__NOT_EXPRESSION, oldNotExpression, newNotExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotExpression(BoolExpression newNotExpression) {
		if (newNotExpression != notExpression) {
			NotificationChain msgs = null;
			if (notExpression != null)
				msgs = ((InternalEObject)notExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.NOT__NOT_EXPRESSION, null, msgs);
			if (newNotExpression != null)
				msgs = ((InternalEObject)newNotExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.NOT__NOT_EXPRESSION, null, msgs);
			msgs = basicSetNotExpression(newNotExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.NOT__NOT_EXPRESSION, newNotExpression, newNotExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gx10Package.NOT__NOT_EXPRESSION:
				return basicSetNotExpression(null, msgs);
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
			case Gx10Package.NOT__NOT_EXPRESSION:
				return getNotExpression();
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
			case Gx10Package.NOT__NOT_EXPRESSION:
				setNotExpression((BoolExpression)newValue);
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
			case Gx10Package.NOT__NOT_EXPRESSION:
				setNotExpression((BoolExpression)null);
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
			case Gx10Package.NOT__NOT_EXPRESSION:
				return notExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //NotImpl
