package fr.mleduc.gseq.xdsml;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	gseq.GseqPackage.eNS_URI,
    	gseq.GseqPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor gSeq = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"fr.mleduc.gseq.xdsml.GSeq", "", "http://mleduc.fr/gseq", "fr.mleduc.gseq.xdsml.GSeqMT"
    );
    gSeq.addAdapter("fr.mleduc.gseq.xdsml.GSeqMT", fr.mleduc.gseq.xdsml.gseq.adapters.gseqmt.GSeqAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"fr.mleduc.gseq.xdsml.GSeq",
    	gSeq
    );
    MelangeRegistry.ModelTypeDescriptor gSeqMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"fr.mleduc.gseq.xdsml.GSeqMT", "", "http://gseqmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"fr.mleduc.gseq.xdsml.GSeqMT",
    	gSeqMT
    );
  }
}
