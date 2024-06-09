package library;

public class Library {

    public static void main(String[] args) {
        Book b = new Book("DUNE", "Frank Herbert", 2752);
        Magazine m = new Magazine(06, "Hoa Hoc Tro", "Teen");
        
        b.borrow();
        System.out.println("");
        b.returnItem();
        System.out.println("");
        
        m.getInfo();
        System.out.println("");
        m.read();
    }
    
}
