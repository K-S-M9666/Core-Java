package innerpackage;
abstract class Mine
{
	abstract public void show();
}
class Outer2
{
	public void display()
	{
		Mine m=new Mine() {
			public void show()
			{
				System.out.println("Hello");
			}
		};
		m.show();
//		class Inner
//		{
//			public void show()
//			{
//				System.out.println("Hello");
//			}
//		}
//		Inner i=new Inner();
//		i.show();
	}
}
public class Exampl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Outer2 o= new Outer2();
      o.display();
	}

}
