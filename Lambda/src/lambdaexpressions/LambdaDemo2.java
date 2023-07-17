package lambdaexpressions;

interface Lambda
{
	public void display();
}
class Demo
{
	int x=10;
	public void method1()
	{
		int b=2;
		Lambda l=()->{
			System.out.println("Hello" +(++x));
		    System.out.println("Bye" +b);	
		};
		l.display();
	}
}
class UseLambda
{
	public void callLambda(Lambda lm)
	{
		lm.display();
	}
}
class Method
{
	public void method1()
	{
		UseLambda ul=new UseLambda();
		ul.callLambda(()->{System.out.println("Haiiii");});
	}
}
public class LambdaDemo2 {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.method1();
		Method m1=new Method();
		m1.method1();

	}

}
