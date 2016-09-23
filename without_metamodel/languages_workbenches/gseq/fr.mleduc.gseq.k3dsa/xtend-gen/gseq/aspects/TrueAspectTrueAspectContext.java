package gseq.aspects;

import gseq.True;
import gseq.aspects.TrueAspectTrueAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class TrueAspectTrueAspectContext {
  public final static TrueAspectTrueAspectContext INSTANCE = new TrueAspectTrueAspectContext();
  
  public static TrueAspectTrueAspectProperties getSelf(final True _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gseq.aspects.TrueAspectTrueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<True, TrueAspectTrueAspectProperties> map = new java.util.WeakHashMap<gseq.True, gseq.aspects.TrueAspectTrueAspectProperties>();
  
  public Map<True, TrueAspectTrueAspectProperties> getMap() {
    return map;
  }
}
