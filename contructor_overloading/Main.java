public class Main {

    public static void main(String[] args) {

        Info info1 = new Info();
        Info info2 = new Info("Saifur");
        Info info3 = new Info("Samin", "napadose@gmail.com");
        Info info4 = new Info("Alif", "danahatao@gmail.com", 23);

        System.out.println(info1.username);
        System.out.println(info1.email);
        System.out.println(info1.age);
        System.out.println();

        System.out.println(info2.username);
        System.out.println(info2.email);
        System.out.println(info2.age);
        System.out.println();

        System.out.println(info3.username);
        System.out.println(info3.email);
        System.out.println(info3.age);
        System.out.println();

        System.out.println(info4.username);
        System.out.println(info4.email);
        System.out.println(info4.age);
        System.out.println();

    }
}