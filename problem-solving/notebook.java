import java.util.*;

public class notebook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int result = (n * 1000) / 100;

        System.out.println(result);
    }
}
