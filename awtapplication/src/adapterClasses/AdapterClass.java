package adapterClasses;
import java.awt.*;
import java.awt.event.*;

//class MyWindowAdapter extends WindowAdapter
//{
//	public void windowClosing(WindowEvent we)
//	{
//		System.exit(0);
//	}
//}
class MyFrame extends Frame
{
	MyFrame()
	{
		super("Adapter Classes");
		//addWindowListener(new MyWindowAdapter());
		addWindowListener(new WindowAdapter() {
		  public void windowClosing(WindowEvent we)
			{
			System.exit(0);
		    }
		});
	}
	
	
}
public class AdapterClass {

	public static void main(String[] args) {
		MyFrame mf=new MyFrame();
		mf.setSize(500,500);
        mf.setVisible(true);
	}

}
