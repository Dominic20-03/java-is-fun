import java.util.*;

public class ajkerfirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        double percentage = ((double) x / n) * 100.00;

        if (percentage >= 50.00) {
            System.out.println("Resolution passed");
        } else {
            System.out.println("Resolution Not Passed");
        }
    }
}
