package monitors;

class Data1
{
 synchronized public void display(String st)
  {
	  
	  for(int i=0;i<st.length();i++)
	  {
		  System.out.print(st.charAt(i));
	  }
	  
  }
}

class Thread1 extends Thread
{
	Data1 dt;
	public Thread1(Data1 dt)
	{
		this.dt=dt;
	}
	public void run()
	{
		dt.display("Surya Manikantha");
	}
}

class Thread2 extends Thread
{
	Data1 dt;
	public Thread2(Data1 dt)
	{
		this.dt=dt;
	}
	public void run()
	{
		dt.display("Keerthi");
	}
}
public class SynchDemo2 {

	public static void main(String[] args) {
		Data1 d1=new Data1();
		Thread1 tt1=new Thread1(d1);
		Thread2 tt2=new Thread2(d1);
		tt1.start();
		tt2.start();

	}

}
