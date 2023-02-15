public class FINAL {
    static String fin="final";
    public static void main(String args[]){

        final int i = 1; // makes the variable value as fixed
        System.out.println(i);
        // i+=1; // If changed we will get error

        System.out.println(new A().j);
        System.out.println(fin);

    }
}

final class A{ // final class stops inheritance 
    static int j;

    public void show(){
        System.out.println("In A");
    }
}

// class B extends A{
//     public void show(){
//         System.out.println("In B");
//     }
// }

class C{
    public final void show(){ // final stops method overloading.
        System.out.println("In A");
    }
}
class D extends C{
    // public void show(){
    //     System.out.println("In D");
    // }
}