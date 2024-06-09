package bank;

public class SavingAccount extends Account implements Transactionable, InterestCalculable {

    private double interestRate;

    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Savings Account: " + accountNumber);
        System.out.println("+" + amount);
        System.out.println("Balance: +" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Cannot withdraw. Please double check your balance!");
        } else {
            System.out.println("Savings Account: " + accountNumber);
            System.out.println("-" + amount);
            System.out.printf("Balance: +%-10.1f\n", balance);
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate/100;
    }

}
