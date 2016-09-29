package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.While;
import gx10.aspects.ControlStructureAspect;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class WhileAspect extends ControlStructureAspect {
}
