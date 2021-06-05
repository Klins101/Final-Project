import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;


public class StudentHome extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentHome frame = new StudentHome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Connection connection = null;
	private JTable table;
	public StudentHome() {
		connection = SqliteDStudent.dbConnection();
		setTitle("Student Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1360, 760);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Full Name");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 26, 203, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(245, 24, 256, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblConfirmFullName = new JLabel("Enter Student Number ");
		lblConfirmFullName.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblConfirmFullName.setBounds(10, 53, 203, 14);
		getContentPane().add(lblConfirmFullName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(245, 51, 256, 20);
		getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("View Results");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String queri = "select * from '"+ textField.getText() + textField_1.getText() +"' ";
					PreparedStatement pst = connection.prepareStatement(queri);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}
				catch(Exception e0) {
					JOptionPane.showMessageDialog(null, "Results not entered by teacher");
					
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(189, 78, 140, 23);
		getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 139, 1324, 571);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1304, 549);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
	}
}
