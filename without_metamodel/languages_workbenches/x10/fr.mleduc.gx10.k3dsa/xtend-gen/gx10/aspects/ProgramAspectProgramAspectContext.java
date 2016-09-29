package gx10.aspects;

import gx10.Program;
import gx10.aspects.ProgramAspectProgramAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ProgramAspectProgramAspectContext {
  public final static ProgramAspectProgramAspectContext INSTANCE = new ProgramAspectProgramAspectContext();
  
  public static ProgramAspectProgramAspectProperties getSelf(final Program _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new gx10.aspects.ProgramAspectProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Program, ProgramAspectProgramAspectProperties> map = new java.util.WeakHashMap<gx10.Program, gx10.aspects.ProgramAspectProgramAspectProperties>();
  
  public Map<Program, ProgramAspectProgramAspectProperties> getMap() {
    return map;
  }
}
