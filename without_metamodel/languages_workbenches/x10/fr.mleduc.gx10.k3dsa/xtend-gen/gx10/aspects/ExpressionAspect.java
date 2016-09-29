package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Expression;
import gx10.aspects.StatementAspect;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public abstract class ExpressionAspect extends StatementAspect {
}
