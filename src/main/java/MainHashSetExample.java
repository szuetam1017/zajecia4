import java.util.HashSet;
import java.util.Set;

public class MainHashSetExample {
    public static void main(String[] args) {
        Set<UserWithEqualsAndHashCode> users = new HashSet<>();
        users.add(new UserWithEqualsAndHashCode("test@mail.com"));
        users.add(new UserWithEqualsAndHashCode("test@mail.com"));

        System.out.println(users.size());
    }
}
