import java.util.ArrayList;
import java.util.List;

/**
 * Manages the Coding Club's members and their payments.
 */
public class CodingClubManager {
    private List<Member> members;

    public CodingClubManager() {
        this.members = new ArrayList<>();
    }

    /**
     * Adds a new member to the club.
     * @param member The new member.
     */
    public void addMember(Member member) {
        members.add(member);
        System.out.println();
        System.out.println("##################################################");
        System.out.println("Member added: " + member.getName());
    }

    /**
     * Deletes a member based on membership number.
     * @param membershipNumber The membership number of the member to be removed.
     */
    public void deleteMember(int membershipNumber) {
        members.removeIf(m -> m.getMembershipNumber() == membershipNumber);
        System.out.println();
        System.out.println("##################################################");
        System.out.println("Member deleted with membership number: " + membershipNumber);
    }

    /**
     * Displays all members of the club.
     */
    public void displayMembers() {
        System.out.println();
        System.out.println("##################################################");
        for (Member member : members) {
            System.out.println(member);
        }
        System.out.println("##################################################");
    }

    /**
     * Records a payment for a specific member.
     * @param membershipNumber The membership number.
     * @param payment The payment to be recorded.
     */
    public void recordPayment(int membershipNumber, Payment payment) {
        for (Member member : members) {
            if (member.getMembershipNumber() == membershipNumber) {
                member.addPayment(payment);
                System.out.println();
                System.out.println("##################################################");
                System.out.println("Payment recorded: " + payment);
                return;
            }
        }
        System.out.println("Member not found.");
    }

    /**
     * Displays payment history of a specific member.
     * @param membershipNumber The membership number.
     */
    public void getPaymentHistory(int membershipNumber) {
        for (Member member : members) {
            if (member.getMembershipNumber() == membershipNumber) {
                System.out.println();
                System.out.println("##################################################");
                System.out.println("Payment history for " + member.getName() + ":");
                for (Payment payment : member.getPayments()) {
                    System.out.println(payment);
                }
                return;
            }
        }
        System.out.println("Member not found.");
    }
}
