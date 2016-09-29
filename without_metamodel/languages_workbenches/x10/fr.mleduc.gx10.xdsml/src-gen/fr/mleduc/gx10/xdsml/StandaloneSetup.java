package fr.mleduc.gx10.xdsml;

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
    	gx10.Gx10Package.eNS_URI,
    	gx10.Gx10Package.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor gX10 = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"fr.mleduc.gx10.xdsml.GX10", "", "http://mleduc.fr/gx10", "fr.mleduc.gx10.xdsml.GX10MT"
    );
    gX10.addAdapter("fr.mleduc.gx10.xdsml.GX10MT", fr.mleduc.gx10.xdsml.gx10.adapters.gx10mt.GX10Adapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"fr.mleduc.gx10.xdsml.GX10",
    	gX10
    );
    MelangeRegistry.ModelTypeDescriptor gX10MT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"fr.mleduc.gx10.xdsml.GX10MT", "", "http://gx10mt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"fr.mleduc.gx10.xdsml.GX10MT",
    	gX10MT
    );
  }
}
