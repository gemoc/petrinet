package fr.inria.diverse.sample.petrinetv2.semantics;

import fr.inria.diverse.sample.petrinetv2.semantics.NetAspectNetAspectProperties;
import java.util.Map;
import petrinetv2.Net;

@SuppressWarnings("all")
public class NetAspectNetAspectContext {
  public final static NetAspectNetAspectContext INSTANCE = new NetAspectNetAspectContext();
  
  public static NetAspectNetAspectProperties getSelf(final Net _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.sample.petrinetv2.semantics.NetAspectNetAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Net, NetAspectNetAspectProperties> map = new java.util.WeakHashMap<petrinetv2.Net, fr.inria.diverse.sample.petrinetv2.semantics.NetAspectNetAspectProperties>();
  
  public Map<Net, NetAspectNetAspectProperties> getMap() {
    return map;
  }
}
