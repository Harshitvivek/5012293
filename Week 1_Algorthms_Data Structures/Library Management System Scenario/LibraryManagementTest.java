public class LibraryManagementTest {
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Adding books
        library.addBook(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("B002", "1984", "George Orwell"));
        library.addBook(new Book("B003", "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("B004", "The Catcher in the Rye", "J.D. Salinger"));
        library.addBook(new Book("B005", "Pride and Prejudice", "Jane Austen"));

        // Linear search for a book by title
        System.out.println("Linear Search for '1984':");
        Book book = library.linearSearchByTitle("1984");
        if (book != null) {
            System.out.println("Found: " + book);
        } else {
            System.out.println("Book not found.");
        }

        // Sort books by title for binary search
        library.sortBooksByTitle();

        // Binary search for a book by title
        System.out.println("\nBinary Search for '1984':");
        book = library.binarySearchByTitle("1984");
        if (book != null) {
            System.out.println("Found: " + book);
        } else {
            System.out.println("Book not found.");
        }
    }
}

