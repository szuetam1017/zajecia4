package tostring;

public record ToStringRecordExample() {

    public record User(String email) {}

    public static void main(String[] args) {
        User u = new User("a@mail.com");
        System.out.println(u); // User[email=a@mail.com]
    }
}
