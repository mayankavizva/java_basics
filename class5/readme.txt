# Exception Handling
# File Handling - I/O API

# Exception Handling
Exception is an event which occurs during the execution of a program that cause the application or program to
terminate inappropriately


We can handle the exception using
1. try
2. catch
3. finally
4. throw
5. throws

# Type of exceptions
there are mainly two type of exception are checked and unchecked, however there are some errors which also
considered as unchecked exceptions
1. Checked
2. Unchecked
3. Error

# Check Exception
As also know as compile time exception which means these exception we must handle at compile time
for ex: IOException, SQLException

# Unchecked Exception
Also know as runtime exception which means these exceoption are dangerous and if not handled it may cause your application to 
terminate inappropritely ex: NullPointerException, ArrayIndexOutOfBound uncheched exception are not checked at compile time
but they are checked at runtime

# Errors
Error are irrecoverable eg: OutOfMemoryError, VirtualMachineError


# try
> any code or statement which we feel is risky or can cause an exception we will write inside the try block

# catch
> whenever any exception happen it will get the control and you can add any alternative or error handling code in the
catch block or you can write any user friendly message

# fianlly
> no matter exception happens or not it will give you guarantee to execute the code
> when you want to execute any piece of code even exceoption happed or not we can write inside the finally block

example: open the connection and we want to make sure connection get closed so we can close connection inside finally

demo
----
case 1: exception does't occur
case 2: exception occues and not handled
case 3: exceptin occur and handle


# throw
It is keyword which is used to explicitly throw an exception
we can use throw keyword to either throw check or unchecked exception


# throw vs throws
throw
1. java throw keyword is used to explicity throw an exception
2. checked exception cannot be propogated using throw only
3. it is followed by an instance 
4. it is used within the method

throws
1. java throws keyword is used to declare an excepotion
2. checked exception can be propogated with throws
3. it is followed by class
4. it is used with the method signature

# final vs finally vs finalize

1. final
it is used to apply restriction on variables, method and class, final class can't inherited, final method can't be overridden, 
final variable value cann't be changed
final is keywoord

2. finally 
finally is used to place important code, it will be executed wheather exception is handled or not, 
finally is a block

3. finalize
finilize is used to perform clean up processing just before object is handle by garbage collected
finalze is method


# Top 10 exception
1. NullPointerException()
2. ArrayIndexOutOfBound()
3. StackOverFlowException()
4. ClassCastException()
5. IllegalArgumentException()
6. NumberFormatException()
7. IllegalStateException()
8. NoClassDefFoundException()
9. AssertException()
10. ArthmaticalException()

# try with resources
In java, try with resources statement is a try statement that declare one or more resources in it.
A resource is an object that must be closed once your program is done using it

try(declare resource){
  // use resource
}



# Java I/O (Input and Output)
we can perform file handling task in java using Java I/O API

File file = new File("data.txt")

this line will not create an physical file
it will first check any file with this name available or not
if it is available then it will refer to that file
if not then we are just creating java file object to represent data.txt

file.exists()
return boolean value
true - file exist
false file does not exist

file.createNewFile()


IN UNIX everything is a file
even directory are also know as file
java file system based on unix
file class can be use to work with either file or directory

file.mkdir() this method can be use to create a directory


# File
Constructor 1:
File file = new File(String name);
name can be either file or directory name
file will get created in the current directory

Constructor 2:
File file = new File(String subDirectoryName, String fileName);
subDirectory is your desire location
this directory can be present in some other location

Constructor 3:
File file = new File(File subDirectory, String name)


# File
exist - to check file
createNewFile()
mkDir()
isFile() - check we have file or not
isDirectory() - check we have dir
list()
length() 
delete()

# FileWrite()
# BufferWrite()
# PrintWriter()

FileWriter
if you specified file which does not exist filewriter will create a new file


Constructor 1:
FileWriter fw = new FileWriter(String filename)

Constructor 2:
FileWriter fw = new FileWriter(File file)


Constructor 3:
FileWriter fw = new FileWriter(String filename, boolean append)


Note: what will happen if we already have data in the file
by default it will perform override - false
override - clear previous data and re write
append - add data in existing - true

fw.flush()
gives us a kind of gaurantee that all the character we have passed from the program 
transfered to the file including the last character

fw.close()

















