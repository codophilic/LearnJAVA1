# Object Oriented Programming


## Class

- A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. 

- A class in Java can contain:

1. Fields

2. Methods

3. Constructors

4. Blocks

5. Nested class and interface



## Objects

- An entity that has property (knowing) and behavior (methods/actions) is known as an object.

- JVM creates objects by compiling the class file.

- An object has three characteristics:

1. State: represents the data (value) of an object.

2. Behavior: represents the behavior (functionality) of an object such as deposit, withdraw,adding etc.

3. Identity: An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely.

- For Example, Pen is an object. Its name is Reynolds; color is white, known as its state. It is used to write, so writing is its behavior.


- Java always search for main method so keep the main method class above all other classes.

- The return type should be same as method type . Like for `int` return value must be an integer.


## Objects Creation in JVM

- In JVM there is a stack memory and a heap memory. Heap memory keeps expanding.

- Every method has its own stack memory. Stack memory consists of two things key(Local varibales,reference variable) and its data.

- The heap memory consists of global and objects addresses.

- Referring **ObjectAndClass.java** code, when JVM will execute the code it will create first stack memory of main method. Now in main method, the stack memory will consits of <key,value> which is <n1,4> , <n2,5> and <res, its value>. 

- So to get the value for object **res** it will refer to **add()** method in class resulator and will create a new stack memory for *add()* . Since the method accepts two arugments , so the stack memory will have <val1,4> and <val2,5>. 

- Now after allocation JVM will execute the operation addition and it will return the value to the **res** and that value goes into stack method <res,9>.

- Now global variable **glob** is not in been declared inside any method. Such variables goes into heap memory.

- The reference variable **calc** also goes in stack memeory but what will be its value?. **calc will have its value as method which is add()** . So inside heap memory on a some address which is an object and there will be <glob,5> and <add()> method for reference variable **calc**. So, in the stack memory of reference variable *calc* the object address goes for value <calc,heap memory address>. Now the **add()** method is present in stack memory.

- So the **calc** will use the address in the stack memory and call its **add()** method which is been pointed by address in heap memory.

- So if we a new reference variable inside **main()** method , **obj1** , this reference variable goes in stack and will have an address referring in heap memory of object having **add()** method and global variable <glob,5>.

- If we changed any value variable of a particular object it does not affect other objects. 

![](https://github.com/codophilic/LearnJAVA/blob/main/Images/3.jpg)

- In JVM there is a string constant pool which maintain string values.

- Whenever JVM complies the code it , it creates number of class files . This class files are based on how many times class is defined in a java code. For an inner class, the class file can be outerclassname$innerclassname.class .


- A class file compilies and create different number of class files of a code. No. of class file = No. of classes written in a code.
