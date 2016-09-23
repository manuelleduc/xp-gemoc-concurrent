package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Method;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Printable;
import gseq.Print;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class PrintAdapter extends EObjectAdapter<Print> implements fr.mleduc.gseq.xdsml.gseqmt.gseq.Print {
  private GSeqMTAdaptersFactory adaptersFactory;
  
  public PrintAdapter() {
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
  public Printable getToPrint() {
    return (Printable) adaptersFactory.createAdapter(adaptee.getToPrint(), eResource);
  }
  
  @Override
  public void setToPrint(final Printable o) {
    if (o != null)
    	adaptee.setToPrint(((fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.PrintableAdapter) o).getAdaptee());
    else adaptee.setToPrint(null);
  }
  
  @Override
  public void execute() {
    adaptee.execute();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.eINSTANCE.getPrint();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.PRINT__EXECUTED_BY:
    		return getExecutedBy();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.PRINT__TO_PRINT:
    		return getToPrint();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.PRINT__EXECUTED_BY:
    		return getExecutedBy() != null;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.PRINT__TO_PRINT:
    		return getToPrint() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.PRINT__EXECUTED_BY:
    		setExecutedBy(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Method)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.PRINT__TO_PRINT:
    		setToPrint(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Printable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
