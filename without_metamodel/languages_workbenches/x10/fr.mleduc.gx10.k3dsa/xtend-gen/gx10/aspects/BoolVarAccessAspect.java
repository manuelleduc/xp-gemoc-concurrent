package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.BoolVarAccess;
import gx10.Referentiable;
import gx10.aspects.BoolExpressionAspect;
import gx10.aspects.BoolVarAccessAspectBoolVarAccessAspectProperties;
import gx10.aspects.Context;
import gx10.aspects.ECoreUtil;

@Aspect(className = BoolVarAccess.class)
@SuppressWarnings("all")
public class BoolVarAccessAspect extends BoolExpressionAspect {
  public static boolean getCurrentValue(final BoolVarAccess _self) {
    final gx10.aspects.BoolVarAccessAspectBoolVarAccessAspectProperties _self_ = gx10.aspects.BoolVarAccessAspectBoolVarAccessAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof gx10.BoolVarAccess){
    					result = gx10.aspects.BoolVarAccessAspect._privk3_getCurrentValue(_self_, (gx10.BoolVarAccess)_self);
    } else  if (_self instanceof gx10.BoolExpression){
    					result = gx10.aspects.BoolExpressionAspect.getCurrentValue((gx10.BoolExpression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_getCurrentValue(final BoolVarAccessAspectBoolVarAccessAspectProperties _self_, final BoolVarAccess _self) {
    boolean _xblockexpression = false;
    {
      final Context context = ECoreUtil.getContext(_self);
      Referentiable _boolVarRef = _self.getBoolVarRef();
      String _name = _boolVarRef.getName();
      _xblockexpression = context.getBool(_name);
    }
    return _xblockexpression;
  }
}
