// Creation of Threads
// LAMBDA EXPRESSION

public class Thread3 {
    public static void main(String[] args) {

        String taskName1 = "Task-1";
        String taskName2 = "Task-2";

        Thread thread1 = new Thread(() -> {
            try {
                System.out.println("Running " + taskName1);
                Thread.sleep(7000);
            } 
            catch (Exception e) {
                System.out.println("Task " + taskName1 + " interrupted.");
            }

            System.out.println(taskName1 + " exiting.");
        });


        
        Thread thread2 = new Thread(() -> {
            try {
                System.out.println("Running " + taskName2);
                Thread.sleep(7000);
            } catch (Exception e) {
                System.out.println("Task " + taskName2 + " interrupted.");
            }

            System.out.println(taskName2 + " exiting.");
        });

        thread1.start();
        thread2.start();
    }
}