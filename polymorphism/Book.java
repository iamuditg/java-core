package polymorphism;

public class Book extends MediaItem{
    private String author;
    public Book(String title,String author, int year) {
        super(title, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year: " + getYear());
    }
}
