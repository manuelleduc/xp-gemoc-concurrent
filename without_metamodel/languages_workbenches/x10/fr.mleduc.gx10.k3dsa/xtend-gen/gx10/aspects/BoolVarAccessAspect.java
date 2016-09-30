package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.BoolVarAccess;
import gx10.aspects.BoolExpressionAspect;

@Aspect(className = BoolVarAccess.class)
@SuppressWarnings("all")
public class BoolVarAccessAspect extends BoolExpressionAspect {
}
