package fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.PetrinetV1MTAdaptersFactory;
import fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Place;
import fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Transition;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import petrinetv1.Net;

@SuppressWarnings("all")
public class NetAdapter extends EObjectAdapter<Net> implements fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Net {
  private PetrinetV1MTAdaptersFactory adaptersFactory;
  
  public NetAdapter() {
    super(fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.PetrinetV1MTAdaptersFactory.getInstance()) ;
    adaptersFactory = fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.PetrinetV1MTAdaptersFactory.getInstance() ;
  }
  
  private EList<Place> places;
  
  @Override
  public EList<Place> getPlaces() {
    if (places == null)
    	places = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPlaces(), adaptersFactory) ;
    return places;
  }
  
  private EList<Transition> transitions;
  
  @Override
  public EList<Transition> getTransitions() {
    if (transitions == null)
    	transitions = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTransitions(), adaptersFactory) ;
    return transitions;
  }
  
  @Override
  public void initialize() {
    fr.inria.diverse.sample.petrinetv1.semantics.NetAspect.initialize(adaptee) ;
  }
  
  @Override
  public void run() {
    fr.inria.diverse.sample.petrinetv1.semantics.NetAspect.run(adaptee) ;
  }
  
  @Override
  public String markingToString() {
    return fr.inria.diverse.sample.petrinetv1.semantics.NetAspect.markingToString(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.eINSTANCE.getNet();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.NET__PLACES:
    		return getPlaces();
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.NET__TRANSITIONS:
    		return getTransitions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.NET__PLACES:
    		getPlaces().clear();
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.NET__TRANSITIONS:
    		getTransitions().clear();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.NET__PLACES:
    		return getPlaces() != null && !getPlaces().isEmpty();
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.NET__TRANSITIONS:
    		return getTransitions() != null && !getTransitions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.NET__PLACES:
    		getPlaces().clear();
    		getPlaces().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.NET__TRANSITIONS:
    		getTransitions().clear();
    		getTransitions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
