import java.util.*;

public class problem_solving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        char c = sc.next().charAt(0);
        int y = sc.nextInt();

        if (c == '+') {
            System.out.println(x + y);
        } else if (c == '-') {
            System.out.println(x - y);
        } else if (c == '*') {
            System.out.println(x * y);
        } else if (c == '/') {
            System.out.println((double) x / y);
        }

    }
}
