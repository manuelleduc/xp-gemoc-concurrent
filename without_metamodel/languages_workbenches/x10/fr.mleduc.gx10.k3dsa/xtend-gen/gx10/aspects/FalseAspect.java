package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.False;
import gx10.aspects.BoolExpressionAspect;
import gx10.aspects.FalseAspectFalseAspectProperties;

@Aspect(className = False.class)
@SuppressWarnings("all")
public class FalseAspect extends BoolExpressionAspect {
  public static boolean getCurrentValue(final False _self) {
    final gx10.aspects.FalseAspectFalseAspectProperties _self_ = gx10.aspects.FalseAspectFalseAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof gx10.False){
    					result = gx10.aspects.FalseAspect._privk3_getCurrentValue(_self_, (gx10.False)_self);
    } else  if (_self instanceof gx10.BoolExpression){
    					result = gx10.aspects.BoolExpressionAspect.getCurrentValue((gx10.BoolExpression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_getCurrentValue(final FalseAspectFalseAspectProperties _self_, final False _self) {
    return false;
  }
}
