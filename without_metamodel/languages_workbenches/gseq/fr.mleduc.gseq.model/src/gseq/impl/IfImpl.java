/**
 */
package gseq.impl;

import gseq.BooleanExpression;
import gseq.GseqPackage;
import gseq.If;
import gseq.Operation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gseq.impl.IfImpl#getElseBranch <em>Else Branch</em>}</li>
 *   <li>{@link gseq.impl.IfImpl#getThenBranch <em>Then Branch</em>}</li>
 *   <li>{@link gseq.impl.IfImpl#getConditionIf <em>Condition If</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfImpl extends OperationImpl implements If {
	/**
	 * The cached value of the '{@link #getElseBranch() <em>Else Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBranch()
	 * @generated
	 * @ordered
	 */
	protected Operation elseBranch;

	/**
	 * The cached value of the '{@link #getThenBranch() <em>Then Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenBranch()
	 * @generated
	 * @ordered
	 */
	protected Operation thenBranch;

	/**
	 * The cached value of the '{@link #getConditionIf() <em>Condition If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionIf()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression conditionIf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GseqPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getElseBranch() {
		return elseBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseBranch(Operation newElseBranch, NotificationChain msgs) {
		Operation oldElseBranch = elseBranch;
		elseBranch = newElseBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GseqPackage.IF__ELSE_BRANCH, oldElseBranch, newElseBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBranch(Operation newElseBranch) {
		if (newElseBranch != elseBranch) {
			NotificationChain msgs = null;
			if (elseBranch != null)
				msgs = ((InternalEObject)elseBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GseqPackage.IF__ELSE_BRANCH, null, msgs);
			if (newElseBranch != null)
				msgs = ((InternalEObject)newElseBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GseqPackage.IF__ELSE_BRANCH, null, msgs);
			msgs = basicSetElseBranch(newElseBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.IF__ELSE_BRANCH, newElseBranch, newElseBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getThenBranch() {
		return thenBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenBranch(Operation newThenBranch, NotificationChain msgs) {
		Operation oldThenBranch = thenBranch;
		thenBranch = newThenBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GseqPackage.IF__THEN_BRANCH, oldThenBranch, newThenBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenBranch(Operation newThenBranch) {
		if (newThenBranch != thenBranch) {
			NotificationChain msgs = null;
			if (thenBranch != null)
				msgs = ((InternalEObject)thenBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GseqPackage.IF__THEN_BRANCH, null, msgs);
			if (newThenBranch != null)
				msgs = ((InternalEObject)newThenBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GseqPackage.IF__THEN_BRANCH, null, msgs);
			msgs = basicSetThenBranch(newThenBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.IF__THEN_BRANCH, newThenBranch, newThenBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getConditionIf() {
		return conditionIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionIf(BooleanExpression newConditionIf, NotificationChain msgs) {
		BooleanExpression oldConditionIf = conditionIf;
		conditionIf = newConditionIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GseqPackage.IF__CONDITION_IF, oldConditionIf, newConditionIf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionIf(BooleanExpression newConditionIf) {
		if (newConditionIf != conditionIf) {
			NotificationChain msgs = null;
			if (conditionIf != null)
				msgs = ((InternalEObject)conditionIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GseqPackage.IF__CONDITION_IF, null, msgs);
			if (newConditionIf != null)
				msgs = ((InternalEObject)newConditionIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GseqPackage.IF__CONDITION_IF, null, msgs);
			msgs = basicSetConditionIf(newConditionIf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.IF__CONDITION_IF, newConditionIf, newConditionIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GseqPackage.IF__ELSE_BRANCH:
				return basicSetElseBranch(null, msgs);
			case GseqPackage.IF__THEN_BRANCH:
				return basicSetThenBranch(null, msgs);
			case GseqPackage.IF__CONDITION_IF:
				return basicSetConditionIf(null, msgs);
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
			case GseqPackage.IF__ELSE_BRANCH:
				return getElseBranch();
			case GseqPackage.IF__THEN_BRANCH:
				return getThenBranch();
			case GseqPackage.IF__CONDITION_IF:
				return getConditionIf();
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
			case GseqPackage.IF__ELSE_BRANCH:
				setElseBranch((Operation)newValue);
				return;
			case GseqPackage.IF__THEN_BRANCH:
				setThenBranch((Operation)newValue);
				return;
			case GseqPackage.IF__CONDITION_IF:
				setConditionIf((BooleanExpression)newValue);
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
			case GseqPackage.IF__ELSE_BRANCH:
				setElseBranch((Operation)null);
				return;
			case GseqPackage.IF__THEN_BRANCH:
				setThenBranch((Operation)null);
				return;
			case GseqPackage.IF__CONDITION_IF:
				setConditionIf((BooleanExpression)null);
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
			case GseqPackage.IF__ELSE_BRANCH:
				return elseBranch != null;
			case GseqPackage.IF__THEN_BRANCH:
				return thenBranch != null;
			case GseqPackage.IF__CONDITION_IF:
				return conditionIf != null;
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
