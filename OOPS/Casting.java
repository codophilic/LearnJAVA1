public class Casting {
    public static void main(String args[]){

        A obj = (A) new B();
        obj.showA(); // UpCasting where casting/reference is for A. A is not aware who is B whereas B is aware who is A.

        B obj1 = (B) obj; // DownCasting the reference to the child
        obj1.showA();
        obj1.showB();



    }
}

class A{
    public void showA(){
        System.out.println("A");
    }
}
class B extends A{
    public void showB(){
        System.out.println("B");
    }
}