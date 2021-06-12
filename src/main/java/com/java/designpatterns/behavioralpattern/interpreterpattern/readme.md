**Interpreter Pattern**

**The Interpreter pattern is a behavioral pattern that provides a way to evaluate language grammar or expression.**

**The Interpreter pattern uses an expression interface that tells how to interpret a particular context.**

**The Interpreter pattern is used to define a grammatical representation for a language and also provides an interpreter to deal with the grammar.**

**As per GO4 "Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language."**

**Implementation Steps** 

**_i) Expression is the interface which have the interpret method. Expression have one terminal(NumberExpression) concrete implementation 
   and four Non-terminal(AdditionExpression,DivisionExpression,MultiplicationExpression and SubtractionExpression) concrete implementations.**_ 

**_ii) ExpressionParser is the class which is responsible for parsing the expression, 
    verifying the expression like whether it's an operator or operand, maintaining the stack and performing calculation._**

**_iii) ParserUtil as the name suggests it's a utility class. It has two methods first is to verify that the given 
     symbol is operator or not and second is based on the symbol it gives the expression object. (+ will give AdditionExpression)._**

**_iv) Finally InterpreterDemo is the mail class which will pass the expression to ExpressionParser._**