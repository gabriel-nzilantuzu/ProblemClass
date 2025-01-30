import java.util.Scanner;

public class TestCodingClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CodingClubManager manager = new CodingClubManager();

        // Main loop to interact with the user
        while (true) {
            System.out.println("\n--- Coding Club Manager ---");
            System.out.println("1. Add Member");
            System.out.println("2. Display Members");
            System.out.println("3. Record Payment");
            System.out.println("4. Get Payment History");
            System.out.println("5. Delete Member");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // To consume the leftover newline character
            try{
                switch (choice) {
                case 1:
                    // Add a new member
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter member number: ");
                    int memberNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Member newMember = new Member(name, memberNumber);
                    manager.addMember(newMember);
                    System.out.println("Member added successfully.");
                    System.out.println("##################################################");
                    break;
                
                case 2:
                    // Display all members
                    manager.displayMembers();
                    break;
                
                case 3:
                    // Record a payment
                    System.out.print("Enter member number: ");
                    int memberNumForPayment = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter month of payment: ");
                    String month = scanner.nextLine();
                    System.out.print("Enter year of payment: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter payment amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    Payment payment = new Payment(month, amount);
                    manager.recordPayment(memberNumForPayment, payment);
                    System.out.println("Payment recorded.");
                    System.out.println("##################################################");
                    break;
                
                case 4:
                    // Get payment history for a member
                    System.out.print("Enter member number: ");
                    int memberNumForHistory = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    manager.getPaymentHistory(memberNumForHistory);
                    System.out.println("##################################################");
                    break;

                case 5:
                    // Delete a member
                    System.out.print("Enter member number to delete: ");
                    int memberNumToDelete = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    manager.deleteMember(memberNumToDelete);
                    System.out.println("Member deleted.");
                    System.out.println("##################################################");
                    break;

                case 6:
                    // Exit the loop and terminate the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
            }catch(Exception e){
                System.out.println("Invalid entry, please try again.");
                break;
            }
        }
    }
}
