package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.ControlStructure;
import gx10.aspects.StatementAspect;

@Aspect(className = ControlStructure.class)
@SuppressWarnings("all")
public abstract class ControlStructureAspect extends StatementAspect {
}
