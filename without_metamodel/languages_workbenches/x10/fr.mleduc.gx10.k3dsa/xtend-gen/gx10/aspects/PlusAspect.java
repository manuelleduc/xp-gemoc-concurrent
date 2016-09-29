package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Plus;
import gx10.aspects.IntExpressionAspect;

@Aspect(className = Plus.class)
@SuppressWarnings("all")
public class PlusAspect extends IntExpressionAspect {
}
