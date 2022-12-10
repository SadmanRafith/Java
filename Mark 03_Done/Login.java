import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login implements ActionListener{  
    
	private JButton lgnBtn;
    private JButton signBtn;
    private JButton exBtn;
    private JLabel lusn;
    private JLabel lpass;
    private JTextField uname;
    private JPasswordField upass;
    private ImageIcon i1;
	JFrame frame;
	
	//ASSOCIATION WITH USER CLASS
	User u1, u2;
	User users[];
	
    Login(){  
	
		u1 = new User("Mazid", "1234");
		u2 = new User("ABCD", "9876");
		users = new User[4];
		users[0] = u1;
		users[1] = u2;
		
        //create frame
		frame = new JFrame ("System");
        //construct components
        lgnBtn = new JButton ("Login");
        signBtn = new JButton ("Sign Up");
        exBtn = new JButton ("Exit");
        lusn = new JLabel ("Username:");
        lpass = new JLabel ("Password:");
        uname = new JTextField ();
        upass = new JPasswordField ();
        i1 = new ImageIcon("download.png");

        lusn.setForeground(new Color (230, 238, 250));
        lpass.setForeground(new Color (230, 238, 250));
		
        lusn.setFont(new Font("Default",Font.BOLD,17));
        lpass.setFont(new Font("Default",Font.BOLD,17));
        
		//set component bounds (only needed by Absolute Positioning)
        lgnBtn.setBounds (150, 185, 100, 30);
        signBtn.setBounds (305, 185, 100, 30);
        exBtn.setBounds (205, 235, 140, 30);
        lusn.setBounds (150, 105, 100, 25);
        lpass.setBounds (150, 145, 100, 25);
        uname.setBounds (305, 105, 100, 25);
        upass.setBounds (305, 145, 100, 25);
		
		
		//addActionListener
		lgnBtn.addActionListener(this);
		exBtn.addActionListener(this);

        //add components
        frame.add (lgnBtn);
        frame.add (signBtn);
        frame.add (exBtn);
        frame.add (lusn);
        frame.add (lpass);
        frame.add (uname);
        frame.add (upass);

        
		
		//frame properties
		//adjust size and set layout
        frame.setSize (624, 400);
		frame.setLocationRelativeTo(null);//to center screen gui
        frame.setLayout (null);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(i1.getImage());
		frame.getContentPane().setBackground(new Color (1, 5, 77));
        frame.getContentPane();
        frame.setVisible (true); 
    }         
    public void actionPerformed(ActionEvent e) {  
         
        if(e.getSource()==lgnBtn)
		{  
			String user = uname.getText();
			String pass = upass.getText();
			
			int flag = 0;
			
			if(user.isEmpty()==false && pass.isEmpty()==false)
			{
				for(int i = 0; i<users.length; i++)
				{
					if(users[i]!=null)
					{
						if(user.equals(users[i].getUsername()) && pass.equals(users[i].getPassword()))
						{
							flag = 1;
							break;
							//new Dashboard();
							//frame.setVisible(false);
						}
					}
				}
				if (flag == 1)
				{
					new Dashboard(user);
					frame.setVisible(false);
				}
				else
				{
					showMessageDialog(null, "Invalid Username or password!");
				}
			}
			else
			{
				showMessageDialog(null,"Fill up each field.");
			}
			
        }  
		else if(e.getSource()==exBtn)
		{
			System.exit(0);
		}
    }  
} 
