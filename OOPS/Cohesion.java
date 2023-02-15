/*
 Cohesion in Java is the Object-Oriented principle most closely associated with making sure that a 
 class is designed with a single, well-focused purpose. In object-oriented design, cohesion refers 
 to how a single class is designed.

 The advantage of high cohesion is that such classes are much easier to maintain (and less frequently changed) 
 than classes with low cohesion. Another benefit of high cohesion is that classes with a well-focused purpose
 tend to be more reusable than other classes. 
 
 
 Example: Suppose we have a class that multiplies two numbers, but the same class creates a pop-up window 
 displaying the result. This is an example of a low cohesive class because the window and the multiplication 
 operation don’t have much in common. To make it high cohesive, we would have to create a class Display and a
 class Multiply. The Display will call Multiply’s method to get the result and display it. This way to develop 
 a high cohesive solution

 High cohesion is when you have a class that does a well-defined job. 
 Low cohesion is when a class does a lot of jobs that don’t have much in common.

 High cohesion gives us better-maintaining facility and Low cohesion results in monolithic classes that 
 are difficult to maintain, understand and reduce re-usability.
 */

public class Cohesion{
    public static void main(String args[]){

        System.out.print(new Add().add(5,4));
    }
}

class Add{ // Focused only addition
    public int add(int n1,int n2){
        return n1+n2;
    }
}