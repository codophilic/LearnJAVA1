// Method overloading is about overloading the method using number of parameter or the type of parameter. Method having same
// name but different type or number of parameter. 

// Method overloading can also be done for Object Class (Default class which is extended by all classes)

public class methodoverloading{

    public static void main(String args[]){

        Addition ad = new Addition();
        System.out.println(ad.add(2,3));
        System.out.println(ad.add(2,3,4));
        System.out.println(ad.add(2.5,3.5));
    }
}

class Addition{

    public int add( int n1, int n2){
        return n1+n2;
    }

    public int add( int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public double add( double n1, double n2){
        return n1+n2;
    }
}