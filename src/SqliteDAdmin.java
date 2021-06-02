import java.sql.*;
import javax.swing.*;
public class SqliteDAdmin {
	Connection conn = null;
	public static Connection dbConnection() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Klins\\Desktop\\JPL 2 Workspace\\Final Project\\src\\DataBases\\AdminLogin.db");
			//JOptionPane.showMessageDialog(null, " Connection Successful");
			return connection;
			
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}

}
