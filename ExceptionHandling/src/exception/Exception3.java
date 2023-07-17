package exception;

import java.util.Scanner;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 2 Values");
     int a=sc.nextInt();
     int b=sc.nextInt();
     try {
     int c=a/b;
     System.out.println(c);
     }
     catch(ArithmeticException e)
     {
    	 System.out.println("Division Error");
     }
     System.out.println("bye");
	}

}
