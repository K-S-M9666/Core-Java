package Interfaces;

interface member
{
	void callback();
}
class Customer implements member
{
	String name;
	Customer(String s)
	{
		name=s;
	}
	public void callback() {
		System.out.println("Ok,I will Visit Store "+name);
	}
}
class Store
{
	member mem[]=new member[100];
	int count =0;
	void register(member m)
	{
		mem[count++]=m;
	}
	void inviteSale()
	{
		for(int i=0;i<count;i++)
			mem[i].callback();
	}
}
public class InterfaceEx3 {

	public static void main(String[] args) {
		Store s=new Store();
		Customer c1=new Customer("John");
		Customer c2=new Customer("Surya");
		s.register(c1);
		s.register(c2);
		s.inviteSale();

	}

}
