import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library(100);

        while (true) {
            System.out.println("\n----- Library Menu -----");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    Book b = new Book(id, title, author, true);
                    library.addBook(b);
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeID = sc.nextInt();
                    library.removeBook(removeID);
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchID = sc.nextInt();
                    Book result = library.searchBook(searchID);
                    if (result != null)
                        System.out.println(result);
                    else
                        System.out.println("Book not found!");
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}



