
public class Encapsulation {
    public static void main(String args[]){

        facebook fb = new facebook();
        fb.setID(11);
        fb.setPass("1234");

        System.out.println(fb.getID()+" "+fb.getPass());

        


    }
}

/*
 Binding (or wrapping) code and data together into a single unit are known as encapsulation.
 */

 class facebook{
    /*
     If these variables are not private anyone can access these varibles /set /add values using objects.
     Private variables are accessible only within a class.

     Here we are restricting direct access of variables of another class by providing methods.
     Binding the data with methods like assigning the value with methods and getting the values with methods and not objects directly.
     */

    private String pass; 
    private int FBid;

    public int getID(){ //Getters (can have different function name)
        return FBid;
    }

    public String getPass(){
        return pass;
    }

    public void setID(int id){ //Setters (can have different function name)
        FBid=id;
    }

    public void setPass(String pas){
        pass=pas;
    }


}