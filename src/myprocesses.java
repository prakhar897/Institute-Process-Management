import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.util.*;

public class myprocesses extends JFrame {

	private JPanel contentPane;
	int x=100;
	Vector<String> v;

	public myprocesses(String a) {
		v = new Vector<>();
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMyProcesses = new JLabel("My Processes");
		lblMyProcesses.setBounds(10, 21, 764, 36);
		lblMyProcesses.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyProcesses.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		contentPane.add(lblMyProcesses);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginschema", "root", "prakharprakhar");
			Statement stmt = con.createStatement();
			String sql = "Select * from processlist where Createdby='"+a+"'";
			ResultSet rs = stmt.executeQuery(sql);
			int rowcount = 0;
			
			while(rs.next())
			{
				v.add(rs.getString(2));
			    System.out.println(rs.getString(2));
			}
			
			JButton arr[] = new JButton[v.size()];
			for(int i=0;i<v.size();i++)
			{
				arr[i] = new JButton(v.get(i));
				arr[i].setBounds(200,x,500,50);
				contentPane.add(arr[i]);
				x+=100;
				arr[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println(e.getActionCommand());
						
					}
				});
			}
				
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 83, 764, 276);
		contentPane.add(scrollPane);
		
		JButton button = new JButton("Refresh");
		button.setFont(new Font("Times New Roman", Font.BOLD, 24));
		button.setBounds(120, 386, 146, 38);
		contentPane.add(button);
		
	}
}
