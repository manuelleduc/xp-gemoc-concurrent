package fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import fr.mleduc.gx10.xdsml.GX10MT;
import fr.mleduc.gx10.xdsml.gx10mt.gx10.Gx10Factory;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class GX10Adapter extends ResourceAdapter implements GX10MT {
  public GX10Adapter() {
    super(fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10MTAdaptersFactory.getInstance());
  }
  
  @Override
  public Gx10Factory getGx10Factory() {
    return new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.gx10.Gx10FactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getGx10Factory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
