package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.BoolExpression;
import gx10.Not;
import gx10.aspects.BoolExpressionAspect;
import gx10.aspects.NotAspectNotAspectProperties;

@Aspect(className = Not.class)
@SuppressWarnings("all")
public class NotAspect extends BoolExpressionAspect {
  public static boolean getCurrentValue(final Not _self) {
    final gx10.aspects.NotAspectNotAspectProperties _self_ = gx10.aspects.NotAspectNotAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof gx10.Not){
    					result = gx10.aspects.NotAspect._privk3_getCurrentValue(_self_, (gx10.Not)_self);
    } else  if (_self instanceof gx10.BoolExpression){
    					result = gx10.aspects.BoolExpressionAspect.getCurrentValue((gx10.BoolExpression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_getCurrentValue(final NotAspectNotAspectProperties _self_, final Not _self) {
    BoolExpression _notExpression = _self.getNotExpression();
    boolean _currentValue = _notExpression.getCurrentValue();
    return (!_currentValue);
  }
}
