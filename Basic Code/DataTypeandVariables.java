class Variables{
    public static void main( String a[] )
    {
        //DataType = assignment
        int age = 23;
        String name = "Harsh"; //Always used double quotes because single quotes are used for char. String is a class and not primitive data type.
        char c ='H'; //Accepty only single character, works in single quotes
        double bw = 80.7;
        boolean male = true;
        float value = 5.88f; // Need to explicitly mention the value to be float
        byte b = 127;
        long num = 1234566l; //Specify long 

        // All these values are called Literals

        int five=0b101;
        int hex=0xFFFF;

        long crores=100_000_000_000l;

        System.out.println("Name: "+name+"\nAge: "+age+"\nBodyWeight: "+bw);
        System.out.println(five+" "+hex);
        System.out.println(crores);


    }

}


/*
 Data Types are of twp types
 1. Primitive: Simple data types (in-built)
    - Integer DT used:byte,short,int,log
        int -> 4 bytes
        long -> 8 bytes
        short -> 2 bytes
        byte -> 1 byte (-2^7 to 2^7-1)(-128 to 127)
    - Float DT used: double,float
        float -> 4 bytes
        double -> 8 bytes (default)
    - Boolean
    - Characters
        char -> 2 bytes
 */