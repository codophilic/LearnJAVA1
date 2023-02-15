public class PolyMorphism {
    /*
    Many behaviours

    In Java polymorphism is mainly divided into two types: 

    1. Compile-time/Early binding/Static Polymorphism 
        - It is also known as static polymorphism. This type of polymorphism is achieved by function overloading. Decision is done during compile time.

    2. Runtime/Late binding/Dynamic Method Dispatch Polymorphism
        - It is a process in which a function call to the overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding.
          Decision is done during run time.
     */

     public static void main(String agrs[]){

        //Dynamic Method Dispatch

        Comp obj1 = new Laptop();
        obj1.show();
        // obj1.show1(); // Won't be able to call show1() is not a function of Comp . Here we will require DownCasting.

        Comp obj = new Comp();
        obj.show();

        obj = new Laptop();
        obj.show();

        // Here obj is been assign for multiple objects of different class and we can know in run time which
        // method will be executed when obj calls show(). This is Run time polymorphism. 

        // obj = new mobile(); // Won't work because mobile is not a subclass of Comp.

     }
}

class Comp{
    public void show(){
        System.out.println("in Comp");
    }
}

class Laptop extends Comp{

    public void show1(){
        System.out.println("in Laptop");
    }

    public void show(){
        System.out.println("in Laptop");
    }
}

class mobile{
    int m=1;
}