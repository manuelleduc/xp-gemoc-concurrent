package gx10.aspects;

import gx10.BoolVar;
import gx10.aspects.BoolVarAspectBoolVarAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BoolVarAspectBoolVarAspectContext {
  public final static BoolVarAspectBoolVarAspectContext INSTANCE = new BoolVarAspectBoolVarAspectContext();
  
  public static BoolVarAspectBoolVarAspectProperties getSelf(final BoolVar _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.BoolVarAspectBoolVarAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BoolVar, BoolVarAspectBoolVarAspectProperties> map = new java.util.WeakHashMap<gx10.BoolVar, gx10.aspects.BoolVarAspectBoolVarAspectProperties>();
  
  public Map<BoolVar, BoolVarAspectBoolVarAspectProperties> getMap() {
    return map;
  }
}
