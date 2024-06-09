package library;

public class Book extends LibraryItem implements Borrowable, Readable {
    private int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        super(title, author);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    @Override
    public void borrow() {
        System.out.println("YOU ARE BORROWING");
        System.out.println("Book's Name: " + title + " - " + numberOfPages + "pages");
        System.out.println("Author: " + author);
    }
    
    @Override
    public void returnItem() {
        System.out.println("YOU ARE RETURNING");
        System.out.println("Book's Name: " + title + " - " + numberOfPages + "pages");
        System.out.println("Author: " + author);
    }
    
    @Override
    public void read() {
        System.out.println("YOU ARE READING:");
        System.out.println("Book's Name: " + title + " - " + numberOfPages + "pages");
        System.out.println("Author: " + author);
    }
}