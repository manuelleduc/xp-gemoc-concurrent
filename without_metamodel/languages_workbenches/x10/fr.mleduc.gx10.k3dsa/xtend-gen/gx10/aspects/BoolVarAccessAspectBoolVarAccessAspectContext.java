package gx10.aspects;

import gx10.BoolVarAccess;
import gx10.aspects.BoolVarAccessAspectBoolVarAccessAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BoolVarAccessAspectBoolVarAccessAspectContext {
  public final static BoolVarAccessAspectBoolVarAccessAspectContext INSTANCE = new BoolVarAccessAspectBoolVarAccessAspectContext();
  
  public static BoolVarAccessAspectBoolVarAccessAspectProperties getSelf(final BoolVarAccess _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.BoolVarAccessAspectBoolVarAccessAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BoolVarAccess, BoolVarAccessAspectBoolVarAccessAspectProperties> map = new java.util.WeakHashMap<gx10.BoolVarAccess, gx10.aspects.BoolVarAccessAspectBoolVarAccessAspectProperties>();
  
  public Map<BoolVarAccess, BoolVarAccessAspectBoolVarAccessAspectProperties> getMap() {
    return map;
  }
}
