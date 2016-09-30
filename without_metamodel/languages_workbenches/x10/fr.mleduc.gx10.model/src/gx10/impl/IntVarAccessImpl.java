/**
 */
package gx10.impl;

import gx10.Gx10Package;
import gx10.IntVar;
import gx10.IntVarAccess;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Var Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gx10.impl.IntVarAccessImpl#getIntVarRef <em>Int Var Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntVarAccessImpl extends IntExpressionImpl implements IntVarAccess {
	/**
	 * The cached value of the '{@link #getIntVarRef() <em>Int Var Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntVarRef()
	 * @generated
	 * @ordered
	 */
	protected IntVar intVarRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntVarAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.INT_VAR_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntVar getIntVarRef() {
		if (intVarRef != null && intVarRef.eIsProxy()) {
			InternalEObject oldIntVarRef = (InternalEObject)intVarRef;
			intVarRef = (IntVar)eResolveProxy(oldIntVarRef);
			if (intVarRef != oldIntVarRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gx10Package.INT_VAR_ACCESS__INT_VAR_REF, oldIntVarRef, intVarRef));
			}
		}
		return intVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntVar basicGetIntVarRef() {
		return intVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntVarRef(IntVar newIntVarRef) {
		IntVar oldIntVarRef = intVarRef;
		intVarRef = newIntVarRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.INT_VAR_ACCESS__INT_VAR_REF, oldIntVarRef, intVarRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gx10Package.INT_VAR_ACCESS__INT_VAR_REF:
				if (resolve) return getIntVarRef();
				return basicGetIntVarRef();
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
			case Gx10Package.INT_VAR_ACCESS__INT_VAR_REF:
				setIntVarRef((IntVar)newValue);
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
			case Gx10Package.INT_VAR_ACCESS__INT_VAR_REF:
				setIntVarRef((IntVar)null);
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
			case Gx10Package.INT_VAR_ACCESS__INT_VAR_REF:
				return intVarRef != null;
		}
		return super.eIsSet(featureID);
	}

} //IntVarAccessImpl
