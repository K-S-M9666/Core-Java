package components;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener
{
	JLabel l;
	JButton b;
	int count=0;
	MyFrame()
	{
		super("Swing Demo");
		
		l=new JLabel("Clicked "+count+"Times");
		b=new JButton("Click");
		
		setLayout(new FlowLayout());
		
		add(l);
		add(b);
		
		
		b.addActionListener(this);
		
		getRootPane().setDefaultButton(b);
		
		//b.setIcon(null);
		l.setToolTipText("Counter");
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		l.setText("Clicked "+count+"Times");
		
	}
}
public class SwingComponentDemo {
  public static void main(String args[])
  {
	  MyFrame mf=new MyFrame();
	  mf.setSize(500,500);
	  mf.setVisible(true);
	  mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
