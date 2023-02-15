public class Interface {
    public static void main(String args[]){

        /*
        Interface is not a class. It is an design or blue print to implement those methods.
        Interface consists of method which all are by default public abstract methods.
        To implement interface we need to use keyword 'implements'.
        If all the methods of interface are not implemented in the class , that class becomes abstract.
        All variables inside interface are by default final & static.
         */
        B b = new B();
        b.show();
        b.display();
        System.out.println(b.a);
        System.out.println(A.a);
        b.run();
        b.play();

    }
}

interface A{

    int a=10;
    void show();
    void display();
}

interface C{
    void run();
}

interface D extends C{
    void play();
}

class B implements A,D{ // Multiple interface implemented, and inheritance interface.

    public void run(){
        System.out.println("in run");
    }
    public void show(){
        System.out.println(" in show");
    }
    public void display(){
        System.out.println(" in display");
    }
    
    public void play() {
        System.out.println(" in play");
    }
}