**Chain Of Responsibility Pattern**

**The Chain of Responsibility pattern is part of the classic Gang of Four behavior pattern family that addresses responsibilities of objects in an application and how they communicate between them.**

**Implementation Steps**

_**In this example I have created a ChainedCashDispenser interface whose task its to dispense the cash, It has three concrete implementations namely Cash100RupeesDispenser,Cash500RupeesDispenser and Cash2000RupeesDispenser.**_

**_ChainedCashDispenser will be having two abstract methods like the first which will create the chain between the cash dispensers so that they can work in chain and the other one which will dispense the cash in dynamic denominations._**

**_AtmCashDispenser class is the main class like the ATM where the user needs to withdraw, and then it will call the highest amount dispenser like in our program I have used 2k followed by the cash dispensers like 500Rs and 100Rs will call each other to get the cash withdrawn._**

