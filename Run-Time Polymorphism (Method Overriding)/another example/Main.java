public class Main {
    public static void main(String[] args) {
        payment p;

        p = new creditcard();
        p.pay();

        p = new paypal();
        p.pay();
    }
}
