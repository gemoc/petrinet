package fr.inria.diverse.sample.simplepetrinet.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.sample.simplepetrinet.semantics.PlaceAspectPlaceAspectProperties;
import simplepetrinet.Place;

@Aspect(className = Place.class)
@SuppressWarnings("all")
public class PlaceAspect {
  public static int tokens(final Place _self) {
    fr.inria.diverse.sample.simplepetrinet.semantics.PlaceAspectPlaceAspectProperties _self_ = fr.inria.diverse.sample.simplepetrinet.semantics.PlaceAspectPlaceAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_tokens(_self_, _self);
    return (int)result;
  }
  
  public static void tokens(final Place _self, final int tokens) {
    fr.inria.diverse.sample.simplepetrinet.semantics.PlaceAspectPlaceAspectProperties _self_ = fr.inria.diverse.sample.simplepetrinet.semantics.PlaceAspectPlaceAspectContext.getSelf(_self);
    _privk3_tokens(_self_, _self,tokens);
  }
  
  protected static int _privk3_tokens(final PlaceAspectPlaceAspectProperties _self_, final Place _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTokens") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.tokens;
  }
  
  protected static void _privk3_tokens(final PlaceAspectPlaceAspectProperties _self_, final Place _self, final int tokens) {
    _self_.tokens = tokens; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTokens")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, tokens);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
