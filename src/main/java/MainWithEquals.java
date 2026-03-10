public class MainWithEquals {

    public static void main(String[] args) {
        User user1 = new User("test@mail.com");
        User user2 = new User("test@mail.com");

        System.out.println(user1.equals(user2));
    }
}
