package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Block;
import gx10.BoolExpression;
import gx10.BoolVar;
import gx10.aspects.BlockAspect;
import gx10.aspects.BoolVarAspectBoolVarAspectProperties;
import gx10.aspects.Context;
import gx10.aspects.ExpressionAspect;

@Aspect(className = BoolVar.class)
@SuppressWarnings("all")
public class BoolVarAspect extends ExpressionAspect {
  public static void evaluate(final BoolVar _self) {
    final gx10.aspects.BoolVarAspectBoolVarAspectProperties _self_ = gx10.aspects.BoolVarAspectBoolVarAspectContext.getSelf(_self);
    _privk3_evaluate(_self_, _self);;
  }
  
  protected static void _privk3_evaluate(final BoolVarAspectBoolVarAspectProperties _self_, final BoolVar _self) {
    Block _inBlock = _self.getInBlock();
    Context _context = BlockAspect.context(_inBlock);
    String _name = _self.getName();
    BoolExpression _boolVarExpr = _self.getBoolVarExpr();
    boolean _currentValue = _boolVarExpr.getCurrentValue();
    _context.addBool(_name, _currentValue);
  }
}
