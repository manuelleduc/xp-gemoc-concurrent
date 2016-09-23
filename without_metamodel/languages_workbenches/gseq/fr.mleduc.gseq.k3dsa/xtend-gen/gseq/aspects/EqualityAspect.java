package gseq.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gseq.Equality;
import gseq.IntegerExpression;
import gseq.aspects.BooleanExpressionAspect;
import gseq.aspects.EqualityAspectEqualityAspectProperties;

@Aspect(className = Equality.class)
@SuppressWarnings("all")
public class EqualityAspect extends BooleanExpressionAspect {
  public static boolean bvalue(final Equality _self) {
    final gseq.aspects.EqualityAspectEqualityAspectProperties _self_ = gseq.aspects.EqualityAspectEqualityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_bvalue(_self_, _self);;
    return (boolean)result;
  }
  
  protected static boolean _privk3_bvalue(final EqualityAspectEqualityAspectProperties _self_, final Equality _self) {
    IntegerExpression _leftEquality = _self.getLeftEquality();
    long _ivalue = _leftEquality.ivalue();
    IntegerExpression _rightEquality = _self.getRightEquality();
    long _ivalue_1 = _rightEquality.ivalue();
    return (_ivalue == _ivalue_1);
  }
}
