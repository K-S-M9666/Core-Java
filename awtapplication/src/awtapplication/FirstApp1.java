package awtapplication;
import java.awt.*;

class MyFrame extends Frame
{
	Label l;
	TextField tf;
	Button b;
	
	public MyFrame()
	{
		super("My App");
		setLayout(new FlowLayout());
		l=new Label("Name");
		tf=new TextField(20);
		b=new Button("OK");
		
		add(l);
		add(tf);
		add(b);
		
		
	}
}
public class FirstApp1 {

	public static void main(String[] args) {
		MyFrame mf=new MyFrame();
		mf.setSize(400,400);
		mf.setVisible(true);

	}

}
