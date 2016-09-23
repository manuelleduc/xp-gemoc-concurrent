/**
 */
package gseq.impl;

import gseq.GseqPackage;
import gseq.Method;
import gseq.MethodCall;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gseq.impl.MethodCallImpl#getMethodToCall <em>Method To Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodCallImpl extends IntegerExpressionImpl implements MethodCall {
	/**
	 * The cached value of the '{@link #getMethodToCall() <em>Method To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodToCall()
	 * @generated
	 * @ordered
	 */
	protected Method methodToCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GseqPackage.Literals.METHOD_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethodToCall() {
		if (methodToCall != null && methodToCall.eIsProxy()) {
			InternalEObject oldMethodToCall = (InternalEObject)methodToCall;
			methodToCall = (Method)eResolveProxy(oldMethodToCall);
			if (methodToCall != oldMethodToCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.METHOD_CALL__METHOD_TO_CALL, oldMethodToCall, methodToCall));
			}
		}
		return methodToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetMethodToCall() {
		return methodToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodToCall(Method newMethodToCall, NotificationChain msgs) {
		Method oldMethodToCall = methodToCall;
		methodToCall = newMethodToCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GseqPackage.METHOD_CALL__METHOD_TO_CALL, oldMethodToCall, newMethodToCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodToCall(Method newMethodToCall) {
		if (newMethodToCall != methodToCall) {
			NotificationChain msgs = null;
			if (methodToCall != null)
				msgs = ((InternalEObject)methodToCall).eInverseRemove(this, GseqPackage.METHOD__CALLED_BY, Method.class, msgs);
			if (newMethodToCall != null)
				msgs = ((InternalEObject)newMethodToCall).eInverseAdd(this, GseqPackage.METHOD__CALLED_BY, Method.class, msgs);
			msgs = basicSetMethodToCall(newMethodToCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.METHOD_CALL__METHOD_TO_CALL, newMethodToCall, newMethodToCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GseqPackage.METHOD_CALL__METHOD_TO_CALL:
				if (methodToCall != null)
					msgs = ((InternalEObject)methodToCall).eInverseRemove(this, GseqPackage.METHOD__CALLED_BY, Method.class, msgs);
				return basicSetMethodToCall((Method)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GseqPackage.METHOD_CALL__METHOD_TO_CALL:
				return basicSetMethodToCall(null, msgs);
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
			case GseqPackage.METHOD_CALL__METHOD_TO_CALL:
				if (resolve) return getMethodToCall();
				return basicGetMethodToCall();
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
			case GseqPackage.METHOD_CALL__METHOD_TO_CALL:
				setMethodToCall((Method)newValue);
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
			case GseqPackage.METHOD_CALL__METHOD_TO_CALL:
				setMethodToCall((Method)null);
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
			case GseqPackage.METHOD_CALL__METHOD_TO_CALL:
				return methodToCall != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodCallImpl
