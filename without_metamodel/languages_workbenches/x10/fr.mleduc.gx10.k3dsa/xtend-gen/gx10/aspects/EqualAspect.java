package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Equal;
import gx10.IntExpression;
import gx10.aspects.BoolExpressionAspect;
import gx10.aspects.EqualAspectEqualAspectProperties;

@Aspect(className = Equal.class)
@SuppressWarnings("all")
public class EqualAspect extends BoolExpressionAspect {
  public static void evaluate(final Equal _self) {
    final gx10.aspects.EqualAspectEqualAspectProperties _self_ = gx10.aspects.EqualAspectEqualAspectContext.getSelf(_self);
    _privk3_evaluate(_self_, _self);;
  }
  
  public static boolean getCurrentValue(final Equal _self) {
    final gx10.aspects.EqualAspectEqualAspectProperties _self_ = gx10.aspects.EqualAspectEqualAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof gx10.Equal){
    					result = gx10.aspects.EqualAspect._privk3_getCurrentValue(_self_, (gx10.Equal)_self);
    } else  if (_self instanceof gx10.BoolExpression){
    					result = gx10.aspects.BoolExpressionAspect.getCurrentValue((gx10.BoolExpression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static boolean currentValueEqual(final Equal _self) {
    final gx10.aspects.EqualAspectEqualAspectProperties _self_ = gx10.aspects.EqualAspectEqualAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentValueEqual(_self_, _self);;
    return (boolean)result;
  }
  
  private static void currentValueEqual(final Equal _self, final boolean currentValueEqual) {
    final gx10.aspects.EqualAspectEqualAspectProperties _self_ = gx10.aspects.EqualAspectEqualAspectContext.getSelf(_self);
    _privk3_currentValueEqual(_self_, _self,currentValueEqual);;
  }
  
  protected static void _privk3_evaluate(final EqualAspectEqualAspectProperties _self_, final Equal _self) {
    IntExpression _leftEqual = _self.getLeftEqual();
    int _currentValue = _leftEqual.getCurrentValue();
    IntExpression _rightEqual = _self.getRightEqual();
    int _currentValue_1 = _rightEqual.getCurrentValue();
    boolean _equals = (_currentValue == _currentValue_1);
    EqualAspect.currentValueEqual(_self, _equals);
  }
  
  protected static boolean _privk3_getCurrentValue(final EqualAspectEqualAspectProperties _self_, final Equal _self) {
    return EqualAspect.currentValueEqual(_self);
  }
  
  protected static boolean _privk3_currentValueEqual(final EqualAspectEqualAspectProperties _self_, final Equal _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentValueEqual") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentValueEqual;
  }
  
  protected static void _privk3_currentValueEqual(final EqualAspectEqualAspectProperties _self_, final Equal _self, final boolean currentValueEqual) {
    _self_.currentValueEqual = currentValueEqual; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentValueEqual")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentValueEqual);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
