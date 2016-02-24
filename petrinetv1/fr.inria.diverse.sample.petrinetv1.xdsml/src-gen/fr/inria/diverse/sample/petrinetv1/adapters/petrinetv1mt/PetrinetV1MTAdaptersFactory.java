package fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.NetAdapter;
import fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.PlaceAdapter;
import fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.TransitionAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import petrinetv1.Net;
import petrinetv1.Place;
import petrinetv1.Transition;

@SuppressWarnings("all")
public class PetrinetV1MTAdaptersFactory implements AdaptersFactory {
  private static PetrinetV1MTAdaptersFactory instance;
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public PetrinetV1MTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public static PetrinetV1MTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.PetrinetV1MTAdaptersFactory() ;
    }
    return instance ;
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof petrinetv1.Net){
    	return createNetAdapter((petrinetv1.Net) o, res) ;
    }
    if (o instanceof petrinetv1.Transition){
    	return createTransitionAdapter((petrinetv1.Transition) o, res) ;
    }
    if (o instanceof petrinetv1.Place){
    	return createPlaceAdapter((petrinetv1.Place) o, res) ;
    }
    
    return null ;
  }
  
  public NetAdapter createNetAdapter(final Net adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.NetAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.NetAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.NetAdapter) adapter ;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.TransitionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.TransitionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.TransitionAdapter) adapter ;
    }
  }
  
  public PlaceAdapter createPlaceAdapter(final Place adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.PlaceAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.PlaceAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.PlaceAdapter) adapter ;
    }
  }
}
