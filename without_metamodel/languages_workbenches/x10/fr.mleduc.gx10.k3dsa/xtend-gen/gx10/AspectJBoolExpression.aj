// AspectJ classes that have been aspectized and name
package gx10;
public aspect AspectJBoolExpression{
boolean around (gx10.BoolExpression self)  :target (self) && (call ( boolean gx10.BoolExpression.getCurrentValue(  ) ) ) { return gx10.aspects.BoolExpressionAspect.getCurrentValue(self );}

}
