package awtapplication;
import java.awt.*;
import java.awt.event.*;

class MineFrame extends Frame implements ItemListener
{
	Label l1;
	Checkbox c1,c2,c3;
	CheckboxGroup cbg;
	
	public MineFrame()
	{
		super("Check Box Demo");
		l1=new Label("Nothing is Selected");
		cbg=new CheckboxGroup();
		
		c1=new Checkbox("Java",false,cbg);
		c2=new Checkbox("Python",false,cbg);
		c3=new Checkbox("C#",false,cbg);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		setLayout(new FlowLayout());
		add(l1);
		add(c1);
		add(c2);
		add(c3);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String str="";
		if(c1.getState())
			str=str+" "+c1.getLabel();
		if(c2.getState())
			str=str+" "+c2.getLabel();
		if(c3.getState())
			str=str+" "+c3.getLabel();
		if(str.isEmpty())
			str="Nothing is Selected";
		l1.setText(str);
		
	}
}
public class CheckBoxDemo {

	public static void main(String[] args) {
		MineFrame mf=new MineFrame();
		mf.setSize(400,400);
		mf.setVisible(true);

	}

}
