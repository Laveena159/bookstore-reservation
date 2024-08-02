package bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class Dbconnection {
		private static final String  URL ="jdbc:mysql://localhost:3306/BookStore";
		private static final String UserName = "root";
		private static final String PassWord = "root";

		public static Connection getConnection() throws SQLException {
			return DriverManager.getConnection(URL, UserName, PassWord);
		}

	}

