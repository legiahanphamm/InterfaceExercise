package electricity;

public class Household implements ElectricityBilling {
    protected double eUnder100;
    protected double eFrom100To150;
    protected double eFrom150To200;
    protected double eOver200;

    public Household() {
    }

    public Household(double eUnder100, double eFrom100To150, double eFrom150To200, double eOver200) {
        this.eUnder100 = eUnder100;
        this.eFrom100To150 = eFrom100To150;
        this.eFrom150To200 = eFrom150To200;
        this.eOver200 = eOver200;
    }
    
    @Override
    public double sumE() {
        return eUnder100 + eFrom100To150 + eFrom150To200 + eOver200;
    }
    
    @Override
    public double calculateElectricityBill() {
        return eUnder100*under100 + eFrom100To150*from100To150 + eFrom150To200*from150To200 + eOver200*over200;
    }
}
