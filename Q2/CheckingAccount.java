public class CheckingAccount {
    private double balance;
    private int accountNumber;

    public void deposit(double depositValue){
        balance += depositValue;
    }

    public void withdraw(double withdrawValue){
        try {
            double newBalance = balance - withdrawValue;
            if (newBalance < 0) {
                throw new InsufficientFundsException(newBalance);
            }
            balance = newBalance;
            System.out.println("Your balance after withdraw is: $" + balance);
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry but your account is short by: $" + Math.abs(e.getAmount()));
        }
    }

    public double getBalance(){
        return balance;
    }

    public int getNumber(){
        return accountNumber;
    }
}