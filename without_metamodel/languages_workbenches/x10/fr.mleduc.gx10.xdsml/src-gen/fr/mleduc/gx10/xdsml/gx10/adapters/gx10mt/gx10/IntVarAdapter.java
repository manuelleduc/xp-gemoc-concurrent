package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression;
import gx10.IntVar;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntVarAdapter extends EObjectAdapter<IntVar> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.IntVar {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public IntVarAdapter() {
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
  public IntExpression getIntVarExpr() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getIntVarExpr(), eResource);
  }
  
  @Override
  public void setIntVarExpr(final IntExpression o) {
    if (o != null)
    	adaptee.setIntVarExpr(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setIntVarExpr(null);
  }
  
  @Override
  public int getCurrentValue() {
    return adaptee.getCurrentValue();
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getIntVar();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__NAME:
    		return getName();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__INT_VAR_EXPR:
    		return getIntVarExpr();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__NAME:
    		return getName() != NAME_EDEFAULT;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__INT_VAR_EXPR:
    		return getIntVarExpr() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__INT_VAR_EXPR:
    		setIntVarExpr(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
