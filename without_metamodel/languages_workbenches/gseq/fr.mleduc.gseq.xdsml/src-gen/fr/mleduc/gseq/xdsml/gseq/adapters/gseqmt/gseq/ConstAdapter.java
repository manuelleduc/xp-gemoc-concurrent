package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Method;
import gseq.Const;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ConstAdapter extends EObjectAdapter<Const> implements fr.mleduc.gseq.xdsml.gseqmt.gseq.Const {
  private GSeqMTAdaptersFactory adaptersFactory;
  
  public ConstAdapter() {
    super(fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory.getInstance());
    adaptersFactory = fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory.getInstance();
  }
  
  @Override
  public long getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final long o) {
    adaptee.setValue(o);
  }
  
  @Override
  public Method getExecutedBy() {
    return (Method) adaptersFactory.createAdapter(adaptee.getExecutedBy(), eResource);
  }
  
  @Override
  public void setExecutedBy(final Method o) {
    if (o != null)
    	adaptee.setExecutedBy(((fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.MethodAdapter) o).getAdaptee());
    else adaptee.setExecutedBy(null);
  }
  
  @Override
  public void execute() {
    adaptee.execute();
  }
  
  @Override
  public String pretty() {
    return adaptee.pretty();
  }
  
  protected final static long VALUE_EDEFAULT = 0L;
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.eINSTANCE.getConst();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.CONST__EXECUTED_BY:
    		return getExecutedBy();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.CONST__VALUE:
    		return new java.lang.Long(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.CONST__EXECUTED_BY:
    		return getExecutedBy() != null;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.CONST__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.CONST__EXECUTED_BY:
    		setExecutedBy(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Method)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.CONST__VALUE:
    		setValue(((java.lang.Long) newValue).longValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
