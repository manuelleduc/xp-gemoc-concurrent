package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Statement;
import gx10.Block;
import gx10.aspects.Context;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BlockAdapter extends EObjectAdapter<Block> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.Block {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public BlockAdapter() {
    super(fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance());
    adaptersFactory = fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance();
  }
  
  @Override
  public fr.mleduc.gx10.xdsml.gx10mt.gx10.Block getInBlock() {
    return (fr.mleduc.gx10.xdsml.gx10mt.gx10.Block) adaptersFactory.createAdapter(adaptee.getInBlock(), eResource);
  }
  
  @Override
  public void setInBlock(final fr.mleduc.gx10.xdsml.gx10mt.gx10.Block o) {
    if (o != null)
    	adaptee.setInBlock(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BlockAdapter) o).getAdaptee());
    else adaptee.setInBlock(null);
  }
  
  private EList<Statement> blockStatements;
  
  @Override
  public EList<Statement> getBlockStatements() {
    if (blockStatements == null)
    	blockStatements = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getBlockStatements(), adaptersFactory);
    return blockStatements;
  }
  
  @Override
  public Context context() {
    return gx10.aspects.BlockAspect.context(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BLOCK__IN_BLOCK:
    		return getInBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BLOCK__BLOCK_STATEMENTS:
    		return getBlockStatements();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BLOCK__IN_BLOCK:
    		return getInBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BLOCK__BLOCK_STATEMENTS:
    		return getBlockStatements() != null && !getBlockStatements().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BLOCK__IN_BLOCK:
    		setInBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BLOCK__BLOCK_STATEMENTS:
    		getBlockStatements().clear();
    		getBlockStatements().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
