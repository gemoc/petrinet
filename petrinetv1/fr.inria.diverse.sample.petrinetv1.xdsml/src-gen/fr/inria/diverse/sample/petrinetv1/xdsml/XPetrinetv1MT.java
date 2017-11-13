package fr.inria.diverse.sample.petrinetv1.xdsml;

import fr.inria.diverse.melange.lib.IModelType;
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1mt.petrinetv1.Petrinetv1Factory;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface XPetrinetv1MT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract Petrinetv1Factory getPetrinetv1Factory();
  
  public abstract void save(final String uri) throws IOException;
}
