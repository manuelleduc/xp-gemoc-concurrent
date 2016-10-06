package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Statement;
import gx10.Finish;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FinishAdapter extends EObjectAdapter<Finish> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.Finish {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public FinishAdapter() {
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
  public Statement getFinishStatement() {
    return (Statement) adaptersFactory.createAdapter(adaptee.getFinishStatement(), eResource);
  }
  
  @Override
  public void setFinishStatement(final Statement o) {
    if (o != null)
    	adaptee.setFinishStatement(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.StatementAdapter) o).getAdaptee());
    else adaptee.setFinishStatement(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getFinish();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.FINISH__IN_BLOCK:
    		return getInBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.FINISH__FINISH_STATEMENT:
    		return getFinishStatement();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.FINISH__IN_BLOCK:
    		return getInBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.FINISH__FINISH_STATEMENT:
    		return getFinishStatement() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.FINISH__IN_BLOCK:
    		setInBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.FINISH__FINISH_STATEMENT:
    		setFinishStatement(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Statement)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
