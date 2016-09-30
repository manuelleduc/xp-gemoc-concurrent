package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Method;
import gx10.Program;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ProgramAdapter extends EObjectAdapter<Program> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.Program {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public ProgramAdapter() {
    super(fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance());
    adaptersFactory = fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance();
  }
  
  private EList<Method> methods;
  
  @Override
  public EList<Method> getMethods() {
    if (methods == null)
    	methods = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMethods(), adaptersFactory);
    return methods;
  }
  
  @Override
  public Method getStartMethod() {
    return (Method) adaptersFactory.createAdapter(adaptee.getStartMethod(), eResource);
  }
  
  @Override
  public void setStartMethod(final Method o) {
    if (o != null)
    	adaptee.setStartMethod(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.MethodAdapter) o).getAdaptee());
    else adaptee.setStartMethod(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getProgram();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PROGRAM__METHODS:
    		return getMethods();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PROGRAM__START_METHOD:
    		return getStartMethod();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PROGRAM__METHODS:
    		return getMethods() != null && !getMethods().isEmpty();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PROGRAM__START_METHOD:
    		return getStartMethod() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PROGRAM__METHODS:
    		getMethods().clear();
    		getMethods().addAll((Collection) newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PROGRAM__START_METHOD:
    		setStartMethod(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Method)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
