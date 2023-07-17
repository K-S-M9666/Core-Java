package awtapplication;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame2  extends Frame implements ActionListener
{
	int count=0;
	Label l;
	Button b;
	public MyFrame2()
	{
		l=new Label(" "+count);
		b=new Button("Count");
		b.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(l);
		add(b);
       
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		l.setText(" "+count);
		
	}
}
public class ButtonEvent2 {

	public static void main(String[] args) {
		MyFrame2 mf2=new MyFrame2();
		mf2.setSize(400,400);
		mf2.setVisible(true);

	}

}
