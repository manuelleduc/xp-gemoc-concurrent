package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Method;
import gseq.Program;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ProgramAdapter extends EObjectAdapter<Program> implements fr.mleduc.gseq.xdsml.gseqmt.gseq.Program {
  private GSeqMTAdaptersFactory adaptersFactory;
  
  public ProgramAdapter() {
    super(fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory.getInstance());
    adaptersFactory = fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory.getInstance();
  }
  
  private EList<Method> methods;
  
  @Override
  public EList<Method> getMethods() {
    if (methods == null)
    	methods = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMethods(), adaptersFactory);
    return methods;
  }
  
  @Override
  public Method getStartMethod() {
    return (Method) adaptersFactory.createAdapter(adaptee.getStartMethod(), eResource);
  }
  
  @Override
  public void setStartMethod(final Method o) {
    if (o != null)
    	adaptee.setStartMethod(((fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.MethodAdapter) o).getAdaptee());
    else adaptee.setStartMethod(null);
  }
  
  @Override
  public void init() {
    adaptee.init();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.eINSTANCE.getProgram();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.PROGRAM__METHODS:
    		return getMethods();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.PROGRAM__START_METHOD:
    		return getStartMethod();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.PROGRAM__METHODS:
    		return getMethods() != null && !getMethods().isEmpty();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.PROGRAM__START_METHOD:
    		return getStartMethod() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.PROGRAM__METHODS:
    		getMethods().clear();
    		getMethods().addAll((Collection) newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.PROGRAM__START_METHOD:
    		setStartMethod(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Method)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
