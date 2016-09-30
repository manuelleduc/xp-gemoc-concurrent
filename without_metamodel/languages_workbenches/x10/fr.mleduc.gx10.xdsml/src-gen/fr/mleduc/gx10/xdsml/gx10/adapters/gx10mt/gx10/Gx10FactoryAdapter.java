package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10;

import fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.And;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Async;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Block;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolVar;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.BoolVarAccess;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.False;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Finish;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Factory;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.If;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.IntConst;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.IntVar;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.IntVarAccess;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Method;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.MethodCall;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Not;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Plus;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Print;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Program;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.True;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.While;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class Gx10FactoryAdapter extends EFactoryImpl implements Gx10Factory {
  private GX10MTAdaptersFactory adaptersFactory = fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance();
  
  private gx10.Gx10Factory gx10Adaptee = gx10.Gx10Factory.eINSTANCE;
  
  @Override
  public Program createProgram() {
    return adaptersFactory.createProgramAdapter(gx10Adaptee.createProgram(), null);
  }
  
  @Override
  public Method createMethod() {
    return adaptersFactory.createMethodAdapter(gx10Adaptee.createMethod(), null);
  }
  
  @Override
  public Block createBlock() {
    return adaptersFactory.createBlockAdapter(gx10Adaptee.createBlock(), null);
  }
  
  @Override
  public If createIf() {
    return adaptersFactory.createIfAdapter(gx10Adaptee.createIf(), null);
  }
  
  @Override
  public While createWhile() {
    return adaptersFactory.createWhileAdapter(gx10Adaptee.createWhile(), null);
  }
  
  @Override
  public True createTrue() {
    return adaptersFactory.createTrueAdapter(gx10Adaptee.createTrue(), null);
  }
  
  @Override
  public False createFalse() {
    return adaptersFactory.createFalseAdapter(gx10Adaptee.createFalse(), null);
  }
  
  @Override
  public Not createNot() {
    return adaptersFactory.createNotAdapter(gx10Adaptee.createNot(), null);
  }
  
  @Override
  public And createAnd() {
    return adaptersFactory.createAndAdapter(gx10Adaptee.createAnd(), null);
  }
  
  @Override
  public IntConst createIntConst() {
    return adaptersFactory.createIntConstAdapter(gx10Adaptee.createIntConst(), null);
  }
  
  @Override
  public Plus createPlus() {
    return adaptersFactory.createPlusAdapter(gx10Adaptee.createPlus(), null);
  }
  
  @Override
  public Async createAsync() {
    return adaptersFactory.createAsyncAdapter(gx10Adaptee.createAsync(), null);
  }
  
  @Override
  public MethodCall createMethodCall() {
    return adaptersFactory.createMethodCallAdapter(gx10Adaptee.createMethodCall(), null);
  }
  
  @Override
  public Finish createFinish() {
    return adaptersFactory.createFinishAdapter(gx10Adaptee.createFinish(), null);
  }
  
  @Override
  public Print createPrint() {
    return adaptersFactory.createPrintAdapter(gx10Adaptee.createPrint(), null);
  }
  
  @Override
  public BoolVar createBoolVar() {
    return adaptersFactory.createBoolVarAdapter(gx10Adaptee.createBoolVar(), null);
  }
  
  @Override
  public IntVar createIntVar() {
    return adaptersFactory.createIntVarAdapter(gx10Adaptee.createIntVar(), null);
  }
  
  @Override
  public IntVarAccess createIntVarAccess() {
    return adaptersFactory.createIntVarAccessAdapter(gx10Adaptee.createIntVarAccess(), null);
  }
  
  @Override
  public BoolVarAccess createBoolVarAccess() {
    return adaptersFactory.createBoolVarAccessAdapter(gx10Adaptee.createBoolVarAccess(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getGx10Package();
  }
  
  public Gx10Package getGx10Package() {
    return fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Package.eINSTANCE;
  }
}
