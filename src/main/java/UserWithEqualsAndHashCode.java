import java.util.Objects;

public class UserWithEqualsAndHashCode {

    private String email;

    public UserWithEqualsAndHashCode(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserWithEqualsAndHashCode user)) {
            return false;
        }
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
