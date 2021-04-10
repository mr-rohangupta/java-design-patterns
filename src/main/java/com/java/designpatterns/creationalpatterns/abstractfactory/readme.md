Abstract Factory lets a class return a factory of classes.

Its just like **define an interface or abstract class for creating family of related(dependent) 
object without specifying their concrete classes.**

Here in this example I had created a Bakery interface and Pizza as an abstract class.
Both have their three concrete implementations.

**BakersPizzaAbstractFactory is the common abstract factory implementation of Pizza and Bakery to get Bakery
and Pizza objects.

BakeryFactory and PizzaFactory are the factory classes that inherit BakersPizzaAbstractFactory to generate 
the object of concrete classes.

Finally BakeryPizzaFactoryCreator to get the factories by passing information such as Pizza or Bakery.**


