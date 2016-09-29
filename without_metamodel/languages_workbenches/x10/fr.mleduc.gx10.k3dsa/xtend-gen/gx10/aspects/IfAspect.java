package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.If;
import gx10.aspects.ControlStructureAspect;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class IfAspect extends ControlStructureAspect {
}
