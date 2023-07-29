package polymorphism;

public class MediaLibraryApp {
    public static void main(String[] args) {
        MediaItem[] mediaItems = new MediaItem[3];
        mediaItems[0] = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
        mediaItems[1] = new Movie("Inception", "Christopher Nolan", 2010);
        mediaItems[2] = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

        System.out.println("Media Library Contents:");
        for (MediaItem item : mediaItems) {
            item.displayInfo();
            System.out.println("---------------");
        }
    }
}
