public class AnonymousObject {
    public static void main(String args[]){

        new A().show(); // Anonymous objects , such objects just get created in heap memory and since there is no 
                           // reference variable we cannot use such objects again. 
        System.out.println(new A().hashCode());
        System.out.println(new A().hashCode());

    }   
}

class A{

    A(){
        System.out.println("Object created");
    }

    void show(){
        System.out.println("SHOW");
    }
}