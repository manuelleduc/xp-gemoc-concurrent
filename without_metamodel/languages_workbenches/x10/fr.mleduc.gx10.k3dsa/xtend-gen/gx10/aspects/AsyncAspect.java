package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Async;
import gx10.aspects.StatementAspect;

@Aspect(className = Async.class)
@SuppressWarnings("all")
public class AsyncAspect extends StatementAspect {
}
