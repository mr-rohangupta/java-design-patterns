**Prototype Pattern**

**Prototype Pattern allows you to copy existing objects without making your code dependent on
their classes.**

**The major advantages includes hiding the complexity of creating objects, adding and removing
of objects at runtime.**

**_In this example I created an interface OperatingSystem with one abstract method clone(implementing 
cloneable), which has three concrete implementations namely IOS,Windows and Ubuntu._**

**_We have ProtoTypeFactory class which have clone method which will call the clone method of respective
concrete implementations._**

**_From the main method we can get as many objects as we want without creating new instance using new 
operator._**


