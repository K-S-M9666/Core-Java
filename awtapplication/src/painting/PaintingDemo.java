package painting;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame 
{
	int x=0,y=0;
	MyFrame()
	{
		super("Painting");
		addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent me)
			{
			   x=me.getX();
			   y=me.getY();
			   repaint();
			}
		});
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		//g.fillOval(x, y, 50, 50);
		g.setFont(new Font("NoteWorthy",Font.BOLD,30));
		g.drawString("Hello", x, y);
	}
}
public class PaintingDemo {

	public static void main(String[] args) {
		MyFrame mf=new MyFrame();
		mf.setSize(400,400);
		mf.setVisible(true);

	}

}
