package fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.PetrinetV1MTAdaptersFactory;
import org.eclipse.emf.ecore.EClass;
import petrinetv1.Place;

@SuppressWarnings("all")
public class PlaceAdapter extends EObjectAdapter<Place> implements fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Place {
  private PetrinetV1MTAdaptersFactory adaptersFactory;
  
  public PlaceAdapter() {
    super(fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.PetrinetV1MTAdaptersFactory.getInstance()) ;
    adaptersFactory = fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.PetrinetV1MTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  @Override
  public int getInitialTokens() {
    return adaptee.getInitialTokens() ;
  }
  
  @Override
  public void setInitialTokens(final int o) {
    adaptee.setInitialTokens(o) ;
  }
  
  @Override
  public int getTokens() {
    return fr.inria.diverse.sample.petrinetv1.semantics.PlaceAspect.tokens(adaptee) ;
  }
  
  @Override
  public void setTokens(final int tokens) {
    fr.inria.diverse.sample.petrinetv1.semantics.PlaceAspect.tokens(adaptee, tokens
    ) ;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static int INITIAL_TOKENS_EDEFAULT = 0;
  
  protected final static int TOKENS_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.eINSTANCE.getPlace();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.PLACE__NAME:
    		return getName();
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.PLACE__INITIAL_TOKENS:
    		return new java.lang.Integer(getInitialTokens());
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.PLACE__TOKENS:
    		return new java.lang.Integer(getTokens());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.PLACE__NAME:
    		setName(NAME_EDEFAULT);
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.PLACE__INITIAL_TOKENS:
    		setInitialTokens(INITIAL_TOKENS_EDEFAULT);
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.PLACE__TOKENS:
    		setTokens(TOKENS_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.PLACE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.PLACE__INITIAL_TOKENS:
    		return getInitialTokens() != INITIAL_TOKENS_EDEFAULT;
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.PLACE__TOKENS:
    		return getTokens() != TOKENS_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.PLACE__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.PLACE__INITIAL_TOKENS:
    		setInitialTokens(((java.lang.Integer) newValue).intValue());
    		return;
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.PLACE__TOKENS:
    		setTokens(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
