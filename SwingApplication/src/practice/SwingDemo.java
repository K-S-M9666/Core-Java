package practice;
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
		super("Swing Demo Practice");
		l=new JLabel("Counter"+count);
		b=new JButton("Click");
		setLayout(new FlowLayout());
		add(l);
		add(b);
	
		b.addActionListener(this);
		l.setToolTipText("Counter");
		getRootPane().setDefaultButton(b);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		l.setText("Counter"+count);
		
	}
}
public class SwingDemo {

	public static void main(String[] args) {
		MyFrame mf=new MyFrame();
		mf.setSize(400,400);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
