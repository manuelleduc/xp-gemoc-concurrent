package gx10.aspects;

import gx10.IntConst;
import gx10.aspects.IntConstAspectIntConstAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class IntConstAspectIntConstAspectContext {
  public final static IntConstAspectIntConstAspectContext INSTANCE = new IntConstAspectIntConstAspectContext();
  
  public static IntConstAspectIntConstAspectProperties getSelf(final IntConst _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.IntConstAspectIntConstAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntConst, IntConstAspectIntConstAspectProperties> map = new java.util.WeakHashMap<gx10.IntConst, gx10.aspects.IntConstAspectIntConstAspectProperties>();
  
  public Map<IntConst, IntConstAspectIntConstAspectProperties> getMap() {
    return map;
  }
}
