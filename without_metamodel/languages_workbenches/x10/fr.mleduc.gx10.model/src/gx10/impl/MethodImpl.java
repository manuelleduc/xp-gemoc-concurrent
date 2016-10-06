/**
 */
package gx10.impl;

import gx10.Block;
import gx10.Gx10Package;
import gx10.Method;
import gx10.MethodCall;
import gx10.Program;
import gx10.Referentiable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gx10.impl.MethodImpl#getInProgram <em>In Program</em>}</li>
 *   <li>{@link gx10.impl.MethodImpl#getMethodBlock <em>Method Block</em>}</li>
 *   <li>{@link gx10.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link gx10.impl.MethodImpl#getCalledBy <em>Called By</em>}</li>
 *   <li>{@link gx10.impl.MethodImpl#getMethodParameters <em>Method Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method {
	/**
	 * The cached value of the '{@link #getMethodBlock() <em>Method Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodBlock()
	 * @generated
	 * @ordered
	 */
	protected Block methodBlock;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCalledBy() <em>Called By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledBy()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodCall> calledBy;

	/**
	 * The cached value of the '{@link #getMethodParameters() <em>Method Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Referentiable> methodParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gx10Package.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program getInProgram() {
		if (eContainerFeatureID() != Gx10Package.METHOD__IN_PROGRAM) return null;
		return (Program)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInProgram(Program newInProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInProgram, Gx10Package.METHOD__IN_PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInProgram(Program newInProgram) {
		if (newInProgram != eInternalContainer() || (eContainerFeatureID() != Gx10Package.METHOD__IN_PROGRAM && newInProgram != null)) {
			if (EcoreUtil.isAncestor(this, newInProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInProgram != null)
				msgs = ((InternalEObject)newInProgram).eInverseAdd(this, Gx10Package.PROGRAM__METHODS, Program.class, msgs);
			msgs = basicSetInProgram(newInProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.METHOD__IN_PROGRAM, newInProgram, newInProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getMethodBlock() {
		return methodBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodBlock(Block newMethodBlock, NotificationChain msgs) {
		Block oldMethodBlock = methodBlock;
		methodBlock = newMethodBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gx10Package.METHOD__METHOD_BLOCK, oldMethodBlock, newMethodBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodBlock(Block newMethodBlock) {
		if (newMethodBlock != methodBlock) {
			NotificationChain msgs = null;
			if (methodBlock != null)
				msgs = ((InternalEObject)methodBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gx10Package.METHOD__METHOD_BLOCK, null, msgs);
			if (newMethodBlock != null)
				msgs = ((InternalEObject)newMethodBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gx10Package.METHOD__METHOD_BLOCK, null, msgs);
			msgs = basicSetMethodBlock(newMethodBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.METHOD__METHOD_BLOCK, newMethodBlock, newMethodBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gx10Package.METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodCall> getCalledBy() {
		if (calledBy == null) {
			calledBy = new EObjectWithInverseResolvingEList<MethodCall>(MethodCall.class, this, Gx10Package.METHOD__CALLED_BY, Gx10Package.METHOD_CALL__METHOD_TO_CALL);
		}
		return calledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Referentiable> getMethodParameters() {
		if (methodParameters == null) {
			methodParameters = new EObjectContainmentEList<Referentiable>(Referentiable.class, this, Gx10Package.METHOD__METHOD_PARAMETERS);
		}
		return methodParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gx10Package.METHOD__IN_PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInProgram((Program)otherEnd, msgs);
			case Gx10Package.METHOD__CALLED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCalledBy()).basicAdd(otherEnd, msgs);
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
			case Gx10Package.METHOD__IN_PROGRAM:
				return basicSetInProgram(null, msgs);
			case Gx10Package.METHOD__METHOD_BLOCK:
				return basicSetMethodBlock(null, msgs);
			case Gx10Package.METHOD__CALLED_BY:
				return ((InternalEList<?>)getCalledBy()).basicRemove(otherEnd, msgs);
			case Gx10Package.METHOD__METHOD_PARAMETERS:
				return ((InternalEList<?>)getMethodParameters()).basicRemove(otherEnd, msgs);
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
			case Gx10Package.METHOD__IN_PROGRAM:
				return eInternalContainer().eInverseRemove(this, Gx10Package.PROGRAM__METHODS, Program.class, msgs);
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
			case Gx10Package.METHOD__IN_PROGRAM:
				return getInProgram();
			case Gx10Package.METHOD__METHOD_BLOCK:
				return getMethodBlock();
			case Gx10Package.METHOD__NAME:
				return getName();
			case Gx10Package.METHOD__CALLED_BY:
				return getCalledBy();
			case Gx10Package.METHOD__METHOD_PARAMETERS:
				return getMethodParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Gx10Package.METHOD__IN_PROGRAM:
				setInProgram((Program)newValue);
				return;
			case Gx10Package.METHOD__METHOD_BLOCK:
				setMethodBlock((Block)newValue);
				return;
			case Gx10Package.METHOD__NAME:
				setName((String)newValue);
				return;
			case Gx10Package.METHOD__CALLED_BY:
				getCalledBy().clear();
				getCalledBy().addAll((Collection<? extends MethodCall>)newValue);
				return;
			case Gx10Package.METHOD__METHOD_PARAMETERS:
				getMethodParameters().clear();
				getMethodParameters().addAll((Collection<? extends Referentiable>)newValue);
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
			case Gx10Package.METHOD__IN_PROGRAM:
				setInProgram((Program)null);
				return;
			case Gx10Package.METHOD__METHOD_BLOCK:
				setMethodBlock((Block)null);
				return;
			case Gx10Package.METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Gx10Package.METHOD__CALLED_BY:
				getCalledBy().clear();
				return;
			case Gx10Package.METHOD__METHOD_PARAMETERS:
				getMethodParameters().clear();
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
			case Gx10Package.METHOD__IN_PROGRAM:
				return getInProgram() != null;
			case Gx10Package.METHOD__METHOD_BLOCK:
				return methodBlock != null;
			case Gx10Package.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Gx10Package.METHOD__CALLED_BY:
				return calledBy != null && !calledBy.isEmpty();
			case Gx10Package.METHOD__METHOD_PARAMETERS:
				return methodParameters != null && !methodParameters.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
