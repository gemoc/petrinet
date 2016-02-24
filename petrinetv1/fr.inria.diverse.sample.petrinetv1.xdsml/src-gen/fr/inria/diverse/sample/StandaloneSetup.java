package fr.inria.diverse.sample;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup() ;
    setup.doEMFRegistration() ;
    setup.doAdaptersRegistration() ;
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	petrinetv1.PetrinetV1Package.eNS_URI,
    	petrinetv1.PetrinetV1Package.eINSTANCE
    ) ;
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    ) ;
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    ) ;
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor petrinetv1 = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"fr.inria.diverse.sample.Petrinetv1", "", "petrinetv1", "fr.inria.diverse.sample.PetrinetV1MT"
    ) ;
    petrinetv1.addAdapter("fr.inria.diverse.sample.PetrinetV1MT", fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.Petrinetv1Adapter.class) ;
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"fr.inria.diverse.sample.Petrinetv1",
    	petrinetv1
    ) ;
    MelangeRegistry.ModelTypeDescriptor petrinetV1MT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"fr.inria.diverse.sample.PetrinetV1MT", "", "http://petrinetv1mt/"
    ) ;
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"fr.inria.diverse.sample.PetrinetV1MT",
    	petrinetV1MT
    ) ;
  }
}
