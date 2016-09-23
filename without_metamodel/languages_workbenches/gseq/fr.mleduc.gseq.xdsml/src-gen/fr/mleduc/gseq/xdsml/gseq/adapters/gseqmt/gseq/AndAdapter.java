package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.BooleanExpression;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Method;
import gseq.And;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class AndAdapter extends EObjectAdapter<And> implements fr.mleduc.gseq.xdsml.gseqmt.gseq.And {
  private GSeqMTAdaptersFactory adaptersFactory;
  
  public AndAdapter() {
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
  public BooleanExpression getLeftAnd() {
    return (BooleanExpression) adaptersFactory.createAdapter(adaptee.getLeftAnd(), eResource);
  }
  
  @Override
  public void setLeftAnd(final BooleanExpression o) {
    if (o != null)
    	adaptee.setLeftAnd(((fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.BooleanExpressionAdapter) o).getAdaptee());
    else adaptee.setLeftAnd(null);
  }
  
  @Override
  public BooleanExpression getRightAnd() {
    return (BooleanExpression) adaptersFactory.createAdapter(adaptee.getRightAnd(), eResource);
  }
  
  @Override
  public void setRightAnd(final BooleanExpression o) {
    if (o != null)
    	adaptee.setRightAnd(((fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.BooleanExpressionAdapter) o).getAdaptee());
    else adaptee.setRightAnd(null);
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
    return fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.eINSTANCE.getAnd();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.AND__EXECUTED_BY:
    		return getExecutedBy();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.AND__LEFT_AND:
    		return getLeftAnd();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.AND__RIGHT_AND:
    		return getRightAnd();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.AND__EXECUTED_BY:
    		return getExecutedBy() != null;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.AND__LEFT_AND:
    		return getLeftAnd() != null;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.AND__RIGHT_AND:
    		return getRightAnd() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.AND__EXECUTED_BY:
    		setExecutedBy(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Method)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.AND__LEFT_AND:
    		setLeftAnd(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.BooleanExpression)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.AND__RIGHT_AND:
    		setRightAnd(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.BooleanExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
