import java.util.*;

public class workingHours {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int result = (x * 4) + y;

        System.out.println("Total Working Hours : " + result);
    }
}