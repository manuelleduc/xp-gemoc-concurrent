package gx10.aspects;

import gx10.BoolExpression;
import gx10.aspects.BoolExpressionAspectBoolExpressionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BoolExpressionAspectBoolExpressionAspectContext {
  public final static BoolExpressionAspectBoolExpressionAspectContext INSTANCE = new BoolExpressionAspectBoolExpressionAspectContext();
  
  public static BoolExpressionAspectBoolExpressionAspectProperties getSelf(final BoolExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.BoolExpressionAspectBoolExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BoolExpression, BoolExpressionAspectBoolExpressionAspectProperties> map = new java.util.WeakHashMap<gx10.BoolExpression, gx10.aspects.BoolExpressionAspectBoolExpressionAspectProperties>();
  
  public Map<BoolExpression, BoolExpressionAspectBoolExpressionAspectProperties> getMap() {
    return map;
  }
}
