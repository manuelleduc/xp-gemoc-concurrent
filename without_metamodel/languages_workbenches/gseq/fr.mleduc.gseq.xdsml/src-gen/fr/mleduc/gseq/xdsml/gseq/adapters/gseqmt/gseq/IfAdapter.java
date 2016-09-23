package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.BooleanExpression;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Method;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Operation;
import gseq.If;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IfAdapter extends EObjectAdapter<If> implements fr.mleduc.gseq.xdsml.gseqmt.gseq.If {
  private GSeqMTAdaptersFactory adaptersFactory;
  
  public IfAdapter() {
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
  public BooleanExpression getIfCondition() {
    return (BooleanExpression) adaptersFactory.createAdapter(adaptee.getIfCondition(), eResource);
  }
  
  @Override
  public void setIfCondition(final BooleanExpression o) {
    if (o != null)
    	adaptee.setIfCondition(((fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.BooleanExpressionAdapter) o).getAdaptee());
    else adaptee.setIfCondition(null);
  }
  
  @Override
  public Operation getThenBranch() {
    return (Operation) adaptersFactory.createAdapter(adaptee.getThenBranch(), eResource);
  }
  
  @Override
  public void setThenBranch(final Operation o) {
    if (o != null)
    	adaptee.setThenBranch(((fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.OperationAdapter) o).getAdaptee());
    else adaptee.setThenBranch(null);
  }
  
  @Override
  public Operation getElseBranch() {
    return (Operation) adaptersFactory.createAdapter(adaptee.getElseBranch(), eResource);
  }
  
  @Override
  public void setElseBranch(final Operation o) {
    if (o != null)
    	adaptee.setElseBranch(((fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.OperationAdapter) o).getAdaptee());
    else adaptee.setElseBranch(null);
  }
  
  @Override
  public void execute() {
    adaptee.execute();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.eINSTANCE.getIf();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.IF__EXECUTED_BY:
    		return getExecutedBy();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.IF__IF_CONDITION:
    		return getIfCondition();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.IF__THEN_BRANCH:
    		return getThenBranch();
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.IF__ELSE_BRANCH:
    		return getElseBranch();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.IF__EXECUTED_BY:
    		return getExecutedBy() != null;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.IF__IF_CONDITION:
    		return getIfCondition() != null;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.IF__THEN_BRANCH:
    		return getThenBranch() != null;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.IF__ELSE_BRANCH:
    		return getElseBranch() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.IF__EXECUTED_BY:
    		setExecutedBy(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Method)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.IF__IF_CONDITION:
    		setIfCondition(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.BooleanExpression)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.IF__THEN_BRANCH:
    		setThenBranch(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Operation)
    		 newValue);
    		return;
    	case fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.IF__ELSE_BRANCH:
    		setElseBranch(
    		(fr.mleduc.gseq.xdsml.gseqmt.gseq.Operation)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
