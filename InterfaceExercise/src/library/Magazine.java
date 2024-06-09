package library;

public class Magazine extends LibraryItem implements Readable {

    private int issueNumber;

    public Magazine(int issueNumber, String title, String author) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public void read() {
        System.out.println("YOU ARE READING:");
        System.out.println("Magazine's Name: " + title);
        System.out.println("No.: " + issueNumber);
        System.out.println("Author: " + author);
    }
}
