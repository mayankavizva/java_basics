# What is Java?

Java is a programming Langugage
It is a high-level, robust, object-oriented, and secure programming language.

# Type of App
1. Desktop app
2. Web App
3. Mobile
4. Embedded System
5. Games
6. Enterprise ap such as banking

# Java Edition
1. Java SE
2. Java EE
3. Java ME
4. JavaFX


# Features
1. Simple
2. Object-Oriented
3. Platform Independent
4. Secured
5. Robust
6. Portable
7. High Performance
8. Multi-Threaded


# Different between JDK, JRE, and JVM
JDK - Java Developer Kit
JVM  -Java Virtual Machine
JRE - Java Run time

JVM - Java Virtual Machine
> It is called a virtual machine bcoz it does not exist physically
> It provides specifications in which java bytecode can be executed

What are the main task performed by JVM
1. Load code
2. Verify the code
3. Execute code
4. Provide runtime environment


# JRE
The java run time environment is a set of a software tools which are used for developing a java application
> It contains a set of libraries + other files that JVM uses at run time


# JDK
Java developer kit
It is a software development kit that is used to develop a java application.
JDK contains a private JVM and few other resources such as compiler, loader, etc


# First Java Program

class Hello{
  public static void main(String args[]){
    System.out.println("Hello World")
 }

}


- class keyword is used to declare a class in java
- public keyword is an access modifier that decides the visibility
- static is a keyword used to create a static method that can be accessed directly by the class name
- void is a return type it means that the method does not return any value
- main represents the starting point of the program
- string arg[] is used for command-line argument
- System.out.println() it is used to print statement

Note:
1. Java is case sensitive
2. In the entire app, we can have only one main method
3. the Main method is the starting point of the program
4. all the statements in java should end with a semicolon (;)


# Java Variables
A variable is a container that holds the value while the java program is executed.
A variable is assigned a data type
A variable is a name of memory location

There are three types of variables
1. local
2. instance
3. static


# local variable
A variable declared inside the body of the method is called local variable; you can use this variable only
within the method 


# instance variable
A variable is declared inside the class but outside the body of the method.

# Static variable
variable that is declared with static keyword is called static variables
static variables are shared among all instances of the class
memory allocation for variables happens only once when the class is loaded in the memory


Syntax
------
<data type> <varible_name>;   // declaration
<variable_name> = 10;  // initalization

<data_type> <variable_name> = 20;   // declaration with initialzation

int a; 



# Data Type
datatype specifies the different sizes and values that can be store in the variable

The data type is of two types
1. primitive type - simple type - char, boolean, int, long, float, etc
2. nonprimitive - complex type - classes, interface, and arrays


Data type		default size
boolean			1 byte
char			2
byte			1
short			2
int			4
long			8
float			4
double			8


# Operators
Arithmatic - + / * %
relational - > < >= <= == 
logical - && ||
ternary ?:
assignment = += -=

turnery

condition ? "true statement" : "false statement"


# Conditional statement
- if
- if-else
- if-else if else
- turnery
- switch

DRY - don't repeat yourself

# Loops
In programing language, loops are used to execute a set of instructions repeatedly when some condition is true.

the are four types of loops in java
- for
- while
- do-while
- for each

for loop
we can initialize a variable, check condition and increment/decrement value


for(initializer; condition; increment / decrement){
  // body
}

# While loops is used to iterate a part of a program repeatedly until the specified condition is true,
as soon as the condition becomes false, the loop automatically stop

while(condition){
 // body
}

# do-while
will make sure to execute the loop at least once before checking the condition, and then if the condition is true
keep running and if the condition is false, terminate the loop

# Jump statement
break
continue

break - is used inside a loop to terminate the existing statement and resume the control from the next statement

continue is used to step over the current statement

















