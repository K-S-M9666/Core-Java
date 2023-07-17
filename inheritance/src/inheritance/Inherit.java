package inheritance;
class Parent
{
	Parent()
	{
		System.out.println("Non-param of Parent");
	}
	Parent(int x)
	{
		System.out.println("Param of parent"+ x);
	}
}
class Child extends Parent
{
	Child()
	{
		System.out.println("Non-param of Child");
	}
	Child(int y)
	{
		System.out.println("Param of Child");
	}
	Child(int x,int y)
	{
		super(x);
		System.out.println("2 Params of Child"+y);
	}
}
public class Inherit {

	public static void main(String[] args) {
		
      Child c=new Child(10,20);
	}

}
