import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.println("===== SIMPLE ATM =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Balance: ₹" + balance);

        } else if (choice == 2) {
            System.out.print("Enter deposit amount: ₹");
            double amount = sc.nextDouble();
            balance += amount;
            System.out.println("New Balance: ₹" + balance);

        } else if (choice == 3) {
            System.out.print("Enter withdrawal amount: ₹");
            double amount = sc.nextDouble();

            if (amount <= balance) {
                balance -= amount;
                System.out.println("New Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance!");
            }

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
