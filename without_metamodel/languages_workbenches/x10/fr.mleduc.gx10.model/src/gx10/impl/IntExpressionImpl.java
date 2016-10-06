/**
 */
package gx10.impl;

import gx10.Gx10Package;
import gx10.IntExpression;

import gx10.MethodCallParameter;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gx10.impl.IntExpressionImpl#getInMethodCallParameter <em>In Method Call Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IntExpressionImpl extends ExpressionImpl implements IntExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.INT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCallParameter getInMethodCallParameter() {
		if (eContainerFeatureID() != Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER) return null;
		return (MethodCallParameter)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInMethodCallParameter(MethodCallParameter newInMethodCallParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInMethodCallParameter, Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMethodCallParameter(MethodCallParameter newInMethodCallParameter) {
		if (newInMethodCallParameter != eInternalContainer() || (eContainerFeatureID() != Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER && newInMethodCallParameter != null)) {
			if (EcoreUtil.isAncestor(this, newInMethodCallParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInMethodCallParameter != null)
				msgs = ((InternalEObject)newInMethodCallParameter).eInverseAdd(this, Gx10Package.METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR, MethodCallParameter.class, msgs);
			msgs = basicSetInMethodCallParameter(newInMethodCallParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER, newInMethodCallParameter, newInMethodCallParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInMethodCallParameter((MethodCallParameter)otherEnd, msgs);
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
			case Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER:
				return basicSetInMethodCallParameter(null, msgs);
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
			case Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER:
				return eInternalContainer().eInverseRemove(this, Gx10Package.METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR, MethodCallParameter.class, msgs);
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
			case Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER:
				return getInMethodCallParameter();
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
			case Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER:
				setInMethodCallParameter((MethodCallParameter)newValue);
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
			case Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER:
				setInMethodCallParameter((MethodCallParameter)null);
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
			case Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER:
				return getInMethodCallParameter() != null;
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
			case Gx10Package.INT_EXPRESSION___GET_CURRENT_VALUE:
				return getCurrentValue();
		}
		return super.eInvoke(operationID, arguments);
	}

} //IntExpressionImpl
