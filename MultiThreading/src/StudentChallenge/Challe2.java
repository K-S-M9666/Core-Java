package StudentChallenge;
class ATM1
{
	synchronized public void WithDrawAmount(String name)
	{
		System.out.println(name +" Withdraw ");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		System.out.println("Balance");
	}
	synchronized  public void BalanceCheck(String name,int amount)
	{
		System.out.println(name+" Checking ");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		System.out.println("Amount");
	}
}

class Cust1 extends Thread
{
	String name;
	ATM1 atm;
	int amount;
	Cust1(String n,ATM1 a,int amt)
	{
		name=n;
		atm=a;
		amount=amt;
	}
	public void UserAtm()
	{
		atm.BalanceCheck(name, amount);
		atm.WithDrawAmount(name);
	}
	public void run()
	{
		UserAtm();
	}
}

class Cust2 extends Thread
{
	String name;
	ATM1 atm;
	int amount;
	Cust2(String n,ATM1 a,int amt)
	{
		name=n;
		atm=a;
		amount=amt;
	}
	public void UserAtm()
	{
		atm.BalanceCheck(name, amount);
		atm.WithDrawAmount(name);
	}
	public void run()
	{
		UserAtm();
	}
}
public class Challe2 {

	public static void main(String[] args) {
		ATM1 a=new ATM1();
		Cust1 c1=new Cust1("Surya",a,1000);
		Cust2 c2=new Cust2("Manikanth",a,200);
		c1.start();
		c2.start();

	}

}
