/**
 */
package gx10.impl;

import gx10.Finish;
import gx10.Gx10Package;
import gx10.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finish</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gx10.impl.FinishImpl#getFinishStatement <em>Finish Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FinishImpl extends StatementImpl implements Finish {
	/**
	 * The cached value of the '{@link #getFinishStatement() <em>Finish Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement finishStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinishImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.FINISH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getFinishStatement() {
		return finishStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinishStatement(Statement newFinishStatement, NotificationChain msgs) {
		Statement oldFinishStatement = finishStatement;
		finishStatement = newFinishStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.FINISH__FINISH_STATEMENT, oldFinishStatement, newFinishStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishStatement(Statement newFinishStatement) {
		if (newFinishStatement != finishStatement) {
			NotificationChain msgs = null;
			if (finishStatement != null)
				msgs = ((InternalEObject)finishStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.FINISH__FINISH_STATEMENT, null, msgs);
			if (newFinishStatement != null)
				msgs = ((InternalEObject)newFinishStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.FINISH__FINISH_STATEMENT, null, msgs);
			msgs = basicSetFinishStatement(newFinishStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.FINISH__FINISH_STATEMENT, newFinishStatement, newFinishStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gx10Package.FINISH__FINISH_STATEMENT:
				return basicSetFinishStatement(null, msgs);
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
			case Gx10Package.FINISH__FINISH_STATEMENT:
				return getFinishStatement();
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
			case Gx10Package.FINISH__FINISH_STATEMENT:
				setFinishStatement((Statement)newValue);
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
			case Gx10Package.FINISH__FINISH_STATEMENT:
				setFinishStatement((Statement)null);
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
			case Gx10Package.FINISH__FINISH_STATEMENT:
				return finishStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //FinishImpl
