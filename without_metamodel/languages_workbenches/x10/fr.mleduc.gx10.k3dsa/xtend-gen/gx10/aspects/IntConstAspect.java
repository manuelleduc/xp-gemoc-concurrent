package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.IntConst;
import gx10.aspects.IntConstAspectIntConstAspectProperties;
import gx10.aspects.IntExpressionAspect;

@Aspect(className = IntConst.class)
@SuppressWarnings("all")
public class IntConstAspect extends IntExpressionAspect {
  public static int getCurrentValue(final IntConst _self) {
    final gx10.aspects.IntConstAspectIntConstAspectProperties _self_ = gx10.aspects.IntConstAspectIntConstAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof gx10.IntConst){
    					result = gx10.aspects.IntConstAspect._privk3_getCurrentValue(_self_, (gx10.IntConst)_self);
    } else  if (_self instanceof gx10.IntExpression){
    					result = gx10.aspects.IntExpressionAspect.getCurrentValue((gx10.IntExpression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  protected static int _privk3_getCurrentValue(final IntConstAspectIntConstAspectProperties _self_, final IntConst _self) {
    return _self.getValue();
  }
}
