/**
 */
package gx10.impl;

import gx10.Gx10Package;
import gx10.Method;
import gx10.MethodCall;
import gx10.MethodCallParameter;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gx10.impl.MethodCallImpl#getMethodToCall <em>Method To Call</em>}</li>
 *   <li>{@link gx10.impl.MethodCallImpl#getMethodCallParameters <em>Method Call Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCallImpl extends ExpressionImpl implements MethodCall {
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
	 * The cached value of the '{@link #getMethodCallParameters() <em>Method Call Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodCallParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodCallParameter> methodCallParameters;

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
		return Gx10Package.Literals.METHOD_CALL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gx10Package.METHOD_CALL__METHOD_TO_CALL, oldMethodToCall, methodToCall));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.METHOD_CALL__METHOD_TO_CALL, oldMethodToCall, newMethodToCall);
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
				msgs = ((InternalEObject)methodToCall).eInverseRemove(this, Gx10Package.METHOD__CALLED_BY, Method.class, msgs);
			if (newMethodToCall != null)
				msgs = ((InternalEObject)newMethodToCall).eInverseAdd(this, Gx10Package.METHOD__CALLED_BY, Method.class, msgs);
			msgs = basicSetMethodToCall(newMethodToCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.METHOD_CALL__METHOD_TO_CALL, newMethodToCall, newMethodToCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodCallParameter> getMethodCallParameters() {
		if (methodCallParameters == null) {
			methodCallParameters = new EObjectContainmentWithInverseEList<MethodCallParameter>(MethodCallParameter.class, this, Gx10Package.METHOD_CALL__METHOD_CALL_PARAMETERS, Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL);
		}
		return methodCallParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void call() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gx10Package.METHOD_CALL__METHOD_TO_CALL:
				if (methodToCall != null)
					msgs = ((InternalEObject)methodToCall).eInverseRemove(this, Gx10Package.METHOD__CALLED_BY, Method.class, msgs);
				return basicSetMethodToCall((Method)otherEnd, msgs);
			case Gx10Package.METHOD_CALL__METHOD_CALL_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethodCallParameters()).basicAdd(otherEnd, msgs);
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
			case Gx10Package.METHOD_CALL__METHOD_TO_CALL:
				return basicSetMethodToCall(null, msgs);
			case Gx10Package.METHOD_CALL__METHOD_CALL_PARAMETERS:
				return ((InternalEList<?>)getMethodCallParameters()).basicRemove(otherEnd, msgs);
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
			case Gx10Package.METHOD_CALL__METHOD_TO_CALL:
				if (resolve) return getMethodToCall();
				return basicGetMethodToCall();
			case Gx10Package.METHOD_CALL__METHOD_CALL_PARAMETERS:
				return getMethodCallParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Gx10Package.METHOD_CALL__METHOD_TO_CALL:
				setMethodToCall((Method)newValue);
				return;
			case Gx10Package.METHOD_CALL__METHOD_CALL_PARAMETERS:
				getMethodCallParameters().clear();
				getMethodCallParameters().addAll((Collection<? extends MethodCallParameter>)newValue);
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
			case Gx10Package.METHOD_CALL__METHOD_TO_CALL:
				setMethodToCall((Method)null);
				return;
			case Gx10Package.METHOD_CALL__METHOD_CALL_PARAMETERS:
				getMethodCallParameters().clear();
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
			case Gx10Package.METHOD_CALL__METHOD_TO_CALL:
				return methodToCall != null;
			case Gx10Package.METHOD_CALL__METHOD_CALL_PARAMETERS:
				return methodCallParameters != null && !methodCallParameters.isEmpty();
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
			case Gx10Package.METHOD_CALL___CALL:
				call();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MethodCallImpl
