package splitframe;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.*;


import java.awt.event.*;


class MyFrame extends JFrame implements ListSelectionListener
{
	JSplitPane sp;
	JList list;
	JLabel lbl;
	
	MyFrame()
	{
		super("Split Demo");
		String cols[]= {"RED","GREEN","YELLOW","ORANGE","BLACK"};
		
		list=new JList(cols);
		list.setSelectedIndex(0);
		list.addListSelectionListener(this);
		JScrollPane p1=new JScrollPane(list);
		
		lbl=new JLabel(" ");
		lbl.setOpaque(true);
		lbl.setBackground(Color.red);
		JScrollPane p2=new JScrollPane(lbl);
		
//		sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
//		sp.setDividerLocation(200);
//		add(sp);
		
		
		JTabbedPane tp=new JTabbedPane();
		tp.addTab("Colors", p1);
		tp.addTab("Label", p2);
		add(tp);
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		String str=(String)list.getSelectedValue();
		switch (str) {
		case "RED": lbl.setBackground(Color.red);
		            break;
		case "GREEN": lbl.setBackground(Color.green);
        break;
		case "BLUE": lbl.setBackground(Color.blue);
        break;
		case "ORANGE": lbl.setBackground(Color.orange);
        break;
		case "BLACK": lbl.setBackground(Color.black);
        break;
		case "YELLOW": lbl.setBackground(Color.yellow);
        break;
			
		
	}
	
}
}
public class SplitDemo {

	public static void main(String[] args) {
		MyFrame mf1=new MyFrame();
		mf1.setSize(800,800);
		mf1.setVisible(true);
		mf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

