# Exceptions

- Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program’s instructions. 

- Exceptions can be caught and handled by the program. When an exception occurs within a method, it creates an object. This object is called the exception object. 

- It contains information about the exception, such as the name and description of the exception and the state of the program when the exception occurred.

- Java Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

- The Exception class is a parent class of all types of exceptions (child class). Throwable class is parent class of Exception class.

- 3 types of errors

## 1. Compile-Time Error

- Errors produced while compiling the code. E.g System.out.PRINTLN();

## 2. Run-Time Error

- Errors produced while running the code. E.g ForLoop is getting out of bound because of array size.

## 3. Logical Error


- Now when we get run-time error , we need to handle it using exceptions. Exceptions are basically run-time errors.

- Now some errors are such things which cannot be handle using exceptions, IOError (providing wrong input type), OutOfmemory etc.


## 2 types of exceptions

1. UnCheck Exceptions:

- Uncheck exceptions are Run-time exceptions which java does not forces user to check like Arithmetic Operations, Array exceptions etc.

2. Check Exceptions:

- Check Exceptions are exceptions which java does forces user to check like SQLExceptions, IOExceptions etc.


# Throw

- The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. 

- We can throw either checked or unchecked exception. The throw keyword is mainly used to throw custom exceptions.

## Throws

- The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. 

- We can throw either checked or unchecked exception. The throw keyword is mainly used to throw custom exceptions.

- Suppose A function calls B & Cfunction and B & C function will show some exception, rather than handling the exception in B & C we will throw the exception using **throws** to A function which will handle V&C both exception using try-catch.

- This is called Ducking the exception

# Finally Block

- Finally block statements will always gets executed irrespective of try or catch.

- Intention of finally block is to closed the resources.

- We can have try-finally block.

- We can also don't need to write finally block using new version method by defining the resource in try block.



