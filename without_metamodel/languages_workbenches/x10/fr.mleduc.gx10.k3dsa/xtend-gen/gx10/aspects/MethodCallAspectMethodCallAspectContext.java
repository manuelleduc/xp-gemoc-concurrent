package gx10.aspects;

import gx10.MethodCall;
import gx10.aspects.MethodCallAspectMethodCallAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class MethodCallAspectMethodCallAspectContext {
  public final static MethodCallAspectMethodCallAspectContext INSTANCE = new MethodCallAspectMethodCallAspectContext();
  
  public static MethodCallAspectMethodCallAspectProperties getSelf(final MethodCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.MethodCallAspectMethodCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MethodCall, MethodCallAspectMethodCallAspectProperties> map = new java.util.WeakHashMap<gx10.MethodCall, gx10.aspects.MethodCallAspectMethodCallAspectProperties>();
  
  public Map<MethodCall, MethodCallAspectMethodCallAspectProperties> getMap() {
    return map;
  }
}
