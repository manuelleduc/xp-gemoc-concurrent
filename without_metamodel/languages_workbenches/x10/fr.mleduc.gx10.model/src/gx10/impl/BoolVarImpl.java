/**
 */
package gx10.impl;

import gx10.BoolExpression;
import gx10.BoolVar;
import gx10.Gx10Package;
import gx10.Referentiable;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bool Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gx10.impl.BoolVarImpl#getBoolVarExpr <em>Bool Var Expr</em>}</li>
 *   <li>{@link gx10.impl.BoolVarImpl#getBoolVarName <em>Bool Var Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoolVarImpl extends ExpressionImpl implements BoolVar {
	/**
	 * The cached value of the '{@link #getBoolVarExpr() <em>Bool Var Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVarExpr()
	 * @generated
	 * @ordered
	 */
	protected BoolExpression boolVarExpr;

	/**
	 * The cached value of the '{@link #getBoolVarName() <em>Bool Var Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVarName()
	 * @generated
	 * @ordered
	 */
	protected Referentiable boolVarName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.BOOL_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolExpression getBoolVarExpr() {
		return boolVarExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoolVarExpr(BoolExpression newBoolVarExpr, NotificationChain msgs) {
		BoolExpression oldBoolVarExpr = boolVarExpr;
		boolVarExpr = newBoolVarExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.BOOL_VAR__BOOL_VAR_EXPR, oldBoolVarExpr, newBoolVarExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolVarExpr(BoolExpression newBoolVarExpr) {
		if (newBoolVarExpr != boolVarExpr) {
			NotificationChain msgs = null;
			if (boolVarExpr != null)
				msgs = ((InternalEObject)boolVarExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.BOOL_VAR__BOOL_VAR_EXPR, null, msgs);
			if (newBoolVarExpr != null)
				msgs = ((InternalEObject)newBoolVarExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.BOOL_VAR__BOOL_VAR_EXPR, null, msgs);
			msgs = basicSetBoolVarExpr(newBoolVarExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.BOOL_VAR__BOOL_VAR_EXPR, newBoolVarExpr, newBoolVarExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referentiable getBoolVarName() {
		return boolVarName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoolVarName(Referentiable newBoolVarName, NotificationChain msgs) {
		Referentiable oldBoolVarName = boolVarName;
		boolVarName = newBoolVarName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.BOOL_VAR__BOOL_VAR_NAME, oldBoolVarName, newBoolVarName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolVarName(Referentiable newBoolVarName) {
		if (newBoolVarName != boolVarName) {
			NotificationChain msgs = null;
			if (boolVarName != null)
				msgs = ((InternalEObject)boolVarName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.BOOL_VAR__BOOL_VAR_NAME, null, msgs);
			if (newBoolVarName != null)
				msgs = ((InternalEObject)newBoolVarName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.BOOL_VAR__BOOL_VAR_NAME, null, msgs);
			msgs = basicSetBoolVarName(newBoolVarName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.BOOL_VAR__BOOL_VAR_NAME, newBoolVarName, newBoolVarName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void evaluate() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gx10Package.BOOL_VAR__BOOL_VAR_EXPR:
				return basicSetBoolVarExpr(null, msgs);
			case Gx10Package.BOOL_VAR__BOOL_VAR_NAME:
				return basicSetBoolVarName(null, msgs);
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
			case Gx10Package.BOOL_VAR__BOOL_VAR_EXPR:
				return getBoolVarExpr();
			case Gx10Package.BOOL_VAR__BOOL_VAR_NAME:
				return getBoolVarName();
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
			case Gx10Package.BOOL_VAR__BOOL_VAR_EXPR:
				setBoolVarExpr((BoolExpression)newValue);
				return;
			case Gx10Package.BOOL_VAR__BOOL_VAR_NAME:
				setBoolVarName((Referentiable)newValue);
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
			case Gx10Package.BOOL_VAR__BOOL_VAR_EXPR:
				setBoolVarExpr((BoolExpression)null);
				return;
			case Gx10Package.BOOL_VAR__BOOL_VAR_NAME:
				setBoolVarName((Referentiable)null);
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
			case Gx10Package.BOOL_VAR__BOOL_VAR_EXPR:
				return boolVarExpr != null;
			case Gx10Package.BOOL_VAR__BOOL_VAR_NAME:
				return boolVarName != null;
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
			case Gx10Package.BOOL_VAR___EVALUATE:
				evaluate();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BoolVarImpl
