import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deposit amount: ");
        double depositValue = scanner.nextDouble();

        account.deposit(depositValue);

        System.out.print("Withdraw amount: ");
        double withdrawValue = scanner.nextDouble();

        account.withdraw(withdrawValue);
    }
}
