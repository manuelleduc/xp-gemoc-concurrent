package gx10.aspects;

import gx10.Method;
import gx10.aspects.MethodAspectMethodAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class MethodAspectMethodAspectContext {
  public final static MethodAspectMethodAspectContext INSTANCE = new MethodAspectMethodAspectContext();
  
  public static MethodAspectMethodAspectProperties getSelf(final Method _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.MethodAspectMethodAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Method, MethodAspectMethodAspectProperties> map = new java.util.WeakHashMap<gx10.Method, gx10.aspects.MethodAspectMethodAspectProperties>();
  
  public Map<Method, MethodAspectMethodAspectProperties> getMap() {
    return map;
  }
}
