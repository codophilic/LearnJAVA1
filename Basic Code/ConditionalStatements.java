import javax.naming.spi.DirStateFactory.Result;

public class ConditionalStatements {
    public static void main( String args[]){
        int x=10;
        if(x>10){
            System.out.println("Greater");
        }
        else if(x==10){
            System.out.println("Equal");
        }
        else{
            System.out.println("Smaller");
        }

        //Ternary Conditional operator
        String result = (x>10)?"Greater":(x==10)?"Equal":"Smaller";
        System.out.println(result);
    }
}
