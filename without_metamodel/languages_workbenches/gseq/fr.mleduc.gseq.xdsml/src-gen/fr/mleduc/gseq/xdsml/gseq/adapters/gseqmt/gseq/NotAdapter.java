package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.BooleanExpression;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Method;
import gseq.Not;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class NotAdapter extends EObjectAdapter<Not> implements fr.mleduc.gseq.xdsml.gseqmt.gseq.Not {
  private GSeqMTAdaptersFactory adaptersFactory;
  
  public NotAdapter() {
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
  public BooleanExpression getNotExpression() {
    return (BooleanExpression) adaptersFactory.createAdapter(adaptee.getNotExpression(), eResource);
  }
  
  @Override
  public void setNotExpression(final BooleanExpression o) {
    if (o != null)
    	adaptee.setNotExpression(((fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.BooleanExpressionAdapter) o).getAdaptee());
    else adaptee.setNotExpression(null);
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
    return fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.eINSTANCE.getNot();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.NOT__EXECUTED_BY:
    		return getExecutedBy();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.NOT__NOT_EXPRESSION:
    		return getNotExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.NOT__EXECUTED_BY:
    		return getExecutedBy() != null;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.NOT__NOT_EXPRESSION:
    		return getNotExpression() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.NOT__EXECUTED_BY:
    		setExecutedBy(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Method)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.NOT__NOT_EXPRESSION:
    		setNotExpression(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.BooleanExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
