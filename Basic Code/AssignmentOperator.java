public class AssignmentOperator {
    public static void main( String args[] ){
        int a=2;
        a+=1;
        a++;
        int b = 100;
        System.out.println(b/a);

        // Pre-Operation and Post-Operation
        int val1=2;
        int result1=++val1; //Pre-increment
        int result2=val1++;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(val1);
    }
}
