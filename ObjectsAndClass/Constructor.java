
public class Constructor {
    public static void main(String args[]){
        /*
        Why public static void main(String args[])?

        The execution of code starts from method main. The main method use parameter which type is 'string' because 
        string accepts all the characters values in its own type. These character are stored in an String arrays (args[]).
        The main method return nothing so we use 'void'. Now to call any method in a class , we require an object but objects
        are created when the code is been executed. So for main method here we found a deadlock since main cannot have object
        its a start of execution. So to break this deadlock we use keyword 'static'. To make main method available to all
        we use 'public' . Hence public static void main(String args[]).

        'New' -> Whenever we wanted to create an object that object requires a space or size inside the heap memory , so 
        to allocate a size inside the heap memory we use 'new' keyword.

        How much size? Constructor provide the size for an object inside heap memory.

        Every class always have an constructor default. It has same name of class name. Constructor is a member method.
        Constructor returns nothing. A constructor is public. Inside a constructor we can provide initial values
        for the instance variable of the class.

        Whenver an object is created the constructor is automatically called and suppose we want to pass atleast some
        arguments while creating the object , we can use constructor.

        So whenever we create an object we need to pass arguments compulsory.

        CLASSNAME OBJECTNAME = NEW[Space in heap] CONSTRUCTOR()[provide space and initials]

        Constructor Overloading:

            We can have same method name of constructor with different arguments and parameters which is also called
            parameterized constructor.
         */

        A obj1 = new A();
        System.out.println(obj1.k);

        A obj2 = new A(100);
        System.out.println(obj2.k);
    }
}

class A{

    int k;

    A(){
        k=10;
        System.out.println("In Constructor");
    }

    A(int val){
        k=val;
        System.out.println("Constructor Overloading");
    }
}