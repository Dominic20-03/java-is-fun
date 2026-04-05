public class Main {
    public static void main(String[] args) {

        person p1 = new person();
        p1.setName("Samin Ullah Patowary");
        p1.setAge(25);

        if (p1.getAge() < 0) {
            System.out.println("Age can't be Negative");
        } else {
            System.out.println("Name : " + p1.getName());
            System.out.println("Age : " + p1.getAge());
        }

    }
}
