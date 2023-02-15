import java.util.ArrayList;
import java.util.List;

/*
 Association is a relation between two separate classes which establishes through their Objects. 
 Association can be one-to-one, one-to-many, many-to-one, many-to-many. 
 In Object-Oriented programming, an Object communicates to another object to use functionality and services 
 provided by that object. 
 
 Composition and Aggregation are the two forms of association. 

 Association:
 Association refers to the relationship between multiple objects. 
 It refers to how objects are related to each other and how they are using each other's functionality. 


 Aggregation:
 The composition is the strong type of association. An association is said to composition 
 if an Object owns another object and another object cannot exist without the owner object. 
 Consider the case of Human having a heart. Here Human object contains the heart and heart 
 cannot exist without Human. Aggregation follows the one-to-one or one-way relationship.


 Composition:
 Aggregation is a weak association. An association is said to be aggregation if both Objects can exist independently. 
 For example, a Team object and a Player object. The team contains multiple players but a player can 
 exist without a team.

 */


public class Associations {
    public static void main(String args[]){
        Car c = new Car();
        Engine e = new Engine();
        c.show(e); // Composition, if Engine object is not there , we cannot drive the car


        // Aggregation
        Students s1 = new Students("Harsh", 1);
        Students s2 = new Students("Meet", 2);
        Students s3 = new Students("Jimit", 3);

        List<Students> engineer = new ArrayList<>();
        engineer.add(s1);
        Departments dpE = new Departments();
        dpE.SetDepartmentOfStudentList(engineer, "Enginner");

        List<Students> Arts = new ArrayList<>();
        Arts.add(s2);
        Arts.add(s3);
        Departments dpA = new Departments();
        dpA.SetDepartmentOfStudentList(Arts, "Arts");
        try{
            dpE.GetCountofStudentsinDeparment();
        }
        catch( Exception error){
            System.out.println("Deparment name not found");
        }
        try{
            dpA.GetCountofStudentsinDeparment();
        }
        catch( Exception error){
            System.out.println("Deparment name not found");
        }
        
        Departments dpNoName = new Departments();

        try{
            dpNoName.GetCountofStudentsinDeparment(); // Method will be still called but it will throw error.
        }
        catch( Exception error){
            System.out.println("Deparment name not found");
        }

        
    }
}

// Composition
class Car{
    public void show(Engine obj){
        
        System.out.println("Driving with "+obj.engin());
    }
}

class Engine{
    public String engin(){
        return "Engine";
    }
}

// Aggregation

class Students{
    String name;
    int id;
    Students(String name,int id){
        this.name=name;
        this.id=id;
    }

}

class Departments{
    String name;
    List <Students> students;

    public void SetDepartmentOfStudentList(List<Students> StudentList,String Departmentname){
        students=StudentList;
        name=Departmentname;
    }
    public int getStudentData(){
        int c=0;
        for(Students i: students){
            c++;
        }
        return c;
    }

    public void GetCountofStudentsinDeparment() throws Exception{
        int count=getStudentData();
        System.out.println("Department : "+name+" Count: "+count);
    }
}