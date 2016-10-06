package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCallParameter;
import gx10.IntBinaryOperation;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntBinaryOperationAdapter extends EObjectAdapter<IntBinaryOperation> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.IntBinaryOperation {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public IntBinaryOperationAdapter() {
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
  public IntExpression getLeftBinaryExpression() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getLeftBinaryExpression(), eResource);
  }
  
  @Override
  public void setLeftBinaryExpression(final IntExpression o) {
    if (o != null)
    	adaptee.setLeftBinaryExpression(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setLeftBinaryExpression(null);
  }
  
  @Override
  public IntExpression getRightBinaryExpression() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getRightBinaryExpression(), eResource);
  }
  
  @Override
  public void setRightBinaryExpression(final IntExpression o) {
    if (o != null)
    	adaptee.setRightBinaryExpression(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setRightBinaryExpression(null);
  }
  
  @Override
  public int getCurrentValue() {
    return adaptee.getCurrentValue();
  }
  
  @Override
  public void evaluate() {
    adaptee.evaluate();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getIntBinaryOperation();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_BINARY_OPERATION__IN_BLOCK:
    		return getInBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_BINARY_OPERATION__IN_METHOD_CALL_PARAMETER:
    		return getInMethodCallParameter();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION:
    		return getLeftBinaryExpression();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION:
    		return getRightBinaryExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_BINARY_OPERATION__IN_BLOCK:
    		return getInBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_BINARY_OPERATION__IN_METHOD_CALL_PARAMETER:
    		return getInMethodCallParameter() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION:
    		return getLeftBinaryExpression() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION:
    		return getRightBinaryExpression() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_BINARY_OPERATION__IN_BLOCK:
    		setInBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_BINARY_OPERATION__IN_METHOD_CALL_PARAMETER:
    		setInMethodCallParameter(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCallParameter)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION:
    		setLeftBinaryExpression(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION:
    		setRightBinaryExpression(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
