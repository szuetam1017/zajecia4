public class Main {

    static class User {
        String email;

        User(String email) {
            this.email = email;
        }
    }

    public static void main(String[] args) {

        User u1 = new User("test@mail.com");
        User u2 = new User("test@mail.com");

        System.out.println(u1 == u2);

    }
}