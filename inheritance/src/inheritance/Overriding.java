package inheritance;
class Super
{
	public void display()
	{
		System.out.println("Super class Display");
	}
}
class Sub extends Super
{
	@Override
	 public void display()
	 {
		 System.out.println("Sub class Display");
	 }
}
public class Overriding {

	public static void main(String[] args) {
		Super sc=new Sub();
		sc.display();
		
		

	}

}
