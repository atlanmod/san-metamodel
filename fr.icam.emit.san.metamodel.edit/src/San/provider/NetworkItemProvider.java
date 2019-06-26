/**
 */
package San.provider;


import San.Network;
import San.SanFactory;
import San.SanPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link San.Network} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkItemProvider(AdapterFactory adapterFactory) {
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

			addUriPropertyDescriptor(object);
			addPortPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Network_uri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Network_uri_feature", "_UI_Network_type"),
				 SanPackage.Literals.NETWORK__URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Network_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Network_port_feature", "_UI_Network_type"),
				 SanPackage.Literals.NETWORK__PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(SanPackage.Literals.NETWORK__PROCESSES);
			childrenFeatures.add(SanPackage.Literals.NETWORK__DEVICES);
			childrenFeatures.add(SanPackage.Literals.NETWORK__INSTRUMENTS);
			childrenFeatures.add(SanPackage.Literals.NETWORK__MEASURANDS);
			childrenFeatures.add(SanPackage.Literals.NETWORK__MEASURES);
			childrenFeatures.add(SanPackage.Literals.NETWORK__BINDINGS);
			childrenFeatures.add(SanPackage.Literals.NETWORK__TRIGGERS);
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
	 * This returns Network.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Network"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Network)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Network_type") :
			getString("_UI_Network_type") + " " + label;
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

		switch (notification.getFeatureID(Network.class)) {
			case SanPackage.NETWORK__URI:
			case SanPackage.NETWORK__PORT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SanPackage.NETWORK__PROCESSES:
			case SanPackage.NETWORK__DEVICES:
			case SanPackage.NETWORK__INSTRUMENTS:
			case SanPackage.NETWORK__MEASURANDS:
			case SanPackage.NETWORK__MEASURES:
			case SanPackage.NETWORK__BINDINGS:
			case SanPackage.NETWORK__TRIGGERS:
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
				(SanPackage.Literals.NETWORK__PROCESSES,
				 SanFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(SanPackage.Literals.NETWORK__DEVICES,
				 SanFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(SanPackage.Literals.NETWORK__INSTRUMENTS,
				 SanFactory.eINSTANCE.createInstrument()));

		newChildDescriptors.add
			(createChildParameter
				(SanPackage.Literals.NETWORK__MEASURANDS,
				 SanFactory.eINSTANCE.createMeasurand()));

		newChildDescriptors.add
			(createChildParameter
				(SanPackage.Literals.NETWORK__MEASURES,
				 SanFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SanPackage.Literals.NETWORK__BINDINGS,
				 SanFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(SanPackage.Literals.NETWORK__TRIGGERS,
				 SanFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SanPackage.Literals.NETWORK__TRIGGERS,
				 SanFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(SanPackage.Literals.NETWORK__TRIGGERS,
				 SanFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(SanPackage.Literals.NETWORK__TRIGGERS,
				 SanFactory.eINSTANCE.createThing()));
	}

}
