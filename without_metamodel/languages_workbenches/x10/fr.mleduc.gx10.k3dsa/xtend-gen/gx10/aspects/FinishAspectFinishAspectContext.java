package gx10.aspects;

import gx10.Finish;
import gx10.aspects.FinishAspectFinishAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class FinishAspectFinishAspectContext {
  public final static FinishAspectFinishAspectContext INSTANCE = new FinishAspectFinishAspectContext();
  
  public static FinishAspectFinishAspectProperties getSelf(final Finish _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.FinishAspectFinishAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Finish, FinishAspectFinishAspectProperties> map = new java.util.WeakHashMap<gx10.Finish, gx10.aspects.FinishAspectFinishAspectProperties>();
  
  public Map<Finish, FinishAspectFinishAspectProperties> getMap() {
    return map;
  }
}
