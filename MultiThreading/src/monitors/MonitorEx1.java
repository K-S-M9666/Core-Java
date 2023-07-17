package monitors;
class Mydata
{
	synchronized  void display(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
	}
}
class MyThreads extends Thread
{
	Mydata d1;
	MyThreads(Mydata dat)
	{
		d1=dat;
	}
	public void run()
	{
		d1.display("Hello World");
	}
}
class MyThreads2 extends Thread
{
	Mydata d2;
	MyThreads2(Mydata data)
	{
		d2=data;
	}
	public void run()
	{
		d2.display("Welcome");
	}
}
public class MonitorEx1 {
  public static void main(String args[])
  {
	  Mydata d=new Mydata();
	  MyThreads t1=new MyThreads(d);
	  MyThreads2 t2=new MyThreads2(d);
	  t1.start();
	  t2.start();
  }
}
