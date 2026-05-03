// Creation of Threads
// Runnable Interface

class MyThread implements Runnable { // Functional Interaface - run()

    private String taskName;

    public MyThread(String name) {
        taskName = name;
        System.out.println("Creating " + taskName);
    }

    public void run() {   
        try {
                System.out.println("Running " + taskName);
                Thread.sleep(7000);
            }
            catch (Exception e) {
            System.out.println("Task " + taskName + " interrupted.");
        }

        System.out.println(taskName + " exiting.");
    }
}

public class Thread2 {
    public static void main(String[] args) throws InterruptedException {
        
        MyThread obj = new MyThread("Task-1"); // repesenting task
        Thread thread1 = new Thread(obj); //Thread Object creation // NEW state
        thread1.start(); // RUNNABLE STATE

        Thread thread2 = new Thread(new MyThread("Task-2"));
        thread2.start();


        thread1.join(); // to the main thread 
        


        thread2.join(2000);

        System.out.println("final value");
    }
}
