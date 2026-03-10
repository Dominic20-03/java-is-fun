import java.util.*;

public class stringwala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int size1 = str.length();

        int size2 = str.length() - 2;

        if (size1 > 10) {
            System.out.println(str.charAt(0) + "" + size2 + str.charAt(size1 - 1));
        } else {
            System.out.println(str);
        }

    }
}
