package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.BoolExpression;
import gx10.Expression;
import gx10.IntExpression;
import gx10.Print;
import gx10.aspects.PrintAspectPrintAspectProperties;
import gx10.aspects.StatementAspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Print.class)
@SuppressWarnings("all")
public class PrintAspect extends StatementAspect {
  public static void print(final Print _self) {
    final gx10.aspects.PrintAspectPrintAspectProperties _self_ = gx10.aspects.PrintAspectPrintAspectContext.getSelf(_self);
    _privk3_print(_self_, _self);;
  }
  
  protected static void _privk3_print(final PrintAspectPrintAspectProperties _self_, final Print _self) {
    Object _xifexpression = null;
    Expression _toPrint = _self.getToPrint();
    if ((_toPrint instanceof IntExpression)) {
      Expression _toPrint_1 = _self.getToPrint();
      _xifexpression = Integer.valueOf(((IntExpression) _toPrint_1).getCurrentValue());
    } else {
      Expression _toPrint_2 = _self.getToPrint();
      _xifexpression = Boolean.valueOf(((BoolExpression) _toPrint_2).getCurrentValue());
    }
    final Object toPrintVal = ((Object)_xifexpression);
    String _valueOf = String.valueOf(((Comparable<?>)toPrintVal));
    String _plus = (">>>>>>>>>>>>>>>>>>>>>>> " + _valueOf);
    InputOutput.<String>println(_plus);
  }
}
