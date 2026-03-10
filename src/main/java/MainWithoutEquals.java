public class MainWithoutEquals {

    public static void main(String[] args) {
        UserWithoutEquals user1 = new UserWithoutEquals("test@mail.com");
        UserWithoutEquals user2 = new UserWithoutEquals("test@mail.com");

        System.out.println(user1.equals(user2));
    }
}
