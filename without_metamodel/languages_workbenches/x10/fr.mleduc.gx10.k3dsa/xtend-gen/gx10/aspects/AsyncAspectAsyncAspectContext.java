package gx10.aspects;

import gx10.Async;
import gx10.aspects.AsyncAspectAsyncAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class AsyncAspectAsyncAspectContext {
  public final static AsyncAspectAsyncAspectContext INSTANCE = new AsyncAspectAsyncAspectContext();
  
  public static AsyncAspectAsyncAspectProperties getSelf(final Async _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.AsyncAspectAsyncAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Async, AsyncAspectAsyncAspectProperties> map = new java.util.WeakHashMap<gx10.Async, gx10.aspects.AsyncAspectAsyncAspectProperties>();
  
  public Map<Async, AsyncAspectAsyncAspectProperties> getMap() {
    return map;
  }
}
