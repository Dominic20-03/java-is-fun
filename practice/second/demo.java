import java.util.*;

public class demo {
    int x = 10;
    String fname = "john";
    String lname = "Doe";

    static void welcome() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        demo obj = new demo();
        System.out.println("Hi, " + obj.fname + " " + obj.lname + "\n" + "Your Age : " + obj.x);
        welcome();
    }
}
