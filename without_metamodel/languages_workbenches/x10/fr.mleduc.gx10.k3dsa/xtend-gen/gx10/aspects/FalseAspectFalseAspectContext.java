package gx10.aspects;

import gx10.False;
import gx10.aspects.FalseAspectFalseAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class FalseAspectFalseAspectContext {
  public final static FalseAspectFalseAspectContext INSTANCE = new FalseAspectFalseAspectContext();
  
  public static FalseAspectFalseAspectProperties getSelf(final False _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.FalseAspectFalseAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<False, FalseAspectFalseAspectProperties> map = new java.util.WeakHashMap<gx10.False, gx10.aspects.FalseAspectFalseAspectProperties>();
  
  public Map<False, FalseAspectFalseAspectProperties> getMap() {
    return map;
  }
}
