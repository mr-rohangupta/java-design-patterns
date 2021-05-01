**Decorator Pattern**

**_Decorator says that just "attach a flexible additional responsibility to an object dynamically"._**

**_The Decorator Pattern uses composition instead of inheritance to extend the functionality of an object at runtime._**

**Implementation Steps**

i) **_In my example I had used an interface ICar which has two concrete final implementations._**

ii) **_Kia and Nexa are the two final concrete implementation of ICar._**

iii) **_Lets say if we want to give some discount to all the Cars which implemented ICar so here we will create the abstract CarDecorator
     which implements ICar and accept ICar in constructor._**

iv) **_Then OfferedPrice is the concrete implementation of CarDecorator which have the business logic of giving discount,
    So all those cars which implements ICar can give any discount without changing their concrete implementations._**