package gx10.aspects;

import gx10.Time;
import gx10.aspects.TimeAspectTimeAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class TimeAspectTimeAspectContext {
  public final static TimeAspectTimeAspectContext INSTANCE = new TimeAspectTimeAspectContext();
  
  public static TimeAspectTimeAspectProperties getSelf(final Time _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.TimeAspectTimeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Time, TimeAspectTimeAspectProperties> map = new java.util.WeakHashMap<gx10.Time, gx10.aspects.TimeAspectTimeAspectProperties>();
  
  public Map<Time, TimeAspectTimeAspectProperties> getMap() {
    return map;
  }
}
