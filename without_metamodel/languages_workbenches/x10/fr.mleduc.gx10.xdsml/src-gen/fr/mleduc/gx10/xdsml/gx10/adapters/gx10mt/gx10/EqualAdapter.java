package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression;
import gx10.Equal;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class EqualAdapter extends EObjectAdapter<Equal> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.Equal {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public EqualAdapter() {
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
  public IntExpression getLeftEqual() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getLeftEqual(), eResource);
  }
  
  @Override
  public void setLeftEqual(final IntExpression o) {
    if (o != null)
    	adaptee.setLeftEqual(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setLeftEqual(null);
  }
  
  @Override
  public IntExpression getRightEqual() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getRightEqual(), eResource);
  }
  
  @Override
  public void setRightEqual(final IntExpression o) {
    if (o != null)
    	adaptee.setRightEqual(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setRightEqual(null);
  }
  
  @Override
  public boolean getCurrentValue() {
    return adaptee.getCurrentValue();
  }
  
  @Override
  public void evaluate() {
    adaptee.evaluate();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getEqual();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.EQUAL__IN_BLOCK:
    		return getInBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.EQUAL__LEFT_EQUAL:
    		return getLeftEqual();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.EQUAL__RIGHT_EQUAL:
    		return getRightEqual();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.EQUAL__IN_BLOCK:
    		return getInBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.EQUAL__LEFT_EQUAL:
    		return getLeftEqual() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.EQUAL__RIGHT_EQUAL:
    		return getRightEqual() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.EQUAL__IN_BLOCK:
    		setInBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.EQUAL__LEFT_EQUAL:
    		setLeftEqual(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.EQUAL__RIGHT_EQUAL:
    		setRightEqual(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
