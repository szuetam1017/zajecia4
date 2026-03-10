public class UserWithToString {

    private String email;

    public UserWithToString(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserWithToString{email='" + email + "'}";
    }
}
