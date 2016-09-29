/**
 */
package gx10.impl;

import gx10.Async;
import gx10.Gx10Package;
import gx10.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Async</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gx10.impl.AsyncImpl#getAsyncBlock <em>Async Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsyncImpl extends StatementImpl implements Async {
	/**
	 * The cached value of the '{@link #getAsyncBlock() <em>Async Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsyncBlock()
	 * @generated
	 * @ordered
	 */
	protected Statement asyncBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsyncImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.ASYNC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getAsyncBlock() {
		return asyncBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsyncBlock(Statement newAsyncBlock, NotificationChain msgs) {
		Statement oldAsyncBlock = asyncBlock;
		asyncBlock = newAsyncBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.ASYNC__ASYNC_BLOCK, oldAsyncBlock, newAsyncBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsyncBlock(Statement newAsyncBlock) {
		if (newAsyncBlock != asyncBlock) {
			NotificationChain msgs = null;
			if (asyncBlock != null)
				msgs = ((InternalEObject)asyncBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.ASYNC__ASYNC_BLOCK, null, msgs);
			if (newAsyncBlock != null)
				msgs = ((InternalEObject)newAsyncBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.ASYNC__ASYNC_BLOCK, null, msgs);
			msgs = basicSetAsyncBlock(newAsyncBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.ASYNC__ASYNC_BLOCK, newAsyncBlock, newAsyncBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gx10Package.ASYNC__ASYNC_BLOCK:
				return basicSetAsyncBlock(null, msgs);
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
			case Gx10Package.ASYNC__ASYNC_BLOCK:
				return getAsyncBlock();
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
			case Gx10Package.ASYNC__ASYNC_BLOCK:
				setAsyncBlock((Statement)newValue);
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
			case Gx10Package.ASYNC__ASYNC_BLOCK:
				setAsyncBlock((Statement)null);
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
			case Gx10Package.ASYNC__ASYNC_BLOCK:
				return asyncBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //AsyncImpl
