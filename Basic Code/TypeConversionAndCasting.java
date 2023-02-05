public class TypeConversionAndCasting {
    public static void main( String args[] ){
        /*
         Suppose we have two variables byte and integer, and let's say
         byte has the value which can be fit in integer range and similarly
         integer haas value which can be fit into byte range
         */

         byte b = 120;
         int a = 127;
         // a=b; //Implicit Conversion / Automatically Casting
         b=(byte)a; //Explicity conversion / Casting / Mentioning to do conversion
         System.out.println(b);

         float f = 5.6f;
         int x  = (int)f; //->5
         System.out.println(x);

         /*
          Let's say integer has have value which is beyond the byte so while doing the
          conversion that value gets divided by byte range.
          */
          int bigval=257;
          byte small=12;
          small=(byte)bigval;  //257%256(byte range)=1->(ans)
          System.out.println(small);

          // Tye Promotion
          byte val1=10;
          byte val2=30;

          int result = val1*val2; //(10*30 = 300 > 256 range of byte hence java promotes the values to int)
          System.out.println(result);


    }
}
