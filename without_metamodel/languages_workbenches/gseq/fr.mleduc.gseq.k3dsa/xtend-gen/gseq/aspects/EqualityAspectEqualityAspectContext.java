package gseq.aspects;

import gseq.Equality;
import gseq.aspects.EqualityAspectEqualityAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class EqualityAspectEqualityAspectContext {
  public final static EqualityAspectEqualityAspectContext INSTANCE = new EqualityAspectEqualityAspectContext();
  
  public static EqualityAspectEqualityAspectProperties getSelf(final Equality _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gseq.aspects.EqualityAspectEqualityAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Equality, EqualityAspectEqualityAspectProperties> map = new java.util.WeakHashMap<gseq.Equality, gseq.aspects.EqualityAspectEqualityAspectProperties>();
  
  public Map<Equality, EqualityAspectEqualityAspectProperties> getMap() {
    return map;
  }
}
