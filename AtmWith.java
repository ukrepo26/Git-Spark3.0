import java.util.Scanner;

public class AtmWith {
    public static void main(String[] args) {
        double accountBalance = 500.0;
        double withdrawalAmount;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        withdrawalAmount = scanner.nextDouble();

        if (accountBalance >= withdrawalAmount) {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal successful. New balance: $" + accountBalance);
        } else {
            System.out.println("Insufficient funds. Try a smaller amount.");
        }

        scanner.close();
    }
}