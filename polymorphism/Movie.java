package polymorphism;

public class Movie extends MediaItem{
    private String director;

    public Movie(String title, String director, int year) {
        super(title, year);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + getDirector());
        System.out.println("Year: " + getYear());
    }
}
