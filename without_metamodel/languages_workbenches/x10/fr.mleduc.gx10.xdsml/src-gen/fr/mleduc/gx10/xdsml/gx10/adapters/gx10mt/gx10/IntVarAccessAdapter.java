package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.IntVar;
import gx10.IntVarAccess;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntVarAccessAdapter extends EObjectAdapter<IntVarAccess> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.IntVarAccess {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public IntVarAccessAdapter() {
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
  public IntVar getIntVarRef() {
    return (IntVar) adaptersFactory.createAdapter(adaptee.getIntVarRef(), eResource);
  }
  
  @Override
  public void setIntVarRef(final IntVar o) {
    if (o != null)
    	adaptee.setIntVarRef(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntVarAdapter) o).getAdaptee());
    else adaptee.setIntVarRef(null);
  }
  
  @Override
  public int getCurrentValue() {
    return adaptee.getCurrentValue();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getIntVarAccess();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR_ACCESS__IN_BLOCK:
    		return getInBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR_ACCESS__INT_VAR_REF:
    		return getIntVarRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR_ACCESS__IN_BLOCK:
    		return getInBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR_ACCESS__INT_VAR_REF:
    		return getIntVarRef() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR_ACCESS__IN_BLOCK:
    		setInBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.INT_VAR_ACCESS__INT_VAR_REF:
    		setIntVarRef(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.IntVar)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
