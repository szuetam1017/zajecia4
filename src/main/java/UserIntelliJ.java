import java.util.Objects;

public class UserIntelliJ {

    private final String name;
    private final String email;

    public UserIntelliJ(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserIntelliJ user)) return false;
        return Objects.equals(name, user.name) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        return "UserIntelliJ{name='" + name + "', email='" + email + "'}";
    }
}
