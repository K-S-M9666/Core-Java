package menuToolbar;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

class MyFrame extends JFrame implements ActionListener
{
	JToolBar tb;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JTextArea ta;
	
	MyFrame()
	{
		super("Toolbar Demo");
		tb=new JToolBar();
		b1=new JButton("Save");
		b2=new JButton("Open");
		b3=new JButton("new");
		b4=new JButton("Cut");
		b5=new JButton("Split");
		b6=new JButton("Copy");
		b7=new JButton("Close");
		tb.add(b1);tb.add(b2);tb.add(b3);
		tb.add(new JToolBar.Separator());
		tb.add(b4);tb.add(b5);tb.add(b6);tb.add(b7);
		
		ta=new JTextArea();
		JScrollPane sp=new JScrollPane(ta);
		
		add(tb,BorderLayout.NORTH);
		add(sp,BorderLayout.CENTER);
		
		JMenuBar mb=new JMenuBar();
		JMenu file=new JMenu("File");
		JMenuItem m1=new JMenuItem("Save");
		JMenuItem m2=new JMenuItem("open");
		m2.setMnemonic(KeyEvent.VK_O);
		
		file.add(m1);
		file.addSeparator();
		file.add(m2);
		mb.add(file);
		setJMenuBar(mb);
		
		b2.setActionCommand("open");
		
		b2.addActionListener(this);
		m2.addActionListener(this);
		b1.addActionListener(this);
		m1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("open"))
		{
		JFileChooser fc=new JFileChooser();
		fc.showOpenDialog(this);
		File f=fc.getSelectedFile();
		
		try {
			FileInputStream fi=new FileInputStream(f);
			byte b[]=new byte[fi.available()];
			fi.read();
			String str=new String(b);
			ta.setText(str);
			fi.close();
		}
		catch (Exception ex) {}
		}
		else
		{
			Color col=JColorChooser.showDialog(this, "Font Color", Color.red);
			ta.setForeground(col);
		}
	}
}

public class TollbarDemi {

	public static void main(String[] args) {
		MyFrame mf1=new MyFrame();
		mf1.setSize(600,600);
		mf1.setVisible(true);
		mf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
