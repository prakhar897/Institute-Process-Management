import javax.swing.*;  
public class Home{  
	public static void main(String[] args) {  
		JFrame f=new JFrame();//creating instance of JFrame  

		JLabel l1,l2,l3,l4,l5;  
		l1=new JLabel("Home Page");  
    	l1.setBounds(100,0, 100,30);
    	f.add(l1);

    	l5 = new JLabel("Logged in as 16ucs131");
    	l5.setBounds(300,0,300,30);
    	f.add(l5);

    	l2=new JLabel("Processes");  
    	l2.setBounds(100,30, 100,30);
    	f.add(l2);

    	l3=new JLabel("Dandiya Night");  
    	l3.setBounds(0,100,100,30);
    	f.add(l3);
    	JButton b3=new JButton("Participate");  
    	b3.setBounds(300,100,100,30);
    	f.add(b3);

    	l4=new JLabel("Conference");  
    	l4.setBounds(0,150,100,30);
    	f.add(l4);
    	JButton b4=new JButton("Participate");  
    	b4.setBounds(300,150,100,30);
    	f.add(b4); 
		          
		JButton b1=new JButton("Review Process"); 
		b1.setBounds(50,300,200, 40);  

		JButton b2=new JButton("Add Process"); 
		b2.setBounds(50,350,200, 40); 
		          
		f.add(b1);
		f.add(b2);
		          
		f.setSize(400,500); 
		f.setLayout(null); 
		f.setVisible(true); 
	}  
}  