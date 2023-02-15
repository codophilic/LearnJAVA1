import java.io.*;


public class FINALLY{
    public static void main(String args[]) throws Exception{

        // With Finally
        // int val1=18;
        // BufferedReader br = null;
        // try{
        //     InputStreamReader in = new InputStreamReader(System.in);
        //     br = new BufferedReader(in);
        //     System.out.println("Enter input");
        //     int num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // }
        // finally{ // Closing the resource
        //     br.close();
        // }

        //Without finally block.

   
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter a number");
            int num1 = Integer.parseInt(bf.readLine());
            System.out.println(num1);
        }

    }
}
