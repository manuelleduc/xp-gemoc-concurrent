package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq;

import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.And;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Assign;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Const;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Equality;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.False;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.If;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Method;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.MethodCall;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Not;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Print;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Program;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.True;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Var;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class GseqFactoryAdapter extends EFactoryImpl implements GseqFactory {
  private GSeqMTAdaptersFactory adaptersFactory = fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory.getInstance();
  
  private gseq.GseqFactory gseqAdaptee = gseq.GseqFactory.eINSTANCE;
  
  @Override
  public Program createProgram() {
    return adaptersFactory.createProgramAdapter(gseqAdaptee.createProgram(), null);
  }
  
  @Override
  public Method createMethod() {
    return adaptersFactory.createMethodAdapter(gseqAdaptee.createMethod(), null);
  }
  
  @Override
  public Print createPrint() {
    return adaptersFactory.createPrintAdapter(gseqAdaptee.createPrint(), null);
  }
  
  @Override
  public MethodCall createMethodCall() {
    return adaptersFactory.createMethodCallAdapter(gseqAdaptee.createMethodCall(), null);
  }
  
  @Override
  public If createIf() {
    return adaptersFactory.createIfAdapter(gseqAdaptee.createIf(), null);
  }
  
  @Override
  public True createTrue() {
    return adaptersFactory.createTrueAdapter(gseqAdaptee.createTrue(), null);
  }
  
  @Override
  public False createFalse() {
    return adaptersFactory.createFalseAdapter(gseqAdaptee.createFalse(), null);
  }
  
  @Override
  public Equality createEquality() {
    return adaptersFactory.createEqualityAdapter(gseqAdaptee.createEquality(), null);
  }
  
  @Override
  public Not createNot() {
    return adaptersFactory.createNotAdapter(gseqAdaptee.createNot(), null);
  }
  
  @Override
  public And createAnd() {
    return adaptersFactory.createAndAdapter(gseqAdaptee.createAnd(), null);
  }
  
  @Override
  public Const createConst() {
    return adaptersFactory.createConstAdapter(gseqAdaptee.createConst(), null);
  }
  
  @Override
  public Var createVar() {
    return adaptersFactory.createVarAdapter(gseqAdaptee.createVar(), null);
  }
  
  @Override
  public Assign createAssign() {
    return adaptersFactory.createAssignAdapter(gseqAdaptee.createAssign(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getGseqPackage();
  }
  
  public GseqPackage getGseqPackage() {
    return fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.eINSTANCE;
  }
}
