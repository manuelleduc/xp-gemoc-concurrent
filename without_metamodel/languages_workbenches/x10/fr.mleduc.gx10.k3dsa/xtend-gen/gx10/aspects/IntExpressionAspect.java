package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import gx10.IntExpression;
import gx10.aspects.ExpressionAspect;
import gx10.aspects.IntExpressionAspectIntExpressionAspectProperties;

@Aspect(className = IntExpression.class)
@SuppressWarnings("all")
public abstract class IntExpressionAspect extends ExpressionAspect {
  @ReplaceAspectMethod
  public static int getCurrentValue(final IntExpression _self) {
    final gx10.aspects.IntExpressionAspectIntExpressionAspectProperties _self_ = gx10.aspects.IntExpressionAspectIntExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof gx10.IntVarAccess){
    					result = gx10.aspects.IntVarAccessAspect.getCurrentValue((gx10.IntVarAccess)_self);
    } else  if (_self instanceof gx10.IntConst){
    					result = gx10.aspects.IntConstAspect.getCurrentValue((gx10.IntConst)_self);
    } else  if (_self instanceof gx10.Plus){
    					result = gx10.aspects.PlusAspect.getCurrentValue((gx10.Plus)_self);
    } else  if (_self instanceof gx10.Time){
    					result = gx10.aspects.TimeAspect.getCurrentValue((gx10.Time)_self);
    } else  if (_self instanceof gx10.IntExpression){
    					result = gx10.aspects.IntExpressionAspect._privk3_getCurrentValue(_self_, (gx10.IntExpression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  protected static int _privk3_getCurrentValue(final IntExpressionAspectIntExpressionAspectProperties _self_, final IntExpression _self) {
    return 0;
  }
}
