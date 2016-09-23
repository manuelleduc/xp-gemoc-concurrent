package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.IntegerExpression;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Method;
import gseq.Assign;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class AssignAdapter extends EObjectAdapter<Assign> implements fr.mleduc.gseq.xdsml.gseqmt.gseq.Assign {
  private GSeqMTAdaptersFactory adaptersFactory;
  
  public AssignAdapter() {
    super(fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory.getInstance());
    adaptersFactory = fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getVarName() {
    return adaptee.getVarName();
  }
  
  @Override
  public void setVarName(final String o) {
    adaptee.setVarName(o);
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
  public IntegerExpression getAssignedExpression() {
    return (IntegerExpression) adaptersFactory.createAdapter(adaptee.getAssignedExpression(), eResource);
  }
  
  @Override
  public void setAssignedExpression(final IntegerExpression o) {
    if (o != null)
    	adaptee.setAssignedExpression(((fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.IntegerExpressionAdapter) o).getAdaptee());
    else adaptee.setAssignedExpression(null);
  }
  
  @Override
  public void execute() {
    adaptee.execute();
  }
  
  protected final static String VAR_NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.eINSTANCE.getAssign();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.ASSIGN__EXECUTED_BY:
    		return getExecutedBy();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.ASSIGN__VAR_NAME:
    		return getVarName();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.ASSIGN__ASSIGNED_EXPRESSION:
    		return getAssignedExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.ASSIGN__EXECUTED_BY:
    		return getExecutedBy() != null;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.ASSIGN__VAR_NAME:
    		return getVarName() != VAR_NAME_EDEFAULT;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.ASSIGN__ASSIGNED_EXPRESSION:
    		return getAssignedExpression() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.ASSIGN__EXECUTED_BY:
    		setExecutedBy(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Method)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.ASSIGN__VAR_NAME:
    		setVarName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.ASSIGN__ASSIGNED_EXPRESSION:
    		setAssignedExpression(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.IntegerExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
