public class Library  {
    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }


    public void removeBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Removing: " + books[i].getTitle());
                books[i] = books[count - 1]; 
                books[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Book not found!");
    }


    public Book searchBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                return books[i];
            }
        }
        return null;
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("\n--- Library Books ---");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}

