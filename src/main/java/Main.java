public class Main {

    static class User {
        String email;

        User(String email) {
            this.email = email;
        }
    }

    public static void main(String[] args) {
        User user1 = new User("test@mail.com");
        User user2 = new User("test@mail.com");

        System.out.println(user1 == user2);
    }
}
