package myfirst;
import java.lang.*;
import java.util.*;

public class ExpressionTriangle {
  
	public static void main(String args[])
	{
		int a,b,c;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b,c values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		float s=(a+b+c)/2f;
		double x=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Square root of Triangle  :" +x);
	}
}
