package fr.inria.diverse.sample.simplepetrinet.semantics;

import fr.inria.diverse.sample.simplepetrinet.semantics.PlaceAspectPlaceAspectProperties;
import java.util.Map;
import simplepetrinet.Place;

@SuppressWarnings("all")
public class PlaceAspectPlaceAspectContext {
  public final static PlaceAspectPlaceAspectContext INSTANCE = new PlaceAspectPlaceAspectContext();
  
  public static PlaceAspectPlaceAspectProperties getSelf(final Place _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.sample.simplepetrinet.semantics.PlaceAspectPlaceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Place, PlaceAspectPlaceAspectProperties> map = new java.util.WeakHashMap<simplepetrinet.Place, fr.inria.diverse.sample.simplepetrinet.semantics.PlaceAspectPlaceAspectProperties>();
  
  public Map<Place, PlaceAspectPlaceAspectProperties> getMap() {
    return map;
  }
}
