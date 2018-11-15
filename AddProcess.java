import javax.swing.*;  
public class AddProcess{  
	public static void main(String[] args) {  
		JFrame f=new JFrame();//creating instance of JFrame  

		JLabel l1,l2,l3,l4;  
		l1=new JLabel("Add Process Page");  
    	l1.setBounds(100,0, 200,30);
    	f.add(l1);

    	l2=new JLabel("Name Of Process");  
    	l2.setBounds(0,100,200,30);
    	f.add(l2);

    	l3=new JLabel("Subject");  
    	l3.setBounds(0,150,200,30);
    	f.add(l3);

    	l4=new JLabel("Owner Email ID");  
    	l4.setBounds(0,200,200,30);
    	f.add(l4);

		JTextField t1,t2,t3;  
	    t1=new JTextField("");  
	    t1.setBounds(180,100, 200,30);  
	    t2=new JTextField("");  
	    t2.setBounds(180,150, 200,30); 
	    t3=new JTextField("");  
	    t3.setBounds(180,200, 200,30); 

	    f.add(t1);
	    f.add(t2);
	    f.add(t3); 
		          
		JButton b=new JButton("Submit");//creating instance of JButton  
		b.setBounds(130,300,100, 40);//x axis, y axis, width, height  
		          
		f.add(b);//adding button in JFrame  
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}  
}  