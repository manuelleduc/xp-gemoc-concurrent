package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Method;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCallParameter;
import gx10.MethodCall;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
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
  
  private EList<MethodCallParameter> methodCallParameters;
  
  @Override
  public EList<MethodCallParameter> getMethodCallParameters() {
    if (methodCallParameters == null)
    	methodCallParameters = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMethodCallParameters(), adaptersFactory);
    return methodCallParameters;
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
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL__IN_BLOCK:
    		return getInBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL__METHOD_TO_CALL:
    		return getMethodToCall();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL__METHOD_CALL_PARAMETERS:
    		return getMethodCallParameters();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL__IN_BLOCK:
    		return getInBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL__METHOD_TO_CALL:
    		return getMethodToCall() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL__METHOD_CALL_PARAMETERS:
    		return getMethodCallParameters() != null && !getMethodCallParameters().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL__IN_BLOCK:
    		setInBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL__METHOD_TO_CALL:
    		setMethodToCall(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Method)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL__METHOD_CALL_PARAMETERS:
    		getMethodCallParameters().clear();
    		getMethodCallParameters().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
