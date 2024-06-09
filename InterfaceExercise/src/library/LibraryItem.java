package library;

public abstract class LibraryItem {
    protected String title;
    protected String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void getInfo() {
        System.out.println("DETAILS INFOMATION");
        System.out.println("Name: " + title);
        System.out.println("Author: " + author);
    }
}
