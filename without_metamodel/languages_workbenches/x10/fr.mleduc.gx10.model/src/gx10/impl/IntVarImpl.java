/**
 */
package gx10.impl;

import gx10.Gx10Package;
import gx10.IntExpression;
import gx10.IntVar;
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
 * An implementation of the model object '<em><b>Int Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gx10.impl.IntVarImpl#getIntVarExpr <em>Int Var Expr</em>}</li>
 *   <li>{@link gx10.impl.IntVarImpl#getIntVarName <em>Int Var Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntVarImpl extends StatementImpl implements IntVar {
	/**
	 * The cached value of the '{@link #getIntVarExpr() <em>Int Var Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntVarExpr()
	 * @generated
	 * @ordered
	 */
	protected IntExpression intVarExpr;

	/**
	 * The cached value of the '{@link #getIntVarName() <em>Int Var Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntVarName()
	 * @generated
	 * @ordered
	 */
	protected Referentiable intVarName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.INT_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntExpression getIntVarExpr() {
		return intVarExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntVarExpr(IntExpression newIntVarExpr, NotificationChain msgs) {
		IntExpression oldIntVarExpr = intVarExpr;
		intVarExpr = newIntVarExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.INT_VAR__INT_VAR_EXPR, oldIntVarExpr, newIntVarExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntVarExpr(IntExpression newIntVarExpr) {
		if (newIntVarExpr != intVarExpr) {
			NotificationChain msgs = null;
			if (intVarExpr != null)
				msgs = ((InternalEObject)intVarExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.INT_VAR__INT_VAR_EXPR, null, msgs);
			if (newIntVarExpr != null)
				msgs = ((InternalEObject)newIntVarExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.INT_VAR__INT_VAR_EXPR, null, msgs);
			msgs = basicSetIntVarExpr(newIntVarExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.INT_VAR__INT_VAR_EXPR, newIntVarExpr, newIntVarExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referentiable getIntVarName() {
		return intVarName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntVarName(Referentiable newIntVarName, NotificationChain msgs) {
		Referentiable oldIntVarName = intVarName;
		intVarName = newIntVarName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.INT_VAR__INT_VAR_NAME, oldIntVarName, newIntVarName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntVarName(Referentiable newIntVarName) {
		if (newIntVarName != intVarName) {
			NotificationChain msgs = null;
			if (intVarName != null)
				msgs = ((InternalEObject)intVarName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.INT_VAR__INT_VAR_NAME, null, msgs);
			if (newIntVarName != null)
				msgs = ((InternalEObject)newIntVarName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.INT_VAR__INT_VAR_NAME, null, msgs);
			msgs = basicSetIntVarName(newIntVarName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.INT_VAR__INT_VAR_NAME, newIntVarName, newIntVarName));
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
			case Gx10Package.INT_VAR__INT_VAR_EXPR:
				return basicSetIntVarExpr(null, msgs);
			case Gx10Package.INT_VAR__INT_VAR_NAME:
				return basicSetIntVarName(null, msgs);
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
			case Gx10Package.INT_VAR__INT_VAR_EXPR:
				return getIntVarExpr();
			case Gx10Package.INT_VAR__INT_VAR_NAME:
				return getIntVarName();
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
			case Gx10Package.INT_VAR__INT_VAR_EXPR:
				setIntVarExpr((IntExpression)newValue);
				return;
			case Gx10Package.INT_VAR__INT_VAR_NAME:
				setIntVarName((Referentiable)newValue);
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
			case Gx10Package.INT_VAR__INT_VAR_EXPR:
				setIntVarExpr((IntExpression)null);
				return;
			case Gx10Package.INT_VAR__INT_VAR_NAME:
				setIntVarName((Referentiable)null);
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
			case Gx10Package.INT_VAR__INT_VAR_EXPR:
				return intVarExpr != null;
			case Gx10Package.INT_VAR__INT_VAR_NAME:
				return intVarName != null;
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
			case Gx10Package.INT_VAR___EVALUATE:
				evaluate();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //IntVarImpl
