package gx10.aspects;

import gx10.And;
import gx10.aspects.AndAspectAndAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class AndAspectAndAspectContext {
  public final static AndAspectAndAspectContext INSTANCE = new AndAspectAndAspectContext();
  
  public static AndAspectAndAspectProperties getSelf(final And _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.AndAspectAndAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<And, AndAspectAndAspectProperties> map = new java.util.WeakHashMap<gx10.And, gx10.aspects.AndAspectAndAspectProperties>();
  
  public Map<And, AndAspectAndAspectProperties> getMap() {
    return map;
  }
}
