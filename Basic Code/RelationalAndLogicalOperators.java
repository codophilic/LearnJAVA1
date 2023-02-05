public class RelationalAndLogicalOperators {
    public static void main(String args[]){
        //Relational
        System.out.println(5>6);
        System.out.println(5>=6);
        System.out.println(6.9>5);

        //Logical
        System.out.println(6==7 & 7==7 );
        System.out.println(6==7 | 7==7 );
        System.out.println(6!=7 && 7==7 ); // Using && or || saves time by not checking further operations when found false or true in between of operations respectively.

    }
}
