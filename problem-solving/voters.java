import java.util.*;

public class voters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        int[] arr = new int[n];

        int num = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

            if (arr[i] > x) {
                num++;
            }
        }

        System.out.println(num);

    }
}
