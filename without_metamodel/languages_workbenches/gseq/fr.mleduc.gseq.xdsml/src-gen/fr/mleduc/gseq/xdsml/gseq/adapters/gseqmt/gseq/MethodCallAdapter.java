package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Method;
import gseq.MethodCall;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class MethodCallAdapter extends EObjectAdapter<MethodCall> implements fr.mleduc.gseq.xdsml.gseqmt.gseq.MethodCall {
  private GSeqMTAdaptersFactory adaptersFactory;
  
  public MethodCallAdapter() {
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
  public Method getMethodToCall() {
    return (Method) adaptersFactory.createAdapter(adaptee.getMethodToCall(), eResource);
  }
  
  @Override
  public void setMethodToCall(final Method o) {
    if (o != null)
    	adaptee.setMethodToCall(((fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.MethodAdapter) o).getAdaptee());
    else adaptee.setMethodToCall(null);
  }
  
  @Override
  public void execute() {
    adaptee.execute();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.eINSTANCE.getMethodCall();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD_CALL__EXECUTED_BY:
    		return getExecutedBy();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD_CALL__METHOD_TO_CALL:
    		return getMethodToCall();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD_CALL__EXECUTED_BY:
    		return getExecutedBy() != null;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD_CALL__METHOD_TO_CALL:
    		return getMethodToCall() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD_CALL__EXECUTED_BY:
    		setExecutedBy(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Method)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD_CALL__METHOD_TO_CALL:
    		setMethodToCall(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Method)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
