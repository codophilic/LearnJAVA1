import java.util.*;
import java.io.*;

public class TakeInput {

    public static void main(String agrs[]) throws Exception{
        System.out.println("Output");
        /*
        println belongs to PrintStream class.
        out is an static object of PrintStream.
        the out object is in System class

        To access static object of a class we use System.out (classname.staticobject)
         */

        // System.out.println("Enter a number");
        // int val=System.in.read();
        // System.out.println(val); // Ascii value as output

        // BufferedReader

        // InputStreamReader in = new InputStreamReader(System.in);// Getting input from console/file or others.
        // BufferedReader bf = new BufferedReader(in); // BufferedReader requires an InputStream and Inputstrea requires system.in

        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        // bf.close();

        // Scanner
        System.out.println("Using Scanner");
        Scanner sc = new Scanner(System.in);
        int val2 = sc.nextInt();
        System.out.println(val2);
        sc.close();

        /*
         Scanner is used for parsing tokens from the contents of the stream while BufferedReader 
         just reads the stream and does not do any special parsing.
         In fact you can pass a BufferedReader to a scanner as the source of characters to parse.
         */

        // Difference https://www.tutorialspoint.com/difference-between-scanner-and-bufferreader-class-in-java

    }
}
