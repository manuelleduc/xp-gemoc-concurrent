package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCallParameter;
import gx10.IntConst;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntConstAdapter extends EObjectAdapter<IntConst> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.IntConst {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public IntConstAdapter() {
    super(fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance());
    adaptersFactory = fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final int o) {
    adaptee.setValue(o);
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
  public MethodCallParameter getInMethodCallParameter() {
    return (MethodCallParameter) adaptersFactory.createAdapter(adaptee.getInMethodCallParameter(), eResource);
  }
  
  @Override
  public void setInMethodCallParameter(final MethodCallParameter o) {
    if (o != null)
    	adaptee.setInMethodCallParameter(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.MethodCallParameterAdapter) o).getAdaptee());
    else adaptee.setInMethodCallParameter(null);
  }
  
  @Override
  public int getCurrentValue() {
    return adaptee.getCurrentValue();
  }
  
  protected final static int VALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getIntConst();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_CONST__IN_BLOCK:
    		return getInBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_CONST__IN_METHOD_CALL_PARAMETER:
    		return getInMethodCallParameter();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_CONST__VALUE:
    		return new java.lang.Integer(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_CONST__IN_BLOCK:
    		return getInBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_CONST__IN_METHOD_CALL_PARAMETER:
    		return getInMethodCallParameter() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_CONST__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_CONST__IN_BLOCK:
    		setInBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_CONST__IN_METHOD_CALL_PARAMETER:
    		setInMethodCallParameter(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCallParameter)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_CONST__VALUE:
    		setValue(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
