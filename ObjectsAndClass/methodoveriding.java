public class methodoveriding {
    public static void main(String args[]){
        B b = new B();
        b.show();
    }
}


class A{

    void show(){
        System.out.println("In A");
    }
}
class B extends A{

    void show(){ // Method overiding
        System.out.println("In B");
    }
}
