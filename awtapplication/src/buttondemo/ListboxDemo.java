package buttondemo;
import java.awt.*;
import java.awt.event.*;

class MYFrame2 extends Frame implements ItemListener,ActionListener
{
	List l;
	Choice c;
	TextArea ta;
	
	public MYFrame2()
	{
		super("ListBox Demo");
		l=new List(4,true);
		c=new Choice();
		ta=new TextArea(20,30);
		
		l.add("Monday");
		l.add("Tuesday");
		l.add("Wednesday");
		l.add("Thrusday");
		l.add("Friday");
		l.add("Saturday");
		l.add("Sunday");
	
	    c.add("January");
	    c.add("Febuary");
	    c.add("March");
	    c.add("April");
		
	    setLayout(new FlowLayout());
	    add(l);
	    add(c);
	    add(ta);
	    
	    l.addItemListener(this);
	    c.addItemListener(this);
	    l.addActionListener(this);
	    
	    
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==l)
			ta.setText(l.getSelectedItem());
		else
			ta.setText(c.getSelectedItem());
			
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String list[]=l.getSelectedItems();
		
		String txt="";
		for(String x:list)
			txt+=x+"\n";
		ta.setText(txt);
		
	}
}
public class ListboxDemo {

	public static void main(String[] args) {
		MYFrame2 mf2=new MYFrame2();
		mf2.setSize(400,600);
		mf2.setVisible(true);

	}

}
