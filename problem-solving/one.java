import java.util.*;

public class one {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int person = (int) (Math.ceil(n / 6.00));

        int cost = person * 300;

        System.out.println(cost);
    }
}