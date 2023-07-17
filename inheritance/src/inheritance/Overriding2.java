package inheritance;
class TV
{
	public void switchON() {
		System.out.println("TV is Switched ON");
	}
	public void changeChannel() {
		System.out.println("TV Channel is Changed");
	}
}
class SmartTV extends TV
{
	@Override
	public void switchON() {
		System.out.println("Smart TV is Switched ON");
	}
	@Override
	public void changeChannel() {
		System.out.println(" Smart TV Channel is Changed");
	}
	public void browse()
	{
		System.out.println("Browsing..");
	}
}
public class Overriding2 {

	public static void main(String[] args) {
		
       TV st=new SmartTV();
       st.switchON();
       st.changeChannel();
       //st.browse();
	}

}
