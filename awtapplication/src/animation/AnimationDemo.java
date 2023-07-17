package animation;
import java.awt.*;
import java.awt.event.*;

class MyFrame1 extends Frame implements Runnable
{
	int x,y,tx,ty;
	
	MyFrame1()
	{
	  x=100;
	  y=100;
	  tx=ty=1;
	  
	  Thread t=new Thread(this);
	  t.start();
	}
	
	 public void paint(Graphics g)
	  {
		 g.setColor(Color.RED);
		  g.fillOval(x,y,50,50);
	  }

	@Override
	public void run() {
		while(true)
		{
			x+=tx;
			y+=ty;
			if(x<0 || x>450)
			tx=tx*-1;
			if(y<20 || y>350)
				ty=ty*-1;
			
			repaint();
			
			try {
				Thread.sleep(5);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
}
public class AnimationDemo {

	public static void main(String[] args) {
		MyFrame1 mf=new MyFrame1();
		mf.setSize(500,400);
		mf.setVisible(true);

	}

}
