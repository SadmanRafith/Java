import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SecondFrame extends JFrame implements ActionListener
{
	JLabel label;
	JButton backBtn, btnOne, btnTwo, btnClear;
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
		label.setBackground(Color.CYAN);
		label.setOpaque(true);
		panel.add(label);
		
		
		backBtn = new JButton("Back");
		backBtn.setBounds(150, 150,80, 30);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		btnOne = new JButton("1");
		btnOne.setBounds(250, 250,80, 30);
		btnOne.addActionListener(this);
		panel.add(btnOne);
		
		btnTwo = new JButton("2");
		btnTwo.setBounds(350, 250,80, 30);
		btnTwo.addActionListener(this);
		panel.add(btnTwo);
		
		btnClear = new JButton("Clear");
		btnClear.setBounds(450, 250,80, 30);
		btnClear.addActionListener(this);
		panel.add(btnClear);
		
		
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
		else if(btnOne.getText().equals(command))
		{
			//label.setText(label.getText()+btnOne.getText());
			String text = label.getText() + btnOne.getText();
			label.setText(text);
		}
		else if(btnTwo.getText().equals(command))
		{
			String text = label.getText() + btnTwo.getText();
			label.setText(text);
		}
		else if(btnClear.getText().equals(command))
		{
			label.setText("");
		}
		else
		{
			
		}
	}
}
