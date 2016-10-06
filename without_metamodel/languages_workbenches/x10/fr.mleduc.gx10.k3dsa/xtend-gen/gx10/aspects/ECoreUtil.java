package gx10.aspects;

import gx10.Block;
import gx10.Statement;
import gx10.aspects.BlockAspect;
import gx10.aspects.Context;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class ECoreUtil {
  public static Context getContext(final Statement _self) {
    Context _xblockexpression = null;
    {
      EObject currentStatement = _self.eContainer();
      while ((!(currentStatement instanceof Block))) {
        EObject _eContainer = currentStatement.eContainer();
        currentStatement = _eContainer;
      }
      final Block block = ((Block) currentStatement);
      final Context context = BlockAspect.context(block);
      _xblockexpression = context;
    }
    return _xblockexpression;
  }
}
