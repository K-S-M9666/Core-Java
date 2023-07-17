package multithreading;

class MyThread extends Thread
{
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i + "Hello");
			i++;
		}
	}
}
public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread  mt =new MyThread();
        mt.start();
        int i=1;
        while(true)
        {
        	System.out.println(i+"World");
        	i++;
        }
	}

}
