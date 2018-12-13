import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ViewOfProcess extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JList list;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String z = null;
					ViewOfProcess frame = new ViewOfProcess(z);
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
	public ViewOfProcess(String b) {
		
		setBounds(100, 100, 442, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProcesses = new JLabel("Processes");
		lblProcesses.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProcesses.setBounds(10, 11, 97, 14);
		contentPane.add(lblProcesses);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 414, 207);
		contentPane.add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnShowprocesses = new JButton("ShowProcesses");
		btnShowprocesses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					DefaultListModel dm = new DefaultListModel();
					String sr;
					if((int)b.charAt(0)>=48 && (int)b.charAt(0)<58)	sr="student";
					else	sr="Faculty";
					String sql = "select ProcessName from processlist where CreatedFor='"+sr+"';";
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginschema", "root", "prakharprakhar");
					Statement s = con.prepareStatement(sql);
		            ResultSet rs = s.executeQuery(sql);
		            while (rs.next()) {
		                String name = rs.getString(1);
		                dm.addElement(name);
		            }
		            list.setModel(dm);
				} catch(Exception exc) {
					System.out.println(b);
					System.out.print(exc);
				}
			}
		});
		btnShowprocesses.setBounds(290, 10, 130, 23);
		contentPane.add(btnShowprocesses);
		
		JButton btnGetselecteditem = new JButton("GetSelectedItem");
		btnGetselecteditem.setBounds(10, 261, 161, 23);
		contentPane.add(btnGetselecteditem);
		
	}
}
