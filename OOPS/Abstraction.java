public class Abstraction {
    public static void main(String args[]){

        /*

         Abstraction is basically just declaration of method and not implementation so that it can be
         implemented in future. 

         We cannot create object of abstract class but create reference variable or type of abstract class.
         
         An Abstract method can be belong to Abstract class.

         If a class is extending an abstract class it must need to implement all abstract method present in the
         abstract class.

         If a class is not able to implement all the abstract method then that class needs to be made as abstract.

         So we can create object of concrete class / normal class and not of abstract class.
         */

        Car c = new Wagon1();
        c.drive();

        Wagon W = new Wagon1();
        W.drive();

    }
}

abstract class Car{ //Abstract class

    public abstract void drive(); //Declaring abstract method
    public abstract void GPS();

    public void playMusic(){
        System.out.println("Playing music");
    }
}

abstract class Wagon extends Car{

    public void drive(){
        System.out.println("Driving");
    }
}

class Wagon1 extends Wagon{

    
    public void GPS() {
        System.out.println("GPS");
        
    }

}
