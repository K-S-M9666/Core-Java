package buttondemo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame1 extends Frame implements ActionListener
{
	Label l;
	TextArea ta;
	TextField tf;
	Button b;
	
	public MyFrame1()
	{
		super("Text Area Demo");
		l=new Label("No Text Entered");
		ta=new TextArea(10,30);
		tf=new TextField(20);
		b=new Button("Click");
		
		setLayout(new FlowLayout());
		add(l);
		add(ta);
		add(tf);
		add(b);
		b.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ta.insert(tf.getText(), ta.getCaretPosition());
		
	}
	
}
public class TextDemo {

	public static void main(String[] args) {
		MyFrame1 mf1=new MyFrame1();
		mf1.setSize(400,400);
		mf1.setVisible(true);

	}

}
