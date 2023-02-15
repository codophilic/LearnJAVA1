
public class string {
    public static void main(String args[]){

        /*
         String is not a primitive data type all these primitive data type start with small letter. String is a class in java.

         Now when we have a class we create object of it using 'new' keyword.
         */

        String name="Harsh";
         /*
          String name = new String("Harsh");
          */
        
        String name1="Harsh";

        System.out.println(name.hashCode()); // Same HashCode
        System.out.println(name1.hashCode()); //Same HashCode
        System.out.println(name==name1);
        System.out.println(name.charAt(1));

        /*
        For string , in a heap memory, there is a string constant pool,
        So whenever we create a string, JVM check if that string value is present or not in the string pool and if not provide that 
        value an address.

        So now if a new reference variable also used same value string, JVM will use that same address from the string pool
        and assign that address in the stack memory of that variable.
        
        name1,name are reference variable to an same object "Harsh"
         */


        name = name + " Pandya";
        String name2="Harsh";
        System.out.println(name.hashCode()); //Different HashCode
        System.out.println(name1.hashCode()); //Same HashCode
        System.out.println(name2.hashCode()); //Same HashCode
        System.out.println(name2==name1);

        /*
        So when we preform any operation on string , a new objects gets created in the string pool constant and the old
        object goes under garbage collection to free some space. 
         */
        
    }
}
