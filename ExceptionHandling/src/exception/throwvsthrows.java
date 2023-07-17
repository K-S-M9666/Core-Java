package exception;
class Test
{
	void meth1()
	{
		try
		{
		int r=area(-10,2);
		System.out.println(r);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	int area(int a,int b) throws Exception
	{
		if(a<0 || b<0)
			throw new Exception("Exception throw");
		
		int c=a*b;
		return c;
		
	}
}
public class throwvsthrows {

	public static void main(String[] args) {
		
      Test t1=new Test();
      t1.meth1();
	}

}
