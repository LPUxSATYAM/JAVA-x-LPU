//Producer - Consumer
//wait() , notify() , notifyAll()

class SharedResource {
    boolean available = false;

    // Consumer method
    public synchronized void consume() {
        while (!available) {
            try {
                System.out.println("Consumer is waiting...");
                wait(); // wait until producer notifies
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumer consumed the item");
        available = false;
    }

    // Producer method
    public synchronized void produce() {
        System.out.println("Producer produced the item");
        available = true;

        notify(); // wake up one waiting thread
    }
}

class Producer implements Runnable {
    SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        resource.produce();
    }
}

class Consumer implements Runnable {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.consume();
    }
}



public class Thread5 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread consumer = new Thread(new Consumer(resource), "Consumer");
        Thread producer = new Thread(new Producer(resource), "Producer");

        consumer.start();
        producer.start();
    }
}