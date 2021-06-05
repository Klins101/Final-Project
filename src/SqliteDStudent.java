import java.sql.*;
import javax.swing.*;
public class SqliteDStudent {
	Connection connection = null;
	public static Connection dbConnection() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:Student.db");
			//JOptionPane.showMessageDialog(null, " Connection Successful");
			return conn;
			
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, " Wrong...");
			return null;
		}
	}

}
