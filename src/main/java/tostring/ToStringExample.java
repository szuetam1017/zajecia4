package tostring;

public class ToStringExample {

    static class UserWithoutToString {
        private final String email;

        UserWithoutToString(String email) {
            this.email = email;
        }
    }

    static class UserWithToString {
        private final String email;

        UserWithToString(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "User{email='" + email + "'}";
        }
    }

    public static void main(String[] args) {
        var a = new UserWithoutToString("a@mail.com");
        var b = new UserWithToString("b@mail.com");

        System.out.println("Without toString: " + a);
        System.out.println("With toString:    " + b);
    }
}
