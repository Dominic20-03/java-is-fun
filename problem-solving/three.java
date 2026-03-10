import java.util.*;

public class three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        double ans = (z / ((double) x * y)) * 100.00;

        System.out.println(ans);

        if (ans > 50.00) {
            System.out.println("Strictly greater than 50%");
        } else {
            System.out.println("Not greater than 50%");
        }
    }
}
