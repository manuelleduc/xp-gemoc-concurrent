package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCallParameter;
import gx10.IntExpression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntExpressionAdapter extends EObjectAdapter<IntExpression> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public IntExpressionAdapter() {
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
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getIntExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_EXPRESSION__IN_BLOCK:
    		return getInBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER:
    		return getInMethodCallParameter();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_EXPRESSION__IN_BLOCK:
    		return getInBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER:
    		return getInMethodCallParameter() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_EXPRESSION__IN_BLOCK:
    		setInBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_EXPRESSION__IN_METHOD_CALL_PARAMETER:
    		setInMethodCallParameter(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCallParameter)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
