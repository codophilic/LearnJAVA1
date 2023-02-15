
/*
 * 
 Whenever we are using packages ALWAYS compile the code and then run it.
 */
import operation.ops;
import java.util.ArrayList;
import java.lang.*; //Default imported in java code. '*' are used to import all files and not nested directories.

public class code {
    public static void main(String args[]){

        ops obj = new ops();
        System.out.println(obj.add(5,6));
    }
}
