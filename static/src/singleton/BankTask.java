package singleton;
import java.util.*;

class bank
{
	private String Accno;
	private static int c=1001;
	
	public String generateAccno()
	{
		Date date=new Date();
		String accn="Icic"+"-"+(date.getYear()+1900)+"19008"+c;
		c++;
		return accn;		
	}
	bank()
	{
		Accno=generateAccno();
	}
	public String generateAcc()
	{
		return Accno;
	}
}
public class BankTask {

	public static void main(String[] args) {
		bank b1=new bank();
		bank b2=new bank();
		
		System.out.println(b1.generateAcc());
		System.out.println(b2.generateAcc());

	}

}
