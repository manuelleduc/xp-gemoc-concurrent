package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCall;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Program;
import gx10.Method;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class MethodAdapter extends EObjectAdapter<Method> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.Method {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public MethodAdapter() {
    super(fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance());
    adaptersFactory = fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public Program getInProgram() {
    return (Program) adaptersFactory.createAdapter(adaptee.getInProgram(), eResource);
  }
  
  @Override
  public void setInProgram(final Program o) {
    if (o != null)
    	adaptee.setInProgram(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ProgramAdapter) o).getAdaptee());
    else adaptee.setInProgram(null);
  }
  
  @Override
  public Block getMethodBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getMethodBlock(), eResource);
  }
  
  @Override
  public void setMethodBlock(final Block o) {
    if (o != null)
    	adaptee.setMethodBlock(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BlockAdapter) o).getAdaptee());
    else adaptee.setMethodBlock(null);
  }
  
  private EList<MethodCall> calledBy;
  
  @Override
  public EList<MethodCall> getCalledBy() {
    if (calledBy == null)
    	calledBy = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCalledBy(), adaptersFactory);
    return calledBy;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getMethod();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD__IN_PROGRAM:
    		return getInProgram();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD__METHOD_BLOCK:
    		return getMethodBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD__NAME:
    		return getName();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD__CALLED_BY:
    		return getCalledBy();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD__IN_PROGRAM:
    		return getInProgram() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD__METHOD_BLOCK:
    		return getMethodBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD__NAME:
    		return getName() != NAME_EDEFAULT;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD__CALLED_BY:
    		return getCalledBy() != null && !getCalledBy().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD__IN_PROGRAM:
    		setInProgram(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Program)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD__METHOD_BLOCK:
    		setMethodBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD__CALLED_BY:
    		getCalledBy().clear();
    		getCalledBy().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
