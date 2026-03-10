import java.util.Objects;
public class User {
    private String email;
    public User(String email) {
        this.email = email;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User user)) {
            return false;
        }
        return Objects.equals(email, user.email);
    }
}
