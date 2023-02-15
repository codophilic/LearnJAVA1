# Threads

- A Thread is a very light-weighted process, or we can say the smallest part of the process that allows a program to operate more efficiently by running multiple tasks simultaneously.

- In order to perform complicated tasks in the background, we used the Thread concept in Java.

- All the threads have their own separate path for execution, so each thread of a process is independent.

- When a thread gets an exception or an error at the time of its execution, it doesn't affect the execution of the other threads. 

- All the threads share a common memory and have their own stack, local variables and program counter. 

- When multiple threads are executed in parallel at the same time, this process is known as Multithreading.

![](https://github.com/codophilic/LearnJAVA/blob/main/Images/5.JPG)

- Class must extends Thread class and it must have run() method. To call the class we need to use start() method with object.

- Class Thread implements an Functional interface Runnable() , that's why it requires method run();

-  Working with thread, the varible / method its using must be immutable or not common. Those methods/variable must not be shared. Because the threads may encounter same operation at the same time. If we call the method two times, and suppose all threads reaches at same time, the operation will be executed once.


## States of thread

- 5 states of thread

- Whenever we create thread that becomes new state, when we start() the threat ie goes in runnable state which means its waiting for schedular to take it on CPU to process. Running state basically execution on CPU of thread. Waiting/blocked waits the thread and again when waiting is over it goes to runnable state. Once process is completed thread
goes in stop state / dead.

![](https://github.com/codophilic/LearnJAVA/blob/main/Images/6.PNG)



