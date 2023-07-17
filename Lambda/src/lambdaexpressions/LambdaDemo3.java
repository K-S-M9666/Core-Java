package lambdaexpressions;

interface LambdaMy
{
	public void display(String str);
}


public class LambdaDemo3 {
	public static void reverse(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
	public static void main(String[] args) {
		LambdaMy lm=LambdaDemo3::reverse;
		lm.display("Welcome All");

	}

}
