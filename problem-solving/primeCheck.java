import java.util.*;

public class primeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // int cnt = 0;

        boolean f = true;

        for (int i = 1; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                f = false;
            }
        }

        if (f) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
