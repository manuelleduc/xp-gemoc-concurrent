/**
 */
package gseq.provider;


import gseq.GseqFactory;
import gseq.GseqPackage;
import gseq.Method;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gseq.Method} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addCalledByPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Method_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Method_name_feature", "_UI_Method_type"),
				 GseqPackage.Literals.METHOD__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Called By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCalledByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Method_calledBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Method_calledBy_feature", "_UI_Method_type"),
				 GseqPackage.Literals.METHOD__CALLED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(GseqPackage.Literals.METHOD__OPERATIONS);
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
	 * This returns Method.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Method"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Method)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Method_type") :
			getString("_UI_Method_type") + " " + label;
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

		switch (notification.getFeatureID(Method.class)) {
			case GseqPackage.METHOD__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GseqPackage.METHOD__OPERATIONS:
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
				(GseqPackage.Literals.METHOD__OPERATIONS,
				 GseqFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(GseqPackage.Literals.METHOD__OPERATIONS,
				 GseqFactory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(GseqPackage.Literals.METHOD__OPERATIONS,
				 GseqFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(GseqPackage.Literals.METHOD__OPERATIONS,
				 GseqFactory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(GseqPackage.Literals.METHOD__OPERATIONS,
				 GseqFactory.eINSTANCE.createFalse()));

		newChildDescriptors.add
			(createChildParameter
				(GseqPackage.Literals.METHOD__OPERATIONS,
				 GseqFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add
			(createChildParameter
				(GseqPackage.Literals.METHOD__OPERATIONS,
				 GseqFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(GseqPackage.Literals.METHOD__OPERATIONS,
				 GseqFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(GseqPackage.Literals.METHOD__OPERATIONS,
				 GseqFactory.eINSTANCE.createConst()));

		newChildDescriptors.add
			(createChildParameter
				(GseqPackage.Literals.METHOD__OPERATIONS,
				 GseqFactory.eINSTANCE.createVar()));

		newChildDescriptors.add
			(createChildParameter
				(GseqPackage.Literals.METHOD__OPERATIONS,
				 GseqFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(GseqPackage.Literals.METHOD__OPERATIONS,
				 GseqFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(GseqPackage.Literals.METHOD__OPERATIONS,
				 GseqFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(GseqPackage.Literals.METHOD__OPERATIONS,
				 GseqFactory.eINSTANCE.createWhile()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GseqEditPlugin.INSTANCE;
	}

}
