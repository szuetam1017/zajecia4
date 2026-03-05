package immutable;

public class ImmutabilityExample {

    public static void main(String[] args) {

        String text = "Hello";

        text.concat(" World");

        System.out.println(text);
    }
}
