package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Method;
import gx10.MethodCall;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class MethodCallAdapter extends EObjectAdapter<MethodCall> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCall {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public MethodCallAdapter() {
    super(fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance());
    adaptersFactory = fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance();
  }
  
  @Override
  public Block getInBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getInBlock(), eResource);
  }
  
  @Override
  public void setInBlock(final Block o) {
    if (o != null)
    	adaptee.setInBlock(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BlockAdapter) o).getAdaptee());
    else adaptee.setInBlock(null);
  }
  
  @Override
  public Method getMethodToCall() {
    return (Method) adaptersFactory.createAdapter(adaptee.getMethodToCall(), eResource);
  }
  
  @Override
  public void setMethodToCall(final Method o) {
    if (o != null)
    	adaptee.setMethodToCall(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.MethodAdapter) o).getAdaptee());
    else adaptee.setMethodToCall(null);
  }
  
  @Override
  public void call() {
    adaptee.call();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getMethodCall();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL__METHOD_TO_CALL:
    		return getMethodToCall();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL__METHOD_TO_CALL:
    		return getMethodToCall() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL__METHOD_TO_CALL:
    		setMethodToCall(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Method)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
