

import tools.*;

public class accessmodify{

    public static void main(String agrs[]) throws Exception {

        A a = new A();
        System.out.println(a.val1); // Whenever we are using another packages variables or method , it must always be public
        
        B b = new B();
        System.out.println(b.val2); // Using a variable inside a same package/codes are accessible.

        /*
         Private variables can be accessible within same class

         Default variables can be accessible within its own package only.

         protected can be accessibile within its own package and as subclass in another package.
         */
    }
    
}

// public class C{

//     private int c=14;

//     public void show(){
//         System.out.println(c);
//     }
// }


