package gx10.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Block;
import gx10.IntVar;
import gx10.IntVarAccess;
import gx10.aspects.BlockAspect;
import gx10.aspects.Context;
import gx10.aspects.IntExpressionAspect;
import gx10.aspects.IntVarAccessAspectIntVarAccessAspectProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;

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
      Block abc = ((Block) currentStatement);
      IntVar _intVarRef = _self.getIntVarRef();
      String _name = _intVarRef.getName();
      String _plus = ("_self.intVarRef.name = " + _name);
      InputOutput.<String>println(_plus);
      Context _context = BlockAspect.context(abc);
      boolean _equals = Objects.equal(_context, null);
      String _plus_1 = ("_self.inBlock.context is null = " + Boolean.valueOf(_equals));
      InputOutput.<String>println(_plus_1);
      Context _context_1 = BlockAspect.context(abc);
      IntVar _intVarRef_1 = _self.getIntVarRef();
      String _name_1 = _intVarRef_1.getName();
      int _int = _context_1.getInt(_name_1);
      String _plus_2 = ("_self.inBlock.context.getInt = " + Integer.valueOf(_int));
      InputOutput.<String>println(_plus_2);
      Context _context_2 = BlockAspect.context(abc);
      IntVar _intVarRef_2 = _self.getIntVarRef();
      String _name_2 = _intVarRef_2.getName();
      _xblockexpression = _context_2.getInt(_name_2);
    }
    return _xblockexpression;
  }
}
