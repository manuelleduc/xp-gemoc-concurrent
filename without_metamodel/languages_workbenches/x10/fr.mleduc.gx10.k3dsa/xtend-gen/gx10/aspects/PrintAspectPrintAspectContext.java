package gx10.aspects;

import gx10.Print;
import gx10.aspects.PrintAspectPrintAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PrintAspectPrintAspectContext {
  public final static PrintAspectPrintAspectContext INSTANCE = new PrintAspectPrintAspectContext();
  
  public static PrintAspectPrintAspectProperties getSelf(final Print _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.PrintAspectPrintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Print, PrintAspectPrintAspectProperties> map = new java.util.WeakHashMap<gx10.Print, gx10.aspects.PrintAspectPrintAspectProperties>();
  
  public Map<Print, PrintAspectPrintAspectProperties> getMap() {
    return map;
  }
}
