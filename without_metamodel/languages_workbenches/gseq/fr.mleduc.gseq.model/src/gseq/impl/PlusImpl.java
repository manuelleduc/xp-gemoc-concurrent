/**
 */
package gseq.impl;

import gseq.GseqPackage;
import gseq.IntegerExpression;
import gseq.Plus;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link gseq.impl.PlusImpl#getRightPlus <em>Right Plus</em>}</li>
 *   <li>{@link gseq.impl.PlusImpl#getLeftPlus <em>Left Plus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlusImpl extends IntegerExpressionImpl implements Plus {
	/**
	 * The cached value of the '{@link #getRightPlus() <em>Right Plus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightPlus()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression rightPlus;

	/**
	 * The cached value of the '{@link #getLeftPlus() <em>Left Plus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftPlus()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression leftPlus;

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
	public IntegerExpression getRightPlus() {
		if (rightPlus != null && rightPlus.eIsProxy()) {
			InternalEObject oldRightPlus = (InternalEObject)rightPlus;
			rightPlus = (IntegerExpression)eResolveProxy(oldRightPlus);
			if (rightPlus != oldRightPlus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.PLUS__RIGHT_PLUS, oldRightPlus, rightPlus));
			}
		}
		return rightPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression basicGetRightPlus() {
		return rightPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightPlus(IntegerExpression newRightPlus) {
		IntegerExpression oldRightPlus = rightPlus;
		rightPlus = newRightPlus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.PLUS__RIGHT_PLUS, oldRightPlus, rightPlus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getLeftPlus() {
		if (leftPlus != null && leftPlus.eIsProxy()) {
			InternalEObject oldLeftPlus = (InternalEObject)leftPlus;
			leftPlus = (IntegerExpression)eResolveProxy(oldLeftPlus);
			if (leftPlus != oldLeftPlus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.PLUS__LEFT_PLUS, oldLeftPlus, leftPlus));
			}
		}
		return leftPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression basicGetLeftPlus() {
		return leftPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftPlus(IntegerExpression newLeftPlus) {
		IntegerExpression oldLeftPlus = leftPlus;
		leftPlus = newLeftPlus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.PLUS__LEFT_PLUS, oldLeftPlus, leftPlus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GseqPackage.PLUS__RIGHT_PLUS:
				if (resolve) return getRightPlus();
				return basicGetRightPlus();
			case GseqPackage.PLUS__LEFT_PLUS:
				if (resolve) return getLeftPlus();
				return basicGetLeftPlus();
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
			case GseqPackage.PLUS__RIGHT_PLUS:
				setRightPlus((IntegerExpression)newValue);
				return;
			case GseqPackage.PLUS__LEFT_PLUS:
				setLeftPlus((IntegerExpression)newValue);
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
			case GseqPackage.PLUS__RIGHT_PLUS:
				setRightPlus((IntegerExpression)null);
				return;
			case GseqPackage.PLUS__LEFT_PLUS:
				setLeftPlus((IntegerExpression)null);
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
			case GseqPackage.PLUS__RIGHT_PLUS:
				return rightPlus != null;
			case GseqPackage.PLUS__LEFT_PLUS:
				return leftPlus != null;
		}
		return super.eIsSet(featureID);
	}

} //PlusImpl
