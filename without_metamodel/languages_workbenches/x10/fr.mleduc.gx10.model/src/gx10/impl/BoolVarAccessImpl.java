/**
 */
package gx10.impl;

import gx10.BoolVar;
import gx10.BoolVarAccess;
import gx10.Gx10Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bool Var Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gx10.impl.BoolVarAccessImpl#getBoolVarRef <em>Bool Var Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoolVarAccessImpl extends BoolExpressionImpl implements BoolVarAccess {
	/**
	 * The cached value of the '{@link #getBoolVarRef() <em>Bool Var Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVarRef()
	 * @generated
	 * @ordered
	 */
	protected BoolVar boolVarRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolVarAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.BOOL_VAR_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolVar getBoolVarRef() {
		if (boolVarRef != null && boolVarRef.eIsProxy()) {
			InternalEObject oldBoolVarRef = (InternalEObject)boolVarRef;
			boolVarRef = (BoolVar)eResolveProxy(oldBoolVarRef);
			if (boolVarRef != oldBoolVarRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gx10Package.BOOL_VAR_ACCESS__BOOL_VAR_REF, oldBoolVarRef, boolVarRef));
			}
		}
		return boolVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolVar basicGetBoolVarRef() {
		return boolVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolVarRef(BoolVar newBoolVarRef) {
		BoolVar oldBoolVarRef = boolVarRef;
		boolVarRef = newBoolVarRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.BOOL_VAR_ACCESS__BOOL_VAR_REF, oldBoolVarRef, boolVarRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gx10Package.BOOL_VAR_ACCESS__BOOL_VAR_REF:
				if (resolve) return getBoolVarRef();
				return basicGetBoolVarRef();
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
			case Gx10Package.BOOL_VAR_ACCESS__BOOL_VAR_REF:
				setBoolVarRef((BoolVar)newValue);
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
			case Gx10Package.BOOL_VAR_ACCESS__BOOL_VAR_REF:
				setBoolVarRef((BoolVar)null);
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
			case Gx10Package.BOOL_VAR_ACCESS__BOOL_VAR_REF:
				return boolVarRef != null;
		}
		return super.eIsSet(featureID);
	}

} //BoolVarAccessImpl
