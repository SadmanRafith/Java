import javax.swing.*;  
import java.awt.event.*;  
public class Sample{  
      
   
	JLabel l1;
    Sample(){  
        JFrame f= new JFrame(); 
		l1 = new JLabel("Welcome");
		l1.setBounds(20,50,150,20); 
		
        
		f.add(l1);
        
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
      
}