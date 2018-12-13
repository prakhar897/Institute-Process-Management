import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.*;

import java.awt.event.*;

public class Option extends JFrame{

	private JPanel contentPane;

	public Option(String a,String b) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Home");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		label.setBounds(10, 11, 414, 41);
		contentPane.add(label);
		
		String welcome = "welcome " + a;
		JLabel label_1 = new JLabel(welcome);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_1.setBounds(344, 52, 150, 14);
		contentPane.add(label_1);
		
		JButton btnCreateProcess = new JButton("Create Process");
		btnCreateProcess.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCreateProcess.setBounds(63, 77, 310, 47);
		contentPane.add(btnCreateProcess);
		btnCreateProcess.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(true);
				createprocess a = new createprocess();
				a.setVisible();
			}
		});
		
		JButton btnViewProcesses = new JButton("View Processes");
		btnViewProcesses.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnViewProcesses.setBounds(63, 212, 310, 47);
		contentPane.add(btnViewProcesses);
		btnViewProcesses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(true);
				ViewOfProcess y = new ViewOfProcess(a);
				y.setVisible(true);
			}
		});
		
		JButton btnCreatedProcesses = new JButton("My Processes");
		btnCreatedProcesses.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCreatedProcesses.setBounds(63, 283, 310, 47);
		contentPane.add(btnCreatedProcesses);
		btnCreatedProcesses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(true);
				myprocesses b = new myprocesses(a);
				b.setVisible(true);
			}
		});
		
		JButton btnReviewProcesses = new JButton("Review Processes");
		btnReviewProcesses.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnReviewProcesses.setBounds(63, 145, 310, 47);
		contentPane.add(btnReviewProcesses);
		
	}
	
	/*public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand().toString();
		if(str.equals("Create Process"))
		{
			contentPane.setVisible(false);
			createprocess a = new createprocess();
			a.setVisible(true);
		}
	}*/

}
