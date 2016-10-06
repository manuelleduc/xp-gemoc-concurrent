package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import gx10.BoolExpression;
import gx10.aspects.BoolExpressionAspectBoolExpressionAspectProperties;
import gx10.aspects.ExpressionAspect;

@Aspect(className = BoolExpression.class)
@SuppressWarnings("all")
public abstract class BoolExpressionAspect extends ExpressionAspect {
  @ReplaceAspectMethod
  public static boolean getCurrentValue(final BoolExpression _self) {
    final gx10.aspects.BoolExpressionAspectBoolExpressionAspectProperties _self_ = gx10.aspects.BoolExpressionAspectBoolExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof gx10.False){
    					result = gx10.aspects.FalseAspect.getCurrentValue((gx10.False)_self);
    } else  if (_self instanceof gx10.Not){
    					result = gx10.aspects.NotAspect.getCurrentValue((gx10.Not)_self);
    } else  if (_self instanceof gx10.True){
    					result = gx10.aspects.TrueAspect.getCurrentValue((gx10.True)_self);
    } else  if (_self instanceof gx10.BoolVarAccess){
    					result = gx10.aspects.BoolVarAccessAspect.getCurrentValue((gx10.BoolVarAccess)_self);
    } else  if (_self instanceof gx10.Equal){
    					result = gx10.aspects.EqualAspect.getCurrentValue((gx10.Equal)_self);
    } else  if (_self instanceof gx10.BoolExpression){
    					result = gx10.aspects.BoolExpressionAspect._privk3_getCurrentValue(_self_, (gx10.BoolExpression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_getCurrentValue(final BoolExpressionAspectBoolExpressionAspectProperties _self_, final BoolExpression _self) {
    return false;
  }
}
