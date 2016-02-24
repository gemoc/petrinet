package fr.inria.diverse.sample;

import fr.inria.diverse.melange.lib.IMetamodel;
import fr.inria.diverse.sample.PetrinetV1MT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class Petrinetv1 implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static Petrinetv1 load(final String uri) {
    ResourceSet rs = new ResourceSetImpl() ;
    Resource res = rs.getResource(URI.createURI(uri), true) ;
    Petrinetv1 mm = new Petrinetv1() ;
    mm.setResource(res) ;
    return mm ;
  }
  
  public PetrinetV1MT toPetrinetV1MT() {
    fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.Petrinetv1Adapter adaptee = new fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.Petrinetv1Adapter() ;
    adaptee.setAdaptee(resource) ;
    return adaptee ;
  }
}
