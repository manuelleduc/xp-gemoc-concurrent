package fr.mleduc.gseq.xdsml;

import fr.inria.diverse.melange.lib.IModelType;
import fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqFactory;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface GSeqMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract GseqFactory getGseqFactory();
  
  public abstract void save(final String uri) throws IOException;
}
