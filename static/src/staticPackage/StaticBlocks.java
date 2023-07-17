package staticPackage;
class Test1
{

	static
	{
		System.out.println("Block -1");
	}
	static
	{
		System.out.println("Block -2");
	}
}
public class StaticBlocks {
    
	public static void main(String[] args) {
	   Test1 t1=new Test1();
       System.out.println("Main");
	}
	

}
