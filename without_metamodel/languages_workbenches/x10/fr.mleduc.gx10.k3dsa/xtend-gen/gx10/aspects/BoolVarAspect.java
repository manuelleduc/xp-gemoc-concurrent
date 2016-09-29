package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.BoolVar;
import gx10.aspects.BoolExpressionAspect;

@Aspect(className = BoolVar.class)
@SuppressWarnings("all")
public class BoolVarAspect extends BoolExpressionAspect {
}
