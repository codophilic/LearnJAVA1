
public class MutableAndImmutable {
    
    public static void main(String args[]){

        /*
         Mutable String ->Change
         Immutable String -> Unchange (Default). Once its object is created that object cannot be changed.

         To create mutable string we can use String buffer or String builder
         String buffer and String builder are almost same having difference String buffer is thread safe whereas
         string builder is not thread safe.
        */

        // String buffer -> it comes with a initial 16 character capacity and keeps increases when operations (append,delete,insert,substring) performed.

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //16
        sb.append("Harsh Nainesh Pandya"); //Use command to append more characters.
        System.out.println(sb.capacity()); //got increased from 16 to 34
        System.out.println(sb.length());

        String convertingMutabletoImmutable = sb.toString();
        System.out.println(convertingMutabletoImmutable);




        

    }
}
