package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Block;
import gx10.aspects.BlockAspectBlockAspectProperties;
import gx10.aspects.Context;
import gx10.aspects.StatementAspect;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends StatementAspect {
  public static Context context(final Block _self) {
    final gx10.aspects.BlockAspectBlockAspectProperties _self_ = gx10.aspects.BlockAspectBlockAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_context(_self_, _self);;
    return (gx10.aspects.Context)result;
  }
  
  protected static Context _privk3_context(final BlockAspectBlockAspectProperties _self_, final Block _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getContext") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (gx10.aspects.Context) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.context;
  }
}
