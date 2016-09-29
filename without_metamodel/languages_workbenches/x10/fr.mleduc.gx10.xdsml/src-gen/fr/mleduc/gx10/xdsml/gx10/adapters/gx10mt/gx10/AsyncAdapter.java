package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Statement;
import gx10.Async;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class AsyncAdapter extends EObjectAdapter<Async> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.Async {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public AsyncAdapter() {
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
  public Statement getAsyncBlock() {
    return (Statement) adaptersFactory.createAdapter(adaptee.getAsyncBlock(), eResource);
  }
  
  @Override
  public void setAsyncBlock(final Statement o) {
    if (o != null)
    	adaptee.setAsyncBlock(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.StatementAdapter) o).getAdaptee());
    else adaptee.setAsyncBlock(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getAsync();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.ASYNC__ASYNC_BLOCK:
    		return getAsyncBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.ASYNC__ASYNC_BLOCK:
    		return getAsyncBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.ASYNC__ASYNC_BLOCK:
    		setAsyncBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Statement)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
