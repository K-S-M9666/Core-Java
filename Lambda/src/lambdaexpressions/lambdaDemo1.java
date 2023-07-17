package lambdaexpressions;

@FunctionalInterface
interface MyLambda1
{
	public void display();
}

//class My implements MyLambda
//{
//	public void display()
//	{
//		System.out.println("Hello world");
//	}
//}

public class lambdaDemo1 {

	public static void main(String[] args) {
		MyLambda1 m=()->
			{
				System.out.println("Hello");
			};
		
		m.display();

	}

}
