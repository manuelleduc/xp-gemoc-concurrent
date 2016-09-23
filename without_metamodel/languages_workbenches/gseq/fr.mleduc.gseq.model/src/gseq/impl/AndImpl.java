/**
 */
package gseq.impl;

import gseq.And;
import gseq.BooleanExpression;
import gseq.GseqPackage;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link gseq.impl.AndImpl#getLeftAnd <em>Left And</em>}</li>
 *   <li>{@link gseq.impl.AndImpl#getRightAnd <em>Right And</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndImpl extends BooleanExpressionImpl implements And {
	/**
	 * The cached value of the '{@link #getLeftAnd() <em>Left And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftAnd()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression leftAnd;

	/**
	 * The cached value of the '{@link #getRightAnd() <em>Right And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightAnd()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression rightAnd;

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
		return GseqPackage.Literals.AND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getLeftAnd() {
		if (leftAnd != null && leftAnd.eIsProxy()) {
			InternalEObject oldLeftAnd = (InternalEObject)leftAnd;
			leftAnd = (BooleanExpression)eResolveProxy(oldLeftAnd);
			if (leftAnd != oldLeftAnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.AND__LEFT_AND, oldLeftAnd, leftAnd));
			}
		}
		return leftAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression basicGetLeftAnd() {
		return leftAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftAnd(BooleanExpression newLeftAnd) {
		BooleanExpression oldLeftAnd = leftAnd;
		leftAnd = newLeftAnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.AND__LEFT_AND, oldLeftAnd, leftAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getRightAnd() {
		if (rightAnd != null && rightAnd.eIsProxy()) {
			InternalEObject oldRightAnd = (InternalEObject)rightAnd;
			rightAnd = (BooleanExpression)eResolveProxy(oldRightAnd);
			if (rightAnd != oldRightAnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.AND__RIGHT_AND, oldRightAnd, rightAnd));
			}
		}
		return rightAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression basicGetRightAnd() {
		return rightAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightAnd(BooleanExpression newRightAnd) {
		BooleanExpression oldRightAnd = rightAnd;
		rightAnd = newRightAnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.AND__RIGHT_AND, oldRightAnd, rightAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GseqPackage.AND__LEFT_AND:
				if (resolve) return getLeftAnd();
				return basicGetLeftAnd();
			case GseqPackage.AND__RIGHT_AND:
				if (resolve) return getRightAnd();
				return basicGetRightAnd();
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
			case GseqPackage.AND__LEFT_AND:
				setLeftAnd((BooleanExpression)newValue);
				return;
			case GseqPackage.AND__RIGHT_AND:
				setRightAnd((BooleanExpression)newValue);
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
			case GseqPackage.AND__LEFT_AND:
				setLeftAnd((BooleanExpression)null);
				return;
			case GseqPackage.AND__RIGHT_AND:
				setRightAnd((BooleanExpression)null);
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
			case GseqPackage.AND__LEFT_AND:
				return leftAnd != null;
			case GseqPackage.AND__RIGHT_AND:
				return rightAnd != null;
		}
		return super.eIsSet(featureID);
	}

} //AndImpl
