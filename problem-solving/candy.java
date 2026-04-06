import java.util.*;

public class candy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        int f = n - x;
        double result = (double) f / 4;
        System.out.println(Math.ceil(result));
    }
}
