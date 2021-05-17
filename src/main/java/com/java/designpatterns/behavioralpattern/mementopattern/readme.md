**Memento Pattern**
_**Hint: Ctrl + Z , Painting example**_

**Memento pattern is used to restore state of an object to a previous state. It is also known as snapshot pattern.**

**Memento comprises three components Originator, Caretaker and memento**

**Implementation Steps**

i) The **originator** is some object that has an internal state.
   **Ex: In this example Paint class is the Originator.**

2) The **caretaker** is going to do something to the originator, but wants to be able to undo the change.
   **Ex: In my example the methods restore and createMemento are the care takers**.
   
3) The **Memento** is the lock box that is written and read by the Originator, and shepherded by the Caretaker.
     Ex: In my example the PaintMemento is the memento