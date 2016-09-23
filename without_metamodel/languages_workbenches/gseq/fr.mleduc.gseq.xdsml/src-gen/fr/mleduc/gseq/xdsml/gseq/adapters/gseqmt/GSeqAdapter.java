package fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import fr.mleduc.gseq.xdsml.GSeqMT;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqFactory;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class GSeqAdapter extends ResourceAdapter implements GSeqMT {
  public GSeqAdapter() {
    super(fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqMTAdaptersFactory.getInstance());
  }
  
  @Override
  public GseqFactory getGseqFactory() {
    return new fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.gseq.GseqFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getGseqFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
