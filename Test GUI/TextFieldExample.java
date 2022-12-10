import javax.swing.*;  
import java.awt.event.*;  
import static javax.swing.JOptionPane.showMessageDialog;
public class TextFieldExample implements ActionListener{  
    
	JFrame f;

    JLabel l1;
	JLabel l2;	
	
	JTextField tf1;  
    JTextField tf2;
	
    JButton b1;  
	
    TextFieldExample(){  
        f= new JFrame(); 
		l1 = new JLabel("Username");
		l1.setBounds(20,50,150,20);

		l2 = new JLabel("Password");
		l2.setBounds(20,80,150,20); 		
		
        tf1=new JTextField();  
        tf1.setBounds(80,50,150,20);  
		
		tf2=new JTextField();  
        tf2.setBounds(80,80,150,20); 
          
        b1=new JButton("Login");  
        b1.setBounds(80,130,100,60);  
        b1.addActionListener(this);
		
		f.add(l1);
		f.add(l2);
        f.add(tf1);
        f.add(tf2);
		f.add(b1); 
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
         
        if(e.getSource()==b1)
		{  
			String user = tf1.getText();
			String pass = tf2.getText();
            if(user.equals("Mazid") && pass.equals("1234"))
			{
				f.setVisible(false);
				new Sample();
			}
			else
			{
				showMessageDialog(null, "Invalid Username and password!");
			}
			
        }  
    }  
} 