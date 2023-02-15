public class AnonymousClass {
    public static void main(String args[]){

        /*
         Suppose if a class needs to be implement once we can use anonymous inner class.
         Here we are creating object of anonymous inner class and not A().
         When we complie such anonymous class we get a class file with name of main class and $number.
         */

         A a = new A(){
            public void show() {
              System.out.println(" In NEW A");  
            }
         };
    }
}

class A{
    public void show(){
        System.out.println("In A");
    }
}