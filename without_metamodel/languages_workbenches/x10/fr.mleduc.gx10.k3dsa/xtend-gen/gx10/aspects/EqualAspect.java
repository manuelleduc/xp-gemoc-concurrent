package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Equal;
import gx10.aspects.BoolExpressionAspect;
import gx10.aspects.EqualAspectEqualAspectProperties;

@Aspect(className = Equal.class)
@SuppressWarnings("all")
public class EqualAspect extends BoolExpressionAspect {
  public static void evaluate(final Equal _self) {
    final gx10.aspects.EqualAspectEqualAspectProperties _self_ = gx10.aspects.EqualAspectEqualAspectContext.getSelf(_self);
    _privk3_evaluate(_self_, _self);;
  }
  
  protected static void _privk3_evaluate(final EqualAspectEqualAspectProperties _self_, final Equal _self) {
  }
}
