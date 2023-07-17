package EventHandling;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame 
{
	TextField tf;
	Button b;
	int count=0;
	
	MyFrame()
	{
		super("Event Demo");
		tf=new TextField("0");
		b=new Button("Click");
		
		setLayout(new FlowLayout());
		add(tf);
		add(b);
		b.addActionListener(new MyListner());
	}
	class MyListner implements ActionListener
	{
	public void actionPerformed(ActionEvent ae)
	{
		count++;
		tf.setText(String.valueOf(count));
	}
	}
}
public class WayofEventHandling {
  public static void main(String args[])
  {
	 MyFrame mf=new MyFrame();
	 mf.setSize(500,500);
	 mf.setVisible(true);
  }
}
