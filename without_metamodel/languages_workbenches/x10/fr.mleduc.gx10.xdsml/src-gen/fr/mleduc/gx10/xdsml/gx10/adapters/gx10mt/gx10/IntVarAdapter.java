package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Referentiable;
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
  public Referentiable getIntVarName() {
    return (Referentiable) adaptersFactory.createAdapter(adaptee.getIntVarName(), eResource);
  }
  
  @Override
  public void setIntVarName(final Referentiable o) {
    if (o != null)
    	adaptee.setIntVarName(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ReferentiableAdapter) o).getAdaptee());
    else adaptee.setIntVarName(null);
  }
  
  @Override
  public void evaluate() {
    adaptee.evaluate();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getIntVar();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__IN_BLOCK:
    		return getInBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__INT_VAR_EXPR:
    		return getIntVarExpr();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__INT_VAR_NAME:
    		return getIntVarName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__IN_BLOCK:
    		return getInBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__INT_VAR_EXPR:
    		return getIntVarExpr() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__INT_VAR_NAME:
    		return getIntVarName() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__IN_BLOCK:
    		setInBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__INT_VAR_EXPR:
    		setIntVarExpr(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR__INT_VAR_NAME:
    		setIntVarName(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Referentiable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
