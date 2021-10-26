# Polymorphism
> This is one of the main pillers of OOP
> Poly (many) + morph (shape)
> this allows you to invoke the derived class method through a base class reference during runtime

# There are two types of polymorphism
1. static / compile time
2. dynamic / runtime

static - method overloading
dynamic - method overriding


method overloading
> in this case, we define multiple methods with the same name by changing their parameters
> this can be performed either within a class as well as between parent and child class
> method overloading is all about defining multiple or adding behavior to a method

condition for method overloading
1. different number of parameters
2. different types of parameters
3. different order of parameters
4. different return type - NO


# Method overriding
> method overriding is used to provide the specific implementation of a method that is already provided by the 
  super-class
> method overriding is used for runtime polymorphism
> it is all about changing the behaviour
> in this case, we define multiple method with the same name and same parameter
> this can be performed only between parent and child class and never can be done within the class



# final
> final keyword in java is used to restrict the user
> final keyword can be used in many context
1. variables
2. methods
3. class

> when we use final keyword with variable, it become constant means its value cannot be changed
> when we use the final keyword with the parent class method, the child cannont override that method
> when we use the final keyword with class, no other class can be inherit from that class


# Abstraction
Abstraction is a process of hidding the implementation details only functionality to the user
In another way, it shows only essential things to the user and hides the internal details

# Abstract class and methods

> A class which declared with abstract keyword is known as abstract class
> Abstract class can contain abstarct as well as non-abstarct method
> Abstract class consider as imcomplete class hence we cannot able to create an instance of the abstract class
> abstract class can always be super class
> the class dervied from abstract class is responsable for providing the implementation or body of the abstarct methods
> A non abstract class derived from the abstract class must provide the implementation of all abstarct methods

> Abstract method cannot have a body or implementation, and if we try to do so it will be a compiler time eror
> only abstract classes can contain abstract methods

Rectangle, Circle, Cone, Triangle

width, height, radius, pie, 


# Interface vs Abstarct class
1. interface is used to achieve 100% abstraction where as abstarct classes are used for partial abstraction
2. interface can be used for  multiple inheritance, where as abstract class is a class which means cannot be inherited
  from more then one class

# Interface
> It is a kind of a contract which needs to be fullfiled by a class
> an interface in java is a bluieprint of a class
> it has static constants and abstarct method
> it is a compile time error to provide an implementation for any interface member (except in java 8)
> interface can also inherit from another interface. A class that inherit from this interface must provide 
  implementation for all interface members in the entire interface chain
> we can not create an instance of an interface
> we can hoild the reference of a class that has implemented interface in interface instance

Java 8, we can have default and static method in an interface
java 9, we can have private method in an interface


Note: by default, interface filed are public, static and final and the method is public and abstarct

multiplr inheritence is java are possible with the help of the interface

> default method in interface
Since java 8, we can have a method body in the interface, but we need to make it default method

> static method in interface
Since java 8, we can have static method in the interface

OOPs
- inheritence
- abstraction
- polymorphism


















