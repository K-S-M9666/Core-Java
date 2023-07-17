package multithreading;

class MyThread1 extends Thread
{
  public void run()
  {
	  int count=1;
	  while(true)
	  {
		  System.out.println(count++  +"My Thread");
	  }
  }
}
public class ThreadTest {

	public static void main(String[] args) throws Exception {
	MyThread1 t=new MyThread1();
	t.setDaemon(true);
	t.start();
	
	int count=1;
	  while(true)
	  {
		  System.out.println(count++  +"Main Thread");
		  Thread.yield();
	  }
	
	
		/*
		 * Thread mainThread=Thread.currentThread(); mainThread.join();
		 */
	
	
	/*
	 * try { Thread.sleep(100); } catch(Exception e) {}
	 */
        
        }
	}
