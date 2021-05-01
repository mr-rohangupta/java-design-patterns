**Composite Pattern**

**Composite Pattern allow clients to operate in generic manner on objects that may or may not represent a hierarchy of objects.**

**Composite pattern has four participants:**

**Component** : _Component is the interface (or abstract class) for the composition of the objects and methods for accessing/processing its child or node components. It also implements a default interface to define common functionalities/behaviors for all component classes._

**Leaf** : _The leaf class defines a concrete component class, which does not have any further composition. The leaf class implements the component interface. It performs the command/task at its end only._

**Composite** : _The composite class defines a concrete component class, which stores its child components. The composite class implements the component interface. It forwards the command/task to the composite objects it contains. It may also perform additional operations before and after forwarding the command/task._

**Client** : _The client class uses the component interface to interact/manipulate the objects in the composition (Leaf and Composite)._

**_In my example I have Employee interface which is the component, It has two concrete implementation namely Developer and QA which is the leaf,
CompanyDirectory is the composite which is a concrete implementation but with some additional properties and finally Composite Demo is the client.**_
