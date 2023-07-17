package layouts;
import java.awt.*;

class MyFrame extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	
	public MyFrame()
	{
	 	b1=new Button("One");
	 	b2=new Button("Two");
	 	b3=new Button("Three");
	 	b4=new Button("Four");
	 	b5=new Button("Five");
	 	b6=new Button("Six");
	 	
	 	FlowLayout fl=new FlowLayout();
	 	fl.setAlignment(FlowLayout.RIGHT);
	 	fl.setHgap(50);
	 	setLayout(fl);
	 	
	 	add(b1,BorderLayout.NORTH);
	 	add(b2,BorderLayout.EAST);
	 	add(b3,BorderLayout.SOUTH);
	 	add(b4,BorderLayout.WEST);
	 	//add(b5,BorderLayout.CENTER);
	 	//add(b6);
	 	
	 	Panel p=new Panel();
	 	p.setLayout(new GridLayout());
	 	p.add(new Button("Mon"));
	 	p.add(new Button("Tues"));
	 	p.add(new Button("Tues"));
	 	p.add(new Button("Wedn"));
	 	
	 	add(p,BorderLayout.EAST);
	}
}
public class FlowLayoutDeo {

	public static void main(String[] args) {
		MyFrame mf=new MyFrame();
		mf.setSize(400,400);
		mf.setVisible(true);
	}

}
