package gx10.aspects;

import gx10.Equal;
import gx10.aspects.EqualAspectEqualAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class EqualAspectEqualAspectContext {
  public final static EqualAspectEqualAspectContext INSTANCE = new EqualAspectEqualAspectContext();
  
  public static EqualAspectEqualAspectProperties getSelf(final Equal _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.EqualAspectEqualAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Equal, EqualAspectEqualAspectProperties> map = new java.util.WeakHashMap<gx10.Equal, gx10.aspects.EqualAspectEqualAspectProperties>();
  
  public Map<Equal, EqualAspectEqualAspectProperties> getMap() {
    return map;
  }
}
