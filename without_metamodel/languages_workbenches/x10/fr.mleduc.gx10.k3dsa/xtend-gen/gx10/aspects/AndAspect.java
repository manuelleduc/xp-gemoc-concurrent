package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.And;
import gx10.aspects.BoolExpressionAspect;

@Aspect(className = And.class)
@SuppressWarnings("all")
public class AndAspect extends BoolExpressionAspect {
}
