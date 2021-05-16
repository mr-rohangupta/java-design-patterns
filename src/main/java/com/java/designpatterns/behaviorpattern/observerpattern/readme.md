**Observer Pattern**
_**(Pub Sub Pattern)**_

**The observer pattern is used to allow an object to publish changes to its state. Other objects subscribe to be immediately notified of any changes.**

**Implementation Steps**

**_i) IProducer interface has methods such as subscribe, unsubscribe and notify so that every subscriber can register and deregister themselves.It has one concrete implementation which is MessagePublisher._**

**_ii) Observer interface has only one abstract method receive and has three concrete implementations SubscriberOne, SubscriberTwo and SubscriberThree. All these are the Consumers which receives the messages send by Producer._**

**_iii) Message class is the type of message being passed and ObserverDemo is the main class which will trigger the program to send messages._**