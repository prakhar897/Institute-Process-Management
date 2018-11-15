import javax.swing.*;  
public class Home{  
	public static void main(String[] args) {  
		JFrame f=new JFrame();//creating instance of JFrame  

		JLabel l1,l2,l3,l4,l5,l6;  
		l1=new JLabel("Home Page");  
    	l1.setBounds(100,0, 100,30);
    	f.add(l1);

    	l2=new JLabel("Processes");  
    	l2.setBounds(100,30, 100,30);
    	f.add(l2);

    	l3=new JLabel("Dandiya Night");  
    	l3.setBounds(0,60,100,30);
    	f.add(l3);
    	l4=new JLabel("Approved");  
    	l4.setBounds(100,60,100,30);
    	f.add(l4);

    	l5=new JLabel("Conference");  
    	l5.setBounds(0,90,100,30);
    	f.add(l5);
    	l6=new JLabel("To be Reviewed");  
    	l6.setBounds(100,90,100,30);
    	f.add(l6); 
		          
		JButton b1=new JButton("Review Process"); 
		b1.setBounds(50,200,100, 40);  

		JButton b2=new JButton("Add Process"); 
		b2.setBounds(50,240,100, 40); 
		          
		f.add(b1);
		f.add(b2);
		          
		f.setSize(400,500); 
		f.setLayout(null); 
		f.setVisible(true); 
	}  
}  