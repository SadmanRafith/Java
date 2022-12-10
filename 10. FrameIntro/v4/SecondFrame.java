import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SecondFrame extends JFrame implements ActionListener
{
	JLabel label;
	JButton backBtn;
	JPanel panel;
	FrameIntro fi;
	
	public SecondFrame(String s1, String s2, String s3, String s4, String s5, FrameIntro fi)
	{
		super("Second GUI");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.fi = fi;
		
		panel = new JPanel();
		panel.setLayout(null);
		
		label = new JLabel("Text: "+s1+" "+s2+" "+s3+" "+s4+" "+s5);
		label.setBounds(50,50,300,30);
		panel.add(label);
		
		
		backBtn = new JButton("Back");
		backBtn.setBounds(150, 150,80, 30);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		this.add(panel);
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(backBtn.getText().equals(command))
		{
			//FrameIntro fi = new FrameIntro();
			fi.setVisible(true);
			this.setVisible(false);
		}
		else
		{
			
		}
	}
}
