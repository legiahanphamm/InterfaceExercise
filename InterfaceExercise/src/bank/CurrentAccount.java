package bank;

public class CurrentAccount extends Account implements Transactionable {

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    
    @Override
    public void deposit(double amount) {
        System.out.println("Current Account: " + accountNumber);
        System.out.println("+" + amount);
        System.out.println("Balance: +" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Cannot withdraw. Please double check your balance!");
        } else {
            System.out.println("Current Account: " + accountNumber);
            System.out.println("-" + amount);
            System.out.printf("Balance: +%-10.1f\n", balance);
        }
    }
}
