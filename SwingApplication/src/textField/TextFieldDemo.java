package textField;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.awt.*;

import javax.swing.*;
import javax.swing.text.NumberFormatter;

class MyFrame extends JFrame
{
	 MyFrame()
	 {
		 JTextField tf1=new JTextField(15);
		 
		 DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		 JFormattedTextField tf2=new JFormattedTextField(df);
		 
		setLayout(new FlowLayout());
		tf2.setColumns(15);
		tf2.setValue(0);
		
		NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormatter nft=new NumberFormatter(nf);
		nft.setAllowsInvalid(false);
		nft.setMaximum(10000);
		
		JFormattedTextField tf3=new JFormattedTextField(nft);
		
		JTextArea ta=new JTextArea(30,30);
		
		
		tf3.setColumns(15);
		tf3.setValue(0);
		add(tf1);
		add(tf2);
		add(tf3);
	 }
	 
}
public class TextFieldDemo {

	public static void main(String[] args) {
		MyFrame mf=new MyFrame();
		mf.setSize(400,400);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
