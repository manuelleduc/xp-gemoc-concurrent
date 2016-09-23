/**
 */
package gseq.impl;

import gseq.GseqPackage;
import gseq.Print;
import gseq.Printable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gseq.impl.PrintImpl#getToPrint <em>To Print</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrintImpl extends OperationImpl implements Print {
	/**
	 * The cached value of the '{@link #getToPrint() <em>To Print</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPrint()
	 * @generated
	 * @ordered
	 */
	protected Printable toPrint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GseqPackage.Literals.PRINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Printable getToPrint() {
		if (toPrint != null && toPrint.eIsProxy()) {
			InternalEObject oldToPrint = (InternalEObject)toPrint;
			toPrint = (Printable)eResolveProxy(oldToPrint);
			if (toPrint != oldToPrint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GseqPackage.PRINT__TO_PRINT, oldToPrint, toPrint));
			}
		}
		return toPrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Printable basicGetToPrint() {
		return toPrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToPrint(Printable newToPrint) {
		Printable oldToPrint = toPrint;
		toPrint = newToPrint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GseqPackage.PRINT__TO_PRINT, oldToPrint, toPrint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GseqPackage.PRINT__TO_PRINT:
				if (resolve) return getToPrint();
				return basicGetToPrint();
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
			case GseqPackage.PRINT__TO_PRINT:
				setToPrint((Printable)newValue);
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
			case GseqPackage.PRINT__TO_PRINT:
				setToPrint((Printable)null);
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
			case GseqPackage.PRINT__TO_PRINT:
				return toPrint != null;
		}
		return super.eIsSet(featureID);
	}

} //PrintImpl
