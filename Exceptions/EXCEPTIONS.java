
public class EXCEPTIONS {
    public static void main(String args[]){

        int k = 0;
        String s = null;
        try
        {
            int j = 100/k; // Critical Statements after this statement below statements won't get executed if exception found.
            System.out.println(j);
        }
        catch(Exception e){ //Exceptions throws an object which is in form of any varible. Here catch that in form of e.
            System.out.println("Divide by 0 "+e);
        };

        int arr[]={1,2,3,4};
        try{
            for(int i=0; i<4;i++) System.out.println(arr[i]);
            System.out.println(s.length());
        }
        catch(ArithmeticException obj){
            System.out.println("ERROR "+ obj);
        }
        catch (ArrayIndexOutOfBoundsException obj1){
            System.out.println("Out of bounds");
        }
        catch( Exception e){
            System.out.println("Not sure what error");
        }

        // Exception is a parent class which handles all the types of exceptions which are child class.

        // Custom Exception
        try{
            throw new MyException(" custom exception");
        }
        catch (MyException e){
            System.out.println(e);
        }



        // Throw

        try{
            throw new ArithmeticException("This is due to zero");
        }
        catch (ArithmeticException e){
            System.out.println("Throw key word throw arithmetic exception which was caught by catch"+" See message provided by error "+e);
        }
        
        // Throws
        A a = new A();
        try{
            a.findclass();
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found "+e);
        }


        // Finally

        int val1 = 0;
        try{
            System.out.println(18/val1);
        }
        catch( Exception e){
            System.out.println("Error");
        }
        finally{
            System.out.println("Always get execute");
        }
    }
}


class MyException extends Exception{
    public MyException (String s){
        super(s);
    }
}

class A{
    public void findclass() throws ClassNotFoundException {
        Class.forName("Demo"); // Search for class Demo and this will show exception which will be thrown
    }
}









