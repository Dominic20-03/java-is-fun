import java.util.*;

public class monopoly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int r1 = a + b + c;
        int r2 = d + b + c;
        int r3 = a + d + c;
        int r4 = a + b + d;

        if (r1 < d || r2 < a || r3 < b || r4 < c) {
            System.out.println("There is Monopoly");
        } else {
            System.out.println("There is no Monopoly");
        }
    }
}
