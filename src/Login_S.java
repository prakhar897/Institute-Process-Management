import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_S {

	private JFrame frame;
	private JTextField user;
	private JPasswordField pass;
	private String typeField=null;
	
	public String getTypeField()
	{
		return this.typeField;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200,200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login System");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(164, 11, 157, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsername.setBounds(70, 80, 102, 20);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(70, 139, 102, 14);
		frame.getContentPane().add(lblPassword);
		
		user = new JTextField();
		user.setBounds(229, 82, 199, 20);
		frame.getContentPane().add(user);
		user.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(229, 133, 199, 20);
		frame.getContentPane().add(pass);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginschema", "root", "prakharprakhar");
					Statement stmt = con.createStatement();
					String psswrd = pass.getText().toString();
					StringBuilder sb = new StringBuilder(psswrd);
					@SuppressWarnings("deprecation")
					String sql = "Select * from tblogin where UserName='"+user.getText()+"' and Password='"+sb.reverse().toString()+"'";
					ResultSet rs = stmt.executeQuery(sql);
					
					boolean credential = false;
					if(rs.next())
					{	
						JOptionPane.showMessageDialog(null,"Login Sucessfully...");
						credential = true;
						frame.setVisible(false);
						//String sl = "SELECT type FROM tblogin WHERE UserName='"+user.getText()+"';"; 
						//typeField = stmt.executeQuery(sl).getString(1);
						Option a = new Option(user.getText(),typeField);
						a.setVisible(true);
						
					}	
					else
						JOptionPane.showMessageDialog(null,"Incorrect username and Password....");
					con.close();
				} catch(Exception e) {
					System.out.print(e);
				}
			}
		});
		btnLogin.setBounds(178, 214, 89, 23);
		frame.getContentPane().add(btnLogin);
	}
}
