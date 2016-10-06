package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Block;
import gx10.IntVarAccess;
import gx10.Referentiable;
import gx10.aspects.BlockAspect;
import gx10.aspects.Context;
import gx10.aspects.IntExpressionAspect;
import gx10.aspects.IntVarAccessAspectIntVarAccessAspectProperties;
import org.eclipse.emf.ecore.EObject;

@Aspect(className = IntVarAccess.class)
@SuppressWarnings("all")
public class IntVarAccessAspect extends IntExpressionAspect {
  public static int getCurrentValue(final IntVarAccess _self) {
    final gx10.aspects.IntVarAccessAspectIntVarAccessAspectProperties _self_ = gx10.aspects.IntVarAccessAspectIntVarAccessAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof gx10.IntVarAccess){
    					result = gx10.aspects.IntVarAccessAspect._privk3_getCurrentValue(_self_, (gx10.IntVarAccess)_self);
    } else  if (_self instanceof gx10.IntExpression){
    					result = gx10.aspects.IntExpressionAspect.getCurrentValue((gx10.IntExpression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  protected static int _privk3_getCurrentValue(final IntVarAccessAspectIntVarAccessAspectProperties _self_, final IntVarAccess _self) {
    int _xblockexpression = (int) 0;
    {
      EObject currentStatement = _self.eContainer();
      while ((!(currentStatement instanceof Block))) {
        EObject _eContainer = currentStatement.eContainer();
        currentStatement = _eContainer;
      }
      Context _context = BlockAspect.context(((Block) currentStatement));
      Referentiable _intVarRef = _self.getIntVarRef();
      String _name = _intVarRef.getName();
      _xblockexpression = _context.getInt(_name);
    }
    return _xblockexpression;
  }
}
