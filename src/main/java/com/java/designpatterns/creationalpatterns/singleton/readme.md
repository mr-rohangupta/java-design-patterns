**Singleton pattern restricts instantiation of a class ad ensures that only one instance of the class 
exists in the java virtual machine**

**In this example I had created a Singleton class Database which have a private constructor,
static getInstance method which will return the same instance everytime.**

**I implemented the class in such a way that it will prevent the class from breaking Singleton.**

for Ex : **_i) readResolve and readObject method which will prevent from Serialization.
         ii) overriding clone to prevent from cloning.
         iii) Instance check at constructor to prevent it from Reflection._**