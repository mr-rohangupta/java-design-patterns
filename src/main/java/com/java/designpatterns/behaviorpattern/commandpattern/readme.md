**Command Pattern**

**The command pattern intends to encapsulate in an object all the data required for performing a given action (command), including what method to call, the method's arguments, and the object to which the method belongs.**

**It comprises 4 components Command, Receiver, Invoker and Client.**

**Implementation Steps**

**_i)A command is an object whose role is to store all the information required for executing an action, including the method to call, the method arguments, and the object (known as the receiver) that implements the method._**
   **Ex : In my example the Command is the Order interface along with it two concrete implementations namely BuyStock and SellStock.**

**_ii)A receiver is an object that performs a set of cohesive actions. It's the component that performs the actual action when the command's execute() method is called._**
   **Ex : The Receiver is the Stock class which handles buy and Sell orders.**

**_iii)An invoker is an object that knows how to execute a given command but doesn't know how the command has been implemented. It only knows the command's interface._**
   **Ex: The Broker class is acting as an invoker which is responsible for placing and taking orders.**

**iv)A client is an object that controls the command execution process by specifying what commands to execute and at what stages of the process to execute them.**
   **Ex: The CommandDemo class is the main function which is responsible for Stock buy and sell and also placing orders etc.**