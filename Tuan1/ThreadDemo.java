class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
    }
        System.out.println("Thread is running...");
    }
}
    
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println("Starting thread...");
        t1.start();
    
        // Using isAlive() method
        if (t1.isAlive()) {
            System.out.println("Thread is still running...");
        } else {
                System.out.println("Thread has finished.");
            }
    
    // Using join() method
        System.out.println("Waiting for thread to finish...");
        t1.join();
        System.out.println("Thread has finished.");
    }
}