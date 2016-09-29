package gx10.aspects;

import gx10.Plus;
import gx10.aspects.PlusAspectPlusAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PlusAspectPlusAspectContext {
  public final static PlusAspectPlusAspectContext INSTANCE = new PlusAspectPlusAspectContext();
  
  public static PlusAspectPlusAspectProperties getSelf(final Plus _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.PlusAspectPlusAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Plus, PlusAspectPlusAspectProperties> map = new java.util.WeakHashMap<gx10.Plus, gx10.aspects.PlusAspectPlusAspectProperties>();
  
  public Map<Plus, PlusAspectPlusAspectProperties> getMap() {
    return map;
  }
}
