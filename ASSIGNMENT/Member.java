import java.util.ArrayList;
import java.util.List;

/**
 * Represents a member of the Coding Club.
 */
public class Member {
    private String name;
    private int membershipNumber;
    private List<Payment> payments;

    public Member(String name, int membershipNumber) {
        this.name = name;
        this.membershipNumber = membershipNumber;
        this.payments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMembershipNumber() {
        return membershipNumber;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    @Override
    public String toString() {
        return "Member{name='" + name + "', membershipNumber=" + membershipNumber + "}";
    }
}
