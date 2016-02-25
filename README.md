# Evolutions of a Petri net xDSML and its generated trace metamodel

Experimentations about model and execution trace co-evolution.

This repository contains three versions of a Petri net xDSML implemented using the GEMOC Studio. Each version can be found in a folder `petrinetVX` with X the number of the version. Each version is based on four Eclipse projects:

- `fr.inria.diverse.sample.petrinetvX.model`: contains the abstract syntax as an Ecore metamodel. Also containing the dynamic parts of the language, each annotated with `aspect`. A concrete syntax representation is provided in an `.aird` file.
- `fr.inria.diverse.sample.petrinetvX.semantics`: contains the semantics of the language as a Kermeta model transformation. Transformation rules annotated with `@Step` result in execution steps when applied. Also contains a `Test.xtend` file to test the language in pure Xtend/Java without the GEMOC runtime.
- `fr.inria.diverse.sample.petrinetvX.trace`: contains the generated domain-specific trace metamodel for the language. A concrete syntax representation is provided in an `.aird` file.
- `fr.inria.diverse.sample.petrinetvX.xdsml`: contains the Melange model that binds all parts of the xDSML.

## V1: Simple Petri nets

Simple Petri net language with places and transitions. Arcs are not weighted, hence only one token is removed/added per arc when a transition is fired.

Metamodel:

![V1 metamodel](https://raw.githubusercontent.com/gemoc/petrinet/master/petrinetv1/fr.inria.diverse.sample.petrinetv1.model/model/petrinetv1%20class%20diagram.png)

Trace metamodel:

![V1 trace metamodel](https://raw.githubusercontent.com/gemoc/petrinet/master/petrinetv1/fr.inria.diverse.sample.petrinetv1.trace/model/petrinetv1Trace%20class%20diagram.png)


## V2: Tokens as objects

Evolution of the V1: a class `Tokens` was added to represent tokens instead of using counters.

Metamodel:

![V2 metamodel](https://raw.githubusercontent.com/gemoc/petrinet/master/petrinetv2/fr.inria.diverse.sample.petrinetv2.model/model/petrinetv2%20class%20diagram.png)

Trace metamodel: 

![V2 trace metamodel](https://raw.githubusercontent.com/gemoc/petrinet/master/petrinetv2/fr.inria.diverse.sample.petrinetv2.trace/model/petrinetv2Trace%20class%20diagram.png)


## V3: Timed Petri nets

Evolution of the V2 into a *timed* Petri net language: each transition has temporal boundaries (`tmin` and `tmax`), along with a dynamic `clock`. A transition can only be fired if its clock value is between the boundaries.

Metamodel:

![V3 metamodel](https://raw.githubusercontent.com/gemoc/petrinet/master/petrinetv3/fr.inria.diverse.sample.petrinetv3.model/model/petrinetv3%20class%20diagram.png)


Trace metamodel: TODO

![V3 trace metamodel](https://raw.githubusercontent.com/gemoc/petrinet/master/petrinetv3/fr.inria.diverse.sample.petrinetv3.trace/model/petrinetv3Trace%20class%20diagram.png)
