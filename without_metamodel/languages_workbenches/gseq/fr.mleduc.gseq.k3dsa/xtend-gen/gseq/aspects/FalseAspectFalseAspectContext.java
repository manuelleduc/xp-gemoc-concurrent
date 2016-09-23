package gseq.aspects;

import gseq.False;
import gseq.aspects.FalseAspectFalseAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class FalseAspectFalseAspectContext {
  public final static FalseAspectFalseAspectContext INSTANCE = new FalseAspectFalseAspectContext();
  
  public static FalseAspectFalseAspectProperties getSelf(final False _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gseq.aspects.FalseAspectFalseAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<False, FalseAspectFalseAspectProperties> map = new java.util.WeakHashMap<gseq.False, gseq.aspects.FalseAspectFalseAspectProperties>();
  
  public Map<False, FalseAspectFalseAspectProperties> getMap() {
    return map;
  }
}
