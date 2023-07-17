package inheritance;

class Account
{
	private String accNo;
	private String name;
	private String address;
	private String phno;
	private String dob;
	protected long balance;
	
	public Account(String acc,String n,String add,String phnno,String dob)
	{
		accNo=acc;
		name=n;
		address=add;
		this.phno=phno;
		this.dob=dob;
		balance=0;
	}
	public String getAccNo() {
		return accNo;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getphone() {
		return phno;
	}
	public String getDob() {
		return dob;
	}
	public long getBalance() {
		return balance;
	}
	
	public void setPhno(String phno)
	{
		this.phno=phno;
	}
	public void setAddress(String add)
	{
		this.address=add;
	}
	
}

class SavingsAccount extends Account
{

	public SavingsAccount(String acc, String n, String add, String phnno, String dob) {
		super(acc, n, add, phnno, dob);
	}
	public void deposite(int amo)
	{
		balance+=amo;
	}
	public void withdraw(int amo)
	{
		balance-=amo;
	}
	
	
}
class LoanAmount extends Account
{

	public LoanAmount(String acc, String n, String add, String phnno, String dob) {
		super(acc, n, add, phnno, dob);
	}
	public void payEmi(int amo)
	{
		balance+=amo;
	}
	public void rePay(int amo)
	{
		if(balance==amo) balance=0; 
	}
	
}
public class BankAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
