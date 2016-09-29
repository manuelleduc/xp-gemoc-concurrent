package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Finish;
import gx10.aspects.StatementAspect;

@Aspect(className = Finish.class)
@SuppressWarnings("all")
public class FinishAspect extends StatementAspect {
}
