import javax.swing.*; 
import java.awt.event.*;

public class Home implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3,l4,l5;

	void prepareGUI() {  
        System.out.println("Home GUI start");

		f=new JFrame();//creating instance of JFrame  

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
		          
		JButton b1=new JButton("View Process"); 
		b1.setBounds(50,300,200, 40);  
        f.add(b1);
        b1.addActionListener(this);

		JButton b2=new JButton("Add Process"); 
		b2.setBounds(50,350,200, 40);
		f.add(b2);
        b2.addActionListener(this);
		          
		f.setSize(400,500); 
		f.setLayout(null);
        System.out.println("GUI end");
	}

    void setVisible(){
        f.setVisible(true);
    }

    void unsetVisible(){
        f.setVisible(false);
    }

    public void actionPerformed(ActionEvent e){
        String str = e.getActionCommand().toString();
        System.out.println(str);
        Form a;
        viewProcess b;
        this.unsetVisible();

        if(str.equals("Add Process"));
        {
            a = new Form();
            a.prepareGUI();
            a.setVisible();
        }

        if(str.equals("View Process"))
        {
            b = new viewProcess();
            b.prepareGUI();
            b.setVisible();
        }

    }
}  