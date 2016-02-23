package fr.inria.diverse.sample.simplepetrinet.semantics;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.sample.simplepetrinet.semantics.NetAspectNetAspectProperties;
import fr.inria.diverse.sample.simplepetrinet.semantics.TransitionAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import simplepetrinet.Net;
import simplepetrinet.Place;
import simplepetrinet.Transition;

@Aspect(className = Net.class)
@SuppressWarnings("all")
public class NetAspect {
  /**
   * Initialization function to be called after creating
   * the objects of the executable model.
   * Each place is given as many tokens as specified in initialTokens.
   */
  @Step
  public static void initialize(final Net _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		fr.inria.diverse.sample.simplepetrinet.semantics.NetAspectNetAspectProperties _self_ = fr.inria.diverse.sample.simplepetrinet.semantics.NetAspectNetAspectContext.getSelf(_self);
    		_privk3_initialize(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"Net","initialize");
    } else {
    	command.execute();
    }
  }
  
  /**
   * Transformation rule that runs the Petri net to completion.
   */
  @Main
  public static void run(final Net _self) {
    fr.inria.diverse.sample.simplepetrinet.semantics.NetAspectNetAspectProperties _self_ = fr.inria.diverse.sample.simplepetrinet.semantics.NetAspectNetAspectContext.getSelf(_self);
    _privk3_run(_self_, _self);
  }
  
  public static String markingToString(final Net _self) {
    fr.inria.diverse.sample.simplepetrinet.semantics.NetAspectNetAspectProperties _self_ = fr.inria.diverse.sample.simplepetrinet.semantics.NetAspectNetAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_markingToString(_self_, _self);
    return (java.lang.String)result;
  }
  
  protected static void _privk3_initialize(final NetAspectNetAspectProperties _self_, final Net _self) {
    EList<Place> _places = _self.getPlaces();
    for (final Place place : _places) {
      int _initialTokens = place.getInitialTokens();
      place.setTokens(_initialTokens);
    }
  }
  
  protected static void _privk3_run(final NetAspectNetAspectProperties _self_, final Net _self) {
    NetAspect.initialize(_self);
    int i = 0;
    while (true) {
      {
        EList<Transition> _transitions = _self.getTransitions();
        final Function1<Transition, Boolean> _function = (Transition t) -> {
          return Boolean.valueOf(TransitionAspect.isEnabled(t));
        };
        final Transition enabledTransition = IterableExtensions.<Transition>findFirst(_transitions, _function);
        boolean _notEquals = (!Objects.equal(enabledTransition, null));
        if (_notEquals) {
          TransitionAspect.fire(enabledTransition);
          int _plusPlus = i++;
          InputOutput.<Integer>println(Integer.valueOf(_plusPlus));
          String _markingToString = NetAspect.markingToString(_self);
          InputOutput.<String>println(_markingToString);
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
        _builder.append("\t");
        String _name = p.getName();
        _builder.append(_name, "\t");
        _builder.append(": ");
        int _tokens = p.getTokens();
        _builder.append(_tokens, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
}
