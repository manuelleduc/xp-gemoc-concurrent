package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.IntExpression;
import gx10.Time;
import gx10.aspects.IntBinaryOperationAspect;
import gx10.aspects.TimeAspectTimeAspectProperties;

@Aspect(className = Time.class)
@SuppressWarnings("all")
public class TimeAspect extends IntBinaryOperationAspect {
  public static void evaluate(final Time _self) {
    final gx10.aspects.TimeAspectTimeAspectProperties _self_ = gx10.aspects.TimeAspectTimeAspectContext.getSelf(_self);
    _privk3_evaluate(_self_, _self);;
  }
  
  public static int getCurrentValue(final Time _self) {
    final gx10.aspects.TimeAspectTimeAspectProperties _self_ = gx10.aspects.TimeAspectTimeAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof gx10.Time){
    					result = gx10.aspects.TimeAspect._privk3_getCurrentValue(_self_, (gx10.Time)_self);
    } else  if (_self instanceof gx10.IntExpression){
    					result = gx10.aspects.IntExpressionAspect.getCurrentValue((gx10.IntExpression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int currentValueTime(final Time _self) {
    final gx10.aspects.TimeAspectTimeAspectProperties _self_ = gx10.aspects.TimeAspectTimeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentValueTime(_self_, _self);;
    return (int)result;
  }
  
  private static void currentValueTime(final Time _self, final int currentValueTime) {
    final gx10.aspects.TimeAspectTimeAspectProperties _self_ = gx10.aspects.TimeAspectTimeAspectContext.getSelf(_self);
    _privk3_currentValueTime(_self_, _self,currentValueTime);;
  }
  
  protected static void _privk3_evaluate(final TimeAspectTimeAspectProperties _self_, final Time _self) {
    IntExpression _leftBinaryExpression = _self.getLeftBinaryExpression();
    int _currentValue = _leftBinaryExpression.getCurrentValue();
    IntExpression _rightBinaryExpression = _self.getRightBinaryExpression();
    int _currentValue_1 = _rightBinaryExpression.getCurrentValue();
    int _multiply = (_currentValue * _currentValue_1);
    TimeAspect.currentValueTime(_self, _multiply);
  }
  
  protected static int _privk3_getCurrentValue(final TimeAspectTimeAspectProperties _self_, final Time _self) {
    return TimeAspect.currentValueTime(_self);
  }
  
  protected static int _privk3_currentValueTime(final TimeAspectTimeAspectProperties _self_, final Time _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentValueTime") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentValueTime;
  }
  
  protected static void _privk3_currentValueTime(final TimeAspectTimeAspectProperties _self_, final Time _self, final int currentValueTime) {
    _self_.currentValueTime = currentValueTime; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentValueTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentValueTime);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
