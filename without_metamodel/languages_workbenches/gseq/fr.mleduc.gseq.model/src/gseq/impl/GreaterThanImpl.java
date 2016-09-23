/**
 */
package gseq.impl;

import gseq.GreaterThan;
import gseq.GseqPackage;
import gseq.IntegerExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Greater Than</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gseq.impl.GreaterThanImpl#getLeftGreaterThan <em>Left Greater Than</em>}</li>
 *   <li>{@link gseq.impl.GreaterThanImpl#getRightGreaterThan <em>Right Greater Than</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GreaterThanImpl extends BooleanExpressionImpl implements GreaterThan {
	/**
	 * The cached value of the '{@link #getLeftGreaterThan() <em>Left Greater Than</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftGreaterThan()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression leftGreaterThan;

	/**
	 * The cached value of the '{@link #getRightGreaterThan() <em>Right Greater Than</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightGreaterThan()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression rightGreaterThan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GreaterThanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GseqPackage.Literals.GREATER_THAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getLeftGreaterThan() {
		if (leftGreaterThan != null && leftGreaterThan.eIsProxy()) {
			InternalEObject oldLeftGreaterThan = (InternalEObject)leftGreaterThan;
			leftGreaterThan = (IntegerExpression)eResolveProxy(oldLeftGreaterThan);
			if (leftGreaterThan != oldLeftGreaterThan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.GREATER_THAN__LEFT_GREATER_THAN, oldLeftGreaterThan, leftGreaterThan));
			}
		}
		return leftGreaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression basicGetLeftGreaterThan() {
		return leftGreaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftGreaterThan(IntegerExpression newLeftGreaterThan) {
		IntegerExpression oldLeftGreaterThan = leftGreaterThan;
		leftGreaterThan = newLeftGreaterThan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.GREATER_THAN__LEFT_GREATER_THAN, oldLeftGreaterThan, leftGreaterThan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getRightGreaterThan() {
		if (rightGreaterThan != null && rightGreaterThan.eIsProxy()) {
			InternalEObject oldRightGreaterThan = (InternalEObject)rightGreaterThan;
			rightGreaterThan = (IntegerExpression)eResolveProxy(oldRightGreaterThan);
			if (rightGreaterThan != oldRightGreaterThan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.GREATER_THAN__RIGHT_GREATER_THAN, oldRightGreaterThan, rightGreaterThan));
			}
		}
		return rightGreaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression basicGetRightGreaterThan() {
		return rightGreaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightGreaterThan(IntegerExpression newRightGreaterThan) {
		IntegerExpression oldRightGreaterThan = rightGreaterThan;
		rightGreaterThan = newRightGreaterThan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.GREATER_THAN__RIGHT_GREATER_THAN, oldRightGreaterThan, rightGreaterThan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GseqPackage.GREATER_THAN__LEFT_GREATER_THAN:
				if (resolve) return getLeftGreaterThan();
				return basicGetLeftGreaterThan();
			case GseqPackage.GREATER_THAN__RIGHT_GREATER_THAN:
				if (resolve) return getRightGreaterThan();
				return basicGetRightGreaterThan();
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
			case GseqPackage.GREATER_THAN__LEFT_GREATER_THAN:
				setLeftGreaterThan((IntegerExpression)newValue);
				return;
			case GseqPackage.GREATER_THAN__RIGHT_GREATER_THAN:
				setRightGreaterThan((IntegerExpression)newValue);
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
			case GseqPackage.GREATER_THAN__LEFT_GREATER_THAN:
				setLeftGreaterThan((IntegerExpression)null);
				return;
			case GseqPackage.GREATER_THAN__RIGHT_GREATER_THAN:
				setRightGreaterThan((IntegerExpression)null);
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
			case GseqPackage.GREATER_THAN__LEFT_GREATER_THAN:
				return leftGreaterThan != null;
			case GseqPackage.GREATER_THAN__RIGHT_GREATER_THAN:
				return rightGreaterThan != null;
		}
		return super.eIsSet(featureID);
	}

} //GreaterThanImpl
