**Proxy Pattern**

**According to GOF, a Proxy Pattern "provides the control for accessing the original object".**

**we can perform many operations like hiding the information of original object, on demand loading etc.**

**Proxy pattern can be used in virtual proxy(current example of proxy image and real image), Protective Proxy(Internet access to employees and restricting the other URLS),
RemoteProxy(Rest call), SmartProxy(to check whether the real object is locked or not before accessing it so that no other objects can change it).**

**Implementation Steps:**

**_In my example I have created an interface Image which has two concrete implementations RealImage and ProxyImage._**

**_RealImage is the one which loads the image and shares the same instance to other proxies on demand._**

**_In ProxyDemo we are creating instance of ProxyImage in first call it is bringing the image from the db but from second call its giving the same image._**