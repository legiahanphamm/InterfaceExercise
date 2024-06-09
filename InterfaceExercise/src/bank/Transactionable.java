package bank;

public interface Transactionable {
    void deposit(double amount);
    void withdraw(double amount);
}
