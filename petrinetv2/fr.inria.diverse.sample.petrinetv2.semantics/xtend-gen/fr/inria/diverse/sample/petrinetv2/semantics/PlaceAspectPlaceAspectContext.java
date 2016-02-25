package fr.inria.diverse.sample.petrinetv2.semantics;

import fr.inria.diverse.sample.petrinetv2.semantics.PlaceAspectPlaceAspectProperties;
import java.util.Map;
import petrinetv2.Place;

@SuppressWarnings("all")
public class PlaceAspectPlaceAspectContext {
  public final static PlaceAspectPlaceAspectContext INSTANCE = new PlaceAspectPlaceAspectContext();
  
  public static PlaceAspectPlaceAspectProperties getSelf(final Place _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.sample.petrinetv2.semantics.PlaceAspectPlaceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Place, PlaceAspectPlaceAspectProperties> map = new java.util.WeakHashMap<petrinetv2.Place, fr.inria.diverse.sample.petrinetv2.semantics.PlaceAspectPlaceAspectProperties>();
  
  public Map<Place, PlaceAspectPlaceAspectProperties> getMap() {
    return map;
  }
}
