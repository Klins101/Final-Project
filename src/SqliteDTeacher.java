import java.sql.*;
import javax.swing.*;
public class SqliteDTeacher {
	Connection conn = null;
	public static Connection dbConnection() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:TeacherLogin.db");
			//JOptionPane.showMessageDialog(null, " Connection Successful");
			return conn;
			
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, " Wrong...");
			return null;
		}
	}

}
