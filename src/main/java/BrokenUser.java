import java.util.Objects;

public class BrokenUser {

    private final String email;
    private final String name;

    public BrokenUser(String email, String name) {
        this.email = email;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BrokenUser user)) {
            return false;
        }
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name);
    }
}
