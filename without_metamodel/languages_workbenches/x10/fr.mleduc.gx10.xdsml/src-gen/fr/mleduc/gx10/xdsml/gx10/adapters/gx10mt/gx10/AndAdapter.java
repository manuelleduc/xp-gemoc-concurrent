package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolExpression;
import gx10.And;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class AndAdapter extends EObjectAdapter<And> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.And {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public AndAdapter() {
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
  public BoolExpression getLeftAndExpression() {
    return (BoolExpression) adaptersFactory.createAdapter(adaptee.getLeftAndExpression(), eResource);
  }
  
  @Override
  public void setLeftAndExpression(final BoolExpression o) {
    if (o != null)
    	adaptee.setLeftAndExpression(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolExpressionAdapter) o).getAdaptee());
    else adaptee.setLeftAndExpression(null);
  }
  
  @Override
  public BoolExpression getRightAndExpression() {
    return (BoolExpression) adaptersFactory.createAdapter(adaptee.getRightAndExpression(), eResource);
  }
  
  @Override
  public void setRightAndExpression(final BoolExpression o) {
    if (o != null)
    	adaptee.setRightAndExpression(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolExpressionAdapter) o).getAdaptee());
    else adaptee.setRightAndExpression(null);
  }
  
  @Override
  public boolean getCurrentValue() {
    return adaptee.getCurrentValue();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getAnd();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.AND__IN_BLOCK:
    		return getInBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.AND__LEFT_AND_EXPRESSION:
    		return getLeftAndExpression();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.AND__RIGHT_AND_EXPRESSION:
    		return getRightAndExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.AND__IN_BLOCK:
    		return getInBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.AND__LEFT_AND_EXPRESSION:
    		return getLeftAndExpression() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.AND__RIGHT_AND_EXPRESSION:
    		return getRightAndExpression() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.AND__IN_BLOCK:
    		setInBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.AND__LEFT_AND_EXPRESSION:
    		setLeftAndExpression(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolExpression)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.AND__RIGHT_AND_EXPRESSION:
    		setRightAndExpression(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
