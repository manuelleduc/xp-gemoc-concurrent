package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.IntVar;
import gx10.aspects.IntExpressionAspect;

@Aspect(className = IntVar.class)
@SuppressWarnings("all")
public class IntVarAspect extends IntExpressionAspect {
}
