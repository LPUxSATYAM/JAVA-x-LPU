// Synchronization of Threads

class SharedCounter {
    int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " : count is " + count);
    }

    public int getCount() {
        return count;
    }
}

class CounterThread implements Runnable {
    SharedCounter counter; // instance variable - reference variable 

    public CounterThread(SharedCounter counter) {
        this.counter = counter;
    }

    
    public void run() {
        for (int i = 0; i < 3; i++) {
            counter.increment(); // task
        }
    }
}

public class Thread4{
    public static void main(String[] args) throws InterruptedException {

        SharedCounter counter = new SharedCounter();// object 

        CounterThread obj = new CounterThread(counter); // passing object as argument
        Thread t1 = new Thread(obj , "Thread 1");

        Thread t2 = new Thread(new CounterThread(counter) , "Thread 2");
        Thread t3 = new Thread(new CounterThread(counter) , "Thread 3");

        //All the threads are sharing the SAME counter object

        t1.start(); // call run()
        t2.start(); //call run()
        t3.start(); // call run()

        t1.join();
        t2.join();
        t2.join();


        System.out.println("Final count: " + counter.getCount());
    }
}
