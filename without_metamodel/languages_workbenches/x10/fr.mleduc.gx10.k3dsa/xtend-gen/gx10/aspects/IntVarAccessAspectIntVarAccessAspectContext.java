package gx10.aspects;

import gx10.IntVarAccess;
import gx10.aspects.IntVarAccessAspectIntVarAccessAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class IntVarAccessAspectIntVarAccessAspectContext {
  public final static IntVarAccessAspectIntVarAccessAspectContext INSTANCE = new IntVarAccessAspectIntVarAccessAspectContext();
  
  public static IntVarAccessAspectIntVarAccessAspectProperties getSelf(final IntVarAccess _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.IntVarAccessAspectIntVarAccessAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntVarAccess, IntVarAccessAspectIntVarAccessAspectProperties> map = new java.util.WeakHashMap<gx10.IntVarAccess, gx10.aspects.IntVarAccessAspectIntVarAccessAspectProperties>();
  
  public Map<IntVarAccess, IntVarAccessAspectIntVarAccessAspectProperties> getMap() {
    return map;
  }
}
