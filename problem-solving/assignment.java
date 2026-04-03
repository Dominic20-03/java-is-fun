import java.util.*;

public class assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        int result = x + 3;

        if (result < 10) {
            System.out.println("Assignment Taken");
        } else {
            System.out.println("Assignment Rejected");
        }
    }
}
