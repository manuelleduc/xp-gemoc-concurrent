package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory;
import gseq.Printable;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class PrintableAdapter extends EObjectAdapter<Printable> implements fr.mleduc.gseq.xdsml.gseqmt.gseq.Printable {
  private GSeqMTAdaptersFactory adaptersFactory;
  
  public PrintableAdapter() {
    super(fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory.getInstance());
    adaptersFactory = fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String pretty() {
    return adaptee.pretty();
  }
  
  @Override
  public EClass eClass() {
    return fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqPackage.eINSTANCE.getPrintable();
  }
}
