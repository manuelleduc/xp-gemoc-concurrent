package gx10.aspects;

import gx10.IntVar;
import gx10.aspects.IntVarAspectIntVarAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class IntVarAspectIntVarAspectContext {
  public final static IntVarAspectIntVarAspectContext INSTANCE = new IntVarAspectIntVarAspectContext();
  
  public static IntVarAspectIntVarAspectProperties getSelf(final IntVar _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.IntVarAspectIntVarAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntVar, IntVarAspectIntVarAspectProperties> map = new java.util.WeakHashMap<gx10.IntVar, gx10.aspects.IntVarAspectIntVarAspectProperties>();
  
  public Map<IntVar, IntVarAspectIntVarAspectProperties> getMap() {
    return map;
  }
}
