/**
 */
package gx10.provider;


import gx10.Gx10Factory;
import gx10.Gx10Package;
import gx10.Print;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gx10.Print} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrintItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Gx10Package.Literals.PRINT__TO_PRINT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Print.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Print"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Print_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Print.class)) {
			case Gx10Package.PRINT__TO_PRINT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Gx10Package.Literals.PRINT__TO_PRINT,
				 Gx10Factory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(Gx10Package.Literals.PRINT__TO_PRINT,
				 Gx10Factory.eINSTANCE.createFalse()));

		newChildDescriptors.add
			(createChildParameter
				(Gx10Package.Literals.PRINT__TO_PRINT,
				 Gx10Factory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(Gx10Package.Literals.PRINT__TO_PRINT,
				 Gx10Factory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(Gx10Package.Literals.PRINT__TO_PRINT,
				 Gx10Factory.eINSTANCE.createIntConst()));

		newChildDescriptors.add
			(createChildParameter
				(Gx10Package.Literals.PRINT__TO_PRINT,
				 Gx10Factory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(Gx10Package.Literals.PRINT__TO_PRINT,
				 Gx10Factory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(Gx10Package.Literals.PRINT__TO_PRINT,
				 Gx10Factory.eINSTANCE.createBoolVar()));

		newChildDescriptors.add
			(createChildParameter
				(Gx10Package.Literals.PRINT__TO_PRINT,
				 Gx10Factory.eINSTANCE.createIntVarAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Gx10Package.Literals.PRINT__TO_PRINT,
				 Gx10Factory.eINSTANCE.createBoolVarAccess()));
	}

}
