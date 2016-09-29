package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Method;
import gx10.MethodCall;
import gx10.aspects.ExpressionAspect;
import gx10.aspects.MethodCallAspectMethodCallAspectProperties;
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
  }
}
