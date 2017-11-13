package fr.inria.diverse.sample.petrinetv1.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import fr.inria.diverse.sample.petrinetv1.xdsml.Petrinetv1MT;
import fr.inria.diverse.sample.petrinetv1.xdsml.XPetrinetv1MT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class XPetrinetv1 implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XPetrinetv1 load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XPetrinetv1 mm = new XPetrinetv1();
    mm.setResource(res);
    return mm ;
  }
  

}
