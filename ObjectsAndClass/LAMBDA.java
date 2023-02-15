/*
 The Lambda expression is used to provide the implementation of an interface which has functional interface. 
 It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing 
 the implementation. Here, we just write the implementation code.

 Lambda expression provides implementation of functional interface. 
 An interface which has only one abstract method is called functional interface. 
 Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.

 Lambda expression can be only implemented with FunctionalInterface
 */

public class LAMBDA {
    public static void main(String agrs[]){

        A a = (int i) ->{
            System.out.println("Calling show using lambda expression "+i);
        };

        A a1 = i -> System.out.println("Calling show using lambda expression "+i);

        a.show(10);
        a1.show(100);

        /*
        Without Lambda expression
        A a = new A(){
            public void show(int i){
                System.out.println(..);
            }
        }

         */

        add ad = (i,j) -> i+j;
        System.out.println(ad.add(5,4));  
    }
}


@FunctionalInterface
interface A{
    void show(int i);
}


@FunctionalInterface
interface add{
    int add(int i , int j);
}