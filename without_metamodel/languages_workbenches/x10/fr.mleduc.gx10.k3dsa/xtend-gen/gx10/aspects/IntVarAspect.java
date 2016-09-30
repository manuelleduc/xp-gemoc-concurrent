package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Block;
import gx10.IntExpression;
import gx10.IntVar;
import gx10.aspects.BlockAspect;
import gx10.aspects.Context;
import gx10.aspects.ExpressionAspect;
import gx10.aspects.IntVarAspectIntVarAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = IntVar.class)
@SuppressWarnings("all")
public class IntVarAspect extends ExpressionAspect {
  public static void evaluate(final IntVar _self) {
    final gx10.aspects.IntVarAspectIntVarAspectProperties _self_ = gx10.aspects.IntVarAspectIntVarAspectContext.getSelf(_self);
    _privk3_evaluate(_self_, _self);;
  }
  
  protected static void _privk3_evaluate(final IntVarAspectIntVarAspectProperties _self_, final IntVar _self) {
    String _name = _self.getName();
    String _plus = ("Debug set value " + _name);
    String _plus_1 = (_plus + " to key \'");
    IntExpression _intVarExpr = _self.getIntVarExpr();
    int _currentValue = _intVarExpr.getCurrentValue();
    String _plus_2 = (_plus_1 + Integer.valueOf(_currentValue));
    String _plus_3 = (_plus_2 + "\'");
    InputOutput.<String>println(_plus_3);
    Block _inBlock = _self.getInBlock();
    Context _context = BlockAspect.context(_inBlock);
    String _name_1 = _self.getName();
    IntExpression _intVarExpr_1 = _self.getIntVarExpr();
    int _currentValue_1 = _intVarExpr_1.getCurrentValue();
    _context.addInt(_name_1, _currentValue_1);
  }
}
