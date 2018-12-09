import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Form{
	JFrame f;
	int x=300;

	public Form(){
		prepareGUI();
	}

	public static void main(String args[]){
		Form a = new Form();
		/*try{
			DriverManager.getConnection("jdbc:mysql://192.168.1.2:3306/dummy",
				"dummy",
				"dummy");
			Statement stmt = conn.createStatement();
			String sql = "select * grom dummy.gd_regions limit 10";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(sql);

			while(rs.next()){
				System.out.println(rs.getString("region"));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}*/
	}

	public void prepareGUI(){	

		f = new JFrame();

		JLabel l1 = new JLabel("Form Name:");
		l1.setBounds(10,50,150,50);
		f.add(l1);

		JTextField t1=new JTextField();	
		t1.setBounds(150,50,300,50);
		f.add(t1);

		JLabel l2 = new JLabel("Form Description:");
		l2.setBounds(10,100,150,50);
		f.add(l2);

		JTextField t2=new JTextField();	
		t2.setBounds(150,100,300,50);
		f.add(t2);

		JButton b = new JButton("Add Short Question");
		b.setBounds(10,180,100,30);//x axis, y axis, width, height  
		f.add(b);
		b.addActionListener(new shortQ());

		JButton b2=new JButton("Add Long Question");
		b2.setBounds(10,210,100,30);//x axis, y axis, width, height  
		f.add(b2);
		b2.addActionListener(new LongQ());

		JButton b3=new JButton("Add MCQ Question");
		b3.setBounds(10,240,100,30);//x axis, y axis, width, height  
		f.add(b3);
		b3.addActionListener(new MCQ());

		JButton b4=new JButton("Add Checkbox Question");
		b4.setBounds(10,270,100,30);//x axis, y axis, width, height  
		f.add(b4);
		b4.addActionListener(new Checkbox());

		JButton b5 = new JButton("Submit");
		b5.setBounds(900,500,100,30);
		f.add(b5);

		f.setSize(640,480); 
		f.setLayout(null); 
		f.setVisible(true); 

	}

	class shortQ implements ActionListener{
		public void actionPerformed(ActionEvent e){

			JLabel l1 = new JLabel("Short Question: ");
			l1.setBounds(10,x,100,30);
			f.add(l1);

			JTextField t1 = new JTextField();
			t1.setBounds(150,x,100,30);
			f.add(t1);

			x+=60;

			f.validate();
			f.repaint();
			//System.out.println(x);
		}
	}

	class LongQ implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JLabel l1 = new JLabel("Long Question: ");
			l1.setBounds(10,x,100,30);
			f.add(l1);

			JTextField t1 = new JTextField();
			t1.setBounds(150,x,100,30);
			f.add(t1);

			x+=60;

			f.validate();
			f.repaint();
			//System.out.println(x);
		}
	}

	class MCQ implements ActionListener{
		public void actionPerformed(ActionEvent e){
			x += 30;
			JLabel l1 = new JLabel("MCQ Question: ");
			l1.setBounds(10,x,100,30);
			f.add(l1);

			JTextField t1 = new JTextField();
			t1.setBounds(150,x,100,30);
			f.add(t1);

			JButton b = new JButton("Add option");
			b.setBounds(50,60+x,100,30);
			f.add(b);
			b.addActionListener(new addOption());

			x+=120;

			f.validate();
			f.repaint();
			//System.out.println(x);
		}
	}

	class Checkbox implements ActionListener{
		public void actionPerformed(ActionEvent e){
			x += 30;
			JLabel l1 = new JLabel("Checkbox Question: ");
			l1.setBounds(10,x,100,30);
			f.add(l1);

			JTextField t1 = new JTextField();
			t1.setBounds(150,x,100,30);
			f.add(t1);

			JButton b = new JButton("Add option");
			b.setBounds(50,60+x,100,30);
			f.add(b);
			b.addActionListener(new addOption());

			x+=120;

			f.validate();
			f.repaint();
			//System.out.println(x);
		}
	}

	class addOption implements ActionListener{
		public void actionPerformed(ActionEvent e){

			JLabel l1 = new JLabel("Add Option: ");
			l1.setBounds(50,x,100,30);
			f.add(l1);

			JTextField t2 = new JTextField("Option");
			t2.setBounds(150,x,100,30);
			f.add(t2);

			x+=30;

			f.validate();
			f.repaint();
		}
	}
}