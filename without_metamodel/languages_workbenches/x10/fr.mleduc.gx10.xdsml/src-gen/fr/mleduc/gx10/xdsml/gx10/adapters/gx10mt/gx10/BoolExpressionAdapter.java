package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import gx10.BoolExpression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BoolExpressionAdapter extends EObjectAdapter<BoolExpression> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolExpression {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public BoolExpressionAdapter() {
    super(fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance());
    adaptersFactory = fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance();
  }
  
  @Override
  public Block getInBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getInBlock(), eResource);
  }
  
  @Override
  public void setInBlock(final Block o) {
    if (o != null)
    	adaptee.setInBlock(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.BlockAdapter) o).getAdaptee());
    else adaptee.setInBlock(null);
  }
  
  @Override
  public boolean getCurrentValue() {
    return adaptee.getCurrentValue();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getBoolExpression();
  }
}
