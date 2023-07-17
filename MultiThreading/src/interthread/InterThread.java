package interthread;

class Dataa
{
	int value;
	boolean flag;
	synchronized public void set(int v)
	{
		while(flag!=true)
			try {
				wait();
			}
		   catch(Exception e) {}
		value=v;
		flag=false;
		notify();
	}
	synchronized public int get()
	{
		while(flag!=false)
			try {
				wait();
			}
		    catch(Exception e) {}
		
		int x=0;
		x=value;
		flag=true;
		notify();
		
		return x;
	}
}
class Producer1 extends Thread
{
	Dataa data;
	int value;
	public Producer1(Dataa dat)
	{
		data=dat;
	}
	public void run()
	{
	  int count=1;
	  while(true)
	  {
		  data.set(count);
		  System.out.println("Producer "+ count);
		  count++;
	  }
	}
	
}
class Consumer1 extends Thread
{
	Dataa data;
	public Consumer1(Dataa dat)
	{
		data=dat;
	}
	public void run()
	{
		int value;
		while(true)
		{
			value=data.get();
			System.out.println("Consumer "+ value);
		}
	}
}
public class InterThread {

	public static void main(String[] args) {
		Dataa dd=new Dataa();
		Producer1 p1=new Producer1(dd);
		Consumer1 c1=new Consumer1(dd);
		p1.start();
		c1.start();

	}

}
