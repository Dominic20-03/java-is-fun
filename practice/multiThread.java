class myRunnable implements Runnable {
    public void run() {
        System.out.println("Running Thread : " + Thread.currentThread().getName());
    }
}

public class multiThread {
    public static void main(String[] args) {
        myRunnable obj = new myRunnable();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);
        Thread t4 = new Thread(obj);
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        t2.start();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        t3.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        t4.start();
    }
}