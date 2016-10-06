package fr.mleduc.gx10.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import fr.mleduc.gx10.xdsml.GX10MT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class GX10 implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static GX10 load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    GX10 mm = new GX10();
    mm.setResource(res);
    return mm ;
  }
  
  public GX10MT toGX10MT() {
    fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10Adapter adaptee = new fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10Adapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
