package jTree;
import java.awt.*;
import java.io.File;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import java.util.Iterator;
import java.util.StringTokenizer;

class MyFrame extends JFrame implements TreeSelectionListener
{
	JTree tree;
	JLabel l;
	
	MyFrame()
	{
		super("Tree Demo");
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("C:\\MyJava");
		File f=new File("C:\\MyJava");
		
		for (File x : f.listFiles()) {
			if (x.isDirectory()) {
				DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());
				for(File y:x.listFiles())
				{
				    temp.add(new DefaultMutableTreeNode(x.getName()));    
				}
				root.add(temp);
			}
			else
			root.add(new DefaultMutableTreeNode(x.getName()));
		}
		tree=new JTree(root);
		l=new JLabel("No Files Selected");
		
		tree.addTreeSelectionListener(this);
		
		JScrollPane sp=new JScrollPane(tree);
		
		add(sp,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		l.setText(e.getPath().toString());
		
	}
}
public class JTreeDemo {

	public static void main(String[] args) {
		MyFrame mf=new MyFrame();
		mf.setSize(500,500);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
