package immutable;

public class ImmutableMethodExample {

    static class Money {

        private final int amount;

        public Money(int amount) {
            this.amount = amount;
        }

        public Money add(int value) {
            return new Money(this.amount + value);
        }

        public int getAmount() {
            return amount;
        }
    }

    public static void main(String[] args) {

        Money m1 = new Money(100);

        Money m2 = m1.add(50);

        System.out.println(m1.getAmount()); // 100
        System.out.println(m2.getAmount()); // 150
    }
}
