package fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects;

import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspectNetAspectProperties;
import java.util.Map;
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Net;

@SuppressWarnings("all")
public class NetAspectNetAspectContext {
  public final static NetAspectNetAspectContext INSTANCE = new NetAspectNetAspectContext();
  
  public static NetAspectNetAspectProperties getSelf(final Net _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspectNetAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Net, NetAspectNetAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Net, fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspectNetAspectProperties>();
  
  public Map<Net, NetAspectNetAspectProperties> getMap() {
    return map;
  }
}
