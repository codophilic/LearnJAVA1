
public class ObjectAndClass{
    public static void main (String args[]){
        int n1=4;
        int n2=5;
        /*
         Calculator calc; --> Creating reference variable in stack memory
         calc= new Calculator; --> Creating Object of calculator in heap memory which address is passed as value
                                    in stack memory of reference variable.
         Inside address of Object in heap memory, there will be variables and methods of Calculator.
         */
        Calculator calc = new Calculator(); //Now Calc is a reference variable/Object having type Calculator.
        int res = calc.add(n1,n2); // Call by value
        /*
         Call by reference/address is not possible in java because java does not have pointer concept
         */
        System.out.println(res);
        System.out.println(calc.glob); //Priting Instance variable of class

        Calculator calc1= new Calculator();
        calc1.glob=8;               // Changing Instance variable for calc1 object.

        System.out.println(calc1.glob);
        System.out.println(calc.glob); // After changing it the value is changed for that particular object, does not affect other object.

        System.out.println(calc.getClass().getSuperclass()); // Getting super class names
    }
}

class Calculator{

    int glob=5; //Instance Variables

    public int add(int val1,int val2){ //-> Behaviour of method

        return val1+val2; // Local variables
    }

}

