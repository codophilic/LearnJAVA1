

public class InnerClass {
    public static void main(String args[]){
        A obj1 = new A();
        obj1.show();

        /*
        Class B is inner class of A.
        So to access inner class we need to specify outerclassname.innerclassname 
        Now to create object for inner class we need to have outer class object.
         */

         A.B obj2 = obj1.new B();

         obj2.display();
         obj2.show();

         A.C obj3 = new A.C(); // To call a static inner class.

         obj3.show();
         // A class can be declared static only if it is a nested class.

    }
}


class A{

    int a;
    public void show(){
        System.out.println("IN A");
    }
    class B{
        int b;
        public void show(){
            System.out.println("IN B");
        }
        public void display(){
            System.out.println("Display in B");
        }
    }
    static class C{
        public void show(){
            System.out.println("IN C");
        }
    }
}
