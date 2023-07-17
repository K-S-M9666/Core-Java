package inheritance;
class CellPhone
{
	private long phoneno;
	private long emi;
	
	public CellPhone(long phoneno, long emi) {
		super();
		this.phoneno = phoneno;
		this.emi = emi;
	}
	public long getPhoneNo() {
		return phoneno;
	}
	public long getEmi() {
		return emi;
	}
	public void call(long phoneno)
	{
		
	}
	public void saveContact(long phoneno)
	{
		
	}
}
class smartPhone extends CellPhone
{

	public smartPhone(long phoneno, long emi) {
		super(phoneno, emi);
		
	}
	public void play() {
		
	}
	public void click() {
		
	}
	
}
public class phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
