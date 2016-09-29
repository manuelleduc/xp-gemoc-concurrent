package gx10.aspects;

import gx10.Not;
import gx10.aspects.NotAspectNotAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class NotAspectNotAspectContext {
  public final static NotAspectNotAspectContext INSTANCE = new NotAspectNotAspectContext();
  
  public static NotAspectNotAspectProperties getSelf(final Not _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.NotAspectNotAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Not, NotAspectNotAspectProperties> map = new java.util.WeakHashMap<gx10.Not, gx10.aspects.NotAspectNotAspectProperties>();
  
  public Map<Not, NotAspectNotAspectProperties> getMap() {
    return map;
  }
}
