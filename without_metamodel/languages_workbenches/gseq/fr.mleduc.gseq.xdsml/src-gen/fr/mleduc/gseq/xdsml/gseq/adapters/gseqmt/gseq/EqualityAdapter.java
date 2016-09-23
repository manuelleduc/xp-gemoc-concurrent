package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.IntegerExpression;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Method;
import gseq.Equality;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class EqualityAdapter extends EObjectAdapter<Equality> implements fr.mleduc.gseq.xdsml.gseqmt.gseq.Equality {
  private GSeqMTAdaptersFactory adaptersFactory;
  
  public EqualityAdapter() {
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
  public IntegerExpression getLeftEquality() {
    return (IntegerExpression) adaptersFactory.createAdapter(adaptee.getLeftEquality(), eResource);
  }
  
  @Override
  public void setLeftEquality(final IntegerExpression o) {
    if (o != null)
    	adaptee.setLeftEquality(((fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.IntegerExpressionAdapter) o).getAdaptee());
    else adaptee.setLeftEquality(null);
  }
  
  @Override
  public IntegerExpression getRightEquality() {
    return (IntegerExpression) adaptersFactory.createAdapter(adaptee.getRightEquality(), eResource);
  }
  
  @Override
  public void setRightEquality(final IntegerExpression o) {
    if (o != null)
    	adaptee.setRightEquality(((fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.IntegerExpressionAdapter) o).getAdaptee());
    else adaptee.setRightEquality(null);
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
    return fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.eINSTANCE.getEquality();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.EQUALITY__EXECUTED_BY:
    		return getExecutedBy();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.EQUALITY__LEFT_EQUALITY:
    		return getLeftEquality();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.EQUALITY__RIGHT_EQUALITY:
    		return getRightEquality();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.EQUALITY__EXECUTED_BY:
    		return getExecutedBy() != null;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.EQUALITY__LEFT_EQUALITY:
    		return getLeftEquality() != null;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.EQUALITY__RIGHT_EQUALITY:
    		return getRightEquality() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.EQUALITY__EXECUTED_BY:
    		setExecutedBy(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Method)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.EQUALITY__LEFT_EQUALITY:
    		setLeftEquality(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.IntegerExpression)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.EQUALITY__RIGHT_EQUALITY:
    		setRightEquality(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.IntegerExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
