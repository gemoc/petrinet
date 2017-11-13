package fr.inria.diverse.sample.petrinetv1.xdsml;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import petrinetv1.PetrinetV1Factory;

@SuppressWarnings("all")
public interface Petrinetv1MT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract PetrinetV1Factory getPetrinetV1Factory();
  
  public abstract void save(final String uri) throws IOException;
}
