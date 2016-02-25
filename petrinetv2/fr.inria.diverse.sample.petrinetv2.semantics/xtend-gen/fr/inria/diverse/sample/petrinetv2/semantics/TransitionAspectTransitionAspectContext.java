package fr.inria.diverse.sample.petrinetv2.semantics;

import fr.inria.diverse.sample.petrinetv2.semantics.TransitionAspectTransitionAspectProperties;
import java.util.Map;
import petrinetv2.Transition;

@SuppressWarnings("all")
public class TransitionAspectTransitionAspectContext {
  public final static TransitionAspectTransitionAspectContext INSTANCE = new TransitionAspectTransitionAspectContext();
  
  public static TransitionAspectTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.sample.petrinetv2.semantics.TransitionAspectTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition, TransitionAspectTransitionAspectProperties> map = new java.util.WeakHashMap<petrinetv2.Transition, fr.inria.diverse.sample.petrinetv2.semantics.TransitionAspectTransitionAspectProperties>();
  
  public Map<Transition, TransitionAspectTransitionAspectProperties> getMap() {
    return map;
  }
}
