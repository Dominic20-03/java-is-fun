public class Main {

    public static void main(String[] args) {
        MathOperation obj = new MathOperation();

        System.out.println(obj.add(3, 4));
        System.out.println(obj.add(3, 4, 5));
        System.out.println(obj.add(3.23, 4.76));
    }
}