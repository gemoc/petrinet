package fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspectNetAspectProperties;
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.TransitionAspect;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Net;
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Place;
import fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.petrinetv1.Transition;

@Aspect(className = Net.class)
@SuppressWarnings("all")
public class NetAspect {
  /**
   * Each place is given as many tokens as specified in initialTokens.
   */
  @InitializeModel
  public static void initialize(final Net _self, final List<String> args) {
    final fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspectNetAspectProperties _self_ = fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspectNetAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self,args);;
  }
  
  /**
   * Transformation rule that runs the Petri net to completion.
   */
  @Main
  @Step
  public static void run(final Net _self) {
	final fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspectNetAspectProperties _self_ = fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspectNetAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_run(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Net", "run");
	} else {
		command.execute();
	}
	;
	;
}
  
  public static String markingToString(final Net _self) {
	final fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspectNetAspectProperties _self_ = fr.inria.diverse.sample.petrinetv1.xdsml.xpetrinetv1.aspects.NetAspectNetAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_markingToString(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  protected static void _privk3_initialize(final NetAspectNetAspectProperties _self_, final Net _self, final List<String> args) {
    EList<Place> _places = _self.getPlaces();
    for (final Place place : _places) {
      place.setTokens(place.getInitialTokens());
    }
  }
  
  protected static void _privk3_run(final NetAspectNetAspectProperties _self_, final Net _self) {
    while (true) {
      {
        final Function1<Transition, Boolean> _function = (Transition t) -> {
          return Boolean.valueOf(TransitionAspect.isEnabled(t));
        };
        final Transition enabledTransition = IterableExtensions.<Transition>findFirst(_self.getTransitions(), _function);
        boolean _notEquals = (!Objects.equal(enabledTransition, null));
        if (_notEquals) {
          TransitionAspect.fire(enabledTransition);
        } else {
          return;
        }
      }
    }
  }
  
  protected static String _privk3_markingToString(final NetAspectNetAspectProperties _self_, final Net _self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Net marking:");
    _builder.newLine();
    {
      EList<Place> _places = _self.getPlaces();
      for(final Place p : _places) {
        _builder.append("\t\t\t");
        String _name = p.getName();
        _builder.append(_name, "\t\t\t");
        _builder.append(": ");
        int _tokens = p.getTokens();
        _builder.append(_tokens, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
}
