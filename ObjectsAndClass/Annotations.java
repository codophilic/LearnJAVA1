

public class Annotations {
    public static void main(String args[]){
        B b = new B();
        C c = new C(){
            public void show(){
                System.out.println(" Anonymous Class");
            }
        };
    }
}

/*
 Java annotations are metadata (data about data) for our program source code.

 They provide additional information about the program to the compiler but are not part of the program itself. 
 These annotations do not affect the execution of the compiled program.

 Annotations start with @. Its syntax is:
 @AnnotationName

 Let's take an example of @Override annotation.

 The @Override annotation specifies that the method that has been marked with this annotation overrides the 
 method of the superclass with the same method name, return type, and parameter list.

 It is not mandatory to use @Override when overriding a method. However, if we use it, the compiler gives an 
 error if something is wrong (such as wrong parameter type) while overriding the method.

 Suppose there is common function but there is wording mistake , we can get to know using @Override 
 */

 // @Deprecated // if some one will try to extend the class they will know this class will be deprecated
 class A{
     public void AAAAAAAAAAAAAAAAAAAAAAAAAAAA(){
         System.out.println("In A");
     }
 }
 class B extends A{
 
     @Override
     public void AAAAAAAAAAAAAAAAAAAAAAAAAAAA() {
         System.out.println("In B");
     }
 
 }
 
 /*
  Lets say we want to implement an interface with single method. So if we try to create more method
  it will throw error due to FunctionalInterface.
  */
 
 @FunctionalInterface 
 interface C{
     void show();
 }
 