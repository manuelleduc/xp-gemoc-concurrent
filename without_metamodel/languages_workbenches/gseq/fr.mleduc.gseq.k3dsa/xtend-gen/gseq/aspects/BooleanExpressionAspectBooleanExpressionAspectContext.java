package gseq.aspects;

import gseq.BooleanExpression;
import gseq.aspects.BooleanExpressionAspectBooleanExpressionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BooleanExpressionAspectBooleanExpressionAspectContext {
  public final static BooleanExpressionAspectBooleanExpressionAspectContext INSTANCE = new BooleanExpressionAspectBooleanExpressionAspectContext();
  
  public static BooleanExpressionAspectBooleanExpressionAspectProperties getSelf(final BooleanExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gseq.aspects.BooleanExpressionAspectBooleanExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanExpression, BooleanExpressionAspectBooleanExpressionAspectProperties> map = new java.util.WeakHashMap<gseq.BooleanExpression, gseq.aspects.BooleanExpressionAspectBooleanExpressionAspectProperties>();
  
  public Map<BooleanExpression, BooleanExpressionAspectBooleanExpressionAspectProperties> getMap() {
    return map;
  }
}
