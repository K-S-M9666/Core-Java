package awtapplication;
import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame implements ActionListener
{
	Label ll;
	TextArea taa;
	Button bb;
	TextField tff;
	
	public MyFrame3()
	{
		super("Text Area Demo");
		ll=new Label("No text Entered");
		tff=new TextField(20);
		taa=new TextArea(10,30);
		bb=new Button("Click");
		
		setLayout(new FlowLayout());
		add(taa);
		add(ll);
		add(tff);
		add(bb);
		bb.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//l.setText(ta.getSelectedText());
//		
        taa.insert(tff.getText(), taa.getCaretPosition());
	}
}
public class TextAreaDemo {

	public static void main(String[] args) {
		MyFrame3 mf3=new MyFrame3();
		mf3.setSize(400,400);
		mf3.setVisible(false);

	}

}
