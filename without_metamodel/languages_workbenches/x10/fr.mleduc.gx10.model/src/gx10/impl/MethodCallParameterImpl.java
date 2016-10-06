/**
 */
package gx10.impl;

import gx10.Gx10Package;
import gx10.IntExpression;
import gx10.MethodCall;
import gx10.MethodCallParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gx10.impl.MethodCallParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link gx10.impl.MethodCallParameterImpl#getMethodCallParameterExpr <em>Method Call Parameter Expr</em>}</li>
 *   <li>{@link gx10.impl.MethodCallParameterImpl#getInMethodCall <em>In Method Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCallParameterImpl extends MinimalEObjectImpl.Container implements MethodCallParameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethodCallParameterExpr() <em>Method Call Parameter Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodCallParameterExpr()
	 * @generated
	 * @ordered
	 */
	protected IntExpression methodCallParameterExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCallParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.METHOD_CALL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.METHOD_CALL_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntExpression getMethodCallParameterExpr() {
		return methodCallParameterExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodCallParameterExpr(IntExpression newMethodCallParameterExpr, NotificationChain msgs) {
		IntExpression oldMethodCallParameterExpr = methodCallParameterExpr;
		methodCallParameterExpr = newMethodCallParameterExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR, oldMethodCallParameterExpr, newMethodCallParameterExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodCallParameterExpr(IntExpression newMethodCallParameterExpr) {
		if (newMethodCallParameterExpr != methodCallParameterExpr) {
			NotificationChain msgs = null;
			if (methodCallParameterExpr != null)
				msgs = ((InternalEObject)methodCallParameterExpr).eInverseRemove(this, Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER, IntExpression.class, msgs);
			if (newMethodCallParameterExpr != null)
				msgs = ((InternalEObject)newMethodCallParameterExpr).eInverseAdd(this, Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER, IntExpression.class, msgs);
			msgs = basicSetMethodCallParameterExpr(newMethodCallParameterExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR, newMethodCallParameterExpr, newMethodCallParameterExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCall getInMethodCall() {
		if (eContainerFeatureID() != Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL) return null;
		return (MethodCall)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInMethodCall(MethodCall newInMethodCall, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInMethodCall, Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMethodCall(MethodCall newInMethodCall) {
		if (newInMethodCall != eInternalContainer() || (eContainerFeatureID() != Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL && newInMethodCall != null)) {
			if (EcoreUtil.isAncestor(this, newInMethodCall))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInMethodCall != null)
				msgs = ((InternalEObject)newInMethodCall).eInverseAdd(this, Gx10Package.METHOD_CALL__METHOD_CALL_PARAMETERS, MethodCall.class, msgs);
			msgs = basicSetInMethodCall(newInMethodCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL, newInMethodCall, newInMethodCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gx10Package.METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR:
				if (methodCallParameterExpr != null)
					msgs = ((InternalEObject)methodCallParameterExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR, null, msgs);
				return basicSetMethodCallParameterExpr((IntExpression)otherEnd, msgs);
			case Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInMethodCall((MethodCall)otherEnd, msgs);
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
			case Gx10Package.METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR:
				return basicSetMethodCallParameterExpr(null, msgs);
			case Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL:
				return basicSetInMethodCall(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL:
				return eInternalContainer().eInverseRemove(this, Gx10Package.METHOD_CALL__METHOD_CALL_PARAMETERS, MethodCall.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gx10Package.METHOD_CALL_PARAMETER__NAME:
				return getName();
			case Gx10Package.METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR:
				return getMethodCallParameterExpr();
			case Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL:
				return getInMethodCall();
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
			case Gx10Package.METHOD_CALL_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case Gx10Package.METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR:
				setMethodCallParameterExpr((IntExpression)newValue);
				return;
			case Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL:
				setInMethodCall((MethodCall)newValue);
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
			case Gx10Package.METHOD_CALL_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Gx10Package.METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR:
				setMethodCallParameterExpr((IntExpression)null);
				return;
			case Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL:
				setInMethodCall((MethodCall)null);
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
			case Gx10Package.METHOD_CALL_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Gx10Package.METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR:
				return methodCallParameterExpr != null;
			case Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL:
				return getInMethodCall() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MethodCallParameterImpl
