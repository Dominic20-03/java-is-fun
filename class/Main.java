public class Main {

    public static void main(String[] args) {
        car c1 = new car();
        System.out.println(c1.isRunning);
        c1.start();
        c1.isRunning = true;
        System.out.println(c1.isRunning);
        System.out.println("Car Year : " + c1.year);
        System.out.println("Car Model : " + c1.model);
        System.out.println("Car brand : " + c1.brand);
        c1.stop();
    }
}