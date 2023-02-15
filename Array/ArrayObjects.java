
public class ArrayObjects {
    
    public static void main(String args[]){

        Student s1 = new Student();
        s1.name="Harsh";
        s1.rollno=1;
        s1.percent=56.5;

        Student s2 = new Student();
        s2.name="Meet";
        s2.rollno=1;
        s2.percent=65.5;

        Student stud[] = new Student[2]; //Creating array of objects and assigning object into the array.
        stud[0]=s1;                      // So here we can consider this as a 2D- Array, where rows are numerical indexes
        stud[1]=s2;                      // and columns are instance variables.   

        for(int i=0;i<stud.length;i++){
            System.out.println("name:"+" "+stud[i].name+" percentage: "+stud[i].percent);
        }



    }
}


class Student{

    String name;
    int rollno;
    double percent;
}