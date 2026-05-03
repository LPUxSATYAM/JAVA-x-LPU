// Creation of Threads
// Thread Class


class MyThread extends Thread { // implements Runnable
    private String threadName;

    MyThread(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        try {
                System.out.println("Running" + threadName);
                Thread.sleep(7000);
        } 
        catch (Exception e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println(threadName + " exiting.");
    }
}

public class Thread1 {
    public static void main(String[] args) throws InterruptedException{ //Main thread

        MyThread thread1 = new MyThread("Task-1"); //Object

        thread1.start(); // start thread - call run() -takes some time -  execute task


        MyThread thread2 = new MyThread("Task-2");
        thread2.start();
    }
}