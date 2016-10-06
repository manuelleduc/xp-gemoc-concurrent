package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCall;
import gx10.MethodCallParameter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class MethodCallParameterAdapter extends EObjectAdapter<MethodCallParameter> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCallParameter {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public MethodCallParameterAdapter() {
    super(fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance());
    adaptersFactory = fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public IntExpression getMethodCallParameterExpr() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getMethodCallParameterExpr(), eResource);
  }
  
  @Override
  public void setMethodCallParameterExpr(final IntExpression o) {
    if (o != null)
    	adaptee.setMethodCallParameterExpr(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setMethodCallParameterExpr(null);
  }
  
  @Override
  public MethodCall getInMethodCall() {
    return (MethodCall) adaptersFactory.createAdapter(adaptee.getInMethodCall(), eResource);
  }
  
  @Override
  public void setInMethodCall(final MethodCall o) {
    if (o != null)
    	adaptee.setInMethodCall(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.MethodCallAdapter) o).getAdaptee());
    else adaptee.setInMethodCall(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getMethodCallParameter();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL_PARAMETER__NAME:
    		return getName();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR:
    		return getMethodCallParameterExpr();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL:
    		return getInMethodCall();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL_PARAMETER__NAME:
    		return getName() != NAME_EDEFAULT;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR:
    		return getMethodCallParameterExpr() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL:
    		return getInMethodCall() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL_PARAMETER__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR:
    		setMethodCallParameterExpr(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.IntExpression)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.METHOD_CALL_PARAMETER__IN_METHOD_CALL:
    		setInMethodCall(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCall)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
