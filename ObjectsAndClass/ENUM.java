/*
 The Enum in Java is a data type which contains a fixed set of constants.
 Enum = Enumeration
 E.g having error codes, specific constants for status of applications.

 Java Enums can be thought of as classes which have a fixed set of constants (a variable that does not change). 
 The Java enum constants are static and final implicitly.
 Enums are used to create our own data type like classes.

 Enums cannot be extended into other classes


 */


public class ENUM {
    public static void main(String args[]){

        Status s = Status.Running; // Class reference variable;
        System.out.println(s);


        System.out.print(s.ordinal()); // Getting the number

        Status[] arryOfVal = Status.values();
        System.out.println(arryOfVal);
        for (Status i: arryOfVal){
            System.out.println(i+": "+i.ordinal());
        }

        System.out.println(s.getClass().getSuperclass()); // ENUM has super class enum.

        Laptop lap = Laptop.Laptop1;
        System.out.println(lap+": "+lap.getPrice());

        for (Laptop i: Laptop.values()){
            System.out.println(i+": "+i.getPrice());
        }
    }
}

enum Status{ //Creating a data type

    Running, Failed, Pending, Success; // objects of status which can be also treated as 0,1,2,3
}

enum Laptop{

    Laptop1(1000), Laptop2(2000), Laptop3;

    private int price;
    private Laptop() {
        price = 0;
    }
    

    private Laptop(int price){ // Constructor of Laptop , objects Laptop1, Laptop2 & Laptop3 calling constructor
                                    // and providing the values to set. Creating private variables to set & get.
        this.price = price;
    }


    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}




