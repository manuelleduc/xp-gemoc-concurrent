package gx10.aspects;

import gx10.IntBinaryOperation;
import gx10.aspects.IntBinaryOperationAspectIntBinaryOperationAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class IntBinaryOperationAspectIntBinaryOperationAspectContext {
  public final static IntBinaryOperationAspectIntBinaryOperationAspectContext INSTANCE = new IntBinaryOperationAspectIntBinaryOperationAspectContext();
  
  public static IntBinaryOperationAspectIntBinaryOperationAspectProperties getSelf(final IntBinaryOperation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.IntBinaryOperationAspectIntBinaryOperationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntBinaryOperation, IntBinaryOperationAspectIntBinaryOperationAspectProperties> map = new java.util.WeakHashMap<gx10.IntBinaryOperation, gx10.aspects.IntBinaryOperationAspectIntBinaryOperationAspectProperties>();
  
  public Map<IntBinaryOperation, IntBinaryOperationAspectIntBinaryOperationAspectProperties> getMap() {
    return map;
  }
}
