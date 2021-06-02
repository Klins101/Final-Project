import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TeachHome extends JFrame {

	private JPanel contentPane;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeachHome frame = new TeachHome();
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
	private JTextField textField;
	private JTextField textField_40;
	private JTable table;
	public TeachHome() {
		connection = SqliteDStudent.dbConnection();
		//connection1 = SqliteDAdmin.dbConnection();
		//connection2 = SqliteDTeacher.dbConnection();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("New");
		mnNewMenu.add(mnNewMenu_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 39, 1330, 657);
		contentPane.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Create Student Account", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblCreateAnAccount_1 = new JLabel("Create an account for a Teacher Here!");
		lblCreateAnAccount_1.setFont(new Font("Vodafone Rg", Font.BOLD, 16));
		lblCreateAnAccount_1.setBounds(330, -3099, 301, 40);
		panel_2.add(lblCreateAnAccount_1);
		
		JLabel lblNewLabel_1_2_4_1 = new JLabel("First Name");
		lblNewLabel_1_2_4_1.setFont(new Font("Vodafone Lt", Font.BOLD, 13));
		lblNewLabel_1_2_4_1.setBounds(328, -3020, 109, 23);
		panel_2.add(lblNewLabel_1_2_4_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(328, -2971, 221, 20);
		panel_2.add(textField_6);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Last Name");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Vodafone Lt", Font.BOLD, 13));
		lblNewLabel_1_2_1_1_1.setBounds(328, -2916, 109, 23);
		panel_2.add(lblNewLabel_1_2_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(328, -2867, 221, 20);
		panel_2.add(textField_7);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Username");
		lblNewLabel_1_2_2_1_1.setFont(new Font("Vodafone Lt", Font.BOLD, 13));
		lblNewLabel_1_2_2_1_1.setBounds(328, -2815, 109, 23);
		panel_2.add(lblNewLabel_1_2_2_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(328, -2766, 221, 20);
		panel_2.add(textField_8);
		
		JLabel lblNewLabel_1_2_3_1_1 = new JLabel("Password");
		lblNewLabel_1_2_3_1_1.setFont(new Font("Vodafone Lt", Font.BOLD, 13));
		lblNewLabel_1_2_3_1_1.setBounds(328, -2709, 109, 23);
		panel_2.add(lblNewLabel_1_2_3_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(328, -2660, 221, 20);
		panel_2.add(textField_9);
		
		JButton btnCreateAccount_1_1 = new JButton("Create Account");
		btnCreateAccount_1_1.setForeground(Color.WHITE);
		btnCreateAccount_1_1.setFont(new Font("Verdana", Font.BOLD, 14));
		btnCreateAccount_1_1.setBackground(Color.CYAN);
		btnCreateAccount_1_1.setBounds(328, -2588, 221, 23);
		panel_2.add(btnCreateAccount_1_1);
		
		JLabel lblCreateAnAccount_2 = new JLabel("Create an account for a Student Here!");
		lblCreateAnAccount_2.setFont(new Font("Vodafone Rg", Font.BOLD, 16));
		lblCreateAnAccount_2.setBounds(260, 11, 301, 40);
		panel_2.add(lblCreateAnAccount_2);
		
		JLabel lblNewLabel_1_2_4_2 = new JLabel("Full Name");
		lblNewLabel_1_2_4_2.setFont(new Font("Vodafone Lt", Font.BOLD, 13));
		lblNewLabel_1_2_4_2.setBounds(260, 101, 109, 23);
		panel_2.add(lblNewLabel_1_2_4_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(260, 150, 221, 20);
		panel_2.add(textField_10);
		
		JLabel lblNewLabel_1_2_1_1_2 = new JLabel("Student Number");
		lblNewLabel_1_2_1_1_2.setFont(new Font("Vodafone Lt", Font.BOLD, 13));
		lblNewLabel_1_2_1_1_2.setBounds(260, 205, 109, 23);
		panel_2.add(lblNewLabel_1_2_1_1_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(260, 254, 221, 20);
		panel_2.add(textField_11);
		
		JLabel lblNewLabel_1_2_2_1_2 = new JLabel("Username");
		lblNewLabel_1_2_2_1_2.setFont(new Font("Vodafone Lt", Font.BOLD, 13));
		lblNewLabel_1_2_2_1_2.setBounds(260, 306, 109, 23);
		panel_2.add(lblNewLabel_1_2_2_1_2);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(260, 355, 221, 20);
		panel_2.add(textField_12);
		
		JLabel lblNewLabel_1_2_3_1_2 = new JLabel("Password");
		lblNewLabel_1_2_3_1_2.setFont(new Font("Vodafone Lt", Font.BOLD, 13));
		lblNewLabel_1_2_3_1_2.setBounds(260, 412, 109, 23);
		panel_2.add(lblNewLabel_1_2_3_1_2);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(260, 461, 221, 20);
		panel_2.add(textField_13);
		
		JButton btnCreateAccount_1_2 = new JButton("Create Account");
		btnCreateAccount_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query1 = " CREATE TABLE '"+ textField_10.getText() +"' (\r\n"
							+ "	\"Full Name\"	TEXT,\r\n"
							+ "	\"\"	TEXT,\r\n"
							+ "	\"Username\"	TEXT,\r\n"
							+ "	\"Password\"	TEXT\r\n"
							+ "); ";
					
					PreparedStatement pst1 = connection.prepareStatement(query1);
					pst1.execute();	
					pst1.close();
					String query2 = " INSERT INTO '"+ textField_10.getText() +"' \r\n"
							+ "(\"Full Name\", \"Student Number\", \"Username\", \"Password\")\r\n"
							+ "VALUES (?, ?, ?, ?); ";
					PreparedStatement pst2 = connection.prepareStatement(query2);
					pst2.setString(1, textField_10.getText());
					pst2.setString(2, textField_11.getText());
					pst2.setString(3, textField_12.getText());
					pst2.setString(4, textField_13.getText());
					pst2.execute();	
					JOptionPane.showMessageDialog(null, "Student Account Created");
					pst2.close();
					
					
					
					
				}
				catch(Exception e0) {
					e0.printStackTrace();
					
				}
				try {
					connection.close();
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		btnCreateAccount_1_2.setForeground(Color.WHITE);
		btnCreateAccount_1_2.setFont(new Font("Verdana", Font.BOLD, 14));
		btnCreateAccount_1_2.setBackground(Color.CYAN);
		btnCreateAccount_1_2.setBounds(260, 533, 221, 23);
		panel_2.add(btnCreateAccount_1_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Input Student Results", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Course Code");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_2.setBounds(72, 57, 110, 14);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Marks");
		lblNewLabel_2_1.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(781, 57, 110, 14);
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Grade");
		lblNewLabel_2_1_1.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(1120, 57, 110, 14);
		panel_3.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Course Name");
		lblNewLabel_2_2.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(408, 57, 110, 14);
		panel_3.add(lblNewLabel_2_2);
		
		textField_14 = new JTextField();
		textField_14.setBounds(72, 95, 205, 20);
		panel_3.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(72, 141, 205, 20);
		panel_3.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(72, 195, 205, 20);
		panel_3.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(72, 257, 205, 20);
		panel_3.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(72, 327, 205, 20);
		panel_3.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(72, 391, 205, 20);
		panel_3.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(72, 451, 205, 20);
		panel_3.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(72, 516, 205, 20);
		panel_3.add(textField_21);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(353, 57, 2, 490);
		panel_3.add(separator_1);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(380, 95, 205, 20);
		panel_3.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(380, 141, 205, 20);
		panel_3.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(380, 195, 205, 20);
		panel_3.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(380, 257, 205, 20);
		panel_3.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(380, 327, 205, 20);
		panel_3.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(380, 391, 205, 20);
		panel_3.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(380, 451, 205, 20);
		panel_3.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(380, 516, 205, 20);
		panel_3.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(755, 95, 205, 20);
		panel_3.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(755, 141, 205, 20);
		panel_3.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(755, 195, 205, 20);
		panel_3.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(755, 257, 205, 20);
		panel_3.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(755, 327, 205, 20);
		panel_3.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(755, 391, 205, 20);
		panel_3.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(755, 451, 205, 20);
		panel_3.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(755, 516, 205, 20);
		panel_3.add(textField_37);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1.setBounds(673, 57, 2, 490);
		panel_3.add(separator_1_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1_1.setBounds(1043, 57, 2, 490);
		panel_3.add(separator_1_1_1);
		
		JList list = new JList();
		list.setBounds(1109, -1592, 1, 1);
		panel_3.add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a grade", "A", "B+", "B", "C+", "C", "D+", "D", "E", "F"}));
		comboBox.setBounds(1109, 93, 121, 24);
		panel_3.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select a grade", "A", "B+", "B", "C+", "C", "D+", "D", "E", "F"}));
		comboBox_1.setBounds(1109, 139, 121, 24);
		panel_3.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select a grade", "A", "B+", "B", "C+", "C", "D+", "D", "E", "F"}));
		comboBox_1_1.setBounds(1109, 193, 121, 24);
		panel_3.add(comboBox_1_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select a grade", "A", "B+", "B", "C+", "C", "D+", "D", "E", "F"}));
		comboBox_1_1_1.setBounds(1109, 255, 121, 24);
		panel_3.add(comboBox_1_1_1);
		
		JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select a grade", "A", "B+", "B", "C+", "C", "D+", "D", "E", "F"}));
		comboBox_1_1_1_1.setBounds(1109, 325, 121, 24);
		panel_3.add(comboBox_1_1_1_1);
		
		JComboBox comboBox_1_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select a grade", "A", "B+", "B", "C+", "C", "D+", "D", "E", "F"}));
		comboBox_1_1_1_1_1.setBounds(1109, 389, 121, 24);
		panel_3.add(comboBox_1_1_1_1_1);
		
		JComboBox comboBox_1_1_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select a grade", "A", "B+", "B", "C+", "C", "D+", "D", "E", "F"}));
		comboBox_1_1_1_1_1_1.setBounds(1109, 449, 121, 24);
		panel_3.add(comboBox_1_1_1_1_1_1);
		
		JComboBox comboBox_1_1_1_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select a grade ", "A", "B+", "B", "C+", "C", "D+", "D", "E", "F"}));
		comboBox_1_1_1_1_1_1_1.setBounds(1109, 514, 121, 24);
		panel_3.add(comboBox_1_1_1_1_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Save Resuts");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query1 = " CREATE TABLE '"+ textField.getText() + textField_40.getText()+"' (\r\n"
							+ "	\"Course Code\"	TEXT,\r\n"
							+ "	\"Course Name\"	TEXT,\r\n"
							+ "	\"Marks\"	TEXT,\r\n"
							+ "	\"Grade\"	TEXT\r\n"
							+ "); ";
					
					PreparedStatement pst1 = connection.prepareStatement(query1);
					pst1.execute();	
					pst1.close();
					String query2 = " INSERT INTO '"+ textField.getText() + textField_40.getText() +"' \r\n"
							+ "(\"Course Code\", \"Course Name\", \"Marks\", \"Grade\")\r\n"
							+ "VALUES (?, ?, ?, ?) " ;
					PreparedStatement pst2 = connection.prepareStatement(query2);
					pst2.setString(1, textField_14.getText());
					pst2.setString(2, textField_22.getText());
					pst2.setString(3, textField_30.getText());
					pst2.setString(4, comboBox.getSelectedItem().toString());
					pst2.execute();	
					//JOptionPane.showMessageDialog(null, "Student Results Stored");
					pst2.close();
					
					String query3 = " INSERT INTO '"+ textField.getText() + textField_40.getText() +"' \r\n"
							+ "(\"Course Code\", \"Course Name\", \"Marks\", \"Grade\")\r\n"
							+ "VALUES (?, ?, ?, ?) " ;
					PreparedStatement pst3 = connection.prepareStatement(query3);
					pst3.setString(1, textField_15.getText());
					pst3.setString(2, textField_23.getText());
					pst3.setString(3, textField_31.getText());
					pst3.setString(4, comboBox_1.getSelectedItem().toString());
					pst3.execute();	
					//JOptionPane.showMessageDialog(null, "Student Results Stored");
					pst3.close();
					
					String query4 = " INSERT INTO '"+ textField.getText() + textField_40.getText() +"' \r\n"
							+ "(\"Course Code\", \"Course Name\", \"Marks\", \"Grade\")\r\n"
							+ "VALUES (?, ?, ?, ?) " ;
					PreparedStatement pst4 = connection.prepareStatement(query4);
					pst4.setString(1, textField_16.getText());
					pst4.setString(2, textField_24.getText());
					pst4.setString(3, textField_32.getText());
					pst4.setString(4, comboBox_1_1.getSelectedItem().toString());
					pst4.execute();	
					//JOptionPane.showMessageDialog(null, "Student Results Stored");
					pst4.close();
					
					String query5 = " INSERT INTO '"+ textField.getText() + textField_40.getText() +"' \r\n"
							+ "(\"Course Code\", \"Course Name\", \"Marks\", \"Grade\")\r\n"
							+ "VALUES (?, ?, ?, ?) " ;
					PreparedStatement pst5 = connection.prepareStatement(query5);
					pst5.setString(1, textField_17.getText());
					pst5.setString(2, textField_25.getText());
					pst5.setString(3, textField_33.getText());
					pst5.setString(4, comboBox_1_1_1.getSelectedItem().toString());
					pst5.execute();	
					//JOptionPane.showMessageDialog(null, "Student Results Stored");
					pst5.close();
					
					String query6 = " INSERT INTO '"+ textField.getText() + textField_40.getText() +"' \r\n"
							+ "(\"Course Code\", \"Course Name\", \"Marks\", \"Grade\")\r\n"
							+ "VALUES (?, ?, ?, ?) " ;
					PreparedStatement pst6 = connection.prepareStatement(query6);
					pst6.setString(1, textField_18.getText());
					pst6.setString(2, textField_26.getText());
					pst6.setString(3, textField_34.getText());
					pst6.setString(4, comboBox_1_1_1_1.getSelectedItem().toString());
					pst6.execute();	
					//JOptionPane.showMessageDialog(null, "Student Results Stored");
					pst6.close();
					
					String query7 = " INSERT INTO '"+ textField.getText() + textField_40.getText() +"' \r\n"
							+ "(\"Course Code\", \"Course Name\", \"Marks\", \"Grade\")\r\n"
							+ "VALUES (?, ?, ?, ?) " ;
					PreparedStatement pst7 = connection.prepareStatement(query7);
					pst7.setString(1, textField_19.getText());
					pst7.setString(2, textField_27.getText());
					pst7.setString(3, textField_35.getText());
					pst7.setString(4, comboBox_1_1_1_1_1.getSelectedItem().toString());
					pst7.execute();	
					//JOptionPane.showMessageDialog(null, "Student Results Stored");
					pst7.close();
					
					String query8 = " INSERT INTO '"+ textField.getText() + textField_40.getText() +"' \r\n"
							+ "(\"Course Code\", \"Course Name\", \"Marks\", \"Grade\")\r\n"
							+ "VALUES (?, ?, ?, ?) " ;
					PreparedStatement pst8 = connection.prepareStatement(query8);
					pst8.setString(1, textField_20.getText());
					pst8.setString(2, textField_28.getText());
					pst8.setString(3, textField_36.getText());
					pst8.setString(4, comboBox_1_1_1_1_1_1.getSelectedItem().toString());
					pst8.execute();	
					//JOptionPane.showMessageDialog(null, "Student Results Stored");
					pst8.close();
					
					String query9 = " INSERT INTO '"+ textField.getText() + textField_40.getText() +"' \r\n"
							+ "(\"Course Code\", \"Course Name\", \"Marks\", \"Grade\")\r\n"
							+ "VALUES (?, ?, ?, ?) " ;
					PreparedStatement pst9 = connection.prepareStatement(query9);
					pst9.setString(1, textField_21.getText());
					pst9.setString(2, textField_29.getText());
					pst9.setString(3, textField_37.getText());
					pst9.setString(4, comboBox_1_1_1_1_1_1_1.getSelectedItem().toString());
					pst9.execute();	
					JOptionPane.showMessageDialog(null, "Student Results Stored");
					pst9.close();
					
					
					
					
				}
				catch(Exception e0) {
					e0.printStackTrace();
					
				}
				try {
					connection.close();
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton_1.setForeground(UIManager.getColor("CheckBoxMenuItem.selectionForeground"));
		btnNewButton_1.setBackground(UIManager.getColor("ComboBox.selectionBackground"));
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnNewButton_1.setBounds(620, 571, 136, 23);
		panel_3.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Student Name");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel.setBounds(61, 11, 110, 14);
		panel_3.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(191, 9, 214, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblStudentNumber = new JLabel("Student Number");
		lblStudentNumber.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblStudentNumber.setBounds(461, 7, 110, 14);
		panel_3.add(lblStudentNumber);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(591, 5, 214, 20);
		panel_3.add(textField_40);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Check Student Results", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Student Number");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_3.setBounds(27, 23, 172, 14);
		panel_4.add(lblNewLabel_3);
		
		textField_38 = new JTextField();
		textField_38.setBounds(240, 21, 227, 20);
		panel_4.add(textField_38);
		textField_38.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Enter Student Full Name");
		lblNewLabel_3_1.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(27, 72, 172, 14);
		panel_4.add(lblNewLabel_3_1);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(240, 70, 227, 20);
		panel_4.add(textField_39);
		
		JButton btnNewButton = new JButton("View Results");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String queri = "select * from '"+ textField_38.getText() + textField_39.getText() +"' ";
					PreparedStatement pst = connection.prepareStatement(queri);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}
				catch(Exception e0) {
					e0.printStackTrace();
					
				}
				
				

			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		btnNewButton.setBounds(27, 97, 138, 23);
		panel_4.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 213, 1273, 384);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Marks", "Course Name", "Grade", "Course Code"
			}
		));
		scrollPane.setColumnHeaderView(table);
	}
}
