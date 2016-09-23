/**
 */
package gseq.impl;

import gseq.GseqPackage;
import gseq.Method;
import gseq.MethodCall;
import gseq.Operation;
import gseq.Program;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gseq.impl.MethodImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link gseq.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link gseq.impl.MethodImpl#getInProgram <em>In Program</em>}</li>
 *   <li>{@link gseq.impl.MethodImpl#getCalledBy <em>Called By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

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
		return GseqPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, GseqPackage.METHOD__OPERATIONS, GseqPackage.OPERATION__EXECUTED_BY);
		}
		return operations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program getInProgram() {
		if (eContainerFeatureID() != GseqPackage.METHOD__IN_PROGRAM) return null;
		return (Program)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInProgram(Program newInProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInProgram, GseqPackage.METHOD__IN_PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInProgram(Program newInProgram) {
		if (newInProgram != eInternalContainer() || (eContainerFeatureID() != GseqPackage.METHOD__IN_PROGRAM && newInProgram != null)) {
			if (EcoreUtil.isAncestor(this, newInProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInProgram != null)
				msgs = ((InternalEObject)newInProgram).eInverseAdd(this, GseqPackage.PROGRAM__METHODS, Program.class, msgs);
			msgs = basicSetInProgram(newInProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.METHOD__IN_PROGRAM, newInProgram, newInProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodCall> getCalledBy() {
		if (calledBy == null) {
			calledBy = new EObjectWithInverseResolvingEList<MethodCall>(MethodCall.class, this, GseqPackage.METHOD__CALLED_BY, GseqPackage.METHOD_CALL__METHOD_TO_CALL);
		}
		return calledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void call() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case GseqPackage.METHOD__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
			case GseqPackage.METHOD__IN_PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInProgram((Program)otherEnd, msgs);
			case GseqPackage.METHOD__CALLED_BY:
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
			case GseqPackage.METHOD__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case GseqPackage.METHOD__IN_PROGRAM:
				return basicSetInProgram(null, msgs);
			case GseqPackage.METHOD__CALLED_BY:
				return ((InternalEList<?>)getCalledBy()).basicRemove(otherEnd, msgs);
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
			case GseqPackage.METHOD__IN_PROGRAM:
				return eInternalContainer().eInverseRemove(this, GseqPackage.PROGRAM__METHODS, Program.class, msgs);
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
			case GseqPackage.METHOD__OPERATIONS:
				return getOperations();
			case GseqPackage.METHOD__NAME:
				return getName();
			case GseqPackage.METHOD__IN_PROGRAM:
				return getInProgram();
			case GseqPackage.METHOD__CALLED_BY:
				return getCalledBy();
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
			case GseqPackage.METHOD__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case GseqPackage.METHOD__NAME:
				setName((String)newValue);
				return;
			case GseqPackage.METHOD__IN_PROGRAM:
				setInProgram((Program)newValue);
				return;
			case GseqPackage.METHOD__CALLED_BY:
				getCalledBy().clear();
				getCalledBy().addAll((Collection<? extends MethodCall>)newValue);
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
			case GseqPackage.METHOD__OPERATIONS:
				getOperations().clear();
				return;
			case GseqPackage.METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GseqPackage.METHOD__IN_PROGRAM:
				setInProgram((Program)null);
				return;
			case GseqPackage.METHOD__CALLED_BY:
				getCalledBy().clear();
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
			case GseqPackage.METHOD__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case GseqPackage.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GseqPackage.METHOD__IN_PROGRAM:
				return getInProgram() != null;
			case GseqPackage.METHOD__CALLED_BY:
				return calledBy != null && !calledBy.isEmpty();
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
			case GseqPackage.METHOD___CALL:
				call();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
