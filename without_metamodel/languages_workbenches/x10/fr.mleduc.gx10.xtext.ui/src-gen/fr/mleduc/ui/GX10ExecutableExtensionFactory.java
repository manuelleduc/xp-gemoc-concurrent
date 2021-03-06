/*
 * generated by Xtext 2.9.2
 */
package fr.mleduc.ui;

import com.google.inject.Injector;
import fr.mleduc.gx10.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GX10ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XtextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return XtextActivator.getInstance().getInjector(XtextActivator.FR_MLEDUC_GX10);
	}
	
}
