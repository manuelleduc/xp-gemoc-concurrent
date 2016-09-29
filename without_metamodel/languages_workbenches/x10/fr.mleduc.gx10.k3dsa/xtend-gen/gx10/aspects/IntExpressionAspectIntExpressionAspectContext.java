package gx10.aspects;

import gx10.IntExpression;
import gx10.aspects.IntExpressionAspectIntExpressionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class IntExpressionAspectIntExpressionAspectContext {
  public final static IntExpressionAspectIntExpressionAspectContext INSTANCE = new IntExpressionAspectIntExpressionAspectContext();
  
  public static IntExpressionAspectIntExpressionAspectProperties getSelf(final IntExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.IntExpressionAspectIntExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntExpression, IntExpressionAspectIntExpressionAspectProperties> map = new java.util.WeakHashMap<gx10.IntExpression, gx10.aspects.IntExpressionAspectIntExpressionAspectProperties>();
  
  public Map<IntExpression, IntExpressionAspectIntExpressionAspectProperties> getMap() {
    return map;
  }
}
