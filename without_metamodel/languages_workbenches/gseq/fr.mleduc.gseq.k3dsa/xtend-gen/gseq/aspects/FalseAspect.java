package gseq.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gseq.False;
import gseq.aspects.BooleanExpressionAspect;
import gseq.aspects.FalseAspectFalseAspectProperties;

@Aspect(className = False.class)
@SuppressWarnings("all")
public class FalseAspect extends BooleanExpressionAspect {
  public static String pretty(final False _self) {
    final gseq.aspects.FalseAspectFalseAspectProperties _self_ = gseq.aspects.FalseAspectFalseAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_pretty(_self_, _self);;
    return (java.lang.String)result;
  }
  
  public static boolean bvalue(final False _self) {
    final gseq.aspects.FalseAspectFalseAspectProperties _self_ = gseq.aspects.FalseAspectFalseAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_bvalue(_self_, _self);;
    return (boolean)result;
  }
  
  protected static String _privk3_pretty(final FalseAspectFalseAspectProperties _self_, final False _self) {
    return "false";
  }
  
  protected static boolean _privk3_bvalue(final FalseAspectFalseAspectProperties _self_, final False _self) {
    return false;
  }
}
