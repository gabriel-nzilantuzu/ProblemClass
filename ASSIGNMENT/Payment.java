/**
 * Represents a payment made by a member.
 */
public class Payment {
    private String month;
    private double amount;

    public Payment(String month, double amount) {
        this.month = month;
        this.amount = amount;
    }

    public String getMonth() {
        return month;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Payment{month='" + month + "', amount=" + amount + "}";
    }
}
