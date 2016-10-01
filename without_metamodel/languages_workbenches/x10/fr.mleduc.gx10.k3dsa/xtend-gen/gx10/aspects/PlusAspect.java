package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.IntExpression;
import gx10.Plus;
import gx10.aspects.IntExpressionAspect;
import gx10.aspects.PlusAspectPlusAspectProperties;

@Aspect(className = Plus.class)
@SuppressWarnings("all")
public class PlusAspect extends IntExpressionAspect {
  public static void evaluate(final Plus _self) {
    final gx10.aspects.PlusAspectPlusAspectProperties _self_ = gx10.aspects.PlusAspectPlusAspectContext.getSelf(_self);
    _privk3_evaluate(_self_, _self);;
  }
  
  public static int getCurrentValue(final Plus _self) {
    final gx10.aspects.PlusAspectPlusAspectProperties _self_ = gx10.aspects.PlusAspectPlusAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof gx10.Plus){
    					result = gx10.aspects.PlusAspect._privk3_getCurrentValue(_self_, (gx10.Plus)_self);
    } else  if (_self instanceof gx10.IntExpression){
    					result = gx10.aspects.IntExpressionAspect.getCurrentValue((gx10.IntExpression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int currentValuePlus(final Plus _self) {
    final gx10.aspects.PlusAspectPlusAspectProperties _self_ = gx10.aspects.PlusAspectPlusAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentValuePlus(_self_, _self);;
    return (int)result;
  }
  
  private static void currentValuePlus(final Plus _self, final int currentValuePlus) {
    final gx10.aspects.PlusAspectPlusAspectProperties _self_ = gx10.aspects.PlusAspectPlusAspectContext.getSelf(_self);
    _privk3_currentValuePlus(_self_, _self,currentValuePlus);;
  }
  
  protected static void _privk3_evaluate(final PlusAspectPlusAspectProperties _self_, final Plus _self) {
    IntExpression _leftPlus = _self.getLeftPlus();
    int _currentValue = _leftPlus.getCurrentValue();
    IntExpression _rightPlus = _self.getRightPlus();
    int _currentValue_1 = _rightPlus.getCurrentValue();
    int _plus = (_currentValue + _currentValue_1);
    PlusAspect.currentValuePlus(_self, _plus);
  }
  
  protected static int _privk3_getCurrentValue(final PlusAspectPlusAspectProperties _self_, final Plus _self) {
    return PlusAspect.currentValuePlus(_self);
  }
  
  protected static int _privk3_currentValuePlus(final PlusAspectPlusAspectProperties _self_, final Plus _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentValuePlus") &&
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
    return _self_.currentValuePlus;
  }
  
  protected static void _privk3_currentValuePlus(final PlusAspectPlusAspectProperties _self_, final Plus _self, final int currentValuePlus) {
    _self_.currentValuePlus = currentValuePlus; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentValuePlus")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentValuePlus);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
