package fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects;

import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.TransitionAspectTransitionAspectProperties;
import java.util.Map;
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Transition;

@SuppressWarnings("all")
public class TransitionAspectTransitionAspectContext {
  public final static TransitionAspectTransitionAspectContext INSTANCE = new TransitionAspectTransitionAspectContext();
  
  public static TransitionAspectTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.TransitionAspectTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition, TransitionAspectTransitionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Transition, fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.TransitionAspectTransitionAspectProperties>();
  
  public Map<Transition, TransitionAspectTransitionAspectProperties> getMap() {
    return map;
  }
}
