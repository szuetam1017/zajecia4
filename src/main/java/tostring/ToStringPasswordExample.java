package tostring;

public class ToStringPasswordExample {

    static class User {
        private final String email;
        private final String password; // sekret

        User(String email, String password) {
            this.email = email;
            this.password = password;
        }

        @Override
        public String toString() {
            return "User{email='" + email + "', password='***'}"; // maskowanie
        }
    }

    public static void main(String[] args) {
        var user = new User("user@mail.com", "secret123");
        System.out.println(user);
    }
}