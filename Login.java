import javax.swing.*; 
public class Login{  

	public static void main(String args[]){
		Login a = new Login();
		a.prepareGUI();
	}

	void prepareGUI() {  
		JFrame f=new JFrame();//creating instance of JFrame  

		JLabel l1,l2,l3;  
		l1=new JLabel("Login Page");  
    	l1.setBounds(100,0, 100,30);
    	f.add(l1);

    	l2=new JLabel("Username");  
    	l2.setBounds(0,100,200,30);
    	f.add(l2);

    	l3=new JLabel("Password");  
    	l3.setBounds(0,150,200,30);
    	f.add(l3);


		JTextField t1,t2;  
	    t1=new JTextField("");  
	    t1.setBounds(80,100, 200,30);  
	    t2=new JTextField("");  
	    t2.setBounds(80,150, 200,30);  
	    f.add(t1); f.add(t2);  
		          
		JButton b=new JButton("Submit");//creating instance of JButton  
		b.setBounds(130,200,100, 40);//x axis, y axis, width, height  
		          
		f.add(b);//adding button in JFrame  
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}  
}  