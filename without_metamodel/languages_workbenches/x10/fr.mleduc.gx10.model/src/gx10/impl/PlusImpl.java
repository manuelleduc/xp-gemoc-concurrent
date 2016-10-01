/**
 */
package gx10.impl;

import gx10.Gx10Package;
import gx10.IntExpression;
import gx10.Plus;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gx10.impl.PlusImpl#getLeftPlus <em>Left Plus</em>}</li>
 *   <li>{@link gx10.impl.PlusImpl#getRightPlus <em>Right Plus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlusImpl extends IntExpressionImpl implements Plus {
	/**
	 * The cached value of the '{@link #getLeftPlus() <em>Left Plus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftPlus()
	 * @generated
	 * @ordered
	 */
	protected IntExpression leftPlus;

	/**
	 * The cached value of the '{@link #getRightPlus() <em>Right Plus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightPlus()
	 * @generated
	 * @ordered
	 */
	protected IntExpression rightPlus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.PLUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntExpression getLeftPlus() {
		return leftPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftPlus(IntExpression newLeftPlus, NotificationChain msgs) {
		IntExpression oldLeftPlus = leftPlus;
		leftPlus = newLeftPlus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.PLUS__LEFT_PLUS, oldLeftPlus, newLeftPlus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftPlus(IntExpression newLeftPlus) {
		if (newLeftPlus != leftPlus) {
			NotificationChain msgs = null;
			if (leftPlus != null)
				msgs = ((InternalEObject)leftPlus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.PLUS__LEFT_PLUS, null, msgs);
			if (newLeftPlus != null)
				msgs = ((InternalEObject)newLeftPlus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.PLUS__LEFT_PLUS, null, msgs);
			msgs = basicSetLeftPlus(newLeftPlus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.PLUS__LEFT_PLUS, newLeftPlus, newLeftPlus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntExpression getRightPlus() {
		return rightPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightPlus(IntExpression newRightPlus, NotificationChain msgs) {
		IntExpression oldRightPlus = rightPlus;
		rightPlus = newRightPlus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.PLUS__RIGHT_PLUS, oldRightPlus, newRightPlus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightPlus(IntExpression newRightPlus) {
		if (newRightPlus != rightPlus) {
			NotificationChain msgs = null;
			if (rightPlus != null)
				msgs = ((InternalEObject)rightPlus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.PLUS__RIGHT_PLUS, null, msgs);
			if (newRightPlus != null)
				msgs = ((InternalEObject)newRightPlus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.PLUS__RIGHT_PLUS, null, msgs);
			msgs = basicSetRightPlus(newRightPlus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.PLUS__RIGHT_PLUS, newRightPlus, newRightPlus));
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
			case Gx10Package.PLUS__LEFT_PLUS:
				return basicSetLeftPlus(null, msgs);
			case Gx10Package.PLUS__RIGHT_PLUS:
				return basicSetRightPlus(null, msgs);
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
			case Gx10Package.PLUS__LEFT_PLUS:
				return getLeftPlus();
			case Gx10Package.PLUS__RIGHT_PLUS:
				return getRightPlus();
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
			case Gx10Package.PLUS__LEFT_PLUS:
				setLeftPlus((IntExpression)newValue);
				return;
			case Gx10Package.PLUS__RIGHT_PLUS:
				setRightPlus((IntExpression)newValue);
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
			case Gx10Package.PLUS__LEFT_PLUS:
				setLeftPlus((IntExpression)null);
				return;
			case Gx10Package.PLUS__RIGHT_PLUS:
				setRightPlus((IntExpression)null);
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
			case Gx10Package.PLUS__LEFT_PLUS:
				return leftPlus != null;
			case Gx10Package.PLUS__RIGHT_PLUS:
				return rightPlus != null;
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
			case Gx10Package.PLUS___EVALUATE:
				evaluate();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PlusImpl
