package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq;

import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqFactory;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Method;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.MethodCall;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Print;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.Program;
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
  public EPackage getEPackage() {
    return getGseqPackage();
  }
  
  public GseqPackage getGseqPackage() {
    return fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.eINSTANCE;
  }
}
