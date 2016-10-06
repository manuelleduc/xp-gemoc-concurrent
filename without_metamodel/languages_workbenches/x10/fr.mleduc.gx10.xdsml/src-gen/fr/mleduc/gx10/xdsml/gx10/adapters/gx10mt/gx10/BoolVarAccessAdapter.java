package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Referentiable;
import gx10.BoolVarAccess;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BoolVarAccessAdapter extends EObjectAdapter<BoolVarAccess> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolVarAccess {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public BoolVarAccessAdapter() {
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
  public Referentiable getBoolVarRef() {
    return (Referentiable) adaptersFactory.createAdapter(adaptee.getBoolVarRef(), eResource);
  }
  
  @Override
  public void setBoolVarRef(final Referentiable o) {
    if (o != null)
    	adaptee.setBoolVarRef(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ReferentiableAdapter) o).getAdaptee());
    else adaptee.setBoolVarRef(null);
  }
  
  @Override
  public boolean getCurrentValue() {
    return adaptee.getCurrentValue();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getBoolVarAccess();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR_ACCESS__IN_BLOCK:
    		return getInBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR_ACCESS__BOOL_VAR_REF:
    		return getBoolVarRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR_ACCESS__IN_BLOCK:
    		return getInBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR_ACCESS__BOOL_VAR_REF:
    		return getBoolVarRef() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR_ACCESS__IN_BLOCK:
    		setInBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.BOOL_VAR_ACCESS__BOOL_VAR_REF:
    		setBoolVarRef(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Referentiable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
