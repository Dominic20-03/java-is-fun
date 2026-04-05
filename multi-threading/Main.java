
public class Main {
    public static void main(String[] args) throws InterruptedException {
        myThread t1 = new myThread();
        myThread t2 = new myThread();
        myThread t3 = new myThread();

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}