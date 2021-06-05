import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.sql.*;

public class HomePage {

	private JFrame frmExaminationResultsSystem;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frmExaminationResultsSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	Connection connection = null;
	Connection connection1 = null;
	Connection connection2 = null;
	public HomePage() {
		initialize();
		connection = SqliteDTeacher.dbConnection();
		connection1 = SqliteDStudent.dbConnection();
		connection2 = SqliteDAdmin.dbConnection();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExaminationResultsSystem = new JFrame();
		frmExaminationResultsSystem.getContentPane().setBackground(Color.WHITE);
		frmExaminationResultsSystem.setTitle("Examination Results System");
		frmExaminationResultsSystem.setBounds(0, 0, 800, 600);
		frmExaminationResultsSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExaminationResultsSystem.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to the Examination Results System");
		lblNewLabel_2.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 17));
		lblNewLabel_2.setBounds(227, 11, 357, 71);
		frmExaminationResultsSystem.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Login For More Details!");
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_3.setBounds(311, 81, 160, 29);
		frmExaminationResultsSystem.getContentPane().add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 207, 166);
		frmExaminationResultsSystem.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("/images/home.png")));
		panel.add(lblNewLabel);
		
		JButton btnStudent = new JButton("Student Login");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "select * from '"+ textField.getText() +"' where password=?";
					PreparedStatement pst = connection1.prepareStatement(query);
					//pst.setString(1, textField.getText());
					pst.setString(1, textField_1.getText());
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while(rs.next()) {
						count++;
					}
					if(count == 1) {
						//JOptionPane.showMessageDialog(null, "Username and Password Correct");
						frmExaminationResultsSystem.dispose();
						StudentHome stu = new StudentHome();
						stu.setVisible(true);
						
					}
					else if(count > 1) {
						JOptionPane.showMessageDialog(null, "Duplicate Username and Password Correct");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Wrong Username or Password Correct");
						
					}
					rs.close();
					pst.close();
					
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				
				
			}
		});
		btnStudent.setIcon(new ImageIcon(HomePage.class.getResource("/images/stu.png")));
		btnStudent.setForeground(Color.BLACK);
		btnStudent.setFont(new Font("Vodafone Rg", Font.BOLD, 12));
		btnStudent.setBackground(Color.WHITE);
		btnStudent.setBounds(272, 442, 144, 23);
		frmExaminationResultsSystem.getContentPane().add(btnStudent);
		
		JButton btnTeacher = new JButton("Teacher Login");
		btnTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "select * from '"+ textField_2.getText() +"' where username=? and password=?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textField_2.getText());
					pst.setString(2, textField_3.getText());
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while(rs.next()) {
						count++;
					}
					if(count == 1) {
						//JOptionPane.showMessageDialog(null, "Username and Password Correct");
						frmExaminationResultsSystem.dispose();
						TeachHome tee = new TeachHome();
						tee.setVisible(true);
						
					}
					else if(count > 1) {
						JOptionPane.showMessageDialog(null, "Duplicate Username and Password Correct");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Wrong Username or Password Correct");
						
					}
					rs.close();
					pst.close();
					
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, e);
				}
				
			}
		});
		btnTeacher.setIcon(new ImageIcon(HomePage.class.getResource("/images/teach.png")));
		btnTeacher.setForeground(Color.BLACK);
		btnTeacher.setFont(new Font("Vodafone Rg", Font.BOLD, 12));
		btnTeacher.setBackground(Color.WHITE);
		btnTeacher.setBounds(554, 442, 144, 23);
		frmExaminationResultsSystem.getContentPane().add(btnTeacher);
		
		JButton btnAdmin = new JButton("Admin Login");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "select * from AddAdmin where username=? and password=?";
					PreparedStatement pst = connection2.prepareStatement(query);
					pst.setString(1, textField_4.getText());
					pst.setString(2, textField_5.getText());
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while(rs.next()) {
						count++;
					}
					if(count == 1) {
						//JOptionPane.showMessageDialog(null, "Username and Password Correct");
						frmExaminationResultsSystem.dispose();
						Admin admin = new Admin();
						admin.setVisible(true);
						
					}
					else if(count > 1) {
						JOptionPane.showMessageDialog(null, "Duplicate Username and Password Correct");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Wrong Username or Password Correct");
						
					}
					rs.close();
					pst.close();
					
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, e);
				}
				
				
			}
		});
		btnAdmin.setIcon(new ImageIcon(HomePage.class.getResource("/images/admin.png")));
		btnAdmin.setForeground(Color.BLACK);
		btnAdmin.setFont(new Font("Vodafone Rg", Font.BOLD, 12));
		btnAdmin.setBackground(Color.WHITE);
		btnAdmin.setBounds(10, 442, 144, 23);
		frmExaminationResultsSystem.getContentPane().add(btnAdmin);
		
		JLabel lblNewLabel_4 = new JLabel("Full Name");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblNewLabel_4.setBounds(272, 259, 144, 14);
		frmExaminationResultsSystem.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(272, 289, 199, 20);
		frmExaminationResultsSystem.getContentPane().add(textField);
		
		JLabel lblNewLabel_4_1 = new JLabel("Password");
		lblNewLabel_4_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblNewLabel_4_1.setBounds(272, 336, 144, 14);
		frmExaminationResultsSystem.getContentPane().add(lblNewLabel_4_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(272, 371, 199, 20);
		frmExaminationResultsSystem.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Username");
		lblNewLabel_4_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblNewLabel_4_2.setBounds(554, 259, 144, 14);
		frmExaminationResultsSystem.getContentPane().add(lblNewLabel_4_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(554, 289, 199, 20);
		frmExaminationResultsSystem.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Password");
		lblNewLabel_4_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblNewLabel_4_1_1.setBounds(554, 336, 144, 14);
		frmExaminationResultsSystem.getContentPane().add(lblNewLabel_4_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(554, 371, 199, 20);
		frmExaminationResultsSystem.getContentPane().add(textField_3);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(509, 226, 1, 252);
		frmExaminationResultsSystem.getContentPane().add(separator);
		
		JLabel lblNewLabel_4_3 = new JLabel("Username");
		lblNewLabel_4_3.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblNewLabel_4_3.setBounds(10, 259, 144, 14);
		frmExaminationResultsSystem.getContentPane().add(lblNewLabel_4_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 289, 199, 20);
		frmExaminationResultsSystem.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Password");
		lblNewLabel_4_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblNewLabel_4_1_2.setBounds(10, 336, 144, 14);
		frmExaminationResultsSystem.getContentPane().add(lblNewLabel_4_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 371, 199, 20);
		frmExaminationResultsSystem.getContentPane().add(textField_5);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(237, 227, 1, 260);
		frmExaminationResultsSystem.getContentPane().add(separator_1);
	}
}
