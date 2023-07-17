package monitors;
class Data
{
	public void display(String s)
	{
		synchronized (this) {
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		  try {
			  Thread.sleep(100);
		  }
		  catch(Exception e) {}
		}
		}
	}
}
class MineThread1 extends Thread
{
	Data d;
	public MineThread1(Data d)
	{
		this.d=d;
	}
	public void run()
	{
		d.display("Hello World");
	}
}
class MineThread2 extends Thread
{
	Data d;
	public MineThread2(Data d)
	{
		this.d=d;
	}
	public void run()
	{
		d.display("Welcome All");
	}
}
public class SyncDemno {

	public static void main(String[] args) {
		Data d=new Data();
		MineThread1 m1=new MineThread1(d);
		MineThread2 m2=new MineThread2(d);
		m1.start();
        m2.start();
	}

}
