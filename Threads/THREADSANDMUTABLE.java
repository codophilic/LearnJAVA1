package Threads;



public class THREADSANDMUTABLE {
    public static void main(String args[]) throws InterruptedException{
    Counter c = new Counter();

    Runnable r1 = () ->{
        for(int i=0; i<=1000 ; i++){
            c.count();
        }
    };

    Runnable r2 = () ->{
        for(int i=0; i<=1000 ; i++){
            c.count();
        }
    };

    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);

    t1.start();
    t2.start();

    t1.join();
    t2.join(); // After executing all threads getting final value of C. Expected to be 2002.

    System.out.println(c.countval);
}

}

class Counter{
    int countval;
    public synchronized void count(){ // One thread at a time when we add synchronized keyword in the method.
        countval++;
    }
}