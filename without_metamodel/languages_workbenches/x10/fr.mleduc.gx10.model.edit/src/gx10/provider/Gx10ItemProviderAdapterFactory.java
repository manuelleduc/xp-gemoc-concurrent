/**
 */
package gx10.provider;

import gx10.util.Gx10AdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Gx10ItemProviderAdapterFactory extends Gx10AdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gx10ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.Program} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramItemProvider programItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProgramAdapter() {
		if (programItemProvider == null) {
			programItemProvider = new ProgramItemProvider(this);
		}

		return programItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.Method} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodItemProvider methodItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodAdapter() {
		if (methodItemProvider == null) {
			methodItemProvider = new MethodItemProvider(this);
		}

		return methodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.Block} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockItemProvider blockItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBlockAdapter() {
		if (blockItemProvider == null) {
			blockItemProvider = new BlockItemProvider(this);
		}

		return blockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.If} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfItemProvider ifItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.If}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfAdapter() {
		if (ifItemProvider == null) {
			ifItemProvider = new IfItemProvider(this);
		}

		return ifItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.While} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileItemProvider whileItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.While}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhileAdapter() {
		if (whileItemProvider == null) {
			whileItemProvider = new WhileItemProvider(this);
		}

		return whileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.True} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrueItemProvider trueItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.True}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrueAdapter() {
		if (trueItemProvider == null) {
			trueItemProvider = new TrueItemProvider(this);
		}

		return trueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.False} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FalseItemProvider falseItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.False}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFalseAdapter() {
		if (falseItemProvider == null) {
			falseItemProvider = new FalseItemProvider(this);
		}

		return falseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.Not} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotItemProvider notItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.Not}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotAdapter() {
		if (notItemProvider == null) {
			notItemProvider = new NotItemProvider(this);
		}

		return notItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.And} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndItemProvider andItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.And}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndAdapter() {
		if (andItemProvider == null) {
			andItemProvider = new AndItemProvider(this);
		}

		return andItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.IntConst} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntConstItemProvider intConstItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.IntConst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntConstAdapter() {
		if (intConstItemProvider == null) {
			intConstItemProvider = new IntConstItemProvider(this);
		}

		return intConstItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.Plus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlusItemProvider plusItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.Plus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlusAdapter() {
		if (plusItemProvider == null) {
			plusItemProvider = new PlusItemProvider(this);
		}

		return plusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.Time} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeItemProvider timeItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.Time}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeAdapter() {
		if (timeItemProvider == null) {
			timeItemProvider = new TimeItemProvider(this);
		}

		return timeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.Async} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsyncItemProvider asyncItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.Async}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAsyncAdapter() {
		if (asyncItemProvider == null) {
			asyncItemProvider = new AsyncItemProvider(this);
		}

		return asyncItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.MethodCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCallItemProvider methodCallItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.MethodCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodCallAdapter() {
		if (methodCallItemProvider == null) {
			methodCallItemProvider = new MethodCallItemProvider(this);
		}

		return methodCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.Finish} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinishItemProvider finishItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.Finish}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFinishAdapter() {
		if (finishItemProvider == null) {
			finishItemProvider = new FinishItemProvider(this);
		}

		return finishItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.Print} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrintItemProvider printItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.Print}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrintAdapter() {
		if (printItemProvider == null) {
			printItemProvider = new PrintItemProvider(this);
		}

		return printItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.BoolVar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolVarItemProvider boolVarItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.BoolVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoolVarAdapter() {
		if (boolVarItemProvider == null) {
			boolVarItemProvider = new BoolVarItemProvider(this);
		}

		return boolVarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.IntVar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntVarItemProvider intVarItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.IntVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntVarAdapter() {
		if (intVarItemProvider == null) {
			intVarItemProvider = new IntVarItemProvider(this);
		}

		return intVarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.IntVarAccess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntVarAccessItemProvider intVarAccessItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.IntVarAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntVarAccessAdapter() {
		if (intVarAccessItemProvider == null) {
			intVarAccessItemProvider = new IntVarAccessItemProvider(this);
		}

		return intVarAccessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.BoolVarAccess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolVarAccessItemProvider boolVarAccessItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.BoolVarAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoolVarAccessAdapter() {
		if (boolVarAccessItemProvider == null) {
			boolVarAccessItemProvider = new BoolVarAccessItemProvider(this);
		}

		return boolVarAccessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.Equal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualItemProvider equalItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.Equal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEqualAdapter() {
		if (equalItemProvider == null) {
			equalItemProvider = new EqualItemProvider(this);
		}

		return equalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.MethodCallParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCallParameterItemProvider methodCallParameterItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.MethodCallParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodCallParameterAdapter() {
		if (methodCallParameterItemProvider == null) {
			methodCallParameterItemProvider = new MethodCallParameterItemProvider(this);
		}

		return methodCallParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gx10.Referentiable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferentiableItemProvider referentiableItemProvider;

	/**
	 * This creates an adapter for a {@link gx10.Referentiable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferentiableAdapter() {
		if (referentiableItemProvider == null) {
			referentiableItemProvider = new ReferentiableItemProvider(this);
		}

		return referentiableItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (programItemProvider != null) programItemProvider.dispose();
		if (methodItemProvider != null) methodItemProvider.dispose();
		if (blockItemProvider != null) blockItemProvider.dispose();
		if (ifItemProvider != null) ifItemProvider.dispose();
		if (whileItemProvider != null) whileItemProvider.dispose();
		if (trueItemProvider != null) trueItemProvider.dispose();
		if (falseItemProvider != null) falseItemProvider.dispose();
		if (notItemProvider != null) notItemProvider.dispose();
		if (andItemProvider != null) andItemProvider.dispose();
		if (intConstItemProvider != null) intConstItemProvider.dispose();
		if (asyncItemProvider != null) asyncItemProvider.dispose();
		if (methodCallItemProvider != null) methodCallItemProvider.dispose();
		if (finishItemProvider != null) finishItemProvider.dispose();
		if (printItemProvider != null) printItemProvider.dispose();
		if (boolVarItemProvider != null) boolVarItemProvider.dispose();
		if (intVarItemProvider != null) intVarItemProvider.dispose();
		if (intVarAccessItemProvider != null) intVarAccessItemProvider.dispose();
		if (boolVarAccessItemProvider != null) boolVarAccessItemProvider.dispose();
		if (equalItemProvider != null) equalItemProvider.dispose();
		if (methodCallParameterItemProvider != null) methodCallParameterItemProvider.dispose();
		if (referentiableItemProvider != null) referentiableItemProvider.dispose();
		if (plusItemProvider != null) plusItemProvider.dispose();
		if (timeItemProvider != null) timeItemProvider.dispose();
	}

}
