public class THIS {
    public static void main(String args[]){

        A obj1 = new A(4,5);
        System.out.println(obj1.n1);
        System.out.println(obj1.n2);

        A obj2 = new A(4,5);
        obj2.setn3(40, obj2); //Passing the object
        System.out.println(obj2.getn3());
    }
}

class A{

    int n1;
    int n2;
    int n3;

    A(int n1, int n2){
        this.n1=n1;
        this.n2=n2;
    }
    public void setn3(int n3,A obj1){
        obj1.n3=n3;
    }
    public int getn3(){
        return n3;
    }
}


/*
 This keyword is used when the argument variable has name of instance variable. To refer instance variable and instance 
 this is used.

 Behind Scenes:

 Now suppose if the arguments variables are different
     A(int num1, int num2){
        n1=num1;
        n2=num2;
    }

 In stack memory of main method , there will be an object 'obj1' having value as reference ID (lets say 101) , this id 
 is present in heap memory with two values (n1,n2) of class A.

 There will be stack memory of 'A()' , these stack will have two values (num1=0,num2=0) initally. 
 
 So when we are passing value 4 & 5, so obj1 which has reference ID will also have same values (n1=4,n2=5),
 Also the stack memory of A() num1=4,num2=5 referring n1,n2.

 Now when we have same instance variable name as arguments
     A(int n1, int n2){
        this.n1=n1;
        this.n2=n2;
    }

 There both the stack memory A() and main have same variables, so when we pass the value the object having 
 reference address 101 where the variables of class A n1 & n2, does not get updates because they are treated 
 as local variables of A(). local variable preference is > instance variable.

 We can pass the object as arugment and assign the address of that object in the set method.

 */