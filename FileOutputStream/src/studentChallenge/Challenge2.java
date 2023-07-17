package studentChallenge;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable
{
	String  CustId;
	String name;
	String Phone;
	
	static int count=1;
	Customer(){}
	Customer(String n,String p)
	{
		name=n;
		Phone=p;
	}
	public String toString()
	{
		return "Customer Id :"+CustId+"\nName :"+name+"\nPhone :"+Phone+"\n";
	}
}
public class Challenge2 {

	public static void main(String[] args) throws Exception {
//		Customer List[]= {new Customer("Smith","987654321"),new Customer("Surya","90909876")};
//		FileOutputStream foss=new FileOutputStream("D:\\File\\customer.txt");
//		ObjectOutputStream oos=new ObjectOutputStream(foss);
//		
//		oos.writeInt(List.length);
//		
//		for (Customer customer : List) {
//			oos.writeObject(customer);
//		}
//		oos.close();
//		foss.close();
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		FileInputStream fis=new FileInputStream("D:\\File\\customer.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		int length=ois.readInt();
		
		Customer list[]=new Customer[length];
		for(int i=0;i<length;i++)
		{
			list[i]=(Customer)ois.readObject();
		}
		
		System.out.println("Enter Name of Customer :");
		String name=sc.nextLine();
		
		for(int i=0;i<length;i++)
		{
			if(name.equalsIgnoreCase(list[i].name));
			System.out.println(list[i]);
		}
		
		ois.close();
		fis.close();
		
		

	}

}
