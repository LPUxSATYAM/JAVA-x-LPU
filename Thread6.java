import java.util.concurrent.*;

class SimpleTask implements Runnable {
    private String taskName;

    public SimpleTask(String name) {
        this.taskName = name;
    }

    @Override // annotation for the compiler
    public void run() {
        System.out.println(Thread.currentThread().getName() + " executing " + taskName);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
            Thread.currentThread().interrupt();
        }

        System.out.println(Thread.currentThread().getName() + " finished " + taskName);
    }
}

public class Thread6 {
    public static void main(String[] args) {

        // Create a thread pool with 3 threads
        // executor - reference
        // newFixedThreadPool(3) - creating a thread pool with (fixed) 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit multiple tasks to the pool
        // Whichever thread is available , assign task to that thread
        for (int i = 1; i <= 5; i++) {
            SimpleTask obj = new SimpleTask("Task-" + i);
            executor.submit(obj); 
            
            // passing the task to the thread pool
            //First submit() will allocate the task to the thread pool
            //Then it will call run() to execute the task
        }

        // Initiate an orderly shutdown
        // Stop executing any new task and finish off already running tasks
        executor.shutdown();

        // Wait until all tasks are terminated, or timeout occurs
        try {
            if (!executor.awaitTermination(30, TimeUnit.SECONDS)) {
                executor.shutdownNow(); // Force shutdown if tasks don't complete in time
                System.out.println("Executor did not terminate in time. Forced shutdown.");
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            System.out.println("Main thread interrupted while waiting for executor termination.");
        }

        System.out.println("All tasks submitted and executor shut down.");
    }
}