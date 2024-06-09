package electricity;

public interface ElectricityBilling {
    final int under100 = 1500;
    final int from100To150 = 2000;
    final int from150To200 = 3000;
    final int over200 = 4000;
    
    double calculateElectricityBill();
    double sumE();
}
