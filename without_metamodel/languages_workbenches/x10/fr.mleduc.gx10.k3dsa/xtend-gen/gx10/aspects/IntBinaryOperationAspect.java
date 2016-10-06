package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.IntBinaryOperation;
import gx10.aspects.IntExpressionAspect;

@Aspect(className = IntBinaryOperation.class)
@SuppressWarnings("all")
public class IntBinaryOperationAspect extends IntExpressionAspect {
}
