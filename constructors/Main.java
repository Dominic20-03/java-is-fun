public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Towhidul Mowla Chowdhury", 24, "CSE", 3.88);
        Student student2 = new Student("Syed Mohammad", 24, "CSE", 3.99);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.dept);
        System.out.println(student1.cgpa);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.dept);
        System.out.println(student2.cgpa);
    }
}