package bookstore;
import java.sql.SQLException;
import java.util.Scanner;

public class BookStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            BookStoreDAO dao = new BookStoreDAO("jdbc:mysql://localhost:3306/BookStore", "userName", "passWord");

            System.out.println("Book Store Registration System");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter title: ");
                String title = scanner.nextLine();
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();

                Book book = new Book(title, author, price, quantity);
                dao.addBook(book);
                System.out.println("Book added successfully!");
            }

            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
