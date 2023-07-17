package myfirst;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a,b,c;
         double r1,r2;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a b c values");
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         
         r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
         r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
         
         System.out.println("Root are :"+r1 +" "+ r2);
	}

}
