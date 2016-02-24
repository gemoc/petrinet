package fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.sample.petrinetv1.adapters.petrinetv1mt.PetrinetV1MTAdaptersFactory;
import fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Place;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import petrinetv1.Transition;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Transition {
  private PetrinetV1MTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
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
  
  private EList<Place> input;
  
  @Override
  public EList<Place> getInput() {
    if (input == null)
    	input = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInput(), adaptersFactory) ;
    return input;
  }
  
  private EList<Place> output;
  
  @Override
  public EList<Place> getOutput() {
    if (output == null)
    	output = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutput(), adaptersFactory) ;
    return output;
  }
  
  @Override
  public boolean isEnabled() {
    return fr.inria.diverse.sample.petrinetv1.semantics.TransitionAspect.isEnabled(adaptee) ;
  }
  
  @Override
  public void fire() {
    fr.inria.diverse.sample.petrinetv1.semantics.TransitionAspect.fire(adaptee) ;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.TRANSITION__INPUT:
    		return getInput();
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.TRANSITION__OUTPUT:
    		return getOutput();
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.TRANSITION__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.TRANSITION__INPUT:
    		getInput().clear();
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.TRANSITION__OUTPUT:
    		getOutput().clear();
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.TRANSITION__NAME:
    		setName(NAME_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.TRANSITION__INPUT:
    		return getInput() != null && !getInput().isEmpty();
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.TRANSITION__OUTPUT:
    		return getOutput() != null && !getOutput().isEmpty();
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.TRANSITION__INPUT:
    		getInput().clear();
    		getInput().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.TRANSITION__OUTPUT:
    		getOutput().clear();
    		getOutput().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.sample.petrinetv1mt.petrinetv1.Petrinetv1Package.TRANSITION__NAME:
    		setName((java.lang.String) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
