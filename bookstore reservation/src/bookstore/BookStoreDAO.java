package bookstore;
import java.sql.*;

public class BookStoreDAO {
    private Connection connection;

    public BookStoreDAO(String URL, String UserName, String PassWord) throws SQLException {
        connection = DriverManager.getConnection(URL, UserName, PassWord);
    }

    public void addBook(Book book) throws SQLException {
        String sql = "INSERT INTO books (title, author, price, quantity) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, book.getTitle());
        statement.setString(2, book.getAuthor());
        statement.setDouble(3, book.getPrice());
        statement.setInt(4, book.getQuantity());
        statement.executeUpdate();
    }

    
}
