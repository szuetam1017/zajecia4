package immutable;

public class ImmutableClassChangeExample {

    static class User {

        private final String email;

        public User(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }
    }

    public static void main(String[] args) {

        User u1 = new User("a@mail.com");

        // "zmiana" emaila -> tworzymy nowy obiekt
        User u2 = new User("b@mail.com");

        System.out.println(u1.getEmail());
        System.out.println(u2.getEmail());
    }
}
