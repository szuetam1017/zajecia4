package hashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class IncorrectHashCodeExample {

    static class User {
        private final String email;

        User(String email) {
            this.email = email;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User other)) return false;
            return Objects.equals(email, other.email);
        }

        // UWAGA: brak hashCode() -> dziedziczymy hashCode z Object (oparty o "tożsamość")
    }

    public static void main(String[] args) {
        Set<User> set = new HashSet<>();

        User u1 = new User("a@mail.com");
        User u2 = new User("a@mail.com");

        System.out.println("u1.equals(u2) = " + u1.equals(u2)); // true

        set.add(u1);
        set.add(u2);

        System.out.println("Set size = " + set.size()); // często 2, a powinno być 1
        System.out.println("Contains u2? " + set.contains(u2)); // może być false w dziwnych przypadkach
    }
}