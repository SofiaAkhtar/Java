import java.util.Date;

class LibraryItem {
    private String title;
    private String itemType;
    private boolean checkedOut;
    private Date dueDate;

    public LibraryItem(String title, String itemType) {
        this.title = title;
        this.itemType = itemType;
        this.checkedOut = false;
        this.dueDate = null;
    }

    public String getTitle() {
        return title;
    }

    public String getItemType() {
        return itemType;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            // Set due date to 2 weeks from today (for example)
            dueDate = new Date(System.currentTimeMillis() + 14 * 24 * 60 * 60 * 1000);
            System.out.println(title + " has been checked out. Due date: " + dueDate);
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void returnItem() {
        if (checkedOut) {
            checkedOut = false;
            dueDate = null;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " is not checked out.");
        }
    }
}

class Book extends LibraryItem {
    private String author;

    public Book(String title, String author) {
        super(title, "Book");
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class DVD extends LibraryItem {
    private String director;

    public DVD(String title, String director) {
        super(title, "DVD");
        this.director = director;
    }

    public String getDirector() {
        return director;
    }
}

class Journal extends LibraryItem {
    private String publisher;

    public Journal(String title, String publisher) {
        super(title, "Journal");
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Book book = new Book("Java Programming", "John Doe");
        DVD dvd = new DVD("Introduction to Java", "Jane Smith");
        Journal journal = new Journal("Java Journal", "Tech Publications");

        book.checkOut();
        dvd.checkOut();
        journal.checkOut();

        book.returnItem();
        dvd.returnItem();
        journal.returnItem();
    }
}
