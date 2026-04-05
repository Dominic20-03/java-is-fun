public class student {
    private int id;
    private double cgpa;
    private String name;

    public void setStudent(int id, double cgpa, String name) {
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("CGPA : " + cgpa);
    }
}