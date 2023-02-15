/*
 Where an object is being used by another object is known as Coupling. 
 In this case an object will be dependent on another object to complete its tasks,
 means both of the objects are dependent on each other.

 Tight Coupling:
 - When some classes highly require one other to perform their functionality. 
 - For example, You have some functions in base class and you are inheriting it in other classes. 
   So the derived class is highly dependent on the base class. 
   if anything changes in base class will affect derived class too.

 Loose Coupling:
 - In Loose Coupling we try to reduce the dependencies of the class which uses another class in a direct way.

 (https://www.thejavaprogrammer.com/coupling-in-java/#:~:text=So%20if%20we%20see%20coupling%20in%20terms%20of,highly%20require%20one%20other%20to%20perform%20their%20functionality.)

 E.g here,
 Suppose a developer requires Laptop , it will perform his development application using laptop.
 So we have a two classes Laptop and Developer. Developer uses Laptop class to code by passing Laptop object to
 the developing method. Since its an Laptop object the type is laptop.
 So here, my Developer object depends on laptop object to code.

 Now let's say company is not providing laptop any more and forcing to use Desktop. So we have Desktop class.
 Desktop object when passed to developer , the developer won't accept it because the developer
 is still using object which is of TYPE LAPTOP.

 To make it work, we need to change type of laptop to desktop again.
 public void Developing(Desktop mach){

 Let's say in future company got new machine , again we need to change the type of object in developing method
 to that type of macine.

 To my developer object is now dependent on another object (Laptop/Desktop)

 This is called Tight Coupling.

 -----------------------------------------------------------------------------------

 Now the developer is not dependent on laptop or desktop , he is dependent on computer.
 So whenever a computer machine he has be provided he must work on it.

 So we have interface/abstract or normal class of computer which is implemented/extended by its devices
 laptop and desktop.

 So we create an reference variable of computer and object of Laptop class or Desktop class.
 Now the type of object in the developing method of developer class is Computer.

 We are creating one reference and passing that reference variable into other class method, but when that reference calls
 for object that will be laptop or desktop or any other future machine the respective method will be used..

 This is called Loose Coupling.

 So in future if we have a new machine of computer it just needed to be implement/extends the class and implement those
 methods. Create a reference variable of a computer and use object of new machine.

 -------------------------------------------------------------------------------
 */

public class Coupling {
 public static void main(String args[]){

    Laptop lap = new Laptop();
    Developer Harsh = new Developer();
    Harsh.Developing(lap);


    Desktop desk = new Desktop();
    //Harsh.Developing(desk); // Providing Desktop object to the developer which won't be accept. Tight Coupling

    Computer comp = new Desktop();
    Computer comp1 = new Laptop();
    Harsh.Developing(comp); // Loose coupling , create single reference variable and implementing its method.
    Harsh.Developing(comp1);

 }   
}


interface Computer{

    void show();
}



class Desktop implements Computer{

    public void show(){
        System.out.println("Developer using Desktop to code,compile & run");
    }
}



class Laptop implements Computer{

    public void show(){
        System.out.println("Developer using Laptop to code,compile & run");
    }
}

class Developer{

    public void Developing(Computer mach){
        System.out.println("Developer using machine");
        mach.show();
    }
}
