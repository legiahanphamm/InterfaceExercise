package electricity;

public class Electricity {

    public static void main(String[] args) {
        Household june = new Household(50, 50, 10, 2);
        System.out.println("Bill = " + june.calculateElectricityBill());
    }
    
}
