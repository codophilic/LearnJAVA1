

public class SUPER {
    public static void main(String args[]){

        B b = new B();
        B b1 = new B(5); // this() method will execute default constructor and then paramterized constructor.
    }
}

class A extends Object{ //Super/Parent class
    A(){ //Default constructor
        System.out.println("A");
    }
    A(int a){ //Parameterized constructor
        System.out.println("IN A "+a);
    }
    public void printing(){
        System.out.println("Just printing");
    }
}

class B extends A{ //Sub/Child class
    B(){
        super();
        System.out.println("B");
    }
    B(int b){
        this();
        System.out.println("IN B "+b);
    }
}




/*
 A constructor always have a super(); method initally which calls parent/super class constructor default one (if inherit). 
 This super() method is hidden in. Now when we call the super method using the variable , it will call
 the parameterized constructor of super class.

 Who is the super of A?

 Every class in java extends ObjectClass automatically.

 this()
 -> this() method executes the default constructor of current class whereas the super() method executes the 
 default constructor of parent class

 */