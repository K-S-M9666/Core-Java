package interthread;
class DataMy
{
	int value;
	boolean flag;
	synchronized public void set(int v)
	{
		while(flag!=true)
			try{
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

class Producer extends Thread
{
	DataMy data;
	public Producer(DataMy d)
	{
		data=d;
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

class Consumer extends Thread
{
	DataMy data;
	public Consumer(DataMy d)
	{
		data=d;
	}
	public void run()
	{
		int value;
		while(true)
		{
			value=data.get();
			System.out.println("Consumer "+value);
		}
	}
}
public class InterEx1 {

	public static void main(String[] args) {
		DataMy dm=new DataMy();
		Producer p=new Producer(dm);
		Consumer c= new Consumer(dm);
		p.start();
		c.start();

	}

}
