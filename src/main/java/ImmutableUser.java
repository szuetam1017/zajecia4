public final class ImmutableUser {

    private final String email;

    public ImmutableUser(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
