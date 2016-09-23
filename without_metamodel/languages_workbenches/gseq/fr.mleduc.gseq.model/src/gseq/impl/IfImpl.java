/**
 */
package gseq.impl;

import gseq.BooleanExpression;
import gseq.GseqPackage;
import gseq.If;
import gseq.Operation;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link gseq.impl.IfImpl#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link gseq.impl.IfImpl#getThenBranch <em>Then Branch</em>}</li>
 *   <li>{@link gseq.impl.IfImpl#getElseBranch <em>Else Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfImpl extends OperationImpl implements If {
	/**
	 * The cached value of the '{@link #getIfCondition() <em>If Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfCondition()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression ifCondition;

	/**
	 * The cached value of the '{@link #getThenBranch() <em>Then Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenBranch()
	 * @generated
	 * @ordered
	 */
	protected Operation thenBranch;

	/**
	 * The cached value of the '{@link #getElseBranch() <em>Else Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBranch()
	 * @generated
	 * @ordered
	 */
	protected Operation elseBranch;

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
	public BooleanExpression getIfCondition() {
		if (ifCondition != null && ifCondition.eIsProxy()) {
			InternalEObject oldIfCondition = (InternalEObject)ifCondition;
			ifCondition = (BooleanExpression)eResolveProxy(oldIfCondition);
			if (ifCondition != oldIfCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.IF__IF_CONDITION, oldIfCondition, ifCondition));
			}
		}
		return ifCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression basicGetIfCondition() {
		return ifCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfCondition(BooleanExpression newIfCondition) {
		BooleanExpression oldIfCondition = ifCondition;
		ifCondition = newIfCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.IF__IF_CONDITION, oldIfCondition, ifCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getThenBranch() {
		if (thenBranch != null && thenBranch.eIsProxy()) {
			InternalEObject oldThenBranch = (InternalEObject)thenBranch;
			thenBranch = (Operation)eResolveProxy(oldThenBranch);
			if (thenBranch != oldThenBranch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.IF__THEN_BRANCH, oldThenBranch, thenBranch));
			}
		}
		return thenBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetThenBranch() {
		return thenBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenBranch(Operation newThenBranch) {
		Operation oldThenBranch = thenBranch;
		thenBranch = newThenBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.IF__THEN_BRANCH, oldThenBranch, thenBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getElseBranch() {
		if (elseBranch != null && elseBranch.eIsProxy()) {
			InternalEObject oldElseBranch = (InternalEObject)elseBranch;
			elseBranch = (Operation)eResolveProxy(oldElseBranch);
			if (elseBranch != oldElseBranch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.IF__ELSE_BRANCH, oldElseBranch, elseBranch));
			}
		}
		return elseBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetElseBranch() {
		return elseBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBranch(Operation newElseBranch) {
		Operation oldElseBranch = elseBranch;
		elseBranch = newElseBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.IF__ELSE_BRANCH, oldElseBranch, elseBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GseqPackage.IF__IF_CONDITION:
				if (resolve) return getIfCondition();
				return basicGetIfCondition();
			case GseqPackage.IF__THEN_BRANCH:
				if (resolve) return getThenBranch();
				return basicGetThenBranch();
			case GseqPackage.IF__ELSE_BRANCH:
				if (resolve) return getElseBranch();
				return basicGetElseBranch();
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
			case GseqPackage.IF__IF_CONDITION:
				setIfCondition((BooleanExpression)newValue);
				return;
			case GseqPackage.IF__THEN_BRANCH:
				setThenBranch((Operation)newValue);
				return;
			case GseqPackage.IF__ELSE_BRANCH:
				setElseBranch((Operation)newValue);
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
			case GseqPackage.IF__IF_CONDITION:
				setIfCondition((BooleanExpression)null);
				return;
			case GseqPackage.IF__THEN_BRANCH:
				setThenBranch((Operation)null);
				return;
			case GseqPackage.IF__ELSE_BRANCH:
				setElseBranch((Operation)null);
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
			case GseqPackage.IF__IF_CONDITION:
				return ifCondition != null;
			case GseqPackage.IF__THEN_BRANCH:
				return thenBranch != null;
			case GseqPackage.IF__ELSE_BRANCH:
				return elseBranch != null;
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
