/**
 */
package gseq.impl;

import gseq.Assign;
import gseq.GseqPackage;
import gseq.IntegerExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gseq.impl.AssignImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link gseq.impl.AssignImpl#getAssignedExpression <em>Assigned Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignImpl extends OperationImpl implements Assign {
	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignedExpression() <em>Assigned Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedExpression()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression assignedExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GseqPackage.Literals.ASSIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.ASSIGN__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getAssignedExpression() {
		if (assignedExpression != null && assignedExpression.eIsProxy()) {
			InternalEObject oldAssignedExpression = (InternalEObject)assignedExpression;
			assignedExpression = (IntegerExpression)eResolveProxy(oldAssignedExpression);
			if (assignedExpression != oldAssignedExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.ASSIGN__ASSIGNED_EXPRESSION, oldAssignedExpression, assignedExpression));
			}
		}
		return assignedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression basicGetAssignedExpression() {
		return assignedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedExpression(IntegerExpression newAssignedExpression) {
		IntegerExpression oldAssignedExpression = assignedExpression;
		assignedExpression = newAssignedExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.ASSIGN__ASSIGNED_EXPRESSION, oldAssignedExpression, assignedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GseqPackage.ASSIGN__VAR_NAME:
				return getVarName();
			case GseqPackage.ASSIGN__ASSIGNED_EXPRESSION:
				if (resolve) return getAssignedExpression();
				return basicGetAssignedExpression();
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
			case GseqPackage.ASSIGN__VAR_NAME:
				setVarName((String)newValue);
				return;
			case GseqPackage.ASSIGN__ASSIGNED_EXPRESSION:
				setAssignedExpression((IntegerExpression)newValue);
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
			case GseqPackage.ASSIGN__VAR_NAME:
				setVarName(VAR_NAME_EDEFAULT);
				return;
			case GseqPackage.ASSIGN__ASSIGNED_EXPRESSION:
				setAssignedExpression((IntegerExpression)null);
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
			case GseqPackage.ASSIGN__VAR_NAME:
				return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
			case GseqPackage.ASSIGN__ASSIGNED_EXPRESSION:
				return assignedExpression != null;
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
		result.append(" (varName: ");
		result.append(varName);
		result.append(')');
		return result.toString();
	}

} //AssignImpl
