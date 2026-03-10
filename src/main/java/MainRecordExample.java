public class MainRecordExample {

    public static void main(String[] args) {
        UserRecord user1 = new UserRecord("Jan", "jan@mail.com");
        UserRecord user2 = new UserRecord("Jan", "jan@mail.com");

        System.out.println(user1.name());
        System.out.println(user1.email());

        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode() == user2.hashCode());
        System.out.println(user1);
    }
}
