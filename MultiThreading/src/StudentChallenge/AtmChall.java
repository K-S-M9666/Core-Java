package StudentChallenge;
class Atm
{
	synchronized public void CheckBalance(String name)
	{
		System.out.print(name + "  Checking  ");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		System.out.println("Balance");
	}
	synchronized public void Withdraw(String name,int amount)
	{
		System.out.print(name +"  Withdrawing..");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		System.out.println("amount");
	}
}

class Customer1 extends Thread
{
	String name;
	int amount;
	Atm atm;
	Customer1(String n,Atm a,int amt)
	{
		name=n;
		atm=a;
		amount=amt;
	}
	public void UseAtm()
	{
		atm.CheckBalance(name);
		atm.Withdraw(name,amount);
	}
	public void run()
	{
		UseAtm();
	}
}

class Customer2 extends Thread
{
	String name;
	int amount;
	Atm atm;
	Customer2(String n,Atm a,int amt)
	{
		name=n;
		atm=a;
		amount=amt;
	}
	public void UseAtm()
	{
		atm.CheckBalance(name);
		atm.Withdraw(name, amount);
	}
	public void run()
	{
		UseAtm();
	}
}
public class AtmChall {
  public static void main(String args[])
  {
	  Atm atm=new Atm();
	  Customer1 c1=new Customer1("Surya",atm,100);
	  Customer2 c2=new Customer2("Manikantha",atm,200);
	  c1.start();
	  c2.start();
	  
  }
}
