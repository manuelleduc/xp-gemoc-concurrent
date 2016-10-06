package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolExpression;
import gx10.While;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class WhileAdapter extends EObjectAdapter<While> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.While {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public WhileAdapter() {
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
  public BoolExpression getControlStructureCondition() {
    return (BoolExpression) adaptersFactory.createAdapter(adaptee.getControlStructureCondition(), eResource);
  }
  
  @Override
  public void setControlStructureCondition(final BoolExpression o) {
    if (o != null)
    	adaptee.setControlStructureCondition(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BoolExpressionAdapter) o).getAdaptee());
    else adaptee.setControlStructureCondition(null);
  }
  
  @Override
  public Block getWhileBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getWhileBlock(), eResource);
  }
  
  @Override
  public void setWhileBlock(final Block o) {
    if (o != null)
    	adaptee.setWhileBlock(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BlockAdapter) o).getAdaptee());
    else adaptee.setWhileBlock(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getWhile();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.WHILE__IN_BLOCK:
    		return getInBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.WHILE__CONTROL_STRUCTURE_CONDITION:
    		return getControlStructureCondition();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.WHILE__WHILE_BLOCK:
    		return getWhileBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.WHILE__IN_BLOCK:
    		return getInBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.WHILE__CONTROL_STRUCTURE_CONDITION:
    		return getControlStructureCondition() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.WHILE__WHILE_BLOCK:
    		return getWhileBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.WHILE__IN_BLOCK:
    		setInBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.WHILE__CONTROL_STRUCTURE_CONDITION:
    		setControlStructureCondition(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolExpression)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.WHILE__WHILE_BLOCK:
    		setWhileBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
