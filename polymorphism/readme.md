Polymorphism in Media Library

This Java program demonstrates the concept of polymorphism using a media library application. Polymorphism is one of the four fundamental OOP concepts, which allows objects to be treated as instances of their parent class or as instances of their own class.

The program consists of three classes: MediaItem, Book, and Movie.

The MediaItem class is an abstract class that serves as the base class for different types of media items. It has private member variables for the title and year of release. The class also defines an abstract method displayInfo() which will be implemented differently in its subclasses.

The Book class is a subclass of MediaItem and represents a book in the media library. It has an additional private member variable for the author of the book. The class implements the displayInfo() method to print the title, author, and year of the book.

The Movie class is another subclass of MediaItem and represents a movie in the media library. It has an additional private member variable for the director of the movie. The class also implements the displayInfo() method to print the title, director, and year of the movie.

In the MediaLibraryApp class, we create an array of MediaItem and populate it with instances of Book and Movie. Since Book and Movie are subclasses of MediaItem, we can store them in the same array and treat them uniformly.

The program then iterates through the array of media items and calls the displayInfo() method on each item, demonstrating polymorphism. Despite having different implementations in Book and Movie, the displayInfo() method is called on each item without knowing its specific type.

The output of the program will show the details of each media item (books and movies) stored in the media library.

This example illustrates how polymorphism allows us to work with different types of media items using a common interface (MediaItem), making the code more flexible and easier to maintain in a media library application.