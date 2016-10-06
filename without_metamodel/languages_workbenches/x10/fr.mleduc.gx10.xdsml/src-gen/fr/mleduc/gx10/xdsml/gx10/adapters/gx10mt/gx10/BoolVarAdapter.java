package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolExpression;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Referentiable;
import gx10.BoolVar;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BoolVarAdapter extends EObjectAdapter<BoolVar> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolVar {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public BoolVarAdapter() {
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
  public BoolExpression getBoolVarExpr() {
    return (BoolExpression) adaptersFactory.createAdapter(adaptee.getBoolVarExpr(), eResource);
  }
  
  @Override
  public void setBoolVarExpr(final BoolExpression o) {
    if (o != null)
    	adaptee.setBoolVarExpr(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolExpressionAdapter) o).getAdaptee());
    else adaptee.setBoolVarExpr(null);
  }
  
  @Override
  public Referentiable getBoolVarName() {
    return (Referentiable) adaptersFactory.createAdapter(adaptee.getBoolVarName(), eResource);
  }
  
  @Override
  public void setBoolVarName(final Referentiable o) {
    if (o != null)
    	adaptee.setBoolVarName(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ReferentiableAdapter) o).getAdaptee());
    else adaptee.setBoolVarName(null);
  }
  
  @Override
  public void evaluate() {
    adaptee.evaluate();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getBoolVar();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR__IN_BLOCK:
    		return getInBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR__BOOL_VAR_EXPR:
    		return getBoolVarExpr();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR__BOOL_VAR_NAME:
    		return getBoolVarName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR__IN_BLOCK:
    		return getInBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR__BOOL_VAR_EXPR:
    		return getBoolVarExpr() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR__BOOL_VAR_NAME:
    		return getBoolVarName() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR__IN_BLOCK:
    		setInBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR__BOOL_VAR_EXPR:
    		setBoolVarExpr(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolExpression)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR__BOOL_VAR_NAME:
    		setBoolVarName(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Referentiable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
