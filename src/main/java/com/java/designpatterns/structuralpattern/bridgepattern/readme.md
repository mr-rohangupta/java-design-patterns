**Bridge Pattern**

**Bridge Pattern says that decouple the functional abstraction from the implementation so that two can vary independently.**

**_In my example here we have IPaymentSystem interface with the method processPayment. IPaymentSystem has two concrete implementations
SbiPaymentSystem and IciciPaymentSystem._**

**_We have Payment as an abstract class with one abstract method makePayment and reference of IPaymentSystem._**

**_Payment has two concrete implementations CardPayment and NetBanking._**

**_The end user is not interested in the gateway. It's interested in only whether the payment is from Card or Netbanking, so here the Payment is the bridge 
which is creating a bridge between the  type of payment and the gateway._** 