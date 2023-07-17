package abstractPractice;
abstract class Hospital
{
	void Offers()
	{
		
	}
	abstract void emergency();
	abstract void appointement();
	
}
class Myhospital extends Hospital
{
	void emergency()
	{
		
	}
	void appointement()
	{
		
	}
}
public class AbstractEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Hospital h=new Myhospital();
      h.appointement();
      h.emergency();
      h.Offers();
	}

}
