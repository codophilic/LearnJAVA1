/*
 A Thread is a very light-weighted process, or we can say the smallest part of the 
 process that allows a program to operate more efficiently by running multiple tasks simultaneously.
 In order to perform complicated tasks in the background, we used the Thread concept in Java.

 All the threads have their own separate path for execution, so each thread of a process is independent.

 When a thread gets an exception or an error at the time of its execution, it doesn't affect the execution
 of the other threads. All the threads share a common memory and have their own stack, 
 local variables and program counter. When multiple threads are executed in parallel at the same time, 
 this process is known as Multithreading


 */

public class THREADS {
    public static void main(String args[]){
        // Sequential execution of single thread
        A a = new A();
        B b = new B();

        // a.show();
        // b.show();

        // Parallel execution

        System.out.println(a.getPriority()); // Priority of threads (1(low) - 10 (high)) . The priority is given by schedular in OS.
        System.out.println(b.getPriority()); // We can set priority of threads.

        

        //a.start(); // To start the threads we need to have run method inside the class
        try{
            Thread.sleep(20); // milliseconds
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //b.start();

        Runnable obj = () ->{ // Runnable is a FunctionalInterface
                System.out.println("C");
        };

        Thread t1 = new Thread(obj);

        t1.start();


    }
}

class A extends Thread{ // Thread class
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("A");
            try{
                Thread.sleep(10); // milliseconds
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{ // Thread class
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("B");
            try{
                Thread.sleep(10); // milliseconds
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


