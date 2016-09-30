package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Expression;
import gx10.Print;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class PrintAdapter extends EObjectAdapter<Print> implements fr.mleduc.gx10.xdsml.gx10mt.gx10.Print {
  private GX10MTAdaptersFactory adaptersFactory;
  
  public PrintAdapter() {
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
  public Expression getToPrint() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getToPrint(), eResource);
  }
  
  @Override
  public void setToPrint(final Expression o) {
    if (o != null)
    	adaptee.setToPrint(((fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.ExpressionAdapter) o).getAdaptee());
    else adaptee.setToPrint(null);
  }
  
  @Override
  public void print() {
    adaptee.print();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE.getPrint();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PRINT__IN_BLOCK:
    		return getInBlock();
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PRINT__TO_PRINT:
    		return getToPrint();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PRINT__IN_BLOCK:
    		return getInBlock() != null;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PRINT__TO_PRINT:
    		return getToPrint() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PRINT__IN_BLOCK:
    		setInBlock(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Block)
    		 newValue);
    		return;
    	case fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.PRINT__TO_PRINT:
    		setToPrint(
    		(fr.mleduc.gx10.xdsml.gx10mt.gx10.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
