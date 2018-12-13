import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ViewProcess extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnRefresh;
	private JButton btnBack;
	private JLabel lblViewProcesses;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewProcess frame = new ViewProcess();
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
	public ViewProcess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 83, 764, 276);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.setBounds(120, 386, 146, 38);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRefresh.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(btnRefresh);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(544, 386, 146, 38);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(btnBack);
		
		lblViewProcesses = new JLabel("View Processes");
		lblViewProcesses.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewProcesses.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblViewProcesses.setBounds(10, 21, 764, 41);
		contentPane.add(lblViewProcesses);
	}

}
