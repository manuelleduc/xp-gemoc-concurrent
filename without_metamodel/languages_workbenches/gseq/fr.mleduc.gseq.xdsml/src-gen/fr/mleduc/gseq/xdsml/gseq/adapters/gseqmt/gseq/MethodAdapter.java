package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.MethodCall;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Operation;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Program;
import gseq.Method;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class MethodAdapter extends EObjectAdapter<Method> implements fr.mleduc.gseq.xdsml.gseqmt.gseq.Method {
  private GSeqMTAdaptersFactory adaptersFactory;
  
  public MethodAdapter() {
    super(fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory.getInstance());
    adaptersFactory = fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<Operation> operations;
  
  @Override
  public EList<Operation> getOperations() {
    if (operations == null)
    	operations = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOperations(), adaptersFactory);
    return operations;
  }
  
  @Override
  public Program getInProgram() {
    return (Program) adaptersFactory.createAdapter(adaptee.getInProgram(), eResource);
  }
  
  @Override
  public void setInProgram(final Program o) {
    if (o != null)
    	adaptee.setInProgram(((fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.ProgramAdapter) o).getAdaptee());
    else adaptee.setInProgram(null);
  }
  
  private EList<MethodCall> calledBy;
  
  @Override
  public EList<MethodCall> getCalledBy() {
    if (calledBy == null)
    	calledBy = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCalledBy(), adaptersFactory);
    return calledBy;
  }
  
  @Override
  public void call() {
    adaptee.call();
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.eINSTANCE.getMethod();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD__OPERATIONS:
    		return getOperations();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD__NAME:
    		return getName();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD__IN_PROGRAM:
    		return getInProgram();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD__CALLED_BY:
    		return getCalledBy();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD__OPERATIONS:
    		return getOperations() != null && !getOperations().isEmpty();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD__NAME:
    		return getName() != NAME_EDEFAULT;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD__IN_PROGRAM:
    		return getInProgram() != null;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD__CALLED_BY:
    		return getCalledBy() != null && !getCalledBy().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD__OPERATIONS:
    		getOperations().clear();
    		getOperations().addAll((Collection) newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD__IN_PROGRAM:
    		setInProgram(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Program)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.METHOD__CALLED_BY:
    		getCalledBy().clear();
    		getCalledBy().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
