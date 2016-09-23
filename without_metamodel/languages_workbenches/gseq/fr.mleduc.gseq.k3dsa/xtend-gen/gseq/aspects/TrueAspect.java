package gseq.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gseq.True;
import gseq.aspects.BooleanExpressionAspect;
import gseq.aspects.TrueAspectTrueAspectProperties;

@Aspect(className = True.class)
@SuppressWarnings("all")
public class TrueAspect extends BooleanExpressionAspect {
  public static String pretty(final True _self) {
    final gseq.aspects.TrueAspectTrueAspectProperties _self_ = gseq.aspects.TrueAspectTrueAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_pretty(_self_, _self);;
    return (java.lang.String)result;
  }
  
  public static boolean bvalue(final True _self) {
    final gseq.aspects.TrueAspectTrueAspectProperties _self_ = gseq.aspects.TrueAspectTrueAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_bvalue(_self_, _self);;
    return (boolean)result;
  }
  
  protected static String _privk3_pretty(final TrueAspectTrueAspectProperties _self_, final True _self) {
    return "true";
  }
  
  protected static boolean _privk3_bvalue(final TrueAspectTrueAspectProperties _self_, final True _self) {
    return true;
  }
}
