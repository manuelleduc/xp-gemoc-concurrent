package gx10.aspects;

import gx10.If;
import gx10.aspects.IfAspectIfAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class IfAspectIfAspectContext {
  public final static IfAspectIfAspectContext INSTANCE = new IfAspectIfAspectContext();
  
  public static IfAspectIfAspectProperties getSelf(final If _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.IfAspectIfAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<If, IfAspectIfAspectProperties> map = new java.util.WeakHashMap<gx10.If, gx10.aspects.IfAspectIfAspectProperties>();
  
  public Map<If, IfAspectIfAspectProperties> getMap() {
    return map;
  }
}
