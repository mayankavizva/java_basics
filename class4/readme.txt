# Encapsulation
# Genrics
# Lambda / functional programming

# Encapsulation
It means hiding your method, variables with the help of access modifiers

> Packages
> Access Modifiers / specifiers

# Packages
In Java, a package is a group of similar types of classes, interface and sub-packages
Packages in java can be categorized into two forms
1. built-in packages
2. user-defines packages

there are many in-built packages in java for example, lang, awt, swing, io, util, sql etc

Advantages
1. packages are used to categorized the classes and interface so that they can be easily mantained
2. java packages provide access protection
3. java packages removed naming collision

package myPack;

class A{

}


class B{

}


import myPack.A;
import myPack.*


# Access modifers in java 
There are two type of modifers
1. access modifiers
2. non-access modifiers


# Access-modifers
1. private
2. default
3. protected
4. public


> private - the access level of a private modifier is only within the class, it cannot be accessed from 
  outside the class

> default - the access level of a default modifer is only within the package. it cannot be access from 
  outside the package. if we dont specify any acess level, it will be default only

> protected - the access level of a protected modifier is within the package and outside the package 
  through child class. if we do not make the child class, it cannot be access from outside the package

> public - the access level of public modifier is everywhere. it can be access within the class, outside the class
  within the package and outside the package

Problem
1. id cannot be a negative value
2. name cannont be blank or null
3. pass mark shoudl be read only


# Generics in Java
In java generic is a feature which allows to detach data type from method
It make you code flexible and which can possible work with any data type

# Problem if you use object class as a data type
1. unnecessary boxing and unboxing take place which will impact perforamce
2. method is no more type safe which means you can compare anything

# Advatages
1. type-safety - we can hold only a single type of object in generics
2. type casting is not required
3. compile time checking, it is checking at compile time so problem will occur at run time


Generic class
> A class that can refere to any type is know as generic class
> we can use T type parameetr to create the generic class of a specific type


Syntax
------
class MyClass<T>{

T obj;

void add(T obj){
 this.obj = obj;
}

T get(){
  return obj;
}

}

this T can be replace by any data type like interger, string, employee

# Type paraneter
T - type
E - element
K - key
N - number
V - value

# Generic methods
like generic class we can also create generic methods that can accept any type of parameters
here the scope of the argument is limited to the method where it is declared

it allow to create static as well as non static method


# Wild card generics
?  -question mark symbol represent the wild card element
it means any type
we can write <? extends Shape> it mean any child class of shape can be use


# Java Lambda Expression
Lambda expression is a new and essential feature that was introduce in java 8
It providea clear and concise way to represent a method 
the lambda expression is used to provide the implementation of an interface that has a function interface
it save a lot of code

# functional interface
An interface that has only one abstract method is called funtionla interface
java provides an annotation @FuntionalInterface which can be use to declare an interface as a functional interface


Why use lambda expression
1. to provide the implementaion of function interface
2. less and cocise code

Syntax
------

(parameters) -> {
  // body
}

lamda express consist of three main components / parts
1. parameters: it can be empty or a list of parameters
2. Arrow: it is used to link parameters list and body expression
3. body: it contain expression or statment for lambda


() -> {}
(a) -> {}
(a, b) -> {}































