
public class Inheritance {
    public static void main(String args[]){

        ScifyCalc obj1 = new ScifyCalc();
        System.out.println(obj1.add(4,5)); // Calling parent class method
        System.out.println(obj1.mul(4,5));

        SuperCalc sc = new SuperCalc();
        System.out.println(sc.add(4,5)); // Calling Parent's Parent class method

        sc.commonMethod(); // Calling out the common method of multi-level inheritance

        /*
        If a commonMethod is present in the current/child class then that method will be get called.
         */

        obj1.commonMethod();

    }
}

class Calc{ //Parent/Super/Base Class

    public int add(int n1,int n2){
        return n1+n2;
    }

    public void commonMethod(){
        System.out.println("In Calc");
    }
}

// Single Level Inheritance

class ScifyCalc extends Calc{ // Child/Sub/Derived class

    public int mul(int n1,int n2){
        return n1*n2;
    }

    public void commonMethod(){
        System.out.println("In ScifyCalc");
    }
}

// Multi-Level Inheritance

class SuperCalc extends Calc{ 

    public int sub(int n1,int n2){
        return n1-n2;
    }

    public void commonMethod(){
        System.out.println("In SuperCalc");
    }
}

// Hierarchial/Multiple Inheritance
/*
 Multiple Inheritance is not supported in JAVA , because if two classes has common method then there will be an error.
 */

