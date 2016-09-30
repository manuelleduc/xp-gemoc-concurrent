/**
 */
package gx10.impl;

import gx10.Block;
import gx10.Gx10Package;
import gx10.While;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gx10.impl.WhileImpl#getWhileBlock <em>While Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileImpl extends ControlStructureImpl implements While {
	/**
	 * The cached value of the '{@link #getWhileBlock() <em>While Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhileBlock()
	 * @generated
	 * @ordered
	 */
	protected Block whileBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.WHILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getWhileBlock() {
		return whileBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhileBlock(Block newWhileBlock, NotificationChain msgs) {
		Block oldWhileBlock = whileBlock;
		whileBlock = newWhileBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.WHILE__WHILE_BLOCK, oldWhileBlock, newWhileBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhileBlock(Block newWhileBlock) {
		if (newWhileBlock != whileBlock) {
			NotificationChain msgs = null;
			if (whileBlock != null)
				msgs = ((InternalEObject)whileBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.WHILE__WHILE_BLOCK, null, msgs);
			if (newWhileBlock != null)
				msgs = ((InternalEObject)newWhileBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.WHILE__WHILE_BLOCK, null, msgs);
			msgs = basicSetWhileBlock(newWhileBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.WHILE__WHILE_BLOCK, newWhileBlock, newWhileBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gx10Package.WHILE__WHILE_BLOCK:
				return basicSetWhileBlock(null, msgs);
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
			case Gx10Package.WHILE__WHILE_BLOCK:
				return getWhileBlock();
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
			case Gx10Package.WHILE__WHILE_BLOCK:
				setWhileBlock((Block)newValue);
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
			case Gx10Package.WHILE__WHILE_BLOCK:
				setWhileBlock((Block)null);
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
			case Gx10Package.WHILE__WHILE_BLOCK:
				return whileBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //WhileImpl
