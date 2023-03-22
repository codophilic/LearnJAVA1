

/*
 * In Java, when we create an object of the class it occupies some space in the memory (heap). If we do not delete these objects, it remains in the memory and occupies unnecessary space that is not upright from the aspect of programming. To resolve this problem, we use the destructor. In this section, we will discuss the alternate option to the destructor in Java. Also, we will also learn how to use the finalize() method as a destructor.

The destructor is the opposite of the constructor. The constructor is used to initialize objects while the destructor is used to delete or destroy the object that releases the resource occupied by the object.

Remember that there is no concept of destructor in Java. In place of the destructor, Java provides the garbage collector that works the same as the destructor. The garbage collector is a program (thread) that runs on the JVM. It automatically deletes the unused objects (objects that are no longer used) and free-up the memory. The programmer has no need to manage memory, manually. It can be error-prone, vulnerable, and may lead to a memory leak.

It does not accept any parameter and cannot be overloaded.
No explicit call is required, it is automatically invoked at the end of the program execution.



When the object is created it occupies the space in the heap. These objects are used by the threads. If the objects are no longer is used by the thread it becomes eligible for the garbage collection. The memory occupied by that object is now available for new objects that are being created. It is noted that when the garbage collector destroys the object, the JRE calls the finalize() method to close the connections such as database and network connection.

From the above, we can conclude that using the destructor and garbage collector is the level of developer's interference to memory management. It is the main difference between the two. The destructor notifies exactly when the object will be destroyed. While in Java the garbage collector does the same work automatically. These two approaches to memory management have positive and negative effects. But the main issue is that sometimes the developer needs immediate access to memory management.


Methods of finalize()

finalize() method is protected as defined in java.lang.Object class.
finalize() method is called only once.
to override the finalize() method, you need to call the finalize method explicitly.
GC() is a service of JVM to execute Garbage Collection; it is called when the heap memory is full and needs memory for new arriving objects.
JVM ignores all exceptions except the unchecked exceptions that occur in the finalize method.

However, since Java 9, the finalize() method has become deprecated. Using finalize() method can be confusing and hard to use properly.

If we want to release resources held by an object, we should consider implementing the AutoCloseable interface instead. Classes like Cleaner and PhantomReference provide a more flexible way to manage resources once an object becomes unreachable.

AutoCloseable was specially introduced to work with try-with-resources statements. Since Closeable implements AutoCloseable, therefore any class that implements Closeable also implements AutoCloseable interface and can use the try-with resources to close the files.

 */

 import java.io.Closeable;

 public class Destructor{
     public static void main(String agrs[]){
         A a =  new A();
         a.show();
         a.finalize(); // Objects destoryed but still a is working
 
         a.show(); // Calling show
 
         a=null;
         // a.show(); // Won't work
         // System.gc(); // Calling garbage collector
         
         try(B b = new B();){ // Closing close function using try-wtih-resource block
             b.show(); 
         }

 
 
     }
 }
 
 
 
 
 
 class A{
 
     A(){
         System.out.println("Intialize  A Constructor");
     }
 
     public void show(){
         System.out.println(" In A Show");
     }
 
     protected void finalize() {
         System.out.println("Calling Destructor");
     }
 }
 
 
 class B implements Closeable{
     B(){
         System.out.println("Intialize B Constructor");
     }
 
     public void show(){
         System.out.println(" In B Show");
     }
 
     @Override
     public void close() {
         System.out.println("Calling Destructor");
     }
 }
 