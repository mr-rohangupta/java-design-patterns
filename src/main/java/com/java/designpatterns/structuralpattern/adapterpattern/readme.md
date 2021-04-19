**Adapter pattern is about creating an object into another object which client expects.**

**Implementation Briefing**

**_In our example we have a situation that in our Hotel class we want to Pay the bill, but it only accepts 
Indian Currency, but the Customer is having only cryptocurrencies._**

**_To overcome this issue we designed a CryptoToRupeeAdapter class which will implements IPayable 
and convert that crypto to rupee._**

**_So like wise the adapter design pattern works._**