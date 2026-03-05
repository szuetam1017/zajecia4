package equals;

import java.util.Objects;

public class CorrectEquals {

    private final String email;
    private final String tenantId; // przykład: ten sam email w różnych tenantach = inny user

    public CorrectEquals(String email, String tenantId) {
        this.email = Objects.requireNonNull(email, "email");
        this.tenantId = Objects.requireNonNull(tenantId, "tenantId");
    }

    @Override
    public boolean equals(Object o) {
        // 1) Ten sam obiekt w pamięci → true (najszybsza ścieżka)
        if (this == o) return true;

        // 2) Null lub inny typ → false
        // Wariant A: ścisły typ (najprostszy do nauki)
        if (o == null || getClass() != o.getClass()) return false;

        // 3) Rzutowanie (już bezpieczne)
        CorrectEquals other = (CorrectEquals) o;

        // 4) Porównanie pól, które definiują tożsamość logiczną
        return Objects.equals(email, other.email)
                && Objects.equals(tenantId, other.tenantId);
    }

    // Uwaga: hashCode MUSI być spójny z equals
    @Override
    public int hashCode() {
        return Objects.hash(email, tenantId);
    }

    @Override
    public String toString() {
        return "User{email='" + email + "', tenantId='" + tenantId + "'}";
    }

    public static void main(String[] args) {
        CorrectEquals u1 = new CorrectEquals("a@mail.com", "TENANT-1");
        CorrectEquals u2 = new CorrectEquals("a@mail.com", "TENANT-1");
        CorrectEquals u3 = new CorrectEquals("a@mail.com", "TENANT-2");

        System.out.println("u1 == u2      : " + (u1 == u2));        // false
        System.out.println("u1.equals(u2) : " + u1.equals(u2));     // true

        System.out.println("u1.equals(u3) : " + u1.equals(u3));     // false (inny tenant)
        System.out.println("u1.equals(null): " + u1.equals(null)); // false
        System.out.println("u1.equals(\"x\"): " + u1.equals("x"));  // false
        System.out.println(u1); // sensowne toString()
    }
}
