package layouts;
import java.awt.*;
import java.awt.event.*;

class MyFrame1 extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	
	public MyFrame1()
	{
		super("Grid Layout");
		
		setLayout(new GridLayout(2,3));
		
		b1=new Button("One");
		b2=new Button("Two");
		b3=new Button("Three");
		b4=new Button("Four");
		b5=new Button("Five");
		b6=new Button("Six");
		
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
	}
}
public class GridlayoutDemo {

	public static void main(String[] args) {
		MyFrame1 mf1=new MyFrame1();
		mf1.setSize(400,400);
		mf1.setVisible(true);

	}

}
