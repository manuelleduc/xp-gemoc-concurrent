package gx10.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import gx10.Block;
import gx10.aspects.StatementAspect;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends StatementAspect {
}
