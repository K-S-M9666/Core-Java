package staticPackage;

class Test
{
	static int x=10;
	int y=20;
	void show()
	{
		System.out.println(x+ " "+y);
	}
	static void display()
	{
		System.out.println(x);
	}
}
public class StaticEx1 {

	public static void main(String[] args) {
		
		Test t= new Test();
		t.show();
		t.x=30;
		t.y=50;
		Test t2=new Test();
		t2.show();
		

	}

}
