import javax.swing.*;  
public class viewProcess{ 
    JFrame f; 
	void prepareGUI(){  
		f=new JFrame();  

		JLabel l1,l2,l3,l4,l5;  
		l1=new JLabel("view Process Page");  
    	l1.setBounds(100,0, 200,30);
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

    	JButton b3=new JButton("View Participants");  
    	b3.setBounds(200,100,100,30);
    	f.add(b3);

    	JButton b5=new JButton("Reject");  
    	b5.setBounds(300,100,100,30);
    	f.add(b5);

    	l4=new JLabel("Conference");  
    	l4.setBounds(0,150,100,30);
    	f.add(l4);
    	JButton b4=new JButton("View Participants");  
    	b4.setBounds(200,150,100,30);
    	f.add(b4);
    	JButton b6=new JButton("Reject");  
    	b6.setBounds(300,150,100,30);
    	f.add(b6);
		          
		JButton b1=new JButton("Back To Home Page"); 
		b1.setBounds(50,300,200, 40);  
		          
		f.add(b1);
		          
		f.setSize(400,500); 
		f.setLayout(null); 
	} 

    void setVisible(){
        f.setVisible(true);
    }

    void unsetVisible(){
        f.setVisible(false);
    }


}  