package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Method;
import gseq.True;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TrueAdapter extends EObjectAdapter<True> implements fr.mleduc.gseq.xdsml.gseqmt.gseq.True {
  private GSeqMTAdaptersFactory adaptersFactory;
  
  public TrueAdapter() {
    super(fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory.getInstance());
    adaptersFactory = fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory.getInstance();
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
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.eINSTANCE.getTrue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.TRUE__EXECUTED_BY:
    		return getExecutedBy();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.TRUE__EXECUTED_BY:
    		return getExecutedBy() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.TRUE__EXECUTED_BY:
    		setExecutedBy(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Method)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
