package borders;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;


class MyFrame extends JFrame
{
	JLabel l;
	JTextField tf;
	JButton b;
    JPanel p;
    
    MyFrame()
    {
    	l=new JLabel("Name");
    	tf=new JTextField(20);
    	b=new JButton("OK");
    	p=new JPanel();
    	
    	p.add(l);
    	p.add(tf);
    	p.add(b);
    	
    	//Border br=BorderFactory.createBevelBorder(EtchedBorder.LOWERED);
    	Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Login");
    	//Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Login", TitledBorder.ABOVE_TOP, TitledBorder.CENTER);
    	p.setBorder(br);
    	
    	setLayout(new FlowLayout());
    	add(p);
    }
}

public class BorderDemo {

	public static void main(String[] args) {
		MyFrame mf=new MyFrame();
		mf.setSize(500,500);
		mf.setVisible(true);
	

		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
