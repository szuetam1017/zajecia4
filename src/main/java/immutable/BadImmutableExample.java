package immutable;

import java.util.List;

public class BadImmutableExample {

    static class Order {

        private final List<String> items;

        public Order(List<String> items) {
            this.items = items;
        }

        public List<String> getItems() {
            return items;
        }
    }
}
