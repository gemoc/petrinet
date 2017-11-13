package fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.TransitionAspectTransitionAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Place;
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Transition;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  /**
   * Query to know if the Transition is enabled.
   * @return true if all input places have at least one token, false otherwise.
   */
  public static boolean isEnabled(final Transition _self) {
	final fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.TransitionAspectTransitionAspectProperties _self_ = fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_isEnabled(_self_, _self);
	;
	return (boolean) result;
}
  
  /**
   * Transformation rule that fires the Transition.
   */
  @Step
  public static void fire(final Transition _self) {
	final fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.TransitionAspectTransitionAspectProperties _self_ = fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_fire(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Transition", "fire");
	} else {
		command.execute();
	}
	;
	;
}
  
  protected static boolean _privk3_isEnabled(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    final Function1<Place, Boolean> _function = (Place place) -> {
      int _tokens = place.getTokens();
      return Boolean.valueOf((_tokens > 0));
    };
    return IterableExtensions.<Place>forall(_self.getInput(), _function);
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
