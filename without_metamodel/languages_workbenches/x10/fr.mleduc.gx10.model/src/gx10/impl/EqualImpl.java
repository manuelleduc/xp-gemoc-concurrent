/**
 */
package gx10.impl;

import gx10.Equal;
import gx10.Gx10Package;
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
 * An implementation of the model object '<em><b>Equal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gx10.impl.EqualImpl#getLeftEqual <em>Left Equal</em>}</li>
 *   <li>{@link gx10.impl.EqualImpl#getRightEqual <em>Right Equal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EqualImpl extends BoolExpressionImpl implements Equal {
	/**
	 * The cached value of the '{@link #getLeftEqual() <em>Left Equal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftEqual()
	 * @generated
	 * @ordered
	 */
	protected IntExpression leftEqual;

	/**
	 * The cached value of the '{@link #getRightEqual() <em>Right Equal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightEqual()
	 * @generated
	 * @ordered
	 */
	protected IntExpression rightEqual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.EQUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntExpression getLeftEqual() {
		return leftEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftEqual(IntExpression newLeftEqual, NotificationChain msgs) {
		IntExpression oldLeftEqual = leftEqual;
		leftEqual = newLeftEqual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.EQUAL__LEFT_EQUAL, oldLeftEqual, newLeftEqual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftEqual(IntExpression newLeftEqual) {
		if (newLeftEqual != leftEqual) {
			NotificationChain msgs = null;
			if (leftEqual != null)
				msgs = ((InternalEObject)leftEqual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.EQUAL__LEFT_EQUAL, null, msgs);
			if (newLeftEqual != null)
				msgs = ((InternalEObject)newLeftEqual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.EQUAL__LEFT_EQUAL, null, msgs);
			msgs = basicSetLeftEqual(newLeftEqual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.EQUAL__LEFT_EQUAL, newLeftEqual, newLeftEqual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntExpression getRightEqual() {
		return rightEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightEqual(IntExpression newRightEqual, NotificationChain msgs) {
		IntExpression oldRightEqual = rightEqual;
		rightEqual = newRightEqual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.EQUAL__RIGHT_EQUAL, oldRightEqual, newRightEqual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightEqual(IntExpression newRightEqual) {
		if (newRightEqual != rightEqual) {
			NotificationChain msgs = null;
			if (rightEqual != null)
				msgs = ((InternalEObject)rightEqual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.EQUAL__RIGHT_EQUAL, null, msgs);
			if (newRightEqual != null)
				msgs = ((InternalEObject)newRightEqual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.EQUAL__RIGHT_EQUAL, null, msgs);
			msgs = basicSetRightEqual(newRightEqual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.EQUAL__RIGHT_EQUAL, newRightEqual, newRightEqual));
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
			case Gx10Package.EQUAL__LEFT_EQUAL:
				return basicSetLeftEqual(null, msgs);
			case Gx10Package.EQUAL__RIGHT_EQUAL:
				return basicSetRightEqual(null, msgs);
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
			case Gx10Package.EQUAL__LEFT_EQUAL:
				return getLeftEqual();
			case Gx10Package.EQUAL__RIGHT_EQUAL:
				return getRightEqual();
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
			case Gx10Package.EQUAL__LEFT_EQUAL:
				setLeftEqual((IntExpression)newValue);
				return;
			case Gx10Package.EQUAL__RIGHT_EQUAL:
				setRightEqual((IntExpression)newValue);
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
			case Gx10Package.EQUAL__LEFT_EQUAL:
				setLeftEqual((IntExpression)null);
				return;
			case Gx10Package.EQUAL__RIGHT_EQUAL:
				setRightEqual((IntExpression)null);
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
			case Gx10Package.EQUAL__LEFT_EQUAL:
				return leftEqual != null;
			case Gx10Package.EQUAL__RIGHT_EQUAL:
				return rightEqual != null;
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
			case Gx10Package.EQUAL___EVALUATE:
				evaluate();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //EqualImpl
