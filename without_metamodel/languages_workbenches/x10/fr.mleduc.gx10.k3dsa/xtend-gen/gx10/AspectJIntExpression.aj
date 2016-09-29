// AspectJ classes that have been aspectized and name
package gx10;
public aspect AspectJIntExpression{
int around (gx10.IntExpression self)  :target (self) && (call ( int gx10.IntExpression.getCurrentValue(  ) ) ) { return gx10.aspects.IntExpressionAspect.getCurrentValue(self );}

}
