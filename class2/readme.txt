# OOPs (Object oriented Programming)
Object means a real-time entity such as car, chair, table etc
Object-oriented programming is a methodology to design a program using classes and object
It simplifies software development and maintenance by providing some key features

> Object
> Class

The four main pillars in OOPS
1. inheritance
2. Polymorphism
3. Encapsulation
4. Abstraction

# Object 
Any entity that has a state and behavior is known as the object for example car
An object can be defined as an instance of a class
An object tale some amount of space in the memory to maintain its state (data)
object can communicate with the class properties and method

# Class 
A class is a logical container in which we can define methods and variables
A class can also be defined as a blueprint from which you can create an individual object 
class doesn't consume any space

# Class naming convention
> it should start with an uppercase letter
> it should be started with character not the number or any special character    
> it should be title case if we have more than two words  eg:  HelloWorld
> always try to give a meaningful full name to a class


# What a class can contain
> fields
> methods
> constructor
> block
> nested class and interface


the class can contain members
> members variable
> member function / method


Syntax
------
<access_modifier> class <class_name>{

// member variable
<access_modifier> <data_type> <variable_name>;
<access_modifier> <data_type> <variable_name>;

// member method / fucntion
<access_modifier> <return_type> | void <method_name>(<parameters>){
 // method body
}
}


# the new keyword is used to allocate memory at run time
All the objects get memory in the heap memory area

DRY - don't repeat yourself

the method in java  - expose the behavior of the object
Advantage
- Code reusability
- Code optimization


# Constructor
> It is a special method present under the class responsible for initializing the class variables
> Constructor is the special method that gets called immediately when we create the object of the class
> the name of the constructor method should be the same name of the class in which it is present
> Every class require a constructor if we want to create the instance of the class
> it is a responsibility of a programmer to create a constructor for the class, but if we fail to do so the compiler
will create a default constructor or implicit constructor
> constructor cannot have a return not even void other it will become the normal method of the class


# Type of constructor
> default or parameter less constructor
> paramertized constructor
> copy constructor
> static constrcuctor


# constructor overloading
to have more than one constructor in a class
we can differentiate constructor on basic of parameters

1. different number of parameters
2. different types of parameters
3. different order of parameters




# Inheritence
> It is a mechanism of consuming members of one class in another class by establishing parent and child relationship
between the class
> It encourages the code reusability

Employee -> parent / base / super
FullTimeEmployee -> child / derived / sub


> In inheritance, child class can consume members of its parent class as it is the owner of those members 
(except private members of the parent class)
> parent class constructor must be accessible to the child class otherwise inheritance will not be possible
> in inheritance child class can access parent class members, but parent class cannot access any members that os define in 
child class

Advantages
1. code reusability
2. reduce error
3. reduce time
4. more maintainable code


# Type of inheritance
1. simple
2. multi-level
3. hierarchical
4. multiple
5. hybrid



