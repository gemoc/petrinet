package fr.inria.diverse.sample.petrinetv2.semantics;

import fr.inria.diverse.sample.petrinetv2.semantics.NetAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import petrinetv2.Net;
import petrinetv2.PetrinetV2Factory;
import petrinetv2.Place;
import petrinetv2.Transition;

@SuppressWarnings("all")
public class Test {
  public static Net createSampleNet() {
    final PetrinetV2Factory factory = PetrinetV2Factory.eINSTANCE;
    Place _createPlace = factory.createPlace();
    final Procedure1<Place> _function = (Place it) -> {
      it.setName("p1");
      it.setInitialTokens(1);
    };
    final Place p1 = ObjectExtensions.<Place>operator_doubleArrow(_createPlace, _function);
    Place _createPlace_1 = factory.createPlace();
    final Procedure1<Place> _function_1 = (Place it) -> {
      it.setName("p2");
      it.setInitialTokens(1);
    };
    final Place p2 = ObjectExtensions.<Place>operator_doubleArrow(_createPlace_1, _function_1);
    Place _createPlace_2 = factory.createPlace();
    final Procedure1<Place> _function_2 = (Place it) -> {
      it.setName("p3");
      it.setInitialTokens(0);
    };
    final Place p3 = ObjectExtensions.<Place>operator_doubleArrow(_createPlace_2, _function_2);
    Place _createPlace_3 = factory.createPlace();
    final Procedure1<Place> _function_3 = (Place it) -> {
      it.setName("p4");
      it.setInitialTokens(0);
    };
    final Place p4 = ObjectExtensions.<Place>operator_doubleArrow(_createPlace_3, _function_3);
    Transition _createTransition = factory.createTransition();
    final Procedure1<Transition> _function_4 = (Transition it) -> {
      it.setName("t1");
      EList<Place> _input = it.getInput();
      _input.add(p1);
      EList<Place> _output = it.getOutput();
      _output.add(p3);
    };
    final Transition t1 = ObjectExtensions.<Transition>operator_doubleArrow(_createTransition, _function_4);
    Transition _createTransition_1 = factory.createTransition();
    final Procedure1<Transition> _function_5 = (Transition it) -> {
      it.setName("t2");
      EList<Place> _input = it.getInput();
      CollectionExtensions.<Place>addAll(_input, p3, p2);
      EList<Place> _output = it.getOutput();
      _output.add(p4);
    };
    final Transition t2 = ObjectExtensions.<Transition>operator_doubleArrow(_createTransition_1, _function_5);
    Net _createNet = factory.createNet();
    final Procedure1<Net> _function_6 = (Net it) -> {
      EList<Place> _places = it.getPlaces();
      CollectionExtensions.<Place>addAll(_places, p1, p2, p3, p4);
      EList<Transition> _transitions = it.getTransitions();
      CollectionExtensions.<Transition>addAll(_transitions, t1, t2);
    };
    final Net net = ObjectExtensions.<Net>operator_doubleArrow(_createNet, _function_6);
    return net;
  }
  
  public static void main(final String[] args) {
    final Net net = Test.createSampleNet();
    NetAspect.run(net);
  }
}
