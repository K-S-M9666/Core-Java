package awtapplication;
import java.awt.*;
import java.awt.event.*;

class MineFrame1 extends Frame implements TextListener,ActionListener
{
	Label l1,l2;
	TextField tf;
	
	public MineFrame1()
	{
		super("TextField Demo");
		l1=new Label("No text Field is Entered");
		l2=new Label("Enter Key is not yet hit");
		tf=new TextField(20);
		
		tf.addTextListener(this);
		tf.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(l1);
		add(tf);
		add(l2);
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		l2.setText(tf.getText());
		
	}

	@Override
	public void textValueChanged(TextEvent e) {
		l1.setText(tf.getText());
		
	}
}
public class TextFieldDemo {

	public static void main(String[] args) {
		MineFrame1 mf1=new MineFrame1();
		mf1.setSize(400,400);
		mf1.setVisible(true);

	}

}
