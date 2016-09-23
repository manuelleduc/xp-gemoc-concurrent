/**
 */
package gseq.impl;

import gseq.BooleanExpression;
import gseq.GseqPackage;
import gseq.Not;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gseq.impl.NotImpl#getNotExpression <em>Not Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotImpl extends BooleanExpressionImpl implements Not {
	/**
	 * The cached value of the '{@link #getNotExpression() <em>Not Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotExpression()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression notExpression;

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
		return GseqPackage.Literals.NOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getNotExpression() {
		if (notExpression != null && notExpression.eIsProxy()) {
			InternalEObject oldNotExpression = (InternalEObject)notExpression;
			notExpression = (BooleanExpression)eResolveProxy(oldNotExpression);
			if (notExpression != oldNotExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.NOT__NOT_EXPRESSION, oldNotExpression, notExpression));
			}
		}
		return notExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression basicGetNotExpression() {
		return notExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotExpression(BooleanExpression newNotExpression) {
		BooleanExpression oldNotExpression = notExpression;
		notExpression = newNotExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.NOT__NOT_EXPRESSION, oldNotExpression, notExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GseqPackage.NOT__NOT_EXPRESSION:
				if (resolve) return getNotExpression();
				return basicGetNotExpression();
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
			case GseqPackage.NOT__NOT_EXPRESSION:
				setNotExpression((BooleanExpression)newValue);
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
			case GseqPackage.NOT__NOT_EXPRESSION:
				setNotExpression((BooleanExpression)null);
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
			case GseqPackage.NOT__NOT_EXPRESSION:
				return notExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //NotImpl
