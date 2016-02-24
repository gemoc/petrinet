package fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import fr.inria.diverse.sample.PetrinetV1MT;
import fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Factory;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class Petrinetv1Adapter extends ResourceAdapter implements PetrinetV1MT {
  public Petrinetv1Adapter() {
    super(fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.PetrinetV1MTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public Petrinetv1Factory getFactory() {
    return new fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.PetrinetV1MTFactoryAdapter() ;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
