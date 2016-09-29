package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Not;
import gx10.aspects.BoolExpressionAspect;

@Aspect(className = Not.class)
@SuppressWarnings("all")
public class NotAspect extends BoolExpressionAspect {
}
