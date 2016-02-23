package fr.inria.diverse.sample.simplepetrinet.semantics;

import fr.inria.diverse.sample.simplepetrinet.semantics.NetAspectNetAspectProperties;
import java.util.Map;
import simplepetrinet.Net;

@SuppressWarnings("all")
public class NetAspectNetAspectContext {
  public final static NetAspectNetAspectContext INSTANCE = new NetAspectNetAspectContext();
  
  public static NetAspectNetAspectProperties getSelf(final Net _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.sample.simplepetrinet.semantics.NetAspectNetAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Net, NetAspectNetAspectProperties> map = new java.util.WeakHashMap<simplepetrinet.Net, fr.inria.diverse.sample.simplepetrinet.semantics.NetAspectNetAspectProperties>();
  
  public Map<Net, NetAspectNetAspectProperties> getMap() {
    return map;
  }
}
