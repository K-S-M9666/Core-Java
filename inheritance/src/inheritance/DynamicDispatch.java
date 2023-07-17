package inheritance;
class Superrr
{
	public void meth1()
	{
		System.out.println("Meth1");
	}
	public void meth2()
	{
		System.out.println("Super Meth2");
	}
}
class Subbb extends Superrr
{
	@Override
	public void meth2()
	{
		System.out.println("Sub Meth2");
	}
	public void meth3()
	{
		System.out.println("Sub Meth3");
	}
}
public class DynamicDispatch {

	public static void main(String[] args) {
		
     Superrr su=new Subbb();
     su.meth1();
     su.meth2();
	}

}
