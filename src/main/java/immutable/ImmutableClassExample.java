package immutable;

public class ImmutableClassExample {

    static class User {

        private final String email;
        private final String name;

        public User(String email, String name) {
            this.email = email;
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {

        User user = new User("user@mail.com", "Jan");

        System.out.println(user.getEmail());
        System.out.println(user.getName());
    }
}
