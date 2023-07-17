package myfirst;

import java.util.Scanner;

public class cubiod {
  
	public static void main(String args[])
	{
		int length,breath,height;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Length breath and Height");
		length =sc.nextInt();
		breath=sc.nextInt();
		height=sc.nextInt();
		int area= 2*(length*breath+length*height+breath*height);
		int volume = length*breath*height;
		System.out.println("Area of Rectangle :" + area);
		System.out.println("Volume of Rectangle :" + volume);
	}
}
