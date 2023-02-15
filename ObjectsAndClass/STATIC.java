

public class STATIC {
    public static void main(String args[]) throws ClassNotFoundException{

        MobileData ph1 = new MobileData();
        ph1.name="Harsh";
        ph1.brand="Iphone";
        ph1.price=10000;

        MobileData ph2 = new MobileData();
        ph2.name="Meet";
        ph2.brand="Samsung";
        ph2.price=8000;

        ph1.show();
        ph2.show();

        /*
        Here we have two object and those object consists of 3 variables (name,brand & price).

        So suppose we want to have same variable common for all objects , we use 'static'. So 'static' makes variable / method common for all.
        Static makes a variable as class member not object member.
        If static value is changed it gets applied for all objects.

        In Java, static is a keyword that can be used with variables, classes, blocks, and methods. 
        When we use the static keyword before any of them, it means that specified member belongs to a type itself. 
        In other words, an instance of a static member is created and shared across all the instances of the class.

        In Non-Static method we can use static variables but in static method we cannot used non-static variables.
         */   

        //Static - Variables
        StaticMobileData smd1 = new StaticMobileData();
         StaticMobileData.name="Harsh"; //Static variables must be call using class name
         smd1.brand="Iphone";
         smd1.price=10000;

         StaticMobileData smd2 = new StaticMobileData();
         smd2.brand="Iphone";
         smd2.price=8000;
 
         smd1.show();
         smd2.show();

         smd2.name="Meet";

         smd1.show();
         smd2.show();

         //Static blocks

         blocks bl = new blocks(); 

         /*
        Whenever a object of a class is created , first the class gets loaded then objects gets created. So 
        whenever a class is getting load , static blocks are called first and then it creates objects.

        Can we load class without creating an object? YES
          */

        Class.forName("without"); //forName just loads the class without creating objects. It throws exceptions
        
         // Static-Class
         // A class can be declared static only if it is a nested class/Inner Class.
         //Refer InnerClass.java

         // Static-Method
        // Call a static method using class name rather than object name.
         MobileData.show1();

         /*
        Reason why can't we have a nonstatic variable with static method
        ph1->object 1 has its own values
        ph2->object 2 has its own values
        Now when we call instance variable of a class in a static method, there will be confusion to call which object
        value instance variable inside that method.

        In Java, static means that it's a variable/method of a class, it belongs to the whole class but not to one of its certain objects.
        
        This means that static keyword can be used only in a 'class scope' i.e. it doesn't have any sense inside methods.
          */

        // In General for static declaration always use Classname to call the declarations.

        /*
        Use non static variables inside static method by passing object as an argument and data type as classname
         */

        MobileData.show2(ph1);
        
    }    
}


class MobileData{

    String name;
    String brand;
    int price;

    public void show(){
        System.out.println(name+":"+brand+" Price: "+price);
    }

    public static void show1(){
        // System.out.println(name+":"+brand+" Price: "+price); //Cannot called nonstatic variable inside static method.
        System.out.println("in Static method 1");
    }

    public static void show2(MobileData obj){
        System.out.println("In Static method 2");
        System.out.println(obj.name+":"+obj.brand+" Price: "+obj.price); //Calling non static variables by passing the object in the static method.
        
    }
}

class StaticMobileData{

    static String name;
    String brand;
    int price;

    public void show(){
        System.out.println(name+":"+brand+" Price: "+price);
    }
}

class blocks{

    static{
        System.out.println("Execute always when any object of class blocks is used");
    }

}

class without{

    static{
        System.out.println("Execute without creating object");
    }
}