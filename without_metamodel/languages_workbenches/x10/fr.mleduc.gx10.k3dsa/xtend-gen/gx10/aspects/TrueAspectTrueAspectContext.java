package gx10.aspects;

import gx10.True;
import gx10.aspects.TrueAspectTrueAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class TrueAspectTrueAspectContext {
  public final static TrueAspectTrueAspectContext INSTANCE = new TrueAspectTrueAspectContext();
  
  public static TrueAspectTrueAspectProperties getSelf(final True _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.TrueAspectTrueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<True, TrueAspectTrueAspectProperties> map = new java.util.WeakHashMap<gx10.True, gx10.aspects.TrueAspectTrueAspectProperties>();
  
  public Map<True, TrueAspectTrueAspectProperties> getMap() {
    return map;
  }
}
