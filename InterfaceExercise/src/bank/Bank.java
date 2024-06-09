package bank;

public class Bank {

    public static void main(String[] args) {
        CurrentAccount c = new CurrentAccount("98711122005", 1928347);
        SavingAccount s = new SavingAccount("34511122005", 30000000, 5);

        c.deposit(300000);
        System.out.println("");
        c.displayAccountInfo();
        System.out.println("");
        System.out.println("Interest 05/2024: " + s.calculateInterest());
        s.withdraw(50000000);
        System.out.println("");
        s.withdraw(1000000);
        System.out.println("");
        s.displayAccountInfo();
        
    }
    
}
