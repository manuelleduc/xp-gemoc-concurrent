package gx10.aspects;

import gx10.ControlStructure;
import gx10.aspects.ControlStructureAspectControlStructureAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ControlStructureAspectControlStructureAspectContext {
  public final static ControlStructureAspectControlStructureAspectContext INSTANCE = new ControlStructureAspectControlStructureAspectContext();
  
  public static ControlStructureAspectControlStructureAspectProperties getSelf(final ControlStructure _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.ControlStructureAspectControlStructureAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ControlStructure, ControlStructureAspectControlStructureAspectProperties> map = new java.util.WeakHashMap<gx10.ControlStructure, gx10.aspects.ControlStructureAspectControlStructureAspectProperties>();
  
  public Map<ControlStructure, ControlStructureAspectControlStructureAspectProperties> getMap() {
    return map;
  }
}
