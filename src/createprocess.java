import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class createprocess implements ActionListener{

	private String str="";
	JFrame f;
	int x=300;
	JTextField t1,t2,t21,t22,t111;
	JButton b1,b2,b3,b4,b5,b6;
	JLabel l1,l2,l3,l22;
	int sqc=0,lqc=0;

	/**
	 * Create the frame.
	 */
	public createprocess() {
		f = new JFrame();
		prepareGUI();
	}
	
	public void prepareGUI(){	
		System.out.print("prep GUI Form start");
		f = new JFrame();

		l1 = new JLabel("Form Name:");
		l1.setBounds(10,50,150,50);
		f.add(l1);

		t1=new JTextField();	
		t1.setBounds(150,50,300,50);
		f.add(t1);

		l2 = new JLabel("Form Description:");
		l2.setBounds(10,100,150,50);
		f.add(l2);

		t2=new JTextField();	
		t2.setBounds(150,100,300,50);
		f.add(t2);

		l3 = new JLabel("Created For:");
		l3.setBounds(600,50,150,50);
		f.add(l3);

		t21=new JTextField();	
		t21.setBounds(750,50,300,50);
		f.add(t21);

		l22 = new JLabel("Reviewed By:");
		l22.setBounds(600,100,150,50);
		f.add(l22);

		t22=new JTextField();	
		t22.setBounds(750,100,300,50);
		f.add(t22);

		b1 = new JButton("Add Short Question");
		b1.setBounds(10,180,100,30); 
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel l1 = new JLabel("Short Question: ");
				l1.setBounds(10,x,100,30);
				f.add(l1);
			
				JTextField t1 = new JTextField();
				t1.setBounds(150,x,100,30);
				f.add(t1);

				/*str=str+", "+t1.getText()+" varchar(64)";
				System.out.println(t1.getText()+"short q");*/
				
				x+=60;

				f.validate();
				f.repaint();
			}
		});

		b2=new JButton("Add Long Question");
		b2.setBounds(10,210,100,30);//x axis, y axis, width, height  
		f.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel l1 = new JLabel("Long Question: ");
				l1.setBounds(10,x,100,30);
				f.add(l1);

				t111 = new JTextField();
				t111.setBounds(150,x,100,30);
				f.add(t111);

				/*str=str+", "+t1.getText()+" varchar(256)";
				System.out.println(t1.getText()+"long question");*/
				
				x+=60;

				f.validate();
				f.repaint();
				//System.out.println(x);
			}
		});

		b3=new JButton("Add MCQ Question");
		b3.setBounds(10,240,100,30);//x axis, y axis, width, height  
		f.add(b3);
		b3.addActionListener(new MCQ());

		b4=new JButton("Add Checkbox Question");
		b4.setBounds(10,270,100,30);//x axis, y axis, width, height  
		f.add(b4);
		b4.addActionListener(new Checkbox());

		b5 = new JButton("Submit");
		b5.setBounds(900,500,100,30);
		f.add(b5);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginschema", "root", "prakharprakhar");
					Statement stmt = con.createStatement();
					System.out.println("Submit started" + t111.getText());
					String sql = "CREATE TABLE "+t1.getText().toString()+" ( "+t2.getText().toString()+" varchar(256), "+t21.getText().toString()+" varchar(32), "+t22.getText().toString()+" varchar(32)"+str+");";
					int rs = stmt.executeUpdate(sql);
					System.out.println(rs);
					if(rs>=1)
						JOptionPane.showMessageDialog(null,"Your Form Sucessfully Created...");
					else
						JOptionPane.showMessageDialog(null,"Unable to create Form...");
				} catch(Exception excep) {
					System.out.print(excep);
				}
			}
		});

		b6 = new JButton("Back");
		b6.setBounds(900,600,100,30);
		f.add(b6);
		b6.addActionListener(this);

		f.setSize(640,480); 
		f.setLayout(null);

	}

	public void actionPerformed(ActionEvent e){
		String name = t1.getText();
		System.out.println(name); 
		String desc = t2.getText();
	}

	void setVisible(){
        f.setVisible(true);
    }

    void unsetVisible(){
        f.setVisible(false);
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
