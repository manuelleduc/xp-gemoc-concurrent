package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Block;
import gx10.IntExpression;
import gx10.Method;
import gx10.MethodCall;
import gx10.MethodCallParameter;
import gx10.aspects.BlockAspect;
import gx10.aspects.Context;
import gx10.aspects.ExpressionAspect;
import gx10.aspects.MethodCallAspectMethodCallAspectProperties;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = MethodCall.class)
@SuppressWarnings("all")
public class MethodCallAspect extends ExpressionAspect {
  public static void call(final MethodCall _self) {
    final gx10.aspects.MethodCallAspectMethodCallAspectProperties _self_ = gx10.aspects.MethodCallAspectMethodCallAspectContext.getSelf(_self);
    _privk3_call(_self_, _self);;
  }
  
  protected static void _privk3_call(final MethodCallAspectMethodCallAspectProperties _self_, final MethodCall _self) {
    Method _methodToCall = _self.getMethodToCall();
    String _name = _methodToCall.getName();
    String _plus = ("Calling " + _name);
    InputOutput.<String>println(_plus);
    final Context tmpCtx = new Context();
    Method _methodToCall_1 = _self.getMethodToCall();
    Block _methodBlock = _methodToCall_1.getMethodBlock();
    BlockAspect.context(_methodBlock, tmpCtx);
    EList<MethodCallParameter> _methodCallParameters = _self.getMethodCallParameters();
    final Consumer<MethodCallParameter> _function = (MethodCallParameter param) -> {
      String _name_1 = param.getName();
      IntExpression _methodCallParameterExpr = param.getMethodCallParameterExpr();
      int _currentValue = _methodCallParameterExpr.getCurrentValue();
      tmpCtx.addInt(_name_1, _currentValue);
    };
    _methodCallParameters.forEach(_function);
  }
}
