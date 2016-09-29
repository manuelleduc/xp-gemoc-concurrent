/**
 */
package gx10.impl;

import gx10.BoolExpression;
import gx10.ControlStructure;
import gx10.Gx10Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gx10.impl.ControlStructureImpl#getControlStructureCondition <em>Control Structure Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ControlStructureImpl extends StatementImpl implements ControlStructure {
	/**
	 * The cached value of the '{@link #getControlStructureCondition() <em>Control Structure Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlStructureCondition()
	 * @generated
	 * @ordered
	 */
	protected BoolExpression controlStructureCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.CONTROL_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolExpression getControlStructureCondition() {
		return controlStructureCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlStructureCondition(BoolExpression newControlStructureCondition, NotificationChain msgs) {
		BoolExpression oldControlStructureCondition = controlStructureCondition;
		controlStructureCondition = newControlStructureCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.CONTROL_STRUCTURE__CONTROL_STRUCTURE_CONDITION, oldControlStructureCondition, newControlStructureCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlStructureCondition(BoolExpression newControlStructureCondition) {
		if (newControlStructureCondition != controlStructureCondition) {
			NotificationChain msgs = null;
			if (controlStructureCondition != null)
				msgs = ((InternalEObject)controlStructureCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.CONTROL_STRUCTURE__CONTROL_STRUCTURE_CONDITION, null, msgs);
			if (newControlStructureCondition != null)
				msgs = ((InternalEObject)newControlStructureCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.CONTROL_STRUCTURE__CONTROL_STRUCTURE_CONDITION, null, msgs);
			msgs = basicSetControlStructureCondition(newControlStructureCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.CONTROL_STRUCTURE__CONTROL_STRUCTURE_CONDITION, newControlStructureCondition, newControlStructureCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gx10Package.CONTROL_STRUCTURE__CONTROL_STRUCTURE_CONDITION:
				return basicSetControlStructureCondition(null, msgs);
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
			case Gx10Package.CONTROL_STRUCTURE__CONTROL_STRUCTURE_CONDITION:
				return getControlStructureCondition();
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
			case Gx10Package.CONTROL_STRUCTURE__CONTROL_STRUCTURE_CONDITION:
				setControlStructureCondition((BoolExpression)newValue);
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
			case Gx10Package.CONTROL_STRUCTURE__CONTROL_STRUCTURE_CONDITION:
				setControlStructureCondition((BoolExpression)null);
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
			case Gx10Package.CONTROL_STRUCTURE__CONTROL_STRUCTURE_CONDITION:
				return controlStructureCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlStructureImpl
