package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression;
import gx10.Plus;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class PlusAdapter extends EObjectAdapter<Plus> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.Plus {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public PlusAdapter() {
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
  public IntExpression getLeftPlus() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getLeftPlus(), eResource);
  }
  
  @Override
  public void setLeftPlus(final IntExpression o) {
    if (o != null)
    	adaptee.setLeftPlus(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setLeftPlus(null);
  }
  
  @Override
  public IntExpression getRightPlus() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getRightPlus(), eResource);
  }
  
  @Override
  public void setRightPlus(final IntExpression o) {
    if (o != null)
    	adaptee.setRightPlus(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setRightPlus(null);
  }
  
  @Override
  public int getCurrentValue() {
    return adaptee.getCurrentValue();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getPlus();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PLUS__LEFT_PLUS:
    		return getLeftPlus();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PLUS__RIGHT_PLUS:
    		return getRightPlus();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PLUS__LEFT_PLUS:
    		return getLeftPlus() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PLUS__RIGHT_PLUS:
    		return getRightPlus() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PLUS__LEFT_PLUS:
    		setLeftPlus(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PLUS__RIGHT_PLUS:
    		setRightPlus(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
