/**
 */
package gseq.impl;

import gseq.Equality;
import gseq.GseqPackage;
import gseq.IntegerExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gseq.impl.EqualityImpl#getLeftEquality <em>Left Equality</em>}</li>
 *   <li>{@link gseq.impl.EqualityImpl#getRightEquality <em>Right Equality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EqualityImpl extends BooleanExpressionImpl implements Equality {
	/**
	 * The cached value of the '{@link #getLeftEquality() <em>Left Equality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftEquality()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression leftEquality;

	/**
	 * The cached value of the '{@link #getRightEquality() <em>Right Equality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightEquality()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression rightEquality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GseqPackage.Literals.EQUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getLeftEquality() {
		if (leftEquality != null && leftEquality.eIsProxy()) {
			InternalEObject oldLeftEquality = (InternalEObject)leftEquality;
			leftEquality = (IntegerExpression)eResolveProxy(oldLeftEquality);
			if (leftEquality != oldLeftEquality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.EQUALITY__LEFT_EQUALITY, oldLeftEquality, leftEquality));
			}
		}
		return leftEquality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression basicGetLeftEquality() {
		return leftEquality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftEquality(IntegerExpression newLeftEquality) {
		IntegerExpression oldLeftEquality = leftEquality;
		leftEquality = newLeftEquality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.EQUALITY__LEFT_EQUALITY, oldLeftEquality, leftEquality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getRightEquality() {
		if (rightEquality != null && rightEquality.eIsProxy()) {
			InternalEObject oldRightEquality = (InternalEObject)rightEquality;
			rightEquality = (IntegerExpression)eResolveProxy(oldRightEquality);
			if (rightEquality != oldRightEquality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.EQUALITY__RIGHT_EQUALITY, oldRightEquality, rightEquality));
			}
		}
		return rightEquality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression basicGetRightEquality() {
		return rightEquality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightEquality(IntegerExpression newRightEquality) {
		IntegerExpression oldRightEquality = rightEquality;
		rightEquality = newRightEquality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.EQUALITY__RIGHT_EQUALITY, oldRightEquality, rightEquality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GseqPackage.EQUALITY__LEFT_EQUALITY:
				if (resolve) return getLeftEquality();
				return basicGetLeftEquality();
			case GseqPackage.EQUALITY__RIGHT_EQUALITY:
				if (resolve) return getRightEquality();
				return basicGetRightEquality();
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
			case GseqPackage.EQUALITY__LEFT_EQUALITY:
				setLeftEquality((IntegerExpression)newValue);
				return;
			case GseqPackage.EQUALITY__RIGHT_EQUALITY:
				setRightEquality((IntegerExpression)newValue);
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
			case GseqPackage.EQUALITY__LEFT_EQUALITY:
				setLeftEquality((IntegerExpression)null);
				return;
			case GseqPackage.EQUALITY__RIGHT_EQUALITY:
				setRightEquality((IntegerExpression)null);
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
			case GseqPackage.EQUALITY__LEFT_EQUALITY:
				return leftEquality != null;
			case GseqPackage.EQUALITY__RIGHT_EQUALITY:
				return rightEquality != null;
		}
		return super.eIsSet(featureID);
	}

} //EqualityImpl
