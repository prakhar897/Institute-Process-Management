import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class Reviewprocess extends JFrame {

	private JPanel contentPane;

	public Reviewprocess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReviewProcess = new JLabel("Review Process");
		lblReviewProcess.setHorizontalAlignment(SwingConstants.CENTER);
		lblReviewProcess.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblReviewProcess.setBounds(10, 21, 764, 36);
		contentPane.add(lblReviewProcess);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 83, 764, 276);
		contentPane.add(scrollPane);
		
		JButton button = new JButton("Refresh");
		button.setFont(new Font("Times New Roman", Font.BOLD, 24));
		button.setBounds(120, 386, 146, 38);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Back");
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		button_1.setBounds(544, 386, 146, 38);
		contentPane.add(button_1);
	}

}
