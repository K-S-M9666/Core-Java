package abstractPractice;
abstract class Super2
{
	public Super2()
	{
		System.out.println("Super Constructor");
	}
	public void meth1()
	{
		System.out.println("Meth1 of Super");
	}
	abstract public void meth2();
}
class Sub2 extends Super2
{
	@Override
	public void meth2()
	{
		System.out.println("Sub method2");
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		Super2 s=new Sub2();
		s.meth1();
		s.meth2();

	}

}
