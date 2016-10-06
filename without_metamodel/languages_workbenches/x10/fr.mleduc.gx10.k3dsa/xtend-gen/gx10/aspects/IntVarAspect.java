package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Block;
import gx10.IntExpression;
import gx10.IntVar;
import gx10.Referentiable;
import gx10.aspects.BlockAspect;
import gx10.aspects.Context;
import gx10.aspects.ExpressionAspect;
import gx10.aspects.IntVarAspectIntVarAspectProperties;

@Aspect(className = IntVar.class)
@SuppressWarnings("all")
public class IntVarAspect extends ExpressionAspect {
  public static void evaluate(final IntVar _self) {
    final gx10.aspects.IntVarAspectIntVarAspectProperties _self_ = gx10.aspects.IntVarAspectIntVarAspectContext.getSelf(_self);
    _privk3_evaluate(_self_, _self);;
  }
  
  protected static void _privk3_evaluate(final IntVarAspectIntVarAspectProperties _self_, final IntVar _self) {
    Block _inBlock = _self.getInBlock();
    Context _context = BlockAspect.context(_inBlock);
    Referentiable _intVarName = _self.getIntVarName();
    String _name = _intVarName.getName();
    IntExpression _intVarExpr = _self.getIntVarExpr();
    int _currentValue = _intVarExpr.getCurrentValue();
    _context.addInt(_name, _currentValue);
  }
}
