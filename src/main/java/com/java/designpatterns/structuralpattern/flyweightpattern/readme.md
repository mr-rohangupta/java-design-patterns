**Flyweight Pattern**

**Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance.**

**Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found.**

**In short, it uses the cache concept to store the objects and tries to re-use it.(Hazelcast).**

**Implementation Briefing**

**_In this example I have created a Vehicle interface and Engine class._**

_**Car is the concrete implementation of Vehicle and also Inside Car class Engine is in has-A relationship and Car accepts Engine in constructor.**_

**_VehicleFactory acts as a FlyWeight which has the Map of Color, Car. For every new request it will check the Map whether that car with the requested color exists or not. If yes it will return the same._**