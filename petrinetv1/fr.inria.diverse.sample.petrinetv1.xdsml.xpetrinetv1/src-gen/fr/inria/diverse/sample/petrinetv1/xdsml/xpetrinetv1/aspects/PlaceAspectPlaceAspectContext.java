package fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects;

import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.PlaceAspectPlaceAspectProperties;
import java.util.Map;
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Place;

@SuppressWarnings("all")
public class PlaceAspectPlaceAspectContext {
  public final static PlaceAspectPlaceAspectContext INSTANCE = new PlaceAspectPlaceAspectContext();
  
  public static PlaceAspectPlaceAspectProperties getSelf(final Place _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.PlaceAspectPlaceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Place, PlaceAspectPlaceAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Place, fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.PlaceAspectPlaceAspectProperties>();
  
  public Map<Place, PlaceAspectPlaceAspectProperties> getMap() {
    return map;
  }
}
