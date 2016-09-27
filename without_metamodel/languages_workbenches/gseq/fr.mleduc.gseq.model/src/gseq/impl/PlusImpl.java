/**
 */
package gseq.impl;

import gseq.GseqPackage;
import gseq.IntegerExpression;
import gseq.Plus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gseq.impl.PlusImpl#getLeftPlus <em>Left Plus</em>}</li>
 *   <li>{@link gseq.impl.PlusImpl#getRightPlus <em>Right Plus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlusImpl extends IntegerExpressionImpl implements Plus {
	/**
	 * The cached value of the '{@link #getLeftPlus() <em>Left Plus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftPlus()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression leftPlus;

	/**
	 * The cached value of the '{@link #getRightPlus() <em>Right Plus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightPlus()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression rightPlus;

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
		return GseqPackage.Literals.PLUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getLeftPlus() {
		return leftPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftPlus(IntegerExpression newLeftPlus, NotificationChain msgs) {
		IntegerExpression oldLeftPlus = leftPlus;
		leftPlus = newLeftPlus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GseqPackage.PLUS__LEFT_PLUS, oldLeftPlus, newLeftPlus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftPlus(IntegerExpression newLeftPlus) {
		if (newLeftPlus != leftPlus) {
			NotificationChain msgs = null;
			if (leftPlus != null)
				msgs = ((InternalEObject)leftPlus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GseqPackage.PLUS__LEFT_PLUS, null, msgs);
			if (newLeftPlus != null)
				msgs = ((InternalEObject)newLeftPlus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GseqPackage.PLUS__LEFT_PLUS, null, msgs);
			msgs = basicSetLeftPlus(newLeftPlus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.PLUS__LEFT_PLUS, newLeftPlus, newLeftPlus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getRightPlus() {
		return rightPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightPlus(IntegerExpression newRightPlus, NotificationChain msgs) {
		IntegerExpression oldRightPlus = rightPlus;
		rightPlus = newRightPlus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GseqPackage.PLUS__RIGHT_PLUS, oldRightPlus, newRightPlus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightPlus(IntegerExpression newRightPlus) {
		if (newRightPlus != rightPlus) {
			NotificationChain msgs = null;
			if (rightPlus != null)
				msgs = ((InternalEObject)rightPlus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GseqPackage.PLUS__RIGHT_PLUS, null, msgs);
			if (newRightPlus != null)
				msgs = ((InternalEObject)newRightPlus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GseqPackage.PLUS__RIGHT_PLUS, null, msgs);
			msgs = basicSetRightPlus(newRightPlus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.PLUS__RIGHT_PLUS, newRightPlus, newRightPlus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GseqPackage.PLUS__LEFT_PLUS:
				return basicSetLeftPlus(null, msgs);
			case GseqPackage.PLUS__RIGHT_PLUS:
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
			case GseqPackage.PLUS__LEFT_PLUS:
				return getLeftPlus();
			case GseqPackage.PLUS__RIGHT_PLUS:
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
			case GseqPackage.PLUS__LEFT_PLUS:
				setLeftPlus((IntegerExpression)newValue);
				return;
			case GseqPackage.PLUS__RIGHT_PLUS:
				setRightPlus((IntegerExpression)newValue);
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
			case GseqPackage.PLUS__LEFT_PLUS:
				setLeftPlus((IntegerExpression)null);
				return;
			case GseqPackage.PLUS__RIGHT_PLUS:
				setRightPlus((IntegerExpression)null);
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
			case GseqPackage.PLUS__LEFT_PLUS:
				return leftPlus != null;
			case GseqPackage.PLUS__RIGHT_PLUS:
				return rightPlus != null;
		}
		return super.eIsSet(featureID);
	}

} //PlusImpl
