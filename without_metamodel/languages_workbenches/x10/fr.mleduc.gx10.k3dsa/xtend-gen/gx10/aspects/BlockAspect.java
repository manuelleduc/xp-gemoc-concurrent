package gx10.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Block;
import gx10.aspects.BlockAspectBlockAspectProperties;
import gx10.aspects.Context;
import gx10.aspects.StatementAspect;
import org.eclipse.emf.ecore.EObject;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends StatementAspect {
  public static void initBlock(final Block _self) {
    final gx10.aspects.BlockAspectBlockAspectProperties _self_ = gx10.aspects.BlockAspectBlockAspectContext.getSelf(_self);
    _privk3_initBlock(_self_, _self);;
  }
  
  public static Context context(final Block _self) {
    final gx10.aspects.BlockAspectBlockAspectProperties _self_ = gx10.aspects.BlockAspectBlockAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_context(_self_, _self);;
    return (gx10.aspects.Context)result;
  }
  
  public static void context(final Block _self, final Context context) {
    final gx10.aspects.BlockAspectBlockAspectProperties _self_ = gx10.aspects.BlockAspectBlockAspectContext.getSelf(_self);
    _privk3_context(_self_, _self,context);;
  }
  
  protected static void _privk3_initBlock(final BlockAspectBlockAspectProperties _self_, final Block _self) {
    Context _context = BlockAspect.context(_self);
    boolean _equals = Objects.equal(_context, null);
    if (_equals) {
      EObject currentStatement = _self.eContainer();
      while (((!Objects.equal(currentStatement, null)) && (!(currentStatement instanceof Block)))) {
        EObject _eContainer = currentStatement.eContainer();
        currentStatement = _eContainer;
      }
      boolean _equals_1 = Objects.equal(currentStatement, null);
      if (_equals_1) {
        Context _context_1 = new Context();
        BlockAspect.context(_self, _context_1);
      } else {
        Context _context_2 = BlockAspect.context(((Block) currentStatement));
        Context _context_3 = new Context(_context_2);
        BlockAspect.context(_self, _context_3);
      }
    }
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
  
  protected static void _privk3_context(final BlockAspectBlockAspectProperties _self_, final Block _self, final Context context) {
    _self_.context = context; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setContext")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, context);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
