public class Info {
    String username;
    String email;
    int age;

    Info() {
        this.username = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }

    Info(String username) {
        this.username = username;
        this.email = "hello@123.com";
        this.age = 12;
    }

    Info(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 17;
    }

    Info(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = 21;
    }
}
