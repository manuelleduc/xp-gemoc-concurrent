package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.True;
import gx10.aspects.BoolExpressionAspect;
import gx10.aspects.TrueAspectTrueAspectProperties;

@Aspect(className = True.class)
@SuppressWarnings("all")
public class TrueAspect extends BoolExpressionAspect {
  public static boolean getCurrentValue(final True _self) {
    final gx10.aspects.TrueAspectTrueAspectProperties _self_ = gx10.aspects.TrueAspectTrueAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof gx10.True){
    					result = gx10.aspects.TrueAspect._privk3_getCurrentValue(_self_, (gx10.True)_self);
    } else  if (_self instanceof gx10.BoolExpression){
    					result = gx10.aspects.BoolExpressionAspect.getCurrentValue((gx10.BoolExpression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_getCurrentValue(final TrueAspectTrueAspectProperties _self_, final True _self) {
    return true;
  }
}
