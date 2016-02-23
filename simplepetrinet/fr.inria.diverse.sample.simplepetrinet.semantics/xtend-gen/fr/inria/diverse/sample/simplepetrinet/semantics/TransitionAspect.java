package fr.inria.diverse.sample.simplepetrinet.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.sample.simplepetrinet.semantics.TransitionAspectTransitionAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import simplepetrinet.Place;
import simplepetrinet.Transition;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  /**
   * Query to know if the Transition is enabled.
   * @return true if all input places have at least one token, false otherwise.
   */
  public static boolean isEnabled(final Transition _self) {
    fr.inria.diverse.sample.simplepetrinet.semantics.TransitionAspectTransitionAspectProperties _self_ = fr.inria.diverse.sample.simplepetrinet.semantics.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_isEnabled(_self_, _self);
    return (boolean)result;
  }
  
  /**
   * Transformation rule that fires the Transition.
   */
  @Step
  public static void fire(final Transition _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		fr.inria.diverse.sample.simplepetrinet.semantics.TransitionAspectTransitionAspectProperties _self_ = fr.inria.diverse.sample.simplepetrinet.semantics.TransitionAspectTransitionAspectContext.getSelf(_self);
    		_privk3_fire(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"Transition","fire");
    } else {
    	command.execute();
    }
  }
  
  protected static boolean _privk3_isEnabled(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    EList<Place> _input = _self.getInput();
    final Function1<Place, Boolean> _function = (Place place) -> {
      int _tokens = place.getTokens();
      return Boolean.valueOf((_tokens > 0));
    };
    return IterableExtensions.<Place>forall(_input, _function);
  }
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    boolean _isEnabled = TransitionAspect.isEnabled(_self);
    if (_isEnabled) {
      EList<Place> _input = _self.getInput();
      for (final Place input : _input) {
        int _tokens = input.getTokens();
        int _minus = (_tokens - 1);
        input.setTokens(_minus);
      }
      EList<Place> _output = _self.getOutput();
      for (final Place output : _output) {
        int _tokens_1 = output.getTokens();
        int _plus = (_tokens_1 + 1);
        output.setTokens(_plus);
      }
    }
  }
}
